package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets OutputFileType
 */
public class OutputFileType {

    /**
     * Enum TXT for value: "txt"
     */
    public static final OutputFileType TXT = new OutputFileType("txt");

    /**
     * Enum VCF for value: "vcf"
     */
    public static final OutputFileType VCF = new OutputFileType("vcf");

    /**
     * Enum CSV for value: "csv"
     */
    public static final OutputFileType CSV = new OutputFileType("csv");

    private static final Map<String, OutputFileType> STATIC_FIELDS = createStaticFields();

    private static Map<String, OutputFileType> createStaticFields() {
        Map<String, OutputFileType> map = new HashMap<>();
        map.put("txt", TXT);
        map.put("vcf", VCF);
        map.put("csv", CSV);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    OutputFileType(String value) {
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
    public static OutputFileType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OutputFileType(value));
    }

    public static OutputFileType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OutputFileType) {
            return this.value.equals(((OutputFileType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
