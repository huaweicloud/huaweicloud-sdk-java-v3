package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 商品状态说明：   - TESTING - 测试   - ONSALE - 在售   - SUSPENDED - 已停售   - RETIREMENT - 产品退出
 */
public class OfferingStatus {

    /**
     * Enum TESTING for value: "TESTING"
     */
    public static final OfferingStatus TESTING = new OfferingStatus("TESTING");

    /**
     * Enum ONSALE for value: "ONSALE"
     */
    public static final OfferingStatus ONSALE = new OfferingStatus("ONSALE");

    /**
     * Enum SUSPENDED for value: "SUSPENDED"
     */
    public static final OfferingStatus SUSPENDED = new OfferingStatus("SUSPENDED");

    /**
     * Enum RETIREMENT for value: "RETIREMENT"
     */
    public static final OfferingStatus RETIREMENT = new OfferingStatus("RETIREMENT");

    private static final Map<String, OfferingStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, OfferingStatus> createStaticFields() {
        Map<String, OfferingStatus> map = new HashMap<>();
        map.put("TESTING", TESTING);
        map.put("ONSALE", ONSALE);
        map.put("SUSPENDED", SUSPENDED);
        map.put("RETIREMENT", RETIREMENT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    OfferingStatus(String value) {
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
    public static OfferingStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OfferingStatus(value));
    }

    public static OfferingStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OfferingStatus) {
            return this.value.equals(((OfferingStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
