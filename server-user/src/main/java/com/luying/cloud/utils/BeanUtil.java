package com.luying.cloud.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * @author luoming
 * @version V1.0
 * @description 对象操作工具类
 * @creater 2018/6/14 下午8:31
 * @modified
 */
public class BeanUtil {

    /**
     * 获取类的继承链（包括对象本身，不包括Object类）
     *
     * @param clazz
     * @return
     */
    public static List<Class> getExtendLink(Class clazz) {
        List<Class> classList = new ArrayList<>();
        classList.add(clazz);
        while (clazz != Object.class) {
            clazz = clazz.getSuperclass();
            classList.add(clazz);
        }
        return classList;
    }

    /**
     * 获取对象所有的自有属性（包括public、private和protected，不包括父类中的属性）
     *
     * @param clazz
     * @return
     */
    public static List<Field> getFields(Class clazz) {
        Field[] fields = clazz.getDeclaredFields();
        return Arrays.asList(fields);
    }

    /**
     * 获取对象素有属性（包括public、private和protected，同时包括父对象的所有属性）
     *
     * @param clazz
     * @return
     */
    public static List<Field> getAllFields(Class clazz) {
        List<Field> fieldList = new ArrayList<>();
        for (Class c : getExtendLink(clazz)) {
            fieldList.addAll(getFields(c));
        }
        return fieldList;
    }

    public static void BeanPropertyCopy(Object from, Object to) {
        List<Field> toFields = getAllFields(from.getClass());
        Map<String, Field> fromFields = fieldListToMap(getAllFields(to.getClass()));
        if (ArraysUtil.isEmpty(toFields)) {
            for (Field toField : toFields) {
                toField.setAccessible(true);//修改访问权限
                if (Modifier.isFinal(toField.getModifiers())) {
                    continue;
                }
                if(fromFields.containsKey(toField.getName())){
                }
            }
        }
    }

    private static Map<String, Field> fieldListToMap(List<Field> fieldList) {
        Map<String, Field> fieldMap = new HashMap<>();
        if (!ArraysUtil.isEmpty(fieldList)) {
            for (Field field : fieldList) {
                fieldMap.put(field.getName(), field);
            }
        }
        return fieldMap;
    }
}
