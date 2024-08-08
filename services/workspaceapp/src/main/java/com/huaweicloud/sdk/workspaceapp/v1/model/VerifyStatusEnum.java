package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 审核状态： * &#x60;VERIFYING&#x60; - 审核中 * &#x60;VERIFY_PASS&#x60; - 审核通过 * &#x60;Verify_FAIL&#x60; - 审核不通过
 */
public class VerifyStatusEnum {

    /**
     * Enum VERIFYING for value: "VERIFYING"
     */
    public static final VerifyStatusEnum VERIFYING = new VerifyStatusEnum("VERIFYING");

    /**
     * Enum VERIFY_PASS for value: "VERIFY_PASS"
     */
    public static final VerifyStatusEnum VERIFY_PASS = new VerifyStatusEnum("VERIFY_PASS");

    /**
     * Enum VERIFY_FAIL for value: "Verify_FAIL"
     */
    public static final VerifyStatusEnum VERIFY_FAIL = new VerifyStatusEnum("Verify_FAIL");

    private static final Map<String, VerifyStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, VerifyStatusEnum> createStaticFields() {
        Map<String, VerifyStatusEnum> map = new HashMap<>();
        map.put("VERIFYING", VERIFYING);
        map.put("VERIFY_PASS", VERIFY_PASS);
        map.put("Verify_FAIL", VERIFY_FAIL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    VerifyStatusEnum(String value) {
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
    public static VerifyStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VerifyStatusEnum(value));
    }

    public static VerifyStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VerifyStatusEnum) {
            return this.value.equals(((VerifyStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
