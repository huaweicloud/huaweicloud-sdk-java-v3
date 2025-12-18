package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：网络大脑作业诊断类型。 **取值范围**：   - PARAMETER_PLANES：参数面诊断
 */
public class NetworkDiagnosisJobType {

    /**
     * Enum PARAMETER_PLANE for value: "PARAMETER_PLANE"
     */
    public static final NetworkDiagnosisJobType PARAMETER_PLANE = new NetworkDiagnosisJobType("PARAMETER_PLANE");

    private static final Map<String, NetworkDiagnosisJobType> STATIC_FIELDS = createStaticFields();

    private static Map<String, NetworkDiagnosisJobType> createStaticFields() {
        Map<String, NetworkDiagnosisJobType> map = new HashMap<>();
        map.put("PARAMETER_PLANE", PARAMETER_PLANE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    NetworkDiagnosisJobType(String value) {
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
    public static NetworkDiagnosisJobType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkDiagnosisJobType(value));
    }

    public static NetworkDiagnosisJobType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NetworkDiagnosisJobType) {
            return this.value.equals(((NetworkDiagnosisJobType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
