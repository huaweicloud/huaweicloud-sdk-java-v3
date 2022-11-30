package com.huaweicloud.sdk.core.utils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;

public class RandomUtils {
    public static SecureRandom getDefaultSecureRandom() {
        String os = System.getProperty("os.name");
        try {
            if (os != null && os.toLowerCase(Locale.ROOT).startsWith("win")) {
                return SecureRandom.getInstanceStrong();
            } else {
                return SecureRandom.getInstance("NativePRNGNonBlocking");
            }
        } catch (NoSuchAlgorithmException ignore) {
            return new SecureRandom();
        }
    }
}
