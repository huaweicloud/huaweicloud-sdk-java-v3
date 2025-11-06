package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 指标周期，单位是秒。如想了解各个云服务的指标原始周期可以参考“[支持服务列表](ces_03_0059.xml)” **取值范围**： 枚举值。 - 0代表立即触发，仅限事件场景使用。 - 1代表指标的原始周期，比如RDS监控指标原始周期是60s，表示该RDS指标按60s周期为一个数据点参与告警计算。 - 300代表指标按5分钟聚合周期为一个数据点参与告警计算。 - 1200代表指标按20分钟聚合周期为一个数据点参与告警计算。 - 3600代表指标按1小时聚合周期为一个数据点参与告警计算。 - 14400代表指标按4小时聚合周期为一个数据点参与告警计算。 - 86400代表指标按1天聚合周期为一个数据点参与告警计算。 
 */
public class PeriodResp {

    /**
     * Enum NUMBER_0 for value: 0
     */
    public static final PeriodResp NUMBER_0 = new PeriodResp(0);

    /**
     * Enum NUMBER_1 for value: 1
     */
    public static final PeriodResp NUMBER_1 = new PeriodResp(1);

    /**
     * Enum NUMBER_300 for value: 300
     */
    public static final PeriodResp NUMBER_300 = new PeriodResp(300);

    /**
     * Enum NUMBER_1200 for value: 1200
     */
    public static final PeriodResp NUMBER_1200 = new PeriodResp(1200);

    /**
     * Enum NUMBER_3600 for value: 3600
     */
    public static final PeriodResp NUMBER_3600 = new PeriodResp(3600);

    /**
     * Enum NUMBER_14400 for value: 14400
     */
    public static final PeriodResp NUMBER_14400 = new PeriodResp(14400);

    /**
     * Enum NUMBER_86400 for value: 86400
     */
    public static final PeriodResp NUMBER_86400 = new PeriodResp(86400);

    private static final Map<Integer, PeriodResp> STATIC_FIELDS = createStaticFields();

    private static Map<Integer, PeriodResp> createStaticFields() {
        Map<Integer, PeriodResp> map = new HashMap<>();
        map.put(0, NUMBER_0);
        map.put(1, NUMBER_1);
        map.put(300, NUMBER_300);
        map.put(1200, NUMBER_1200);
        map.put(3600, NUMBER_3600);
        map.put(14400, NUMBER_14400);
        map.put(86400, NUMBER_86400);
        return Collections.unmodifiableMap(map);
    }

    private Integer value;

    PeriodResp(Integer value) {
        this.value = value;
    }

    @JsonValue
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static PeriodResp fromValue(Integer value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodResp(value));
    }

    public static PeriodResp valueOf(Integer value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PeriodResp) {
            return this.value.equals(((PeriodResp) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
