package com.luying.cloud.common.utils;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author luoming
 * @version V1.0
 * @description 主键生成算法，将UUID中的时间常量提前至id的头部，使id变为有序的序列
 * @creater 2018/5/20 上午11:04
 * @modified
 */
public class IdGenerate implements IdentifierGenerator {

    public static String getId() {
        long time = System.currentTimeMillis();
        String id = Long.toHexString(time);
        id += UUID.randomUUID().toString().replaceAll("-", "");
        id = id.substring(0, 36);
        return id;
    }

    public static void main(String[] args) {
        System.out.println(getId());
        System.out.println(getId());
    }

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        return null;
    }
}