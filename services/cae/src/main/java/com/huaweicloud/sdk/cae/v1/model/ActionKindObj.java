package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“Action”，该值不可修改。
 */
public class ActionKindObj {

    /**
     * Enum ACTION for value: "Action"
     */
    public static final ActionKindObj ACTION = new ActionKindObj("Action");

    private static final Map<String, ActionKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, ActionKindObj> createStaticFields() {
        Map<String, ActionKindObj> map = new HashMap<>();
        map.put("Action", ACTION);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ActionKindObj(String value) {
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
    public static ActionKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionKindObj(value));
    }

    public static ActionKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ActionKindObj) {
            return this.value.equals(((ActionKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
