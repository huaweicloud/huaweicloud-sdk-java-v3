package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 屏蔽状态。UN_MASKED：未屏蔽，MASK_EFFECTIVE：已生效，MASK_INEFFECTIVE：未生效。
 */
public class MaskStatus {

    /**
     * Enum UN_MASKED for value: "UN_MASKED"
     */
    public static final MaskStatus UN_MASKED = new MaskStatus("UN_MASKED");

    /**
     * Enum MASK_EFFECTIVE for value: "MASK_EFFECTIVE"
     */
    public static final MaskStatus MASK_EFFECTIVE = new MaskStatus("MASK_EFFECTIVE");

    /**
     * Enum MASK_INEFFECTIVE for value: "MASK_INEFFECTIVE"
     */
    public static final MaskStatus MASK_INEFFECTIVE = new MaskStatus("MASK_INEFFECTIVE");

    private static final Map<String, MaskStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, MaskStatus> createStaticFields() {
        Map<String, MaskStatus> map = new HashMap<>();
        map.put("UN_MASKED", UN_MASKED);
        map.put("MASK_EFFECTIVE", MASK_EFFECTIVE);
        map.put("MASK_INEFFECTIVE", MASK_INEFFECTIVE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    MaskStatus(String value) {
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
    public static MaskStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MaskStatus(value));
    }

    public static MaskStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MaskStatus) {
            return this.value.equals(((MaskStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
