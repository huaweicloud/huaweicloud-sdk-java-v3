package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * job状态。 * &#x60;WAITING&#x60; - 等待 * &#x60;RUNNING&#x60; - 运行中 * &#x60;SUCCESS - 完成 * &#x60;FAILED&#x60; - 失败
 */
public class ImageJobStatus {

    /**
     * Enum WAITING for value: "WAITING"
     */
    public static final ImageJobStatus WAITING = new ImageJobStatus("WAITING");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final ImageJobStatus RUNNING = new ImageJobStatus("RUNNING");

    /**
     * Enum SUCCESS for value: "SUCCESS"
     */
    public static final ImageJobStatus SUCCESS = new ImageJobStatus("SUCCESS");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final ImageJobStatus FAILED = new ImageJobStatus("FAILED");

    private static final Map<String, ImageJobStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ImageJobStatus> createStaticFields() {
        Map<String, ImageJobStatus> map = new HashMap<>();
        map.put("WAITING", WAITING);
        map.put("RUNNING", RUNNING);
        map.put("SUCCESS", SUCCESS);
        map.put("FAILED", FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ImageJobStatus(String value) {
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
    public static ImageJobStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageJobStatus(value));
    }

    public static ImageJobStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ImageJobStatus) {
            return this.value.equals(((ImageJobStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
