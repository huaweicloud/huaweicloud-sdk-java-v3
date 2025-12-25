package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: sku类型 - FLOW_DATA_BANDWIDTH 数据带宽 - CSS_CAPACITY 索引集群容量 - PAIMON_CAPACITY 数据库容量 - OBS_CAPACITY 对象存储容量 - JOB_CAPACITY 作业容量 - AD_HOC_COUNT 即席查询数量  **约束限制** 不涉及 **取值范围**: - FLOW_DATA_BANDWIDTH - CSS_CAPACITY - PAIMON_CAPACITY - OBS_CAPACITY - JOB_CAPACITY - AD_HOC_COUNT  **默认值** 不涉及      
 */
public class SkuEnum {

    /**
     * Enum FLOW_DATA_BANDWIDTH for value: "FLOW_DATA_BANDWIDTH"
     */
    public static final SkuEnum FLOW_DATA_BANDWIDTH = new SkuEnum("FLOW_DATA_BANDWIDTH");

    /**
     * Enum CSS_CAPACITY for value: "CSS_CAPACITY"
     */
    public static final SkuEnum CSS_CAPACITY = new SkuEnum("CSS_CAPACITY");

    /**
     * Enum PAIMON_CAPACITY for value: "PAIMON_CAPACITY"
     */
    public static final SkuEnum PAIMON_CAPACITY = new SkuEnum("PAIMON_CAPACITY");

    /**
     * Enum OBS_CAPACITY for value: "OBS_CAPACITY"
     */
    public static final SkuEnum OBS_CAPACITY = new SkuEnum("OBS_CAPACITY");

    /**
     * Enum JOB_CAPACITY for value: "JOB_CAPACITY"
     */
    public static final SkuEnum JOB_CAPACITY = new SkuEnum("JOB_CAPACITY");

    /**
     * Enum AD_HOC_COUNT for value: "AD_HOC_COUNT"
     */
    public static final SkuEnum AD_HOC_COUNT = new SkuEnum("AD_HOC_COUNT");

    private static final Map<String, SkuEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SkuEnum> createStaticFields() {
        Map<String, SkuEnum> map = new HashMap<>();
        map.put("FLOW_DATA_BANDWIDTH", FLOW_DATA_BANDWIDTH);
        map.put("CSS_CAPACITY", CSS_CAPACITY);
        map.put("PAIMON_CAPACITY", PAIMON_CAPACITY);
        map.put("OBS_CAPACITY", OBS_CAPACITY);
        map.put("JOB_CAPACITY", JOB_CAPACITY);
        map.put("AD_HOC_COUNT", AD_HOC_COUNT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SkuEnum(String value) {
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
    public static SkuEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SkuEnum(value));
    }

    public static SkuEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SkuEnum) {
            return this.value.equals(((SkuEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
