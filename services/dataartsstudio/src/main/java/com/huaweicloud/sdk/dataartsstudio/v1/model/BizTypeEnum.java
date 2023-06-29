package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 业务类型
 */
public class BizTypeEnum {

    /**
     * Enum ATOMIC_INDEX for value: "ATOMIC_INDEX"
     */
    public static final BizTypeEnum ATOMIC_INDEX = new BizTypeEnum("ATOMIC_INDEX");

    /**
     * Enum DERIVATIVE_INDEX for value: "DERIVATIVE_INDEX"
     */
    public static final BizTypeEnum DERIVATIVE_INDEX = new BizTypeEnum("DERIVATIVE_INDEX");

    /**
     * Enum DIMENSION for value: "DIMENSION"
     */
    public static final BizTypeEnum DIMENSION = new BizTypeEnum("DIMENSION");

    /**
     * Enum DIMENSION_ATTRIBUTE for value: "DIMENSION_ATTRIBUTE"
     */
    public static final BizTypeEnum DIMENSION_ATTRIBUTE = new BizTypeEnum("DIMENSION_ATTRIBUTE");

    /**
     * Enum DIMENSION_HIERARCHIES for value: "DIMENSION_HIERARCHIES"
     */
    public static final BizTypeEnum DIMENSION_HIERARCHIES = new BizTypeEnum("DIMENSION_HIERARCHIES");

    /**
     * Enum CONDITION_GROUP for value: "CONDITION_GROUP"
     */
    public static final BizTypeEnum CONDITION_GROUP = new BizTypeEnum("CONDITION_GROUP");

    /**
     * Enum TIME_CONDITION for value: "TIME_CONDITION"
     */
    public static final BizTypeEnum TIME_CONDITION = new BizTypeEnum("TIME_CONDITION");

    /**
     * Enum COMMON_CONDITION for value: "COMMON_CONDITION"
     */
    public static final BizTypeEnum COMMON_CONDITION = new BizTypeEnum("COMMON_CONDITION");

    /**
     * Enum FACT_LOGIC_TABLE for value: "FACT_LOGIC_TABLE"
     */
    public static final BizTypeEnum FACT_LOGIC_TABLE = new BizTypeEnum("FACT_LOGIC_TABLE");

    /**
     * Enum TABLE_MODEL for value: "TABLE_MODEL"
     */
    public static final BizTypeEnum TABLE_MODEL = new BizTypeEnum("TABLE_MODEL");

    /**
     * Enum DIMENSION_LOGIC_TABLE for value: "DIMENSION_LOGIC_TABLE"
     */
    public static final BizTypeEnum DIMENSION_LOGIC_TABLE = new BizTypeEnum("DIMENSION_LOGIC_TABLE");

    /**
     * Enum STANDARD_ELEMENT for value: "STANDARD_ELEMENT"
     */
    public static final BizTypeEnum STANDARD_ELEMENT = new BizTypeEnum("STANDARD_ELEMENT");

    /**
     * Enum AGGREGATION_LOGIC_TABLE for value: "AGGREGATION_LOGIC_TABLE"
     */
    public static final BizTypeEnum AGGREGATION_LOGIC_TABLE = new BizTypeEnum("AGGREGATION_LOGIC_TABLE");

    /**
     * Enum TAG for value: "TAG"
     */
    public static final BizTypeEnum TAG = new BizTypeEnum("TAG");

    /**
     * Enum CODE_TABLE for value: "CODE_TABLE"
     */
    public static final BizTypeEnum CODE_TABLE = new BizTypeEnum("CODE_TABLE");

    /**
     * Enum TABLE_MODEL_ATTRIBUTE for value: "TABLE_MODEL_ATTRIBUTE"
     */
    public static final BizTypeEnum TABLE_MODEL_ATTRIBUTE = new BizTypeEnum("TABLE_MODEL_ATTRIBUTE");

    /**
     * Enum FACT_DIMENSION for value: "FACT_DIMENSION"
     */
    public static final BizTypeEnum FACT_DIMENSION = new BizTypeEnum("FACT_DIMENSION");

    /**
     * Enum FACT_ATTRIBUTE for value: "FACT_ATTRIBUTE"
     */
    public static final BizTypeEnum FACT_ATTRIBUTE = new BizTypeEnum("FACT_ATTRIBUTE");

    /**
     * Enum FACT_MEASURE for value: "FACT_MEASURE"
     */
    public static final BizTypeEnum FACT_MEASURE = new BizTypeEnum("FACT_MEASURE");

    /**
     * Enum SUMMARY_DIMENSION_ATTRIBUTE for value: "SUMMARY_DIMENSION_ATTRIBUTE"
     */
    public static final BizTypeEnum SUMMARY_DIMENSION_ATTRIBUTE = new BizTypeEnum("SUMMARY_DIMENSION_ATTRIBUTE");

    /**
     * Enum SUMMARY_TIME for value: "SUMMARY_TIME"
     */
    public static final BizTypeEnum SUMMARY_TIME = new BizTypeEnum("SUMMARY_TIME");

    /**
     * Enum DIMENSION_TABLE_ATTRIBUTE for value: "DIMENSION_TABLE_ATTRIBUTE"
     */
    public static final BizTypeEnum DIMENSION_TABLE_ATTRIBUTE = new BizTypeEnum("DIMENSION_TABLE_ATTRIBUTE");

    /**
     * Enum QUALITY_RULE for value: "QUALITY_RULE"
     */
    public static final BizTypeEnum QUALITY_RULE = new BizTypeEnum("QUALITY_RULE");

    /**
     * Enum BIZ_METRIC for value: "BIZ_METRIC"
     */
    public static final BizTypeEnum BIZ_METRIC = new BizTypeEnum("BIZ_METRIC");

    /**
     * Enum COMPOUND_METRIC for value: "COMPOUND_METRIC"
     */
    public static final BizTypeEnum COMPOUND_METRIC = new BizTypeEnum("COMPOUND_METRIC");

    /**
     * Enum INFO_ARCH for value: "INFO_ARCH"
     */
    public static final BizTypeEnum INFO_ARCH = new BizTypeEnum("INFO_ARCH");

    /**
     * Enum DEGENERATE_DIMENSION for value: "DEGENERATE_DIMENSION"
     */
    public static final BizTypeEnum DEGENERATE_DIMENSION = new BizTypeEnum("DEGENERATE_DIMENSION");

    /**
     * Enum TABLE_MODEL_LOGIC for value: "TABLE_MODEL_LOGIC"
     */
    public static final BizTypeEnum TABLE_MODEL_LOGIC = new BizTypeEnum("TABLE_MODEL_LOGIC");

    private static final Map<String, BizTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, BizTypeEnum> createStaticFields() {
        Map<String, BizTypeEnum> map = new HashMap<>();
        map.put("ATOMIC_INDEX", ATOMIC_INDEX);
        map.put("DERIVATIVE_INDEX", DERIVATIVE_INDEX);
        map.put("DIMENSION", DIMENSION);
        map.put("DIMENSION_ATTRIBUTE", DIMENSION_ATTRIBUTE);
        map.put("DIMENSION_HIERARCHIES", DIMENSION_HIERARCHIES);
        map.put("CONDITION_GROUP", CONDITION_GROUP);
        map.put("TIME_CONDITION", TIME_CONDITION);
        map.put("COMMON_CONDITION", COMMON_CONDITION);
        map.put("FACT_LOGIC_TABLE", FACT_LOGIC_TABLE);
        map.put("TABLE_MODEL", TABLE_MODEL);
        map.put("DIMENSION_LOGIC_TABLE", DIMENSION_LOGIC_TABLE);
        map.put("STANDARD_ELEMENT", STANDARD_ELEMENT);
        map.put("AGGREGATION_LOGIC_TABLE", AGGREGATION_LOGIC_TABLE);
        map.put("TAG", TAG);
        map.put("CODE_TABLE", CODE_TABLE);
        map.put("TABLE_MODEL_ATTRIBUTE", TABLE_MODEL_ATTRIBUTE);
        map.put("FACT_DIMENSION", FACT_DIMENSION);
        map.put("FACT_ATTRIBUTE", FACT_ATTRIBUTE);
        map.put("FACT_MEASURE", FACT_MEASURE);
        map.put("SUMMARY_DIMENSION_ATTRIBUTE", SUMMARY_DIMENSION_ATTRIBUTE);
        map.put("SUMMARY_TIME", SUMMARY_TIME);
        map.put("DIMENSION_TABLE_ATTRIBUTE", DIMENSION_TABLE_ATTRIBUTE);
        map.put("QUALITY_RULE", QUALITY_RULE);
        map.put("BIZ_METRIC", BIZ_METRIC);
        map.put("COMPOUND_METRIC", COMPOUND_METRIC);
        map.put("INFO_ARCH", INFO_ARCH);
        map.put("DEGENERATE_DIMENSION", DEGENERATE_DIMENSION);
        map.put("TABLE_MODEL_LOGIC", TABLE_MODEL_LOGIC);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    BizTypeEnum(String value) {
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
    public static BizTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BizTypeEnum(value));
    }

    public static BizTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BizTypeEnum) {
            return this.value.equals(((BizTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
