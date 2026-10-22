package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：自定义镜像分类。 **取值范围**：   - RAY_BASIC：基于Ray构建的自定义镜像。   - SPARK_JOB：基于SparkJob构建的自定义镜像。   - SPARK_SQL：基于SparkSql构建的自定义镜像。   - FLINK_JOB：基于FlinkJob构建的自定义镜像。   - AURA_JOB：基于AuraJobV2构建的自定义镜像。
 */
public class V2ImageCategory {

    /**
     * Enum RAY_BASIC for value: "RAY_BASIC"
     */
    public static final V2ImageCategory RAY_BASIC = new V2ImageCategory("RAY_BASIC");

    /**
     * Enum SPARK_JOB for value: "SPARK_JOB"
     */
    public static final V2ImageCategory SPARK_JOB = new V2ImageCategory("SPARK_JOB");

    /**
     * Enum SPARK_SQL for value: "SPARK_SQL"
     */
    public static final V2ImageCategory SPARK_SQL = new V2ImageCategory("SPARK_SQL");

    /**
     * Enum FLINK_JOB for value: "FLINK_JOB"
     */
    public static final V2ImageCategory FLINK_JOB = new V2ImageCategory("FLINK_JOB");

    /**
     * Enum AURA_JOB for value: "AURA_JOB"
     */
    public static final V2ImageCategory AURA_JOB = new V2ImageCategory("AURA_JOB");

    private static final Map<String, V2ImageCategory> STATIC_FIELDS = createStaticFields();

    private static Map<String, V2ImageCategory> createStaticFields() {
        Map<String, V2ImageCategory> map = new HashMap<>();
        map.put("RAY_BASIC", RAY_BASIC);
        map.put("SPARK_JOB", SPARK_JOB);
        map.put("SPARK_SQL", SPARK_SQL);
        map.put("FLINK_JOB", FLINK_JOB);
        map.put("AURA_JOB", AURA_JOB);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    V2ImageCategory(String value) {
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
    public static V2ImageCategory fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new V2ImageCategory(value));
    }

    public static V2ImageCategory valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof V2ImageCategory) {
            return this.value.equals(((V2ImageCategory) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
