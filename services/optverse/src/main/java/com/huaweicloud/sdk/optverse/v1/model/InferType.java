package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 推理类型。 **约束限制**： 不涉及 **取值范围**： * online：在线推理 * edge：边缘推理 **默认取值**： 不涉及 
 */
public class InferType {

    /**
     * Enum ONLINE for value: "online"
     */
    public static final InferType ONLINE = new InferType("online");

    /**
     * Enum EDGE for value: "edge"
     */
    public static final InferType EDGE = new InferType("edge");

    private static final Map<String, InferType> STATIC_FIELDS = createStaticFields();

    private static Map<String, InferType> createStaticFields() {
        Map<String, InferType> map = new HashMap<>();
        map.put("online", ONLINE);
        map.put("edge", EDGE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InferType(String value) {
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
    public static InferType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InferType(value));
    }

    public static InferType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InferType) {
            return this.value.equals(((InferType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
