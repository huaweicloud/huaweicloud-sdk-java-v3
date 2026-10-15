package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：作业停止策略。 **约束限制**：不涉及。 **取值范围**：   - NONE：立即停止，不保存状态。   - STOP_WITH_SAVEPOINT：停止前创建快照。   - STOP_WITH_DRAIN：Drain模式停止，先触发所有窗口计算并发送水位线，再创建快照停止。   - FORCE_CANCEL：强制取消，仅当作业已处于CANCELLING状态时可再次触发取消。 **默认取值**：不涉及。 
 */
public class FlinkJobCancelStrategy {

    /**
     * Enum NONE for value: "NONE"
     */
    public static final FlinkJobCancelStrategy NONE = new FlinkJobCancelStrategy("NONE");

    /**
     * Enum STOP_WITH_SAVEPOINT for value: "STOP_WITH_SAVEPOINT"
     */
    public static final FlinkJobCancelStrategy STOP_WITH_SAVEPOINT = new FlinkJobCancelStrategy("STOP_WITH_SAVEPOINT");

    /**
     * Enum STOP_WITH_DRAIN for value: "STOP_WITH_DRAIN"
     */
    public static final FlinkJobCancelStrategy STOP_WITH_DRAIN = new FlinkJobCancelStrategy("STOP_WITH_DRAIN");

    /**
     * Enum FORCE_CANCEL for value: "FORCE_CANCEL"
     */
    public static final FlinkJobCancelStrategy FORCE_CANCEL = new FlinkJobCancelStrategy("FORCE_CANCEL");

    private static final Map<String, FlinkJobCancelStrategy> STATIC_FIELDS = createStaticFields();

    private static Map<String, FlinkJobCancelStrategy> createStaticFields() {
        Map<String, FlinkJobCancelStrategy> map = new HashMap<>();
        map.put("NONE", NONE);
        map.put("STOP_WITH_SAVEPOINT", STOP_WITH_SAVEPOINT);
        map.put("STOP_WITH_DRAIN", STOP_WITH_DRAIN);
        map.put("FORCE_CANCEL", FORCE_CANCEL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FlinkJobCancelStrategy(String value) {
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
    public static FlinkJobCancelStrategy fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlinkJobCancelStrategy(value));
    }

    public static FlinkJobCancelStrategy valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FlinkJobCancelStrategy) {
            return this.value.equals(((FlinkJobCancelStrategy) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
