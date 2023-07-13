package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 镜像类型 * &#x60;gold&#x60; - 云市场镜像 * &#x60;public&#x60; - 公共镜像 * &#x60;private&#x60; - 私有镜像 * &#x60;shared&#x60; - 共享镜像 * &#x60;other&#x60; - 其他
 */
public class ImageTypeEnum {

    /**
     * Enum GOLD for value: "gold"
     */
    public static final ImageTypeEnum GOLD = new ImageTypeEnum("gold");

    /**
     * Enum PUBLIC for value: "public"
     */
    public static final ImageTypeEnum PUBLIC = new ImageTypeEnum("public");

    /**
     * Enum PRIVATE for value: "private"
     */
    public static final ImageTypeEnum PRIVATE = new ImageTypeEnum("private");

    /**
     * Enum SHARED for value: "shared"
     */
    public static final ImageTypeEnum SHARED = new ImageTypeEnum("shared");

    /**
     * Enum OTHER for value: "other"
     */
    public static final ImageTypeEnum OTHER = new ImageTypeEnum("other");

    private static final Map<String, ImageTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ImageTypeEnum> createStaticFields() {
        Map<String, ImageTypeEnum> map = new HashMap<>();
        map.put("gold", GOLD);
        map.put("public", PUBLIC);
        map.put("private", PRIVATE);
        map.put("shared", SHARED);
        map.put("other", OTHER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ImageTypeEnum(String value) {
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
    public static ImageTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageTypeEnum(value));
    }

    public static ImageTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ImageTypeEnum) {
            return this.value.equals(((ImageTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
