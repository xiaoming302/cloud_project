package com.luying.cloud.utils;

/**
 * @author luoming
 * @description
 * @reater By: 2017/9/17 下午10:30
 * @version V1.0
 * @modified By:
 */
public class StringUtil {

    public static boolean isNull(String str) {
        return null == str || str.trim().length() == 0;
    }

    public static boolean isNotNull(String str) {
        return !isNull(str);
    }

}
