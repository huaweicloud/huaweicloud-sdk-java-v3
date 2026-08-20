package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：集群重启策略，用于指定重启方式。 **约束限制**：不涉及。 **取值范围**：         - FORCE：强制重启，不等待正在运行的作业完成。 - GRACEFUL：优雅重启，等待所有正在运行的作业完成后再重启。 **默认取值**：不涉及。 
 */
public class SparkSqlRestartStrategy {

    /**
     * Enum FORCE for value: "FORCE"
     */
    public static final SparkSqlRestartStrategy FORCE = new SparkSqlRestartStrategy("FORCE");

    /**
     * Enum GRACEFUL for value: "GRACEFUL"
     */
    public static final SparkSqlRestartStrategy GRACEFUL = new SparkSqlRestartStrategy("GRACEFUL");

    private static final Map<String, SparkSqlRestartStrategy> STATIC_FIELDS = createStaticFields();

    private static Map<String, SparkSqlRestartStrategy> createStaticFields() {
        Map<String, SparkSqlRestartStrategy> map = new HashMap<>();
        map.put("FORCE", FORCE);
        map.put("GRACEFUL", GRACEFUL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SparkSqlRestartStrategy(String value) {
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
    public static SparkSqlRestartStrategy fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SparkSqlRestartStrategy(value));
    }

    public static SparkSqlRestartStrategy valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SparkSqlRestartStrategy) {
            return this.value.equals(((SparkSqlRestartStrategy) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
