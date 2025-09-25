package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能状态。
 */
public class FeatureStatus {

    /**
     * Enum ON for value: "on"
     */
    public static final FeatureStatus ON = new FeatureStatus("on");

    /**
     * Enum OFF for value: "off"
     */
    public static final FeatureStatus OFF = new FeatureStatus("off");

    /**
     * Enum PENDING for value: "pending"
     */
    public static final FeatureStatus PENDING = new FeatureStatus("pending");

    private static final Map<String, FeatureStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, FeatureStatus> createStaticFields() {
        Map<String, FeatureStatus> map = new HashMap<>();
        map.put("on", ON);
        map.put("off", OFF);
        map.put("pending", PENDING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FeatureStatus(String value) {
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
    public static FeatureStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FeatureStatus(value));
    }

    public static FeatureStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FeatureStatus) {
            return this.value.equals(((FeatureStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
