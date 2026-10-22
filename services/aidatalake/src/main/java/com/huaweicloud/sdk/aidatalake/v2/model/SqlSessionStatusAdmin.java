package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：SQL会话状态。 **取值范围**：    - RUNNING：运行中。   - CLOSED：已关闭。   - WAITING：等待中。   - CREATING：创建中。   - FAIL：失败。
 */
public class SqlSessionStatusAdmin {

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final SqlSessionStatusAdmin RUNNING = new SqlSessionStatusAdmin("RUNNING");

    /**
     * Enum CLOSED for value: "CLOSED"
     */
    public static final SqlSessionStatusAdmin CLOSED = new SqlSessionStatusAdmin("CLOSED");

    /**
     * Enum WAITING for value: "WAITING"
     */
    public static final SqlSessionStatusAdmin WAITING = new SqlSessionStatusAdmin("WAITING");

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final SqlSessionStatusAdmin CREATING = new SqlSessionStatusAdmin("CREATING");

    /**
     * Enum FAIL for value: "FAIL"
     */
    public static final SqlSessionStatusAdmin FAIL = new SqlSessionStatusAdmin("FAIL");

    private static final Map<String, SqlSessionStatusAdmin> STATIC_FIELDS = createStaticFields();

    private static Map<String, SqlSessionStatusAdmin> createStaticFields() {
        Map<String, SqlSessionStatusAdmin> map = new HashMap<>();
        map.put("RUNNING", RUNNING);
        map.put("CLOSED", CLOSED);
        map.put("WAITING", WAITING);
        map.put("CREATING", CREATING);
        map.put("FAIL", FAIL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SqlSessionStatusAdmin(String value) {
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
    public static SqlSessionStatusAdmin fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SqlSessionStatusAdmin(value));
    }

    public static SqlSessionStatusAdmin valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SqlSessionStatusAdmin) {
            return this.value.equals(((SqlSessionStatusAdmin) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
