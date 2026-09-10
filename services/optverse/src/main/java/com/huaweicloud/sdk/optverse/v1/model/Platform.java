package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 部署平台。 **约束限制**： 不涉及 **取值范围**： * Modelarts：ModelArts平台 * CCE：CCE平台 **默认取值**： 不涉及 
 */
public class Platform {

    /**
     * Enum MODELARTS for value: "Modelarts"
     */
    public static final Platform MODELARTS = new Platform("Modelarts");

    /**
     * Enum CCE for value: "CCE"
     */
    public static final Platform CCE = new Platform("CCE");

    private static final Map<String, Platform> STATIC_FIELDS = createStaticFields();

    private static Map<String, Platform> createStaticFields() {
        Map<String, Platform> map = new HashMap<>();
        map.put("Modelarts", MODELARTS);
        map.put("CCE", CCE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Platform(String value) {
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
    public static Platform fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Platform(value));
    }

    public static Platform valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Platform) {
            return this.value.equals(((Platform) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
