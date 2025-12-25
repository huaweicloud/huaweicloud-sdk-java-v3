package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 查询类型 - SQL SQL查询 - CBSL CBSL查询  **约束限制** 不涉及 **取值范围**: - SQL - CBSL  **默认值** 不涉及        
 */
public class QueryType {

    /**
     * Enum SQL for value: "SQL"
     */
    public static final QueryType SQL = new QueryType("SQL");

    /**
     * Enum CBSL for value: "CBSL"
     */
    public static final QueryType CBSL = new QueryType("CBSL");

    private static final Map<String, QueryType> STATIC_FIELDS = createStaticFields();

    private static Map<String, QueryType> createStaticFields() {
        Map<String, QueryType> map = new HashMap<>();
        map.put("SQL", SQL);
        map.put("CBSL", CBSL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    QueryType(String value) {
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
    public static QueryType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QueryType(value));
    }

    public static QueryType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof QueryType) {
            return this.value.equals(((QueryType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
