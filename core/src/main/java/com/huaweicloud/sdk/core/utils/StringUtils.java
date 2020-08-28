package com.huaweicloud.sdk.core.utils;

/**
 * The type String utils
 */
public class StringUtils {
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static String camelToUnderscore(String camelString) {
        StringBuilder sb = new StringBuilder(camelString);
        int temp = 0;
        if (!camelString.contains("_")) {
            for (int i = 0; i < camelString.length(); i++) {
                if (Character.isUpperCase(camelString.charAt(i))) {
                    sb.insert(i + temp, "_");
                    temp += 1;
                }
            }
        }
        return sb.toString();
    }
}
