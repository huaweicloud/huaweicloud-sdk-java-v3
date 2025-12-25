package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 采集通道失败类型 - SUCCESS 成功 - FILE_UPLOAD_ERROR 文件上传失败 - FILE_COPY_ERROR 文件复制失败 - FILE_ZIP_ERROR 文件压缩失败 - SALT_EXECUTE_ERROR Salt执行出错  **约束限制** 不涉及 **取值范围**: - SUCCESS - FILE_UPLOAD_ERROR - FILE_COPY_ERROR - FILE_ZIP_ERROR - SALT_EXECUTE_ERROR  **默认值** 不涉及
 */
public class ChannelErrorType {

    /**
     * Enum SUCCESS for value: "SUCCESS"
     */
    public static final ChannelErrorType SUCCESS = new ChannelErrorType("SUCCESS");

    /**
     * Enum FILE_UPLOAD_ERROR for value: "FILE_UPLOAD_ERROR"
     */
    public static final ChannelErrorType FILE_UPLOAD_ERROR = new ChannelErrorType("FILE_UPLOAD_ERROR");

    /**
     * Enum FILE_COPY_ERROR for value: "FILE_COPY_ERROR"
     */
    public static final ChannelErrorType FILE_COPY_ERROR = new ChannelErrorType("FILE_COPY_ERROR");

    /**
     * Enum FILE_ZIP_ERROR for value: "FILE_ZIP_ERROR"
     */
    public static final ChannelErrorType FILE_ZIP_ERROR = new ChannelErrorType("FILE_ZIP_ERROR");

    /**
     * Enum SALT_EXECUTE_ERROR for value: "SALT_EXECUTE_ERROR"
     */
    public static final ChannelErrorType SALT_EXECUTE_ERROR = new ChannelErrorType("SALT_EXECUTE_ERROR");

    private static final Map<String, ChannelErrorType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ChannelErrorType> createStaticFields() {
        Map<String, ChannelErrorType> map = new HashMap<>();
        map.put("SUCCESS", SUCCESS);
        map.put("FILE_UPLOAD_ERROR", FILE_UPLOAD_ERROR);
        map.put("FILE_COPY_ERROR", FILE_COPY_ERROR);
        map.put("FILE_ZIP_ERROR", FILE_ZIP_ERROR);
        map.put("SALT_EXECUTE_ERROR", SALT_EXECUTE_ERROR);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ChannelErrorType(String value) {
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
    public static ChannelErrorType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChannelErrorType(value));
    }

    public static ChannelErrorType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ChannelErrorType) {
            return this.value.equals(((ChannelErrorType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
