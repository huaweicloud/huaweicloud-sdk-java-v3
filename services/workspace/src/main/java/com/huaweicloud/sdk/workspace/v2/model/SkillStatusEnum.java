package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 技能状态枚举。
 */
public class SkillStatusEnum {

    /**
     * Enum ACTIVE for value: "ACTIVE"
     */
    public static final SkillStatusEnum ACTIVE = new SkillStatusEnum("ACTIVE");

    /**
     * Enum DISABLED for value: "DISABLED"
     */
    public static final SkillStatusEnum DISABLED = new SkillStatusEnum("DISABLED");

    private static final Map<String, SkillStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SkillStatusEnum> createStaticFields() {
        Map<String, SkillStatusEnum> map = new HashMap<>();
        map.put("ACTIVE", ACTIVE);
        map.put("DISABLED", DISABLED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SkillStatusEnum(String value) {
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
    public static SkillStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SkillStatusEnum(value));
    }

    public static SkillStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SkillStatusEnum) {
            return this.value.equals(((SkillStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
