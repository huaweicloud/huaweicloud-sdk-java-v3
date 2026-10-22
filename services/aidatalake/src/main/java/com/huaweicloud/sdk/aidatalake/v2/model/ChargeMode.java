package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：计费模式。 **取值范围**：   - postPaid：按需计费。   - prePaid：包周期计费。
 */
public class ChargeMode {

    /**
     * Enum PREPAID for value: "prePaid"
     */
    public static final ChargeMode PREPAID = new ChargeMode("prePaid");

    /**
     * Enum POSTPAID for value: "postPaid"
     */
    public static final ChargeMode POSTPAID = new ChargeMode("postPaid");

    private static final Map<String, ChargeMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, ChargeMode> createStaticFields() {
        Map<String, ChargeMode> map = new HashMap<>();
        map.put("prePaid", PREPAID);
        map.put("postPaid", POSTPAID);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ChargeMode(String value) {
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
    public static ChargeMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargeMode(value));
    }

    public static ChargeMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ChargeMode) {
            return this.value.equals(((ChargeMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
