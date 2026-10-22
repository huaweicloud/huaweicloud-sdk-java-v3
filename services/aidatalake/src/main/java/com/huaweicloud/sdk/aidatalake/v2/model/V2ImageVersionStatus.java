package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：镜像版本状态。 **取值范围**：   - AVAILABLE：可用。   - UNAVAILABLE：不可用。   - UNKNOWN：未知。
 */
public class V2ImageVersionStatus {

    /**
     * Enum AVAILABLE for value: "AVAILABLE"
     */
    public static final V2ImageVersionStatus AVAILABLE = new V2ImageVersionStatus("AVAILABLE");

    /**
     * Enum UNAVAILABLE for value: "UNAVAILABLE"
     */
    public static final V2ImageVersionStatus UNAVAILABLE = new V2ImageVersionStatus("UNAVAILABLE");

    /**
     * Enum UNKNOWN for value: "UNKNOWN"
     */
    public static final V2ImageVersionStatus UNKNOWN = new V2ImageVersionStatus("UNKNOWN");

    private static final Map<String, V2ImageVersionStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, V2ImageVersionStatus> createStaticFields() {
        Map<String, V2ImageVersionStatus> map = new HashMap<>();
        map.put("AVAILABLE", AVAILABLE);
        map.put("UNAVAILABLE", UNAVAILABLE);
        map.put("UNKNOWN", UNKNOWN);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    V2ImageVersionStatus(String value) {
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
    public static V2ImageVersionStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new V2ImageVersionStatus(value));
    }

    public static V2ImageVersionStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof V2ImageVersionStatus) {
            return this.value.equals(((V2ImageVersionStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
