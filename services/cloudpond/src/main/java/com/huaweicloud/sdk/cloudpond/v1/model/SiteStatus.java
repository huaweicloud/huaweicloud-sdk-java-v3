package com.huaweicloud.sdk.cloudpond.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 站点状态： - initial：待部署 - deploying：部署中 - available：可用 - unavailable：不可用
 */
public class SiteStatus {

    /**
     * Enum INITIAL for value: "initial"
     */
    public static final SiteStatus INITIAL = new SiteStatus("initial");

    /**
     * Enum DEPLOYING for value: "deploying"
     */
    public static final SiteStatus DEPLOYING = new SiteStatus("deploying");

    /**
     * Enum AVAILABLE for value: "available"
     */
    public static final SiteStatus AVAILABLE = new SiteStatus("available");

    /**
     * Enum UNAVAILABLE for value: "unavailable"
     */
    public static final SiteStatus UNAVAILABLE = new SiteStatus("unavailable");

    private static final Map<String, SiteStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, SiteStatus> createStaticFields() {
        Map<String, SiteStatus> map = new HashMap<>();
        map.put("initial", INITIAL);
        map.put("deploying", DEPLOYING);
        map.put("available", AVAILABLE);
        map.put("unavailable", UNAVAILABLE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SiteStatus(String value) {
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
    public static SiteStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SiteStatus(value));
    }

    public static SiteStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SiteStatus) {
            return this.value.equals(((SiteStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
