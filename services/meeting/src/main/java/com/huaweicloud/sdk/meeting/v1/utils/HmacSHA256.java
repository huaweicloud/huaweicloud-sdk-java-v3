package com.huaweicloud.sdk.meeting.v1.utils;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HmacSHA256 {

    /** 16进制0~F的字符数组 */
    private final static char[] DIGEST_ARRAYS =
        {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String encode(String data, String key) {
        byte[] hashByte;
        try {
            Mac sha256HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
            sha256HMAC.init(secretKey);

            hashByte = sha256HMAC.doFinal(data.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            return null;
        }

        return bytesToHex(hashByte);
    }

    /** bytesToHex()，用来把一个byte类型数组转换成十六进制字符串 */
    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexStr = new StringBuilder();
        for (byte b : bytes) {
            hexStr.append(DIGEST_ARRAYS[b >>> 4 & 0X0F]);
            hexStr.append(DIGEST_ARRAYS[b & 0X0F]);
        }

        return hexStr.toString();
    }

}
