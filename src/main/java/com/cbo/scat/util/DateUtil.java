package com.cbo.scat.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: chengbo
 * @Date: 2018/4/21
 */
public class DateUtil {

    public interface DatePatterns{
        public static final String DEFAULT =  "yyyyMMddHHmmss";
        public static final String ISO = "yyyy-MM-dd HH:mm:ss";
        public static final String YYYYMMDD = "yyyyMMdd";
        public static final String YYYY_MM_DD = "yyyy-MM-dd";
        public static final String YYYY_MM_DD_HH_MM_SS_SSS = "yyyy-MM-dd HH:mm:ss.SSS";
        public static final String YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
    }

    public static String format(Date date, String pattern){
        if(date==null||pattern==null){
            return null;
        }
        try {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static String getNow(String pattern){
        return format(new Date(),pattern);
    }

    public static String getISO(){
        return format(new Date(),DatePatterns.ISO);
    }



}
