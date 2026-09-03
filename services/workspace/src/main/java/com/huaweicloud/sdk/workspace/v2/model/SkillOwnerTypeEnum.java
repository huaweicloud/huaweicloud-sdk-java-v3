package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 技能所有者类型枚举。
 */
public class SkillOwnerTypeEnum {

    /**
     * Enum COMMON for value: "COMMON"
     */
    public static final SkillOwnerTypeEnum COMMON = new SkillOwnerTypeEnum("COMMON");

    /**
     * Enum TENANT for value: "TENANT"
     */
    public static final SkillOwnerTypeEnum TENANT = new SkillOwnerTypeEnum("TENANT");

    private static final Map<String, SkillOwnerTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SkillOwnerTypeEnum> createStaticFields() {
        Map<String, SkillOwnerTypeEnum> map = new HashMap<>();
        map.put("COMMON", COMMON);
        map.put("TENANT", TENANT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SkillOwnerTypeEnum(String value) {
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
    public static SkillOwnerTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SkillOwnerTypeEnum(value));
    }

    public static SkillOwnerTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SkillOwnerTypeEnum) {
            return this.value.equals(((SkillOwnerTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
