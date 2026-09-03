package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 技能包状态枚举。
 */
public class PackageStatusEnum {

    /**
     * Enum UPLOAD for value: "UPLOAD"
     */
    public static final PackageStatusEnum UPLOAD = new PackageStatusEnum("UPLOAD");

    /**
     * Enum PUBLISHED for value: "PUBLISHED"
     */
    public static final PackageStatusEnum PUBLISHED = new PackageStatusEnum("PUBLISHED");

    /**
     * Enum DISABLED for value: "DISABLED"
     */
    public static final PackageStatusEnum DISABLED = new PackageStatusEnum("DISABLED");

    private static final Map<String, PackageStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, PackageStatusEnum> createStaticFields() {
        Map<String, PackageStatusEnum> map = new HashMap<>();
        map.put("UPLOAD", UPLOAD);
        map.put("PUBLISHED", PUBLISHED);
        map.put("DISABLED", DISABLED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PackageStatusEnum(String value) {
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
    public static PackageStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PackageStatusEnum(value));
    }

    public static PackageStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PackageStatusEnum) {
            return this.value.equals(((PackageStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
