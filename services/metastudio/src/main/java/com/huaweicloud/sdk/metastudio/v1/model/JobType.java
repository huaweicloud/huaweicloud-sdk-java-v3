package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 训练类型。 * BASIC: 基础版(20句话) * MIDDLE: 进阶版(100句话) * ADVANCE: 高级版 * THIRD_PARTY: 第三方出门问问训练版 * THIRD_PARTY_LJZN: 第三方逻辑智能训练版 * FLEXUS: Flexus版---用的是大模型特征提取
 */
public class JobType {

    /**
     * Enum BASIC for value: "BASIC"
     */
    public static final JobType BASIC = new JobType("BASIC");

    /**
     * Enum MIDDLE for value: "MIDDLE"
     */
    public static final JobType MIDDLE = new JobType("MIDDLE");

    /**
     * Enum ADVANCE for value: "ADVANCE"
     */
    public static final JobType ADVANCE = new JobType("ADVANCE");

    /**
     * Enum THIRD_PARTY for value: "THIRD_PARTY"
     */
    public static final JobType THIRD_PARTY = new JobType("THIRD_PARTY");

    /**
     * Enum THIRD_PARTY_LJZN for value: "THIRD_PARTY_LJZN"
     */
    public static final JobType THIRD_PARTY_LJZN = new JobType("THIRD_PARTY_LJZN");

    /**
     * Enum FLEXUS for value: "FLEXUS"
     */
    public static final JobType FLEXUS = new JobType("FLEXUS");

    private static final Map<String, JobType> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobType> createStaticFields() {
        Map<String, JobType> map = new HashMap<>();
        map.put("BASIC", BASIC);
        map.put("MIDDLE", MIDDLE);
        map.put("ADVANCE", ADVANCE);
        map.put("THIRD_PARTY", THIRD_PARTY);
        map.put("THIRD_PARTY_LJZN", THIRD_PARTY_LJZN);
        map.put("FLEXUS", FLEXUS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobType(String value) {
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
    public static JobType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobType(value));
    }

    public static JobType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobType) {
            return this.value.equals(((JobType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
