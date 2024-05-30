package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 业务实体类型。 枚举值：  - AGGREGATION_LOGIC_TABLE: 汇总表  - ATOMIC_INDEX: 原子指标  - ATOMIC_METRIC: 原子指标（新）  - BIZ_CATALOG: 流程架构目录  - BIZ_METRIC: 业务指标  - CODE_TABLE: 码表  - COMMON_CONDITION: 通用限定  - COMPOSITE_METRIC: 复合指标（新）  - COMPOUND_METRIC: 复合指标  - CONDITION_GROUP: 限定分组  - DEGENERATE_DIMENSION: 退化维度  - DERIVATIVE_INDEX: 衍生指标  - DERIVED_METRIC: 衍生指标（新）  - DIMENSION: 维度  - DIMENSION_ATTRIBUTE: 维度属性  - DIMENSION_HIERARCHIES: 维度层级  - DIMENSION_LOGIC_TABLE: 维度表  - DIMENSION_TABLE_ATTRIBUTE: 维度属性  - DIRECTORY: 目录  - FACT_ATTRIBUTE: 事实表属性  - FACT_DIMENSION: 事实表维度  - FACT_LOGIC_TABLE: 事实表  - FACT_MEASURE: 事实表度量  - FUNCTION: 函数  - INFO_ARCH: 信息架构（批量修改主题使用）  - MODEL: 模型  - QUALITY_RULE: 质量规则  - SECRECY_LEVEL: 密级  - STANDARD_ELEMENT: 数据标准  - STANDARD_ELEMENT_TEMPLATE: 数据标准模板  - SUBJECT: 主题  - SUMMARY_DIMENSION_ATTRIBUTE: 汇总表维度属性  - SUMMARY_INDEX: 汇总表指标属性  - SUMMARY_TIME: 汇总表时间周期属性  - TABLE_MODEL: 关系模型（逻辑模型/物理模型）  - TABLE_MODEL_ATTRIBUTE: 关系模型属性（逻辑模型/物理模型）  - TABLE_MODEL_LOGIC: 逻辑实体  - TABLE_TYPE: 表类型  - TAG: 标签  - TIME_CONDITION: 时间限定 
 */
public class BizTypeEnum {

    /**
     * Enum AGGREGATION_LOGIC_TABLE for value: "AGGREGATION_LOGIC_TABLE"
     */
    public static final BizTypeEnum AGGREGATION_LOGIC_TABLE = new BizTypeEnum("AGGREGATION_LOGIC_TABLE");

    /**
     * Enum ATOMIC_INDEX for value: "ATOMIC_INDEX"
     */
    public static final BizTypeEnum ATOMIC_INDEX = new BizTypeEnum("ATOMIC_INDEX");

    /**
     * Enum ATOMIC_METRIC for value: "ATOMIC_METRIC"
     */
    public static final BizTypeEnum ATOMIC_METRIC = new BizTypeEnum("ATOMIC_METRIC");

    /**
     * Enum BIZ_CATALOG for value: "BIZ_CATALOG"
     */
    public static final BizTypeEnum BIZ_CATALOG = new BizTypeEnum("BIZ_CATALOG");

    /**
     * Enum BIZ_METRIC for value: "BIZ_METRIC"
     */
    public static final BizTypeEnum BIZ_METRIC = new BizTypeEnum("BIZ_METRIC");

    /**
     * Enum CODE_TABLE for value: "CODE_TABLE"
     */
    public static final BizTypeEnum CODE_TABLE = new BizTypeEnum("CODE_TABLE");

    /**
     * Enum COMMON_CONDITION for value: "COMMON_CONDITION"
     */
    public static final BizTypeEnum COMMON_CONDITION = new BizTypeEnum("COMMON_CONDITION");

    /**
     * Enum COMPOSITE_METRIC for value: "COMPOSITE_METRIC"
     */
    public static final BizTypeEnum COMPOSITE_METRIC = new BizTypeEnum("COMPOSITE_METRIC");

    /**
     * Enum COMPOUND_METRIC for value: "COMPOUND_METRIC"
     */
    public static final BizTypeEnum COMPOUND_METRIC = new BizTypeEnum("COMPOUND_METRIC");

    /**
     * Enum CONDITION_GROUP for value: "CONDITION_GROUP"
     */
    public static final BizTypeEnum CONDITION_GROUP = new BizTypeEnum("CONDITION_GROUP");

    /**
     * Enum DEGENERATE_DIMENSION for value: "DEGENERATE_DIMENSION"
     */
    public static final BizTypeEnum DEGENERATE_DIMENSION = new BizTypeEnum("DEGENERATE_DIMENSION");

    /**
     * Enum DERIVATIVE_INDEX for value: "DERIVATIVE_INDEX"
     */
    public static final BizTypeEnum DERIVATIVE_INDEX = new BizTypeEnum("DERIVATIVE_INDEX");

    /**
     * Enum DERIVED_METRIC for value: "DERIVED_METRIC"
     */
    public static final BizTypeEnum DERIVED_METRIC = new BizTypeEnum("DERIVED_METRIC");

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
     * Enum DIMENSION_LOGIC_TABLE for value: "DIMENSION_LOGIC_TABLE"
     */
    public static final BizTypeEnum DIMENSION_LOGIC_TABLE = new BizTypeEnum("DIMENSION_LOGIC_TABLE");

    /**
     * Enum DIMENSION_TABLE_ATTRIBUTE for value: "DIMENSION_TABLE_ATTRIBUTE"
     */
    public static final BizTypeEnum DIMENSION_TABLE_ATTRIBUTE = new BizTypeEnum("DIMENSION_TABLE_ATTRIBUTE");

    /**
     * Enum DIRECTORY for value: "DIRECTORY"
     */
    public static final BizTypeEnum DIRECTORY = new BizTypeEnum("DIRECTORY");

    /**
     * Enum FACT_ATTRIBUTE for value: "FACT_ATTRIBUTE"
     */
    public static final BizTypeEnum FACT_ATTRIBUTE = new BizTypeEnum("FACT_ATTRIBUTE");

    /**
     * Enum FACT_DIMENSION for value: "FACT_DIMENSION"
     */
    public static final BizTypeEnum FACT_DIMENSION = new BizTypeEnum("FACT_DIMENSION");

    /**
     * Enum FACT_LOGIC_TABLE for value: "FACT_LOGIC_TABLE"
     */
    public static final BizTypeEnum FACT_LOGIC_TABLE = new BizTypeEnum("FACT_LOGIC_TABLE");

    /**
     * Enum FACT_MEASURE for value: "FACT_MEASURE"
     */
    public static final BizTypeEnum FACT_MEASURE = new BizTypeEnum("FACT_MEASURE");

    /**
     * Enum FUNCTION for value: "FUNCTION"
     */
    public static final BizTypeEnum FUNCTION = new BizTypeEnum("FUNCTION");

    /**
     * Enum INFO_ARCH for value: "INFO_ARCH"
     */
    public static final BizTypeEnum INFO_ARCH = new BizTypeEnum("INFO_ARCH");

    /**
     * Enum MODEL for value: "MODEL"
     */
    public static final BizTypeEnum MODEL = new BizTypeEnum("MODEL");

    /**
     * Enum QUALITY_RULE for value: "QUALITY_RULE"
     */
    public static final BizTypeEnum QUALITY_RULE = new BizTypeEnum("QUALITY_RULE");

    /**
     * Enum SECRECY_LEVEL for value: "SECRECY_LEVEL"
     */
    public static final BizTypeEnum SECRECY_LEVEL = new BizTypeEnum("SECRECY_LEVEL");

    /**
     * Enum STANDARD_ELEMENT for value: "STANDARD_ELEMENT"
     */
    public static final BizTypeEnum STANDARD_ELEMENT = new BizTypeEnum("STANDARD_ELEMENT");

    /**
     * Enum STANDARD_ELEMENT_TEMPLATE for value: "STANDARD_ELEMENT_TEMPLATE"
     */
    public static final BizTypeEnum STANDARD_ELEMENT_TEMPLATE = new BizTypeEnum("STANDARD_ELEMENT_TEMPLATE");

    /**
     * Enum SUBJECT for value: "SUBJECT"
     */
    public static final BizTypeEnum SUBJECT = new BizTypeEnum("SUBJECT");

    /**
     * Enum SUMMARY_DIMENSION_ATTRIBUTE for value: "SUMMARY_DIMENSION_ATTRIBUTE"
     */
    public static final BizTypeEnum SUMMARY_DIMENSION_ATTRIBUTE = new BizTypeEnum("SUMMARY_DIMENSION_ATTRIBUTE");

    /**
     * Enum SUMMARY_INDEX for value: "SUMMARY_INDEX"
     */
    public static final BizTypeEnum SUMMARY_INDEX = new BizTypeEnum("SUMMARY_INDEX");

    /**
     * Enum SUMMARY_TIME for value: "SUMMARY_TIME"
     */
    public static final BizTypeEnum SUMMARY_TIME = new BizTypeEnum("SUMMARY_TIME");

    /**
     * Enum TABLE_MODEL for value: "TABLE_MODEL"
     */
    public static final BizTypeEnum TABLE_MODEL = new BizTypeEnum("TABLE_MODEL");

    /**
     * Enum TABLE_MODEL_ATTRIBUTE for value: "TABLE_MODEL_ATTRIBUTE"
     */
    public static final BizTypeEnum TABLE_MODEL_ATTRIBUTE = new BizTypeEnum("TABLE_MODEL_ATTRIBUTE");

    /**
     * Enum TABLE_MODEL_LOGIC for value: "TABLE_MODEL_LOGIC"
     */
    public static final BizTypeEnum TABLE_MODEL_LOGIC = new BizTypeEnum("TABLE_MODEL_LOGIC");

    /**
     * Enum TABLE_TYPE for value: "TABLE_TYPE"
     */
    public static final BizTypeEnum TABLE_TYPE = new BizTypeEnum("TABLE_TYPE");

    /**
     * Enum TAG for value: "TAG"
     */
    public static final BizTypeEnum TAG = new BizTypeEnum("TAG");

    /**
     * Enum TIME_CONDITION for value: "TIME_CONDITION"
     */
    public static final BizTypeEnum TIME_CONDITION = new BizTypeEnum("TIME_CONDITION");

    private static final Map<String, BizTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, BizTypeEnum> createStaticFields() {
        Map<String, BizTypeEnum> map = new HashMap<>();
        map.put("AGGREGATION_LOGIC_TABLE", AGGREGATION_LOGIC_TABLE);
        map.put("ATOMIC_INDEX", ATOMIC_INDEX);
        map.put("ATOMIC_METRIC", ATOMIC_METRIC);
        map.put("BIZ_CATALOG", BIZ_CATALOG);
        map.put("BIZ_METRIC", BIZ_METRIC);
        map.put("CODE_TABLE", CODE_TABLE);
        map.put("COMMON_CONDITION", COMMON_CONDITION);
        map.put("COMPOSITE_METRIC", COMPOSITE_METRIC);
        map.put("COMPOUND_METRIC", COMPOUND_METRIC);
        map.put("CONDITION_GROUP", CONDITION_GROUP);
        map.put("DEGENERATE_DIMENSION", DEGENERATE_DIMENSION);
        map.put("DERIVATIVE_INDEX", DERIVATIVE_INDEX);
        map.put("DERIVED_METRIC", DERIVED_METRIC);
        map.put("DIMENSION", DIMENSION);
        map.put("DIMENSION_ATTRIBUTE", DIMENSION_ATTRIBUTE);
        map.put("DIMENSION_HIERARCHIES", DIMENSION_HIERARCHIES);
        map.put("DIMENSION_LOGIC_TABLE", DIMENSION_LOGIC_TABLE);
        map.put("DIMENSION_TABLE_ATTRIBUTE", DIMENSION_TABLE_ATTRIBUTE);
        map.put("DIRECTORY", DIRECTORY);
        map.put("FACT_ATTRIBUTE", FACT_ATTRIBUTE);
        map.put("FACT_DIMENSION", FACT_DIMENSION);
        map.put("FACT_LOGIC_TABLE", FACT_LOGIC_TABLE);
        map.put("FACT_MEASURE", FACT_MEASURE);
        map.put("FUNCTION", FUNCTION);
        map.put("INFO_ARCH", INFO_ARCH);
        map.put("MODEL", MODEL);
        map.put("QUALITY_RULE", QUALITY_RULE);
        map.put("SECRECY_LEVEL", SECRECY_LEVEL);
        map.put("STANDARD_ELEMENT", STANDARD_ELEMENT);
        map.put("STANDARD_ELEMENT_TEMPLATE", STANDARD_ELEMENT_TEMPLATE);
        map.put("SUBJECT", SUBJECT);
        map.put("SUMMARY_DIMENSION_ATTRIBUTE", SUMMARY_DIMENSION_ATTRIBUTE);
        map.put("SUMMARY_INDEX", SUMMARY_INDEX);
        map.put("SUMMARY_TIME", SUMMARY_TIME);
        map.put("TABLE_MODEL", TABLE_MODEL);
        map.put("TABLE_MODEL_ATTRIBUTE", TABLE_MODEL_ATTRIBUTE);
        map.put("TABLE_MODEL_LOGIC", TABLE_MODEL_LOGIC);
        map.put("TABLE_TYPE", TABLE_TYPE);
        map.put("TAG", TAG);
        map.put("TIME_CONDITION", TIME_CONDITION);
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
