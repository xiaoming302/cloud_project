package com.luying.cloud.utils;

import java.util.Collection;
import java.util.Map;

/**
 * @author luoming
 * @version V1.0
 * @description 数组（集合）工具类
 * @creater 2018/6/14 下午9:00
 * @modified
 */
public class ArraysUtil {

    /**
     * 判断集合是否为空
     *
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<?> collection) {
        if (null == collection) {
            return true;
        }
        return collection.isEmpty();
    }

    /**
     * 判断Map是否为空
     *
     * @param map
     * @return
     */
    public static boolean isEmpty(Map map) {
        if (map == null) {
            return true;
        }
        return map.isEmpty();
    }
}
