package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：   - AuraJob：AuraJob引擎。   - SparkSql：SparkSql引擎。   - SparkJob：SparkJob引擎。   - FlinkJob：FlinkJob引擎。   - RayCluster：RayCluster引擎。   - RayJob：RayJob引擎。   - AuraJobV2：AuraJobV2引擎。   - RayService：RayService引擎。 **默认取值**：不涉及。
 */
public class EngineType {

    /**
     * Enum AURAJOB for value: "AuraJob"
     */
    public static final EngineType AURAJOB = new EngineType("AuraJob");

    /**
     * Enum SPARKSQL for value: "SparkSql"
     */
    public static final EngineType SPARKSQL = new EngineType("SparkSql");

    /**
     * Enum SPARKJOB for value: "SparkJob"
     */
    public static final EngineType SPARKJOB = new EngineType("SparkJob");

    /**
     * Enum FLINKJOB for value: "FlinkJob"
     */
    public static final EngineType FLINKJOB = new EngineType("FlinkJob");

    /**
     * Enum RAYCLUSTER for value: "RayCluster"
     */
    public static final EngineType RAYCLUSTER = new EngineType("RayCluster");

    /**
     * Enum RAYJOB for value: "RayJob"
     */
    public static final EngineType RAYJOB = new EngineType("RayJob");

    /**
     * Enum AURAJOBV2_ for value: "AuraJobV2作业管理"
     */
    public static final EngineType AURAJOBV2_ = new EngineType("AuraJobV2作业管理");

    /**
     * Enum RAYSERVICE for value: "RayService"
     */
    public static final EngineType RAYSERVICE = new EngineType("RayService");

    private static final Map<String, EngineType> STATIC_FIELDS = createStaticFields();

    private static Map<String, EngineType> createStaticFields() {
        Map<String, EngineType> map = new HashMap<>();
        map.put("AuraJob", AURAJOB);
        map.put("SparkSql", SPARKSQL);
        map.put("SparkJob", SPARKJOB);
        map.put("FlinkJob", FLINKJOB);
        map.put("RayCluster", RAYCLUSTER);
        map.put("RayJob", RAYJOB);
        map.put("AuraJobV2作业管理", AURAJOBV2_);
        map.put("RayService", RAYSERVICE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EngineType(String value) {
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
    public static EngineType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineType(value));
    }

    public static EngineType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EngineType) {
            return this.value.equals(((EngineType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
