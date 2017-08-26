package com.everyDayUse.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {
	public static String getCurrentTime(){
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS") ;
		String format = simpleDateFormat.format(date);
		return format;
	}
	//��ȡ��ǰʱ��
	public static String getDateOfNow(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time1 = sdf.format(date);
		return time1;
				
	}
	
	//��ȡ�����0ʱ0��0���ʱ��
	public static String getInitailOfDay(){
		//��ȡ��ǰʱ��
		Date date = new Date();
		//��ȡcalendarʵ����ͨ��calendar��ȡһ���еĳ�ʼʱ�䡣
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE), 0, 0, 0);
		Date time = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time1 = sdf.format(time);
		
		return time1;
	}
	//��ȡ���µĳ�ʼ����
	public static String getInitailOfMonth(){
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), 0, 0, 0, 0);
		Date time = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time1 = sdf.format(time);
		
		return time1;
	}
	//��ȡ����ĳ�ʼʱ��
	public static String getInitailOfYear(){
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(c.get(Calendar.YEAR),0, 0, 0, 0, 0);
		Date time = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time1 = sdf.format(time);
		
		return time1;
	}
	
	public static String getNowMonth(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		String time1 = sdf.format(date);
		return time1;
	}
}
