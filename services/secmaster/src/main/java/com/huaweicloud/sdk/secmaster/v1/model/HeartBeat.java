package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 节点是否成功收到心跳信号 - ONLINE 在线 - OFFLINE 离线  **约束限制** 不涉及 **取值范围**: - ONLINE - OFFLINE  **默认值** 不涉及
 */
public class HeartBeat {

    /**
     * Enum ONLINE for value: "ONLINE"
     */
    public static final HeartBeat ONLINE = new HeartBeat("ONLINE");

    /**
     * Enum OFFLINE for value: "OFFLINE"
     */
    public static final HeartBeat OFFLINE = new HeartBeat("OFFLINE");

    private static final Map<String, HeartBeat> STATIC_FIELDS = createStaticFields();

    private static Map<String, HeartBeat> createStaticFields() {
        Map<String, HeartBeat> map = new HashMap<>();
        map.put("ONLINE", ONLINE);
        map.put("OFFLINE", OFFLINE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    HeartBeat(String value) {
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
    public static HeartBeat fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HeartBeat(value));
    }

    public static HeartBeat valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HeartBeat) {
            return this.value.equals(((HeartBeat) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
