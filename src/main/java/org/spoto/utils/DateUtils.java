package org.spoto.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    /**
     * 将字符串类型的时间转化为Date
     * @param str  字符串类型时间
     * @return     返回Date类型的时间
     * @throws ParseException
     */
    public static Date getSetDate(String str) throws ParseException {
//        String str="2021-5-21";  //假设str为前段传过来的时间类型参数
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(str);
        String format = simpleDateFormat.format(parse);
        System.out.println(parse);
//        System.out.println(format);
        return parse;
    }


}
