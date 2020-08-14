package com.xiangyang.crm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
    private DateTimeUtil(){}
    public static String getSysTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
