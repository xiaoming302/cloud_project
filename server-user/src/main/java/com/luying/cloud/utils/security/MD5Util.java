package com.luying.cloud.utils.security;

import org.apache.commons.codec.binary.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/18 下午2:34
 * @modified
 */
public class MD5Util {

    /**
     * MD5加密
     *
     * @param str
     * @return
     */
    public static String encrypt(String str) {
        MessageDigest md;
        String str2 = null;
        try {
            md = MessageDigest.getInstance("md5");
            byte[] buf = md.digest(str.getBytes());
            str2 = Base64.encodeBase64String(buf);
        } catch (NoSuchAlgorithmException e) {
        }
        return str2;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(encrypt("1"));
    }
    //xMpCOKC5I4INzFCab3WEmw==
}
