package com.richinfo.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * ���ڡ�ʱ����
 * @author cmt
 *
 */
public class DateUtil {
	

	/**
	 * ����ת�� 
	 * @author cmt
	 * @param time
	 * @param fmt:yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String formatTime(Timestamp time,String fmt) {
		if (time == null) {
			return "";
		}
		SimpleDateFormat myFormat = new SimpleDateFormat(fmt);
		return myFormat.format(time);
	}
	
	/**
	 * ����ת�� 
	 * @author cmt
	 * @param time
	 * @param fmt:yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getformatDate(String time,String fmt) {
		if (time == null) {
			return "";
		}
		SimpleDateFormat myFormat = new SimpleDateFormat(fmt);
		return myFormat.format(time);
	}
	/**
	 * ��ȡϵͳ��ǰʱ�䣨�룩
	 * @author cmt
	 * @return
	 */
	public static Timestamp getTime() {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		String mystrdate = myFormat.format(calendar.getTime());
		return Timestamp.valueOf(mystrdate);
	}
	
	/**
	 * ��ȡ��ǰ����(ʱ��00:00:00)
	 * @author cmt
	 * @return
	 */
	public static Timestamp getDateFirst(){
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
		Calendar calendar = Calendar.getInstance();
		String mystrdate = myFormat.format(calendar.getTime());
		return Timestamp.valueOf(mystrdate);
	}
	
	/**
	 * ��ȡ��ǰ����(ʱ��23:59:59)
	 * @author cmt
	 * @return
	 */
	public static Timestamp getDateLast(){
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
		Calendar calendar = Calendar.getInstance();
		String mystrdate = myFormat.format(calendar.getTime());
		return Timestamp.valueOf(mystrdate);
	}
	
	/**
	 * ��ȡ��ǰ����
	 * @author cmt
	 * @return
	 */
	public static Date getDate(){
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
	/**
	 * ȡ�õ�ǰ���� 20140807
	 * @return
	 */
	public static String getCurrDate(){
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");
		Calendar calendar = Calendar.getInstance();
		String mystrdate = myFormat.format(calendar.getTime());
		return mystrdate;
	}
	/**
	 * yyyy-MM-dd HH:mm:ss ת����Timestamp
	 * @author cmt
	 * @param timeString
	 * @return
	 */
	public static Timestamp getTime(String timeString){
		return Timestamp.valueOf(timeString);
	}
	
	
	/**
	 * �Զ����ʽ���ַ���ת��������
	 * @author cmt
	 * @param timeString
	 * @param fmt
	 * @return
	 * @throws Exception
	 */
	public static Timestamp getTime(String timeString,String fmt) throws Exception{
		SimpleDateFormat myFormat = new SimpleDateFormat(fmt);
		Date date= myFormat.parse(timeString);
		myFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return getTime(myFormat.format(date));
	}
	
	/**
	 * ��ʽ������
	 * @author cmt
	 * @param date
	 * @param fmt
	 * @return
	 * @throws Exception
	 */
	public static String formatDate(Date date,String fmt){
		if (date == null) {
			return "";
		}
		SimpleDateFormat myFormat = new SimpleDateFormat(fmt);
		return myFormat.format(date);
	}
	
	/**
	 * �������ڻ���ʱ�䣬�������������ڣ��������ڵ�00:00:00ʱ��
	 * @author cmt
	 * @param timeString
	 * @return
	 * @throws Exception
	 */
	public static Timestamp getDateFirst(String timeString) throws Exception{
		if (null==timeString ||"".equals(timeString)) {
			return null;
		}
		if (timeString.length() > 10) {
			return getTime(timeString, "yyyy-MM-dd HH:mm:ss");
		} else {
			return getTime(timeString, "yyyy-MM-dd");
		}
	}
	
	
	/**
	 * �������ڻ���ʱ�䣬�������������ڣ��������ڵ�23:59:59ʱ��
	 * @author cmt
	 * @param timeString
	 * @return
	 * @throws Exception
	 */
	public static Timestamp getDateLast(String timeString) throws Exception{
		if (null==timeString ||"".equals(timeString)) {
			return null;
		}
		if (timeString.length() > 10) {
			return getTime(timeString, "yyyy-MM-dd HH:mm:ss");
		} else {
			return getTime(timeString +" 23:59:59", "yyyy-MM-dd HH:mm:ss");
		}
	}
	
	/**
	 * ��ȡ���� ��һʱ�䣬���� ��ʽyyyy-MM-dd 00:00:00
	 * @author cmt
	 * @return
	 */
	public static Timestamp getMonday(){
		Calendar calendar= Calendar.getInstance(); 
		int dayofweek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		if (dayofweek == 0){
			dayofweek = 7;
			calendar.add(Calendar.DATE, -dayofweek + 1);
		}
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
		String mystrdate = myFormat.format(calendar.getTime());
		return Timestamp.valueOf(mystrdate);
	}
	
	
	/**
	 * ��ȡ���� ���� ʱ�䣬���ظ�ʽyyyy-MM-dd 23:59:59
	 * @author cmt
	 * @return
	 */
	public static Timestamp getSunday(){
		Calendar calendar= Calendar.getInstance(); 
		int dayofweek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		if (dayofweek == 0){
			dayofweek = 7;
			calendar.add(Calendar.DATE, -dayofweek + 7);
		}
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
		String mystrdate = myFormat.format(calendar.getTime());
		return Timestamp.valueOf(mystrdate);
	}
	
	
	/**
	 * ��������
	 * @author cmt
	 * @param time
	 * @param day
	 * @return
	 */
	public static Timestamp addDay(Timestamp time,Integer day){
		Timestamp time2=new Timestamp(time.getTime()+day*1000l*60*60*24L);
		return time2;
	}
	
	/**
	 * 2��ʱ����������
	 * @author cmt
	 * @param time1
	 * @param time2
	 * @return
	 */
	public static Integer getDay(Timestamp time1,Timestamp time2){
		Long dayTime=(time1.getTime()-time2.getTime())/(1000*60*60*24);
		return dayTime.intValue();
	}
	
	/**
	 * �����������
	 * ��ʽ yyyyMMdd
	 * @param oldDate	
	 * @param newDate
	 * @return ��������
	 * @throws ParseException 
	 */
	public static long getsubDate(String oldDate, String newDate) throws ParseException{
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyyMMdd");
		Date d1 = sdf.parse(oldDate);
		Date d2= sdf.parse(newDate);
		return (d1.getTime() - d2.getTime()) / (3600L * 1000 * 24);
	}
	
	/**
	 * �����������
	 * ��ʽ yyyyMMdd
	 * @param oldDate	
	 * @param newDate
	 * @return ��������
	 */
	public static long getsubDate(Date oldDate, Date newDate){
		return (oldDate.getTime() - newDate.getTime()) / (3600L * 1000 * 24);
	}
	
	/**
	 * ��ȡϵͳ��ǰʱ�䣨�֣�
	 * @author cmt
	 * @return
	 */
	public static String getMinute() {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMddHHmm");
		return myFormat.format(new Date());
	}
		
	
	/**
	 * ת����ʱ�� �ַ�����ʽ����Ϊ yyyy-MM-dd HH:mm:ss �� yyyy-MM-dd
	 * @author cmt
	 * @return
	 * @throws ParseException 
	 */
	public static Date parseToDate(String val) throws ParseException{
		Date date = null;
		if(null!=val&& val.trim().length() != 0 && !"null".equals(val.trim().toLowerCase())){
			val = val.trim();
			if(val.length()>10){
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				date = sdf.parse(val);
			}
			if(val.length() <= 10){
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				date = sdf.parse(val);
			}
		}	
		return date;
	}
	
	/**
	 * ת����ʱ�� �ַ�����ʽ
	 * @author yangquan
	 * @param String dateStr  the date of String
	 * @param String format   the format of date
	 * @return Date
	 * @throws ParseException 
	 */
	public static Date parseToDate(String dateStr,String format) throws ParseException{
		Date date = null;
		if(null!=dateStr  && dateStr.trim().length() != 0 && !"null".equals(dateStr.trim().toLowerCase())){
			dateStr = dateStr.trim();
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			date = sdf.parse(dateStr);
		}	
		return date;
	}
	/**
	 * ��ȡ���µĵ�һ��yyyy-MM-dd 00:00:00�����һ��yyyy-MM-dd 23:59:59
	 * @author cmt
	 * @return
	 */
	@SuppressWarnings("static-access")
	public static Map<String,String> getPreMonth(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		Calendar cal = Calendar.getInstance();
		GregorianCalendar gcLast = (GregorianCalendar) Calendar.getInstance();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());

		calendar.add(Calendar.MONTH, -1);
		Date theDate = calendar.getTime();
		gcLast.setTime(theDate);
		gcLast.set(Calendar.DAY_OF_MONTH, 1);
		String day_first_prevM = df.format(gcLast.getTime());
		StringBuilder str = new StringBuilder().append(day_first_prevM).append(
		" 00:00:00");
		day_first_prevM = str.toString(); //���µ�һ��

		calendar.add(cal.MONTH, 1);
		calendar.set(cal.DATE, 1);
		calendar.add(cal.DATE, -1);
		String day_end_prevM = df.format(calendar.getTime());
		StringBuilder endStr = new StringBuilder().append(day_end_prevM).append(
		" 23:59:59");
		day_end_prevM = endStr.toString();  //�������һ��

		Map<String, String> map = new HashMap<String, String>();
		map.put("prevMonthFD", day_first_prevM);
		map.put("prevMonthPD", day_end_prevM);
		return map;
	}
	
	
	/**
	 * ��ȡ���� ��һʱ�䣬���� ��ʽyyyy-MM-dd 00:00:00
	 * @author cmt
	 * @return
	 */
	@SuppressWarnings("static-access")
	public static Timestamp getPreMonday(){
		Calendar calendar= Calendar.getInstance(); 
		int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);
		if (dayofweek == 1){
			calendar.add(calendar.WEEK_OF_MONTH,-1); 
		}
		
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
		calendar.add(calendar.WEEK_OF_MONTH,-1);
		
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
		String mystrdate = myFormat.format(calendar.getTime());
		return Timestamp.valueOf(mystrdate);
	}
	
	/**
	 * ��ȡ���� ����ʱ�䣬���� ��ʽyyyy-MM-dd 23:59:59
	 * @author cmt
	 * @return
	 */
	@SuppressWarnings("static-access")
	public static Timestamp getPreSunday(){
		Calendar calendar= Calendar.getInstance(); 
		int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);
		if (dayofweek != 1){
			calendar.add(calendar.WEEK_OF_MONTH,+1); 
		}
		
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY); 
		calendar.add(calendar.WEEK_OF_MONTH,-1); 

		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
		String mystrdate = myFormat.format(calendar.getTime());
		return Timestamp.valueOf(mystrdate);
	}
	
	public static String getDateyyyyMMddHHmmssSSSStr() {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Calendar calendar = Calendar.getInstance();
		return myFormat.format(calendar.getTime());
	}
	
	public static Date getDateyyyyMMddHHmmssSSS() throws ParseException {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Calendar calendar = Calendar.getInstance();
		return myFormat.parse(calendar.getTime().toString());
	}

	
	public static String getDateyyyyMMddHHmmss() {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar calendar = Calendar.getInstance();
		return myFormat.format(calendar.getTime());
	}

	public static String getDateyyyyMMdd() {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");
		Calendar calendar = Calendar.getInstance();
		return myFormat.format(calendar.getTime());
	}
	/**
	 * ��ȡt��ǰ���ڣ���ʽyyyyMM
	 * 
	 * @return
	 */
	public static String getDateyyyyMMdd(int t) {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");
		Calendar calendar = Calendar.getInstance();
		 int day = calendar.get(Calendar.DAY_OF_YEAR);
		 calendar.set(Calendar.DAY_OF_YEAR, day - t);
		return myFormat.format(calendar.getTime());
	}
	
	/**
	 * ��ȡ��ǰ�·ݣ���ʽyyyyMM
	 * 
	 * @return
	 */
	public static String getMonth() {
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMM");
		return myFormat.format(getDate());
	}
	
	/**
	 * ȡ��ǰʱ�䣬��ȷ���룬 ��ʽΪ yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getCurrentDateTime(){
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		return myFormat.format(calendar.getTime());
	}
	
	/**
	 * ȡ��ǰʱ�侫ȷ������ ����ʽΪ yyyy-MM-dd HH:mm:ss:SSS
	 * @return
	 */
	public static String getCurrentDateTimeMS(){
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		Calendar calendar = Calendar.getInstance();
		return myFormat.format(calendar.getTime());
	}
	
	/**
	 * ��ȡ���������ڣ�T�գ� ��ʽΪyyyyMMdd
	 * 
	 * @author: louiszhang
	 * @throws Exception
	 * @date: 2015-11-26����3:07:23
	 */
	public static String getYesterday() {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");// �������ڸ�ʽ
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		date = calendar.getTime();
		return df.format(date);
	}
	
    /**
     * ��ȡĳ����������������µ�����ʱ�̣��������������µĵ�һ��0ʱ0��0��0���룩
     * @param dateSource ĳ����������
     * @param pattern ���ڸ�ʽ
     * @return  �������������µĵ�һ��0ʱ0��0��0����
     * @throws ParseException
     */
    public static String getFirstDayOfMonth(String dateSource,String dateSourcePattern,String outPattern) throws ParseException {
    	
    	SimpleDateFormat simpleDateFormatSrc= new SimpleDateFormat(dateSourcePattern, Locale.getDefault());
    	
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(simpleDateFormatSrc.parse(dateSource));
       
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        
        calendar.set(Calendar.HOUR_OF_DAY, 0);//ʱ
        calendar.set(Calendar.MINUTE, 0);//��
        calendar.set(Calendar.SECOND, 0);//��
        calendar.set(Calendar.MILLISECOND, 0); //����
        
        SimpleDateFormat simpleDateFormatOut= new SimpleDateFormat(outPattern, Locale.getDefault());


        return simpleDateFormatOut.format(calendar.getTime());
    }
    
    /**
     * ��ȡ�������������µ����һ�죨�������������µ����һ��23ʱ59��59��999���룩
     * @param dateSource ĳ����������
     * @param dateSourcePattern ���ڸ�ʽ
     * @param outPattern �������ص����ڸ�ʽ
     * @return �������������µ����һ��23ʱ59��59��999����
     * @throws ParseException
     */
    public static String getLastDayOfMonth(String dateSource,String dateSourcePattern,String outPattern) throws ParseException {
    	
    	SimpleDateFormat simpleDateFormatSrc= new SimpleDateFormat(dateSourcePattern, Locale.getDefault());
    	
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(simpleDateFormatSrc.parse(dateSource));

        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        
        calendar.set(Calendar.HOUR_OF_DAY, 23);//ʱ
        calendar.set(Calendar.MINUTE, 59);//��
        calendar.set(Calendar.SECOND, 59);//��
        calendar.set(Calendar.MILLISECOND, 999); //����

        SimpleDateFormat simpleDateFormatOut= new SimpleDateFormat(outPattern, Locale.getDefault());
        
        return simpleDateFormatOut.format(calendar.getTime());
    }
    
	/**
	 * ��������Ҫ��ʱ���ʽ����ȡϵͳ��ǰʱ����ַ�����ʾ��ʽ
	 * @param pattern ʱ���ʽ
	 * @return ��ǰϵͳʱ����ַ�����ʾ��ʽ
	 */
	public static String getCurrentTimeDescByPattern(String pattern) {
		SimpleDateFormat myFormat = new SimpleDateFormat(pattern, Locale.getDefault());
		Calendar calendar = Calendar.getInstance();
		return myFormat.format(calendar.getTime());
	}
    
    
}
