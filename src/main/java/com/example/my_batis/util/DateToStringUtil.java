package com.example.my_batis.util;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: hongming
 * @Date: 2021/09/18/1:48
 * @Description:
 */
public class DateToStringUtil {
    private static SimpleDateFormat format = new SimpleDateFormat("YYYYMMDD");

    public static String getDateString(Date date) {
        String time = DateToStringUtil.format.format(date);
        return time + "000000";
    }
}
