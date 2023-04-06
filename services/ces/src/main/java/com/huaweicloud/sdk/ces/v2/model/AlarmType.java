package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 告警规则类型，ALL_INSTANCE为全部资源指标告警，RESOURCE_GROUP为资源分组指标告警，MULTI_INSTANCE为指定资源指标告警，EVENT.SYS为系统事件告警，EVENT.CUSTOM自定义事件告警，DNSHealthCheck为健康检查告警；
 */
public class AlarmType {

    /**
     * Enum EVENT_SYS for value: "EVENT.SYS"
     */
    public static final AlarmType EVENT_SYS = new AlarmType("EVENT.SYS");

    /**
     * Enum EVENT_CUSTOM for value: "EVENT.CUSTOM"
     */
    public static final AlarmType EVENT_CUSTOM = new AlarmType("EVENT.CUSTOM");

    /**
     * Enum DNSHEALTHCHECK for value: "DNSHealthCheck"
     */
    public static final AlarmType DNSHEALTHCHECK = new AlarmType("DNSHealthCheck");

    /**
     * Enum RESOURCE_GROUP for value: "RESOURCE_GROUP"
     */
    public static final AlarmType RESOURCE_GROUP = new AlarmType("RESOURCE_GROUP");

    /**
     * Enum MULTI_INSTANCE for value: "MULTI_INSTANCE"
     */
    public static final AlarmType MULTI_INSTANCE = new AlarmType("MULTI_INSTANCE");

    /**
     * Enum ALL_INSTANCE for value: "ALL_INSTANCE"
     */
    public static final AlarmType ALL_INSTANCE = new AlarmType("ALL_INSTANCE");

    private static final Map<String, AlarmType> STATIC_FIELDS = createStaticFields();

    private static Map<String, AlarmType> createStaticFields() {
        Map<String, AlarmType> map = new HashMap<>();
        map.put("EVENT.SYS", EVENT_SYS);
        map.put("EVENT.CUSTOM", EVENT_CUSTOM);
        map.put("DNSHealthCheck", DNSHEALTHCHECK);
        map.put("RESOURCE_GROUP", RESOURCE_GROUP);
        map.put("MULTI_INSTANCE", MULTI_INSTANCE);
        map.put("ALL_INSTANCE", ALL_INSTANCE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AlarmType(String value) {
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
    public static AlarmType fromValue(String value) {
        if (value == null) {
            return null;
        }
        AlarmType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new AlarmType(value);
        }
        return result;
    }

    public static AlarmType valueOf(String value) {
        if (value == null) {
            return null;
        }
        AlarmType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AlarmType) {
            return this.value.equals(((AlarmType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
