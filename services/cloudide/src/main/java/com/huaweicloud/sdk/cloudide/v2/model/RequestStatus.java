package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * An enumeration. - created - dispatched - completed - timeout - unknown
 */
public class RequestStatus {

    /**
     * Enum CREATED for value: "created"
     */
    public static final RequestStatus CREATED = new RequestStatus("created");

    /**
     * Enum DISPATCHED for value: "dispatched"
     */
    public static final RequestStatus DISPATCHED = new RequestStatus("dispatched");

    /**
     * Enum COMPLETED for value: "completed"
     */
    public static final RequestStatus COMPLETED = new RequestStatus("completed");

    /**
     * Enum TIMEOUT for value: "timeout"
     */
    public static final RequestStatus TIMEOUT = new RequestStatus("timeout");

    /**
     * Enum UNKNOWN for value: "unknown"
     */
    public static final RequestStatus UNKNOWN = new RequestStatus("unknown");

    private static final Map<String, RequestStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, RequestStatus> createStaticFields() {
        Map<String, RequestStatus> map = new HashMap<>();
        map.put("created", CREATED);
        map.put("dispatched", DISPATCHED);
        map.put("completed", COMPLETED);
        map.put("timeout", TIMEOUT);
        map.put("unknown", UNKNOWN);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RequestStatus(String value) {
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
    public static RequestStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        RequestStatus result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new RequestStatus(value);
        }
        return result;
    }

    public static RequestStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        RequestStatus result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RequestStatus) {
            return this.value.equals(((RequestStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
