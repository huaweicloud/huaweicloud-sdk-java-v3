package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：ModelArts产品形态。 **约束限制**：不涉及。 **取值范围**：   - STANDARD：ModelArts Standard   - LITE-CLUSTER：ModelArts Lite-Cluster   - LITE-DEVSERVER：ModelArts Lite-Server（过时，由LITE-SERVER代替）   - LITE-SERVER：ModelArts Lite-Server **默认取值**：不涉及。
 */
public class ModelArtsOffering {

    /**
     * Enum STANDARD for value: "STANDARD"
     */
    public static final ModelArtsOffering STANDARD = new ModelArtsOffering("STANDARD");

    /**
     * Enum LITE_CLUSTER for value: "LITE-CLUSTER"
     */
    public static final ModelArtsOffering LITE_CLUSTER = new ModelArtsOffering("LITE-CLUSTER");

    /**
     * Enum LITE_DEVSERVER for value: "LITE-DEVSERVER"
     */
    public static final ModelArtsOffering LITE_DEVSERVER = new ModelArtsOffering("LITE-DEVSERVER");

    /**
     * Enum LITE_SERVER for value: "LITE-SERVER"
     */
    public static final ModelArtsOffering LITE_SERVER = new ModelArtsOffering("LITE-SERVER");

    private static final Map<String, ModelArtsOffering> STATIC_FIELDS = createStaticFields();

    private static Map<String, ModelArtsOffering> createStaticFields() {
        Map<String, ModelArtsOffering> map = new HashMap<>();
        map.put("STANDARD", STANDARD);
        map.put("LITE-CLUSTER", LITE_CLUSTER);
        map.put("LITE-DEVSERVER", LITE_DEVSERVER);
        map.put("LITE-SERVER", LITE_SERVER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ModelArtsOffering(String value) {
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
    public static ModelArtsOffering fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelArtsOffering(value));
    }

    public static ModelArtsOffering valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ModelArtsOffering) {
            return this.value.equals(((ModelArtsOffering) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
