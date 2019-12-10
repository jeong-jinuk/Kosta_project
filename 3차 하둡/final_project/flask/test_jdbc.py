#!/usr/bin/env python
# coding: utf-8

# In[1]:


from flask import Flask, render_template, request,jsonify
from werkzeug import secure_filename
import requests
import random
import simplejson as json
import pymysql
import findspark
import pyspark
import os
import threading, requests,time
import subprocess
app = Flask(__name__)
@app.route('/')
def index():
    #사용자에게 입력받을 컬럼을 list로 전달해줌(html에서는 jinja for로 화면에 뿌림)
    var_list = {'성별':'sex', '나이':'age', '평균연소득':'avg_income', '평균지출액':'avg_spend','현재대출금액':'avg_debt', '신용대출보유액':'avg_debt_credit','중대형 차량소유비율':'vehicle_own_rat'}
    return render_template('index.html',var_list=var_list)
@app.route('/report_view')
def report_view():
    return render_template('report_view.html')
@app.route('/send_form', methods=['POST'])
def send_form():
    process_result = ""
    #get user's info from web
    financial_info = request.get_json()
    level = call_sparkr(financial_info)
    if level == "sparkerr":
        return "sparkerr"    
    #insert user's info into mysql
    #if mysql_insert_userINFO(financial_info) == "sqlerr":
    #    return "sqlerr"
    #csv_result = csvwrite()
    #print("CSVWRITE res : ",csv_result)
    #flush user's info to hdfs via flume
    #if myflume_flush_userINFO(financial_info) == "flumeerr":
    #    return "flumeerr"
    t1 = threading.Thread(target=th_sql_csv, args=(financial_info,level))
    result = t1.start()
    return str(round(float(level)))
def th_sql_csv(info, level):
    print(log("Thread start"))
    #insert user's info into mysql
    if mysql_insert_userINFO(info,level) == "sqlerr":
        return "sqlerr"
    csv_result = csvwrite()
    print("CSVWRITE res : ",csv_result)
    #flush user's info to hdfs via flume
    if myflume_flush_userINFO(info) == "flumeerr":
        return "flumeerr"
    print(log("Thread end"))
    return 0
def csvwrite():
    result = subprocess.check_output("/home/FP/final_project/others/makeCSV.sh", shell=True)
    return result   
def call_sparkr(info):
    try:
        print(log("spark-submit start"))
        spark_cmd_line = 'spark-submit /home/FP/final_project/others/cp_lev.R '
        for value in info.values():
            spark_cmd_line+=str(value)
            spark_cmd_line+=" "
        #spark_cmd_line = 'spark-submit /home/FP/test/lev.R '+str(info['sex']) + " "+str(info['age'])\
        #+" " +str(info['avg_income'])+" "+str(info['avg_debt'])+" "+str(info['avg_debt_credit']) + " "\
        #+str(info['avg_credit_rat'])+" " +str(info['vehicle_own_rat'])
        print(spark_cmd_line)
        result = subprocess.check_output(spark_cmd_line, shell=True)
        result = result.decode('utf-8')
        result2 = result.split('\n')
        print("SparkR Result : ",result2[2])
        print(log("spark-submit end"))
        return result2[2]
    except Exception as e:
        print(e)
        return "sparkerr"
def mysql_insert_userINFO(info, level):
    try:
        print(log("mysql start"))
        sql = "insert into jeju_finance values(%s,%s,%s,%s,%s,%s,%s,%s)"
        curs = mysql.getCurs()
        curs.execute(sql, (info['sex'], info['age'], info['avg_income'], info['avg_spend'],\
        info['avg_debt'], info['avg_debt_credit'],level,info['vehicle_own_rat']))
        mysql.commit()
        mysql.close()
        print(log("mysql end"))
        return 0
    except Exception as e:
        print(e)
        return "sqlerr"
def myflume_flush_userINFO(info):
    try:
        print(log("flume start"))
        message = 'success'
        params = [{'headers':{}, 'body':message}]
        #body에 들어가는 내용이 전송됨.
        url_flume = 'http://192.168.0.39:4444'
        headers = {'content-type' : 'application/json'}
        response = requests.post(url_flume, data=json.dumps(params), headers=headers)
        print(log("flume end"))
        return 0
    except Exceptino as e:
        print(e)
        return "flumeerr"
#로그를 출력하기 위한 function
def log(msg):
     return "@LOG" + msg + ".....";
@app.route('/get_report', methods=['POST'])
def get_report():
    return render_template('report.html')
#test를 위해 인풋을 랜덤하게 생성하는 function
@app.route('/random_generate', methods=['POST'])
def random_generate():
    sex = random.randint(1,2)
    age = random.randint(24,99)
    avg_income = random.randint(0,99999999)
    avg_spend = random.randint(0,99999999)
    avg_debt = random.randint(0,99999999)
    avg_debt_credit = random.randint(0,99999999)
    vehicle_own_rat = round(random.random(),11)
    return jsonify([sex,age,avg_income,avg_spend,avg_debt,avg_debt_credit,vehicle_own_rat])
#SQL connection 관리를 쉽게 하기 위해 만듬
class SQLConnector:
    conn=0
    def getCurs(self):
        self.conn = pymysql.connect(host='localhost', user='root', password='1212',
                       db='hadoop', charset='utf8')
        curs = self.conn.cursor(pymysql.cursors.DictCursor)
        return curs;
    def close(self):
        self.conn.close()
    def commit(self):
        self.conn.commit()
        
if __name__ == '__main__':
    mysql = SQLConnector()
    #report.html은 crontab에 의해 계속 업데이트 된다.
    #밑의 두줄은 업데이트된 페이지를 받아오기 위한 설정이다.
    app.jinja_env.auto_reload = True
    app.config['TEMPLATES_AUTO_RELOAD'] = True
    app.run(host='192.168.0.39')


# In[ ]:




