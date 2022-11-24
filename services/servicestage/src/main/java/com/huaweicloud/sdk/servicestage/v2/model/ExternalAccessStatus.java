package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 状态。
 */
public class ExternalAccessStatus {

    /**
     * Enum NORMAL for value: "NORMAL"
     */
    public static final ExternalAccessStatus NORMAL = new ExternalAccessStatus("NORMAL");

    /**
     * Enum EXPIRED for value: "EXPIRED"
     */
    public static final ExternalAccessStatus EXPIRED = new ExternalAccessStatus("EXPIRED");

    private static final Map<String, ExternalAccessStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ExternalAccessStatus> createStaticFields() {
        Map<String, ExternalAccessStatus> map = new HashMap<>();
        map.put("NORMAL", NORMAL);
        map.put("EXPIRED", EXPIRED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ExternalAccessStatus(String value) {
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
    public static ExternalAccessStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        ExternalAccessStatus result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ExternalAccessStatus(value);
        }
        return result;
    }

    public static ExternalAccessStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        ExternalAccessStatus result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ExternalAccessStatus) {
            return this.value.equals(((ExternalAccessStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
