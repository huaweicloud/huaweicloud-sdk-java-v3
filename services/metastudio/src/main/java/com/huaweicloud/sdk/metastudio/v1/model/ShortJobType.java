package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 短任务类型。 * VOICE_ASSESS: 声音质量检测
 */
public class ShortJobType {

    /**
     * Enum VOICE_ASSESS for value: "VOICE_ASSESS"
     */
    public static final ShortJobType VOICE_ASSESS = new ShortJobType("VOICE_ASSESS");

    private static final Map<String, ShortJobType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ShortJobType> createStaticFields() {
        Map<String, ShortJobType> map = new HashMap<>();
        map.put("VOICE_ASSESS", VOICE_ASSESS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ShortJobType(String value) {
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
    public static ShortJobType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ShortJobType(value));
    }

    public static ShortJobType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ShortJobType) {
            return this.value.equals(((ShortJobType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
