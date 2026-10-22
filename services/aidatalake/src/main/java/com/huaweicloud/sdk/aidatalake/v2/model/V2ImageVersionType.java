package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：版本类型。 **约束限制**：不涉及。 **取值范围**：   - STABLE：稳定版本。   - RECOMMEND：推荐版本。   - BETA：测试版本。 **默认取值**：不涉及。
 */
public class V2ImageVersionType {

    /**
     * Enum STABLE for value: "STABLE"
     */
    public static final V2ImageVersionType STABLE = new V2ImageVersionType("STABLE");

    /**
     * Enum RECOMMEND for value: "RECOMMEND"
     */
    public static final V2ImageVersionType RECOMMEND = new V2ImageVersionType("RECOMMEND");

    /**
     * Enum BETA for value: "BETA"
     */
    public static final V2ImageVersionType BETA = new V2ImageVersionType("BETA");

    private static final Map<String, V2ImageVersionType> STATIC_FIELDS = createStaticFields();

    private static Map<String, V2ImageVersionType> createStaticFields() {
        Map<String, V2ImageVersionType> map = new HashMap<>();
        map.put("STABLE", STABLE);
        map.put("RECOMMEND", RECOMMEND);
        map.put("BETA", BETA);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    V2ImageVersionType(String value) {
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
    public static V2ImageVersionType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new V2ImageVersionType(value));
    }

    public static V2ImageVersionType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof V2ImageVersionType) {
            return this.value.equals(((V2ImageVersionType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
