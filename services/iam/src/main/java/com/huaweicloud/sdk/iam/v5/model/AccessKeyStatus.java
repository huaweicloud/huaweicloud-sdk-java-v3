package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 访问密钥状态，可以为“启用”（active）或“停用”（inactive）。
 */
public class AccessKeyStatus {

    /**
     * Enum ACTIVE for value: "active"
     */
    public static final AccessKeyStatus ACTIVE = new AccessKeyStatus("active");

    /**
     * Enum INACTIVE for value: "inactive"
     */
    public static final AccessKeyStatus INACTIVE = new AccessKeyStatus("inactive");

    private static final Map<String, AccessKeyStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, AccessKeyStatus> createStaticFields() {
        Map<String, AccessKeyStatus> map = new HashMap<>();
        map.put("active", ACTIVE);
        map.put("inactive", INACTIVE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AccessKeyStatus(String value) {
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
    public static AccessKeyStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessKeyStatus(value));
    }

    public static AccessKeyStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AccessKeyStatus) {
            return this.value.equals(((AccessKeyStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
