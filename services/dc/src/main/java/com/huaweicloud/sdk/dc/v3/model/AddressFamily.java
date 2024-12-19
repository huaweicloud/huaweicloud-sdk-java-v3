package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 地址族类型: - ipv4: ipv4 - ipv6: ipv6
 */
public class AddressFamily {

    /**
     * Enum IPV4 for value: "ipv4"
     */
    public static final AddressFamily IPV4 = new AddressFamily("ipv4");

    /**
     * Enum IPV6 for value: "ipv6"
     */
    public static final AddressFamily IPV6 = new AddressFamily("ipv6");

    private static final Map<String, AddressFamily> STATIC_FIELDS = createStaticFields();

    private static Map<String, AddressFamily> createStaticFields() {
        Map<String, AddressFamily> map = new HashMap<>();
        map.put("ipv4", IPV4);
        map.put("ipv6", IPV6);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AddressFamily(String value) {
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
    public static AddressFamily fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AddressFamily(value));
    }

    public static AddressFamily valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AddressFamily) {
            return this.value.equals(((AddressFamily) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
