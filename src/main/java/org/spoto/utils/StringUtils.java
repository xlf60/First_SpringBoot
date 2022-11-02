package org.spoto.utils;

public class StringUtils {
    /**
     * 判断字符串是否为空
     * @param str 字符串
     * @return true or false
     */
    public static boolean isEmoty(String str){
        return str == null || "".equals(str);
    }

    /**
     * 判断字符串是否不为空
     * @param str 字符串
     * @return true or false
     */
    public static boolean isNotEmoty(String str){
        return !isEmoty(str);
    }
}
