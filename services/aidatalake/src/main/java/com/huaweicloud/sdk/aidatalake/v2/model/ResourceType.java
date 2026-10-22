package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：资源使用模式。 **约束限制**：不涉及。 **取值范围**：   - RESERVED：预留资源。   - ONDEMAND：按需弹性。   - HYBRID：混合模式。 **默认取值**：不涉及。
 */
public class ResourceType {

    /**
     * Enum RESERVED for value: "RESERVED"
     */
    public static final ResourceType RESERVED = new ResourceType("RESERVED");

    /**
     * Enum ONDEMAND for value: "ONDEMAND"
     */
    public static final ResourceType ONDEMAND = new ResourceType("ONDEMAND");

    /**
     * Enum HYBRID for value: "HYBRID"
     */
    public static final ResourceType HYBRID = new ResourceType("HYBRID");

    private static final Map<String, ResourceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ResourceType> createStaticFields() {
        Map<String, ResourceType> map = new HashMap<>();
        map.put("RESERVED", RESERVED);
        map.put("ONDEMAND", ONDEMAND);
        map.put("HYBRID", HYBRID);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ResourceType(String value) {
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
    public static ResourceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceType(value));
    }

    public static ResourceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ResourceType) {
            return this.value.equals(((ResourceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
