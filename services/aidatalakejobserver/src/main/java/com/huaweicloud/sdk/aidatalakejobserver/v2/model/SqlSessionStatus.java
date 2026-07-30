package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：SQL会话状态。 **取值范围**：    - RUNNING：运行中。   - CLOSED：已关闭。   - WAITING：等待中。   - CREATING：创建中。   - FAIL：失败。
 */
public class SqlSessionStatus {

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final SqlSessionStatus RUNNING = new SqlSessionStatus("RUNNING");

    /**
     * Enum CLOSED for value: "CLOSED"
     */
    public static final SqlSessionStatus CLOSED = new SqlSessionStatus("CLOSED");

    /**
     * Enum WAITING for value: "WAITING"
     */
    public static final SqlSessionStatus WAITING = new SqlSessionStatus("WAITING");

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final SqlSessionStatus CREATING = new SqlSessionStatus("CREATING");

    /**
     * Enum FAIL for value: "FAIL"
     */
    public static final SqlSessionStatus FAIL = new SqlSessionStatus("FAIL");

    private static final Map<String, SqlSessionStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, SqlSessionStatus> createStaticFields() {
        Map<String, SqlSessionStatus> map = new HashMap<>();
        map.put("RUNNING", RUNNING);
        map.put("CLOSED", CLOSED);
        map.put("WAITING", WAITING);
        map.put("CREATING", CREATING);
        map.put("FAIL", FAIL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SqlSessionStatus(String value) {
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
    public static SqlSessionStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SqlSessionStatus(value));
    }

    public static SqlSessionStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SqlSessionStatus) {
            return this.value.equals(((SqlSessionStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
