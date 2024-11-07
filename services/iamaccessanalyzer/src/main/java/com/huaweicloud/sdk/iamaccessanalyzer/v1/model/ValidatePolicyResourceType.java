package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 要附加到资源策略的资源类型。
 */
public class ValidatePolicyResourceType {

    /**
     * Enum IAM_AGENCY for value: "iam:agency"
     */
    public static final ValidatePolicyResourceType IAM_AGENCY = new ValidatePolicyResourceType("iam:agency");

    private static final Map<String, ValidatePolicyResourceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ValidatePolicyResourceType> createStaticFields() {
        Map<String, ValidatePolicyResourceType> map = new HashMap<>();
        map.put("iam:agency", IAM_AGENCY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ValidatePolicyResourceType(String value) {
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
    public static ValidatePolicyResourceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ValidatePolicyResourceType(value));
    }

    public static ValidatePolicyResourceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ValidatePolicyResourceType) {
            return this.value.equals(((ValidatePolicyResourceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
