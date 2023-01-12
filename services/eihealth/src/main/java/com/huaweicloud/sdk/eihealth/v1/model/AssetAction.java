package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets AssetAction
 */
public class AssetAction {

    /**
     * Enum RETRY for value: "RETRY"
     */
    public static final AssetAction RETRY = new AssetAction("RETRY");

    /**
     * Enum CANCEL for value: "CANCEL"
     */
    public static final AssetAction CANCEL = new AssetAction("CANCEL");

    /**
     * Enum OFFLINE for value: "OFFLINE"
     */
    public static final AssetAction OFFLINE = new AssetAction("OFFLINE");

    private static final Map<String, AssetAction> STATIC_FIELDS = createStaticFields();

    private static Map<String, AssetAction> createStaticFields() {
        Map<String, AssetAction> map = new HashMap<>();
        map.put("RETRY", RETRY);
        map.put("CANCEL", CANCEL);
        map.put("OFFLINE", OFFLINE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AssetAction(String value) {
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
    public static AssetAction fromValue(String value) {
        if (value == null) {
            return null;
        }
        AssetAction result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new AssetAction(value);
        }
        return result;
    }

    public static AssetAction valueOf(String value) {
        if (value == null) {
            return null;
        }
        AssetAction result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AssetAction) {
            return this.value.equals(((AssetAction) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
