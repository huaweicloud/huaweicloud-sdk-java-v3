package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets ImageChipType
 */
public class ImageChipType {

    /**
     * Enum X86 for value: "X86"
     */
    public static final ImageChipType X86 = new ImageChipType("X86");

    /**
     * Enum ARM for value: "ARM"
     */
    public static final ImageChipType ARM = new ImageChipType("ARM");

    private static final Map<String, ImageChipType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ImageChipType> createStaticFields() {
        Map<String, ImageChipType> map = new HashMap<>();
        map.put("X86", X86);
        map.put("ARM", ARM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ImageChipType(String value) {
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
    public static ImageChipType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageChipType(value));
    }

    public static ImageChipType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ImageChipType) {
            return this.value.equals(((ImageChipType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
