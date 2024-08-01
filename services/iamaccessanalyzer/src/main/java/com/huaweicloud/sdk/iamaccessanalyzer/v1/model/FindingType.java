package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 访问分析结果类型。
 */
public class FindingType {

    /**
     * Enum EXTERNAL_ACCESS for value: "external_access"
     */
    public static final FindingType EXTERNAL_ACCESS = new FindingType("external_access");

    /**
     * Enum UNUSED_IAM_USER_ACCESS_KEY for value: "unused_iam_user_access_key"
     */
    public static final FindingType UNUSED_IAM_USER_ACCESS_KEY = new FindingType("unused_iam_user_access_key");

    /**
     * Enum UNUSED_IAM_USER_PASSWORD for value: "unused_iam_user_password"
     */
    public static final FindingType UNUSED_IAM_USER_PASSWORD = new FindingType("unused_iam_user_password");

    private static final Map<String, FindingType> STATIC_FIELDS = createStaticFields();

    private static Map<String, FindingType> createStaticFields() {
        Map<String, FindingType> map = new HashMap<>();
        map.put("external_access", EXTERNAL_ACCESS);
        map.put("unused_iam_user_access_key", UNUSED_IAM_USER_ACCESS_KEY);
        map.put("unused_iam_user_password", UNUSED_IAM_USER_PASSWORD);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FindingType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static FindingType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FindingType(value));
    }

    public static FindingType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FindingType) {
            return this.value.equals(((FindingType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
