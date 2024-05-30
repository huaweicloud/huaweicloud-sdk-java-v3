package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 关系类型，只读。 枚举值：   - ONE: 表示每条子（父）逻辑实体数据在父（子）逻辑实体中有且只有一条数据与之对应。   - ZERO_OR_ONE: 表示每条子（父）逻辑实体数据在父（子）逻辑实体中最多有一条数据与之对应。   - ZERO_OR_N: 表示每条子（父）逻辑实体数据在父（子）逻辑实体中可能有多条数据与之对应。   - ONE_OR_N: 表示每条子（父）逻辑实体数据在父（子）逻辑实体中至少有一条数据与之对应。 
 */
public class RelationType {

    /**
     * Enum ONE for value: "ONE"
     */
    public static final RelationType ONE = new RelationType("ONE");

    /**
     * Enum ZERO_OR_ONE for value: "ZERO_OR_ONE"
     */
    public static final RelationType ZERO_OR_ONE = new RelationType("ZERO_OR_ONE");

    /**
     * Enum ZERO_OR_N for value: "ZERO_OR_N"
     */
    public static final RelationType ZERO_OR_N = new RelationType("ZERO_OR_N");

    /**
     * Enum ONE_OR_N for value: "ONE_OR_N"
     */
    public static final RelationType ONE_OR_N = new RelationType("ONE_OR_N");

    private static final Map<String, RelationType> STATIC_FIELDS = createStaticFields();

    private static Map<String, RelationType> createStaticFields() {
        Map<String, RelationType> map = new HashMap<>();
        map.put("ONE", ONE);
        map.put("ZERO_OR_ONE", ZERO_OR_ONE);
        map.put("ZERO_OR_N", ZERO_OR_N);
        map.put("ONE_OR_N", ONE_OR_N);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RelationType(String value) {
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
    public static RelationType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RelationType(value));
    }

    public static RelationType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RelationType) {
            return this.value.equals(((RelationType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
