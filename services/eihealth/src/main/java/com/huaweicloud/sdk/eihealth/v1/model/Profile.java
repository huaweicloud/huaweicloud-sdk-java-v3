package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets Profile
 */
public class Profile {

    /**
     * Enum PY3 for value: "PY3"
     */
    public static final Profile PY3 = new Profile("PY3");

    private static final Map<String, Profile> STATIC_FIELDS = createStaticFields();

    private static Map<String, Profile> createStaticFields() {
        Map<String, Profile> map = new HashMap<>();
        map.put("PY3", PY3);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Profile(String value) {
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
    public static Profile fromValue(String value) {
        if (value == null) {
            return null;
        }
        Profile result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new Profile(value);
        }
        return result;
    }

    public static Profile valueOf(String value) {
        if (value == null) {
            return null;
        }
        Profile result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Profile) {
            return this.value.equals(((Profile) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
