package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 存储方式： * &#x60;OBS&#x60; -  OBS桶存储。 * &#x60;LINK&#x60; - 外部存储,使用的可访问下载链接。
 */
public class FileStoreTypeEnum {

    /**
     * Enum OBS for value: "OBS"
     */
    public static final FileStoreTypeEnum OBS = new FileStoreTypeEnum("OBS");

    /**
     * Enum LINK for value: "LINK"
     */
    public static final FileStoreTypeEnum LINK = new FileStoreTypeEnum("LINK");

    private static final Map<String, FileStoreTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, FileStoreTypeEnum> createStaticFields() {
        Map<String, FileStoreTypeEnum> map = new HashMap<>();
        map.put("OBS", OBS);
        map.put("LINK", LINK);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FileStoreTypeEnum(String value) {
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
    public static FileStoreTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FileStoreTypeEnum(value));
    }

    public static FileStoreTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FileStoreTypeEnum) {
            return this.value.equals(((FileStoreTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
