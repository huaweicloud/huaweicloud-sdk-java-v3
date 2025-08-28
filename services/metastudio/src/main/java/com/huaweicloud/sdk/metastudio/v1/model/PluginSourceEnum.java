package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 使用的插件来源 * PLUGIN_CONFIG：插件配置 * DEFAULT：默认
 */
public class PluginSourceEnum {

    /**
     * Enum PLUGIN_CONFIG for value: "PLUGIN_CONFIG"
     */
    public static final PluginSourceEnum PLUGIN_CONFIG = new PluginSourceEnum("PLUGIN_CONFIG");

    /**
     * Enum DEFAULT for value: "DEFAULT"
     */
    public static final PluginSourceEnum DEFAULT = new PluginSourceEnum("DEFAULT");

    private static final Map<String, PluginSourceEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, PluginSourceEnum> createStaticFields() {
        Map<String, PluginSourceEnum> map = new HashMap<>();
        map.put("PLUGIN_CONFIG", PLUGIN_CONFIG);
        map.put("DEFAULT", DEFAULT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PluginSourceEnum(String value) {
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
    public static PluginSourceEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PluginSourceEnum(value));
    }

    public static PluginSourceEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PluginSourceEnum) {
            return this.value.equals(((PluginSourceEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
