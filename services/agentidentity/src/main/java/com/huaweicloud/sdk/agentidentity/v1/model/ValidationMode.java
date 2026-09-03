package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The validation mode for policy creation/updates. FAIL_ON_ANY_FINDINGS (default) fails if the Cedar analyzer reports any findings; IGNORE_ALL_FINDINGS allows creation/update even if findings are detected.
 */
public class ValidationMode {

    /**
     * Enum FAIL_ON_ANY_FINDINGS for value: "FAIL_ON_ANY_FINDINGS"
     */
    public static final ValidationMode FAIL_ON_ANY_FINDINGS = new ValidationMode("FAIL_ON_ANY_FINDINGS");

    /**
     * Enum IGNORE_ALL_FINDINGS for value: "IGNORE_ALL_FINDINGS"
     */
    public static final ValidationMode IGNORE_ALL_FINDINGS = new ValidationMode("IGNORE_ALL_FINDINGS");

    private static final Map<String, ValidationMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, ValidationMode> createStaticFields() {
        Map<String, ValidationMode> map = new HashMap<>();
        map.put("FAIL_ON_ANY_FINDINGS", FAIL_ON_ANY_FINDINGS);
        map.put("IGNORE_ALL_FINDINGS", IGNORE_ALL_FINDINGS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ValidationMode(String value) {
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
    public static ValidationMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ValidationMode(value));
    }

    public static ValidationMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ValidationMode) {
            return this.value.equals(((ValidationMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
