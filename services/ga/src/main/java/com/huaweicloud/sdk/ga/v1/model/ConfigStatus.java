package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 配置状态，取值： - ACTIVE：运行中 - PENDING：待定 - ERROR：错误 - DELETING：正在删除
 */
public class ConfigStatus {

    /**
     * Enum ACTIVE for value: "ACTIVE"
     */
    public static final ConfigStatus ACTIVE = new ConfigStatus("ACTIVE");

    /**
     * Enum PENDING for value: "PENDING"
     */
    public static final ConfigStatus PENDING = new ConfigStatus("PENDING");

    /**
     * Enum ERROR for value: "ERROR"
     */
    public static final ConfigStatus ERROR = new ConfigStatus("ERROR");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final ConfigStatus DELETING = new ConfigStatus("DELETING");

    private static final Map<String, ConfigStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ConfigStatus> createStaticFields() {
        Map<String, ConfigStatus> map = new HashMap<>();
        map.put("ACTIVE", ACTIVE);
        map.put("PENDING", PENDING);
        map.put("ERROR", ERROR);
        map.put("DELETING", DELETING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ConfigStatus(String value) {
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
    public static ConfigStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        ConfigStatus result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ConfigStatus(value);
        }
        return result;
    }

    public static ConfigStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        ConfigStatus result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ConfigStatus) {
            return this.value.equals(((ConfigStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
