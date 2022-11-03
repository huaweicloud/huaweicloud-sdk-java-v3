package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 客户端亲和性，取值： - SOURCE_IP：按源IP保持会话。 - NONE：关闭。
 */
public class ClientAffinity {

    /**
     * Enum SOURCE_IP for value: "SOURCE_IP"
     */
    public static final ClientAffinity SOURCE_IP = new ClientAffinity("SOURCE_IP");

    /**
     * Enum NONE for value: "NONE"
     */
    public static final ClientAffinity NONE = new ClientAffinity("NONE");

    private static final Map<String, ClientAffinity> STATIC_FIELDS = createStaticFields();

    private static Map<String, ClientAffinity> createStaticFields() {
        Map<String, ClientAffinity> map = new HashMap<>();
        map.put("SOURCE_IP", SOURCE_IP);
        map.put("NONE", NONE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ClientAffinity(String value) {
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
    public static ClientAffinity fromValue(String value) {
        if (value == null) {
            return null;
        }
        ClientAffinity result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ClientAffinity(value);
        }
        return result;
    }

    public static ClientAffinity valueOf(String value) {
        if (value == null) {
            return null;
        }
        ClientAffinity result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ClientAffinity) {
            return this.value.equals(((ClientAffinity) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
