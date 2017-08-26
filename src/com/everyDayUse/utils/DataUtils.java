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
	//获取当前时间
	public static String getDateOfNow(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time1 = sdf.format(date);
		return time1;
				
	}
	
	//获取当天的0时0分0秒的时间
	public static String getInitailOfDay(){
		//获取当前时间
		Date date = new Date();
		//获取calendar实例，通过calendar获取一天中的初始时间。
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE), 0, 0, 0);
		Date time = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time1 = sdf.format(time);
		
		return time1;
	}
	//获取本月的初始日期
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
	//获取本年的初始时间
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
