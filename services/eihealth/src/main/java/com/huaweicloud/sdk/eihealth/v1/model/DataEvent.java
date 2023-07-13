package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets DataEvent
 */
public class DataEvent {

    /**
     * Enum READ for value: "READ"
     */
    public static final DataEvent READ = new DataEvent("READ");

    /**
     * Enum WRITE for value: "WRITE"
     */
    public static final DataEvent WRITE = new DataEvent("WRITE");

    private static final Map<String, DataEvent> STATIC_FIELDS = createStaticFields();

    private static Map<String, DataEvent> createStaticFields() {
        Map<String, DataEvent> map = new HashMap<>();
        map.put("READ", READ);
        map.put("WRITE", WRITE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DataEvent(String value) {
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
    public static DataEvent fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DataEvent(value));
    }

    public static DataEvent valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DataEvent) {
            return this.value.equals(((DataEvent) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
