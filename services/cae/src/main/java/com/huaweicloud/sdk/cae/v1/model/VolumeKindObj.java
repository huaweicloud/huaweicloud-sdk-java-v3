package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“Volume”，该值不可修改。
 */
public class VolumeKindObj {

    /**
     * Enum VOLUME for value: "Volume"
     */
    public static final VolumeKindObj VOLUME = new VolumeKindObj("Volume");

    private static final Map<String, VolumeKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, VolumeKindObj> createStaticFields() {
        Map<String, VolumeKindObj> map = new HashMap<>();
        map.put("Volume", VOLUME);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    VolumeKindObj(String value) {
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
    public static VolumeKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VolumeKindObj(value));
    }

    public static VolumeKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VolumeKindObj) {
            return this.value.equals(((VolumeKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
