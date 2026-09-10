package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 绑定状态。 **约束限制**： 不涉及 **取值范围**： * requirement_analyzer：构建需求文档。 * modeling：构建数学模型。 * data：校验模型数据。 * solver：求解数学模型。 * report：业务辅助分析。 * business_planner：构建需求文档 * data_agent：原始数据处理 * vrp：路径规划求解 * predict_step1：解析任务意图 * predict_step2：探查数据面貌 * predict_step3：生成算法模型 * predict_step4：总结分析报告 **默认取值**： 不涉及 
 */
public class StageName {

    /**
     * Enum REQUIREMENT_ANALYZER for value: "requirement_analyzer"
     */
    public static final StageName REQUIREMENT_ANALYZER = new StageName("requirement_analyzer");

    /**
     * Enum MODELING for value: "modeling"
     */
    public static final StageName MODELING = new StageName("modeling");

    /**
     * Enum DATA for value: "data"
     */
    public static final StageName DATA = new StageName("data");

    /**
     * Enum SOLVER for value: "solver"
     */
    public static final StageName SOLVER = new StageName("solver");

    /**
     * Enum REPORT for value: "report"
     */
    public static final StageName REPORT = new StageName("report");

    /**
     * Enum BUSINESS_PLANNER for value: "business_planner"
     */
    public static final StageName BUSINESS_PLANNER = new StageName("business_planner");

    /**
     * Enum DATA_AGENT for value: "data_agent"
     */
    public static final StageName DATA_AGENT = new StageName("data_agent");

    /**
     * Enum VRP for value: "vrp"
     */
    public static final StageName VRP = new StageName("vrp");

    /**
     * Enum PREDICT_STEP1 for value: "predict_step1"
     */
    public static final StageName PREDICT_STEP1 = new StageName("predict_step1");

    /**
     * Enum PREDICT_STEP2 for value: "predict_step2"
     */
    public static final StageName PREDICT_STEP2 = new StageName("predict_step2");

    /**
     * Enum PREDICT_STEP3 for value: "predict_step3"
     */
    public static final StageName PREDICT_STEP3 = new StageName("predict_step3");

    /**
     * Enum PREDICT_STEP4 for value: "predict_step4"
     */
    public static final StageName PREDICT_STEP4 = new StageName("predict_step4");

    private static final Map<String, StageName> STATIC_FIELDS = createStaticFields();

    private static Map<String, StageName> createStaticFields() {
        Map<String, StageName> map = new HashMap<>();
        map.put("requirement_analyzer", REQUIREMENT_ANALYZER);
        map.put("modeling", MODELING);
        map.put("data", DATA);
        map.put("solver", SOLVER);
        map.put("report", REPORT);
        map.put("business_planner", BUSINESS_PLANNER);
        map.put("data_agent", DATA_AGENT);
        map.put("vrp", VRP);
        map.put("predict_step1", PREDICT_STEP1);
        map.put("predict_step2", PREDICT_STEP2);
        map.put("predict_step3", PREDICT_STEP3);
        map.put("predict_step4", PREDICT_STEP4);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    StageName(String value) {
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
    public static StageName fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StageName(value));
    }

    public static StageName valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StageName) {
            return this.value.equals(((StageName) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
