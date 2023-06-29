package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets ProjectRoleType
 */
public class ProjectRoleType {

    /**
     * Enum ADMINISTRATOR for value: "Administrator"
     */
    public static final ProjectRoleType ADMINISTRATOR = new ProjectRoleType("Administrator");

    /**
     * Enum DEVELOPER for value: "Developer"
     */
    public static final ProjectRoleType DEVELOPER = new ProjectRoleType("Developer");

    /**
     * Enum UPLOADER for value: "Uploader"
     */
    public static final ProjectRoleType UPLOADER = new ProjectRoleType("Uploader");

    /**
     * Enum VIEWER for value: "Viewer"
     */
    public static final ProjectRoleType VIEWER = new ProjectRoleType("Viewer");

    private static final Map<String, ProjectRoleType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ProjectRoleType> createStaticFields() {
        Map<String, ProjectRoleType> map = new HashMap<>();
        map.put("Administrator", ADMINISTRATOR);
        map.put("Developer", DEVELOPER);
        map.put("Uploader", UPLOADER);
        map.put("Viewer", VIEWER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ProjectRoleType(String value) {
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
    public static ProjectRoleType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProjectRoleType(value));
    }

    public static ProjectRoleType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ProjectRoleType) {
            return this.value.equals(((ProjectRoleType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
