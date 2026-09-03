package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 上传状态枚举。
 */
public class UploadStatusEnum {

    /**
     * Enum UPLOADING for value: "UPLOADING"
     */
    public static final UploadStatusEnum UPLOADING = new UploadStatusEnum("UPLOADING");

    /**
     * Enum UPLOADED for value: "UPLOADED"
     */
    public static final UploadStatusEnum UPLOADED = new UploadStatusEnum("UPLOADED");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final UploadStatusEnum FAILED = new UploadStatusEnum("FAILED");

    private static final Map<String, UploadStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, UploadStatusEnum> createStaticFields() {
        Map<String, UploadStatusEnum> map = new HashMap<>();
        map.put("UPLOADING", UPLOADING);
        map.put("UPLOADED", UPLOADED);
        map.put("FAILED", FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    UploadStatusEnum(String value) {
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
    public static UploadStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UploadStatusEnum(value));
    }

    public static UploadStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UploadStatusEnum) {
            return this.value.equals(((UploadStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
