package com.huaweicloud.sdk.meeting.v1.utils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HmacSHA256 {

    /**
     * 16进制0~F的字符数组
     */
    private final static char[] DIGEST_ARRAYS = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
    };

    public static String encode(String data, String key) {
        byte[] hashByte;
        try {
            Mac sha256HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
            sha256HMAC.init(secretKey);

            hashByte = sha256HMAC.doFinal(data.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException | InvalidKeyException e) {
            return null;
        }

        return bytesToHex(hashByte);
    }

    /*
     * bytesToHex()，用来把一个byte类型数组转换成十六进制字符串
     */
    private static String bytesToHex(byte[] bytes) {
        StringBuffer hexStr = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            hexStr.append(DIGEST_ARRAYS[bytes[i] >>> 4 & 0X0F]);
            hexStr.append(DIGEST_ARRAYS[bytes[i] & 0X0F]);
        }

        return hexStr.toString();
    }

}
