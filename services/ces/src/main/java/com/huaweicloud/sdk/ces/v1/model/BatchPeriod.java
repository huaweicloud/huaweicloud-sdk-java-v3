package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 指标监控数据的聚合粒度，取值范围：1，300，1200，3600，14400，86400；1为监控资源的实时数据；300为聚合5分钟粒度数据，表示5分钟一个数据点；1200为聚合20分钟粒度数据，表示20分钟一个数据点；3600为聚合1小时粒度数据，表示1小时一个数据点；14400为聚合4小时粒度数据，表示4小时一个数据点；86400为聚合1天粒度数据，表示1天一个数据点；聚合解释可查看：“[聚合含义](https://support.huaweicloud.com/ces_faq/ces_faq_0009.html)”。 
 */
public class BatchPeriod {

    /**
     * Enum _1 for value: "1"
     */
    public static final BatchPeriod _1 = new BatchPeriod("1");

    /**
     * Enum _60 for value: "60"
     */
    public static final BatchPeriod _60 = new BatchPeriod("60");

    /**
     * Enum _300 for value: "300"
     */
    public static final BatchPeriod _300 = new BatchPeriod("300");

    /**
     * Enum _1200 for value: "1200"
     */
    public static final BatchPeriod _1200 = new BatchPeriod("1200");

    /**
     * Enum _3600 for value: "3600"
     */
    public static final BatchPeriod _3600 = new BatchPeriod("3600");

    /**
     * Enum _14400 for value: "14400"
     */
    public static final BatchPeriod _14400 = new BatchPeriod("14400");

    /**
     * Enum _86400 for value: "86400"
     */
    public static final BatchPeriod _86400 = new BatchPeriod("86400");

    private static final Map<String, BatchPeriod> STATIC_FIELDS = createStaticFields();

    private static Map<String, BatchPeriod> createStaticFields() {
        Map<String, BatchPeriod> map = new HashMap<>();
        map.put("1", _1);
        map.put("60", _60);
        map.put("300", _300);
        map.put("1200", _1200);
        map.put("3600", _3600);
        map.put("14400", _14400);
        map.put("86400", _86400);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    BatchPeriod(String value) {
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
    public static BatchPeriod fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BatchPeriod(value));
    }

    public static BatchPeriod valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BatchPeriod) {
            return this.value.equals(((BatchPeriod) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
