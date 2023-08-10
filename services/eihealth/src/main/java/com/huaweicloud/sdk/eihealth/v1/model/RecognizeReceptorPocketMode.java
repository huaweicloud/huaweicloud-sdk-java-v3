package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 口袋识别的模式：自动、全局、配体、残基
 */
public class RecognizeReceptorPocketMode {

    /**
     * Enum AUTO for value: "AUTO"
     */
    public static final RecognizeReceptorPocketMode AUTO = new RecognizeReceptorPocketMode("AUTO");

    /**
     * Enum GLOBAL for value: "GLOBAL"
     */
    public static final RecognizeReceptorPocketMode GLOBAL = new RecognizeReceptorPocketMode("GLOBAL");

    /**
     * Enum LIGAND for value: "LIGAND"
     */
    public static final RecognizeReceptorPocketMode LIGAND = new RecognizeReceptorPocketMode("LIGAND");

    /**
     * Enum RESIDUES for value: "RESIDUES"
     */
    public static final RecognizeReceptorPocketMode RESIDUES = new RecognizeReceptorPocketMode("RESIDUES");

    private static final Map<String, RecognizeReceptorPocketMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, RecognizeReceptorPocketMode> createStaticFields() {
        Map<String, RecognizeReceptorPocketMode> map = new HashMap<>();
        map.put("AUTO", AUTO);
        map.put("GLOBAL", GLOBAL);
        map.put("LIGAND", LIGAND);
        map.put("RESIDUES", RESIDUES);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RecognizeReceptorPocketMode(String value) {
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
    public static RecognizeReceptorPocketMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecognizeReceptorPocketMode(value));
    }

    public static RecognizeReceptorPocketMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RecognizeReceptorPocketMode) {
            return this.value.equals(((RecognizeReceptorPocketMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
