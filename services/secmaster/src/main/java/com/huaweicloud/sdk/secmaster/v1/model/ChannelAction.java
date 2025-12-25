package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 节点运行状态的监控 - START 开始 - STOP 停止 - REMOVE 移除 - RESTART 重启 - REFRESH 刷新 - INSTALL 安装  **约束限制** 不涉及 **取值范围**: - START - STOP - REMOVE - RESTART - REFRESH - INSTALL  **默认值** 不涉及
 */
public class ChannelAction {

    /**
     * Enum START for value: "START"
     */
    public static final ChannelAction START = new ChannelAction("START");

    /**
     * Enum STOP for value: "STOP"
     */
    public static final ChannelAction STOP = new ChannelAction("STOP");

    /**
     * Enum REMOVE for value: "REMOVE"
     */
    public static final ChannelAction REMOVE = new ChannelAction("REMOVE");

    /**
     * Enum RESTART for value: "RESTART"
     */
    public static final ChannelAction RESTART = new ChannelAction("RESTART");

    /**
     * Enum REFRESH for value: "REFRESH"
     */
    public static final ChannelAction REFRESH = new ChannelAction("REFRESH");

    /**
     * Enum INSTALL for value: "INSTALL"
     */
    public static final ChannelAction INSTALL = new ChannelAction("INSTALL");

    private static final Map<String, ChannelAction> STATIC_FIELDS = createStaticFields();

    private static Map<String, ChannelAction> createStaticFields() {
        Map<String, ChannelAction> map = new HashMap<>();
        map.put("START", START);
        map.put("STOP", STOP);
        map.put("REMOVE", REMOVE);
        map.put("RESTART", RESTART);
        map.put("REFRESH", REFRESH);
        map.put("INSTALL", INSTALL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ChannelAction(String value) {
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
    public static ChannelAction fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChannelAction(value));
    }

    public static ChannelAction valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ChannelAction) {
            return this.value.equals(((ChannelAction) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
