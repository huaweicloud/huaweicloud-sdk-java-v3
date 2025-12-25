package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 告警规则类型 **取值范围**： 枚举值。 - ALL_INSTANCE：针对全部资源的告警规则。 - RESOURCE_GROUP：针对资源分组的告警规则。 - MULTI_INSTANCE：针对指定资源的告警规则。 - EVENT.SYS：系统事件告警规则。 - EVENT.CUSTOM：自定义事件告警规则。 - DNSHealthCheck：健康检查告警规则。 
 */
public class AlarmTypeResp {

    /**
     * Enum EVENT_SYS for value: "EVENT.SYS"
     */
    public static final AlarmTypeResp EVENT_SYS = new AlarmTypeResp("EVENT.SYS");

    /**
     * Enum EVENT_CUSTOM for value: "EVENT.CUSTOM"
     */
    public static final AlarmTypeResp EVENT_CUSTOM = new AlarmTypeResp("EVENT.CUSTOM");

    /**
     * Enum DNSHEALTHCHECK for value: "DNSHealthCheck"
     */
    public static final AlarmTypeResp DNSHEALTHCHECK = new AlarmTypeResp("DNSHealthCheck");

    /**
     * Enum RESOURCE_GROUP for value: "RESOURCE_GROUP"
     */
    public static final AlarmTypeResp RESOURCE_GROUP = new AlarmTypeResp("RESOURCE_GROUP");

    /**
     * Enum MULTI_INSTANCE for value: "MULTI_INSTANCE"
     */
    public static final AlarmTypeResp MULTI_INSTANCE = new AlarmTypeResp("MULTI_INSTANCE");

    /**
     * Enum ALL_INSTANCE for value: "ALL_INSTANCE"
     */
    public static final AlarmTypeResp ALL_INSTANCE = new AlarmTypeResp("ALL_INSTANCE");

    private static final Map<String, AlarmTypeResp> STATIC_FIELDS = createStaticFields();

    private static Map<String, AlarmTypeResp> createStaticFields() {
        Map<String, AlarmTypeResp> map = new HashMap<>();
        map.put("EVENT.SYS", EVENT_SYS);
        map.put("EVENT.CUSTOM", EVENT_CUSTOM);
        map.put("DNSHealthCheck", DNSHEALTHCHECK);
        map.put("RESOURCE_GROUP", RESOURCE_GROUP);
        map.put("MULTI_INSTANCE", MULTI_INSTANCE);
        map.put("ALL_INSTANCE", ALL_INSTANCE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AlarmTypeResp(String value) {
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
    public static AlarmTypeResp fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmTypeResp(value));
    }

    public static AlarmTypeResp valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AlarmTypeResp) {
            return this.value.equals(((AlarmTypeResp) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
