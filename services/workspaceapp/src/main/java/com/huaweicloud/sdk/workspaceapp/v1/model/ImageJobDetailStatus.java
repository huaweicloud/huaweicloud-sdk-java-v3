package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * job详情的状态 * &#x60;WAITING&#x60; - 等待 * &#x60;RUNNING&#x60; - 运行中 * &#x60;SUCCESS&#x60; - 成功 * &#x60;FAILED&#x60; - 失败 * &#x60;ABNORMAL&#x60; - 异常 * &#x60;ROLLBACK&#x60; - 回滚中 * &#x60;ABORTING&#x60; - 终止中
 */
public class ImageJobDetailStatus {

    /**
     * Enum WAITING for value: "WAITING"
     */
    public static final ImageJobDetailStatus WAITING = new ImageJobDetailStatus("WAITING");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final ImageJobDetailStatus RUNNING = new ImageJobDetailStatus("RUNNING");

    /**
     * Enum SUCCESS for value: "SUCCESS"
     */
    public static final ImageJobDetailStatus SUCCESS = new ImageJobDetailStatus("SUCCESS");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final ImageJobDetailStatus FAILED = new ImageJobDetailStatus("FAILED");

    /**
     * Enum ABNORMAL for value: "ABNORMAL"
     */
    public static final ImageJobDetailStatus ABNORMAL = new ImageJobDetailStatus("ABNORMAL");

    /**
     * Enum ROLLBACK for value: "ROLLBACK"
     */
    public static final ImageJobDetailStatus ROLLBACK = new ImageJobDetailStatus("ROLLBACK");

    /**
     * Enum ABORTING for value: "ABORTING"
     */
    public static final ImageJobDetailStatus ABORTING = new ImageJobDetailStatus("ABORTING");

    private static final Map<String, ImageJobDetailStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ImageJobDetailStatus> createStaticFields() {
        Map<String, ImageJobDetailStatus> map = new HashMap<>();
        map.put("WAITING", WAITING);
        map.put("RUNNING", RUNNING);
        map.put("SUCCESS", SUCCESS);
        map.put("FAILED", FAILED);
        map.put("ABNORMAL", ABNORMAL);
        map.put("ROLLBACK", ROLLBACK);
        map.put("ABORTING", ABORTING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ImageJobDetailStatus(String value) {
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
    public static ImageJobDetailStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageJobDetailStatus(value));
    }

    public static ImageJobDetailStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ImageJobDetailStatus) {
            return this.value.equals(((ImageJobDetailStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
