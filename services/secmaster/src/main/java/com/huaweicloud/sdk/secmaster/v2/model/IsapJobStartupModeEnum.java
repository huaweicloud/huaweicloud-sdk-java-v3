package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 作业启动模式 - UPGRADE 升级启动 - REFRESH_NEW 全新启动  **约束限制** 不涉及 **取值范围**: - UPGRADE - REFRESH_NEW  **默认值** 不涉及      
 */
public class IsapJobStartupModeEnum {

    /**
     * Enum UPGRADE for value: "UPGRADE"
     */
    public static final IsapJobStartupModeEnum UPGRADE = new IsapJobStartupModeEnum("UPGRADE");

    /**
     * Enum REFRESH_NEW for value: "REFRESH_NEW"
     */
    public static final IsapJobStartupModeEnum REFRESH_NEW = new IsapJobStartupModeEnum("REFRESH_NEW");

    private static final Map<String, IsapJobStartupModeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, IsapJobStartupModeEnum> createStaticFields() {
        Map<String, IsapJobStartupModeEnum> map = new HashMap<>();
        map.put("UPGRADE", UPGRADE);
        map.put("REFRESH_NEW", REFRESH_NEW);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    IsapJobStartupModeEnum(String value) {
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
    public static IsapJobStartupModeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsapJobStartupModeEnum(value));
    }

    public static IsapJobStartupModeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IsapJobStartupModeEnum) {
            return this.value.equals(((IsapJobStartupModeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
