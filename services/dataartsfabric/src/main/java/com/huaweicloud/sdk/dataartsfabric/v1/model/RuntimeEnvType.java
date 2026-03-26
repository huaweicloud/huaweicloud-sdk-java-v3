package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：运行环境。 **约束限制**：不涉及。 **取值范围**：   - RELEASE：表示运行在生产引擎实例环境中；   - GRAY：表示运行在灰度引擎实例环境中。 **默认取值**：不涉及。 
 */
public class RuntimeEnvType {

    /**
     * Enum RELEASE for value: "RELEASE"
     */
    public static final RuntimeEnvType RELEASE = new RuntimeEnvType("RELEASE");

    /**
     * Enum GRAY for value: "GRAY"
     */
    public static final RuntimeEnvType GRAY = new RuntimeEnvType("GRAY");

    private static final Map<String, RuntimeEnvType> STATIC_FIELDS = createStaticFields();

    private static Map<String, RuntimeEnvType> createStaticFields() {
        Map<String, RuntimeEnvType> map = new HashMap<>();
        map.put("RELEASE", RELEASE);
        map.put("GRAY", GRAY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RuntimeEnvType(String value) {
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
    public static RuntimeEnvType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuntimeEnvType(value));
    }

    public static RuntimeEnvType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RuntimeEnvType) {
            return this.value.equals(((RuntimeEnvType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
