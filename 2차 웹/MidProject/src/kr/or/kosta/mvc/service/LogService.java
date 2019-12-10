package kr.or.kosta.mvc.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.kosta.mvc.dao.JoinLogDao;
import kr.or.kosta.mvc.dao.LoginLogDao;
import kr.or.kosta.mvc.dao.MovieSoldLogDao;
import kr.or.kosta.mvc.dao.ViewLogDao;
import kr.or.kosta.mvc.dao.WatchLogDao;
import kr.or.kosta.mvc.inter.LogDao;



@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class,readOnly=true)
@Service
//�α� ��ȸ ���� �����鿡���� ��û�� ������ �����ϰ� ��ȸ�� �α׵����͸� �����ϴ� ���� Ŭ����
public class LogService {
	
	@Autowired
	private WatchLogDao watchLogDao;
	@Autowired
	private ViewLogDao viewLogDao;
	@Autowired
	private MovieSoldLogDao movieSoldLogDao;
	@Autowired
	private LoginLogDao loginLogDao;
	@Autowired
	private JoinLogDao joinLogDao;
	private LogDao logDao;
	
	int month=Calendar.getInstance().get(Calendar.MONTH);


	//�湮�ڼ� �α�
	public List<Integer> getLoginLogData(String cmd) {
		logDao=loginLogDao;
		return getLogData(cmd);
	}
	//���Ǹž� �α�
	public List<Integer> getMovieSoldLogData(String cmd) {
		logDao=movieSoldLogDao;
		List<Integer> result = null;
		if(cmd.equals("0")) {
			result=movieSoldLogDao.getLogPrice_Days();
		}
		else if(cmd.equals("1")) {
			result=movieSoldLogDao.getLogPrice_Months();
			result=alignMonths(result);
		}
		else if(cmd.equals("2")) {
			result=movieSoldLogDao.getLogPrice_Years();
		}
		return result;
	}
	//����ȸ�� �α�
	public List<Integer> getViewLogData(String cmd) {
		logDao=viewLogDao;
		return getLogData(cmd);
	}
	//�ѽ�û�� �α�
	public List<Integer> getWatchLogData(String cmd) {
		logDao=watchLogDao;
		return getLogData(cmd);
	}
	//�� �����ڼ� �α�
	public List<Integer> getJoinLogData(String cmd) {
		logDao=joinLogDao;
		return getLogData(cmd);
	}
	
	private List<Integer> alignMonths (List<Integer> result) {
		int period=result.size();
		int[] temp=new int[period];
		for(int i=0; i<period ; i++) {
			if(month+i>period-1) {
				temp[month+i-(period)]= result.get(i);
			}
			else
				temp[month+i]=result.get(i);
		}
		result.clear();
		for(int i=0; i<period;i++) {
			result.add(temp[i]);
		}
		return result;
	}
	private List<Integer> alignMonths2 (List<HashMap<String,BigDecimal>> list,int period)
	{
		List<Integer> result=new ArrayList<>();
		int month_desc=month+1;
		int temp[]=new int[period];
		for(HashMap<String,BigDecimal> item : list) {
			int month_from_map=item.get("month").intValue();
			for(int i=period-1;i>-1;i--) {
				if(month_from_map==month_desc) {
					temp[i]=item.get("count").intValue();
					month_desc=month+1;
					break;
				}else {
					if(month_desc==1)
						month_desc=12;
					else
						month_desc--;
				}
			}
		}
		for(int i=0;i<temp.length;i++) {
			result.add(temp[i]);
		}
		return result;
	}
	
	
	//dao�� �̿��Ͽ� �����ͺҷ�����
	private List<Integer> getLogData(String cmd){
		List<Integer> result = null;
		List<HashMap<String,BigDecimal>> list=null;
		if(cmd.equals("0")) {
			result=logDao.getLogCount_Days();
		}
		else if(cmd.equals("1")) {
			list=logDao.getLogCount_Months();
			result=alignMonths2(list,5);
		}
		else if(cmd.equals("2")) {
			result=logDao.getLogCount_Years();
		}
		return result;
	}
}
