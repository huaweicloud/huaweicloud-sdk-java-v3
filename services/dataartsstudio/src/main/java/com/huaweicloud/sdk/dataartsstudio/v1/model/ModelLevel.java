package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 数据治理分层。 枚举值：   - SDI: 贴源数据层   - DWI: 数据整合层   - DWR: 数据报告层   - DM:  数据集市层 
 */
public class ModelLevel {

    /**
     * Enum SDI for value: "SDI"
     */
    public static final ModelLevel SDI = new ModelLevel("SDI");

    /**
     * Enum DWI for value: "DWI"
     */
    public static final ModelLevel DWI = new ModelLevel("DWI");

    /**
     * Enum DWR for value: "DWR"
     */
    public static final ModelLevel DWR = new ModelLevel("DWR");

    /**
     * Enum DM for value: "DM"
     */
    public static final ModelLevel DM = new ModelLevel("DM");

    private static final Map<String, ModelLevel> STATIC_FIELDS = createStaticFields();

    private static Map<String, ModelLevel> createStaticFields() {
        Map<String, ModelLevel> map = new HashMap<>();
        map.put("SDI", SDI);
        map.put("DWI", DWI);
        map.put("DWR", DWR);
        map.put("DM", DM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ModelLevel(String value) {
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
    public static ModelLevel fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelLevel(value));
    }

    public static ModelLevel valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ModelLevel) {
            return this.value.equals(((ModelLevel) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
