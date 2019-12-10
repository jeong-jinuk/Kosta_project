#makeCVS.sh
#save jeju_finance_data as cvs
#This script runs every 1miniute(crontab -e  or /etc/cron)
export PANDOC_HOME=/home/FP/pandoc/
export PATH=$PANDOC_HOME/bin:/home/FP/test:$PATH
export LD_LIBRARY_PATH=/home/FP/rlibrary/lib:$GCC/lib64/:/usr/lib64/:/usr/include/:/usr/local/lib64/:$LD_LIBRARY_PATH

db="hadoop"
user="root"
pass="1212"
rm -rf /home/FP/test/jeju.csv
for table in $(mysql -u$user -p$pass $db -Be "SHOW tables" | sed 1d); do
	mysql -u$user -p$pass $db -e "SELECT * FROM $table" | sed 's/\t/","/g;s/^/"/;s/$/"/;' > /home/FP/final_project/others/jeju.csv
done
Rscript /home/FP/final_project/others/test.R

