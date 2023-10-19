package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 带宽类型包括： - BandwidthPackage (按带宽计费，需要绑定全域互联带宽，并指定分配带宽大小) - TestBandwidth (不收费的测试带宽，仅保留最小带宽，用于测试跨地域连通性）
 */
public class BandwidthTypeEnum {

    /**
     * Enum BANDWIDTHPACKAGE for value: "BandwidthPackage"
     */
    public static final BandwidthTypeEnum BANDWIDTHPACKAGE = new BandwidthTypeEnum("BandwidthPackage");

    /**
     * Enum TESTBANDWIDTH for value: "TestBandwidth"
     */
    public static final BandwidthTypeEnum TESTBANDWIDTH = new BandwidthTypeEnum("TestBandwidth");

    private static final Map<String, BandwidthTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, BandwidthTypeEnum> createStaticFields() {
        Map<String, BandwidthTypeEnum> map = new HashMap<>();
        map.put("BandwidthPackage", BANDWIDTHPACKAGE);
        map.put("TestBandwidth", TESTBANDWIDTH);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    BandwidthTypeEnum(String value) {
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
    public static BandwidthTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BandwidthTypeEnum(value));
    }

    public static BandwidthTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BandwidthTypeEnum) {
            return this.value.equals(((BandwidthTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
