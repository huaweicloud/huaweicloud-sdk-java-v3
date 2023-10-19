package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 审批状态。 - APPROVING (审批中) - APPROVED (已审批) - UNAPPROVED (审批未通过)
 */
public class ApprovedStateEnum {

    /**
     * Enum APPROVING for value: "APPROVING"
     */
    public static final ApprovedStateEnum APPROVING = new ApprovedStateEnum("APPROVING");

    /**
     * Enum APPROVED for value: "APPROVED"
     */
    public static final ApprovedStateEnum APPROVED = new ApprovedStateEnum("APPROVED");

    /**
     * Enum UNAPPROVED for value: "UNAPPROVED"
     */
    public static final ApprovedStateEnum UNAPPROVED = new ApprovedStateEnum("UNAPPROVED");

    private static final Map<String, ApprovedStateEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ApprovedStateEnum> createStaticFields() {
        Map<String, ApprovedStateEnum> map = new HashMap<>();
        map.put("APPROVING", APPROVING);
        map.put("APPROVED", APPROVED);
        map.put("UNAPPROVED", UNAPPROVED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ApprovedStateEnum(String value) {
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
    public static ApprovedStateEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApprovedStateEnum(value));
    }

    public static ApprovedStateEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ApprovedStateEnum) {
            return this.value.equals(((ApprovedStateEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
