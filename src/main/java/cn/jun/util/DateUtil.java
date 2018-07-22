package cn.jun.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static final String YYYY_MM_dd = "yyyy-MM-dd";
	public static final String YYYY_MM_dd_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	private static SimpleDateFormat simpleDateFormat = null;
	
	public static String dateToStamp(String s) throws ParseException{
        simpleDateFormat = new SimpleDateFormat(DateUtil.YYYY_MM_dd_HH_MM_SS);
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        return  String.valueOf(ts);
    }

    /* 
     * 将时间戳转换为时间
     */
    public static String stampToDate(String s){
        simpleDateFormat = new SimpleDateFormat(DateUtil.YYYY_MM_dd_HH_MM_SS);
        long lt = new Long(s);
        Date date = new Date(lt);
        return simpleDateFormat.format(date);
    }
    
    public static String dateToString(Date date,String pattern){
    	simpleDateFormat = new SimpleDateFormat(pattern);
    	return simpleDateFormat.format(date);
    }
}
