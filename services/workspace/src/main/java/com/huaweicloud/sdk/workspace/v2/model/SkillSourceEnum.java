package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 技能来源枚举。
 */
public class SkillSourceEnum {

    /**
     * Enum CUSTOM for value: "CUSTOM"
     */
    public static final SkillSourceEnum CUSTOM = new SkillSourceEnum("CUSTOM");

    /**
     * Enum OFFICIAL for value: "OFFICIAL"
     */
    public static final SkillSourceEnum OFFICIAL = new SkillSourceEnum("OFFICIAL");

    /**
     * Enum MARKETPLACE for value: "MARKETPLACE"
     */
    public static final SkillSourceEnum MARKETPLACE = new SkillSourceEnum("MARKETPLACE");

    private static final Map<String, SkillSourceEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SkillSourceEnum> createStaticFields() {
        Map<String, SkillSourceEnum> map = new HashMap<>();
        map.put("CUSTOM", CUSTOM);
        map.put("OFFICIAL", OFFICIAL);
        map.put("MARKETPLACE", MARKETPLACE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SkillSourceEnum(String value) {
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
    public static SkillSourceEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SkillSourceEnum(value));
    }

    public static SkillSourceEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SkillSourceEnum) {
            return this.value.equals(((SkillSourceEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
