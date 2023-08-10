package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 差异计算方法：RMSD、EMD
 */
public class CheckLigandDifferenceMethod {

    /**
     * Enum RMSD for value: "RMSD"
     */
    public static final CheckLigandDifferenceMethod RMSD = new CheckLigandDifferenceMethod("RMSD");

    /**
     * Enum EMD for value: "EMD"
     */
    public static final CheckLigandDifferenceMethod EMD = new CheckLigandDifferenceMethod("EMD");

    private static final Map<String, CheckLigandDifferenceMethod> STATIC_FIELDS = createStaticFields();

    private static Map<String, CheckLigandDifferenceMethod> createStaticFields() {
        Map<String, CheckLigandDifferenceMethod> map = new HashMap<>();
        map.put("RMSD", RMSD);
        map.put("EMD", EMD);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CheckLigandDifferenceMethod(String value) {
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
    public static CheckLigandDifferenceMethod fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CheckLigandDifferenceMethod(value));
    }

    public static CheckLigandDifferenceMethod valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CheckLigandDifferenceMethod) {
            return this.value.equals(((CheckLigandDifferenceMethod) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
