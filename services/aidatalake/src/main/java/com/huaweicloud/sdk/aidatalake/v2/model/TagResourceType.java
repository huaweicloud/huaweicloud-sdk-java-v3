package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：资源类型，用于指定需要打标签的资源类型，取值包括：   - aidatalake-workspace：工作空间。   - aidatalake-endpoint-ray：Ray引擎端点。   - aidatalake-endpoint-aura：Aura引擎端点。   - aidatalake-endpoint-spark：Spark引擎端点。   - aidatalake-endpoint-flink：Flink引擎端点。   - aidatalake-compute：计算资源。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class TagResourceType {

    /**
     * Enum AIDATALAKE_WORKSPACE for value: "aidatalake-workspace"
     */
    public static final TagResourceType AIDATALAKE_WORKSPACE = new TagResourceType("aidatalake-workspace");

    /**
     * Enum AIDATALAKE_ENDPOINT_RAY for value: "aidatalake-endpoint-ray"
     */
    public static final TagResourceType AIDATALAKE_ENDPOINT_RAY = new TagResourceType("aidatalake-endpoint-ray");

    /**
     * Enum AIDATALAKE_ENDPOINT_AURA for value: "aidatalake-endpoint-aura"
     */
    public static final TagResourceType AIDATALAKE_ENDPOINT_AURA = new TagResourceType("aidatalake-endpoint-aura");

    /**
     * Enum AIDATALAKE_ENDPOINT_SPARK for value: "aidatalake-endpoint-spark"
     */
    public static final TagResourceType AIDATALAKE_ENDPOINT_SPARK = new TagResourceType("aidatalake-endpoint-spark");

    /**
     * Enum AIDATALAKE_ENDPOINT_FLINK for value: "aidatalake-endpoint-flink"
     */
    public static final TagResourceType AIDATALAKE_ENDPOINT_FLINK = new TagResourceType("aidatalake-endpoint-flink");

    /**
     * Enum AIDATALAKE_COMPUTE for value: "aidatalake-compute"
     */
    public static final TagResourceType AIDATALAKE_COMPUTE = new TagResourceType("aidatalake-compute");

    private static final Map<String, TagResourceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, TagResourceType> createStaticFields() {
        Map<String, TagResourceType> map = new HashMap<>();
        map.put("aidatalake-workspace", AIDATALAKE_WORKSPACE);
        map.put("aidatalake-endpoint-ray", AIDATALAKE_ENDPOINT_RAY);
        map.put("aidatalake-endpoint-aura", AIDATALAKE_ENDPOINT_AURA);
        map.put("aidatalake-endpoint-spark", AIDATALAKE_ENDPOINT_SPARK);
        map.put("aidatalake-endpoint-flink", AIDATALAKE_ENDPOINT_FLINK);
        map.put("aidatalake-compute", AIDATALAKE_COMPUTE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TagResourceType(String value) {
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
    public static TagResourceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TagResourceType(value));
    }

    public static TagResourceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TagResourceType) {
            return this.value.equals(((TagResourceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
