package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets ProjectStatus
 */
public class ProjectStatus {

    /**
     * Enum ACTIVE for value: "ACTIVE"
     */
    public static final ProjectStatus ACTIVE = new ProjectStatus("ACTIVE");

    /**
     * Enum INACTIVE for value: "INACTIVE"
     */
    public static final ProjectStatus INACTIVE = new ProjectStatus("INACTIVE");

    private static final Map<String, ProjectStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ProjectStatus> createStaticFields() {
        Map<String, ProjectStatus> map = new HashMap<>();
        map.put("ACTIVE", ACTIVE);
        map.put("INACTIVE", INACTIVE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ProjectStatus(String value) {
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
    public static ProjectStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProjectStatus(value));
    }

    public static ProjectStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ProjectStatus) {
            return this.value.equals(((ProjectStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
