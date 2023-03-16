package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets NoticeOperation
 */
public class NoticeOperation {

    /**
     * Enum READ for value: "read"
     */
    public static final NoticeOperation READ = new NoticeOperation("read");

    private static final Map<String, NoticeOperation> STATIC_FIELDS = createStaticFields();

    private static Map<String, NoticeOperation> createStaticFields() {
        Map<String, NoticeOperation> map = new HashMap<>();
        map.put("read", READ);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    NoticeOperation(String value) {
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
    public static NoticeOperation fromValue(String value) {
        if (value == null) {
            return null;
        }
        NoticeOperation result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new NoticeOperation(value);
        }
        return result;
    }

    public static NoticeOperation valueOf(String value) {
        if (value == null) {
            return null;
        }
        NoticeOperation result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NoticeOperation) {
            return this.value.equals(((NoticeOperation) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
