package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 对接的ASR厂商类型 * EI_SIS:华为云SIS（仅国内站点支持） * MOBVOI:出门问问（仅海外站点支持）
 */
public class AsrTypeEnum {

    /**
     * Enum EI_SIS for value: "EI_SIS"
     */
    public static final AsrTypeEnum EI_SIS = new AsrTypeEnum("EI_SIS");

    /**
     * Enum MOBVOI for value: "MOBVOI"
     */
    public static final AsrTypeEnum MOBVOI = new AsrTypeEnum("MOBVOI");

    private static final Map<String, AsrTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AsrTypeEnum> createStaticFields() {
        Map<String, AsrTypeEnum> map = new HashMap<>();
        map.put("EI_SIS", EI_SIS);
        map.put("MOBVOI", MOBVOI);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AsrTypeEnum(String value) {
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
    public static AsrTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AsrTypeEnum(value));
    }

    public static AsrTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AsrTypeEnum) {
            return this.value.equals(((AsrTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
