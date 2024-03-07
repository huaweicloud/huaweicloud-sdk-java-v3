package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 访问预览的状态。
 */
public class AccessPreviewStatus {

    /**
     * Enum CREATING for value: "creating"
     */
    public static final AccessPreviewStatus CREATING = new AccessPreviewStatus("creating");

    /**
     * Enum COMPLETED for value: "completed"
     */
    public static final AccessPreviewStatus COMPLETED = new AccessPreviewStatus("completed");

    /**
     * Enum FAILED for value: "failed"
     */
    public static final AccessPreviewStatus FAILED = new AccessPreviewStatus("failed");

    private static final Map<String, AccessPreviewStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, AccessPreviewStatus> createStaticFields() {
        Map<String, AccessPreviewStatus> map = new HashMap<>();
        map.put("creating", CREATING);
        map.put("completed", COMPLETED);
        map.put("failed", FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AccessPreviewStatus(String value) {
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
    public static AccessPreviewStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessPreviewStatus(value));
    }

    public static AccessPreviewStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AccessPreviewStatus) {
            return this.value.equals(((AccessPreviewStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
