package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 交互对接类型 * LIVE:直播交互 * CHAT:智能交互
 */
public class RobotTypeEnum {

    /**
     * Enum LIVE for value: "LIVE"
     */
    public static final RobotTypeEnum LIVE = new RobotTypeEnum("LIVE");

    /**
     * Enum CHAT for value: "CHAT"
     */
    public static final RobotTypeEnum CHAT = new RobotTypeEnum("CHAT");

    private static final Map<String, RobotTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, RobotTypeEnum> createStaticFields() {
        Map<String, RobotTypeEnum> map = new HashMap<>();
        map.put("LIVE", LIVE);
        map.put("CHAT", CHAT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RobotTypeEnum(String value) {
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
    public static RobotTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RobotTypeEnum(value));
    }

    public static RobotTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RobotTypeEnum) {
            return this.value.equals(((RobotTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
