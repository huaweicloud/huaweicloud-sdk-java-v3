package com.huaweicloud.sdk.eihealth.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 反馈标签。 **约束限制**： 不涉及 **取值范围**： * others：其他 * professional：内容专业 * helpful：有帮助 * unprofessional：不专业 * unhelpful ：没有帮助 * unsafe：有害/不安全 * misinformation：虚假信息 * download_successful：下载数据成功 * promising：生成分子有价值 * synthesizable：合成可行性高 * validated：运行结果与实验相符 * download_failed：下载数据失败 * unpromising：生成分子没价值 * hard_to_synthesize：较难合成 * not_validated：运行结果与实验相悖 * plan_validated：规划步骤与预期相符 * accurate_results：执行结果准确 * high_performance：运行速度快 * plan_flawed：规划步骤不合理 * inaccurate_results：选择算法不准确 * low_performance：运行速度慢 **默认取值**： 不涉及 
 */
public class FeedbackLabel {

    /**
     * Enum OTHERS for value: "others"
     */
    public static final FeedbackLabel OTHERS = new FeedbackLabel("others");

    /**
     * Enum PROFESSIONAL for value: "professional"
     */
    public static final FeedbackLabel PROFESSIONAL = new FeedbackLabel("professional");

    /**
     * Enum HELPFUL for value: "helpful"
     */
    public static final FeedbackLabel HELPFUL = new FeedbackLabel("helpful");

    /**
     * Enum UNPROFESSIONAL for value: "unprofessional"
     */
    public static final FeedbackLabel UNPROFESSIONAL = new FeedbackLabel("unprofessional");

    /**
     * Enum UNHELPFUL for value: "unhelpful"
     */
    public static final FeedbackLabel UNHELPFUL = new FeedbackLabel("unhelpful");

    /**
     * Enum UNSAFE for value: "unsafe"
     */
    public static final FeedbackLabel UNSAFE = new FeedbackLabel("unsafe");

    /**
     * Enum MISINFORMATION for value: "misinformation"
     */
    public static final FeedbackLabel MISINFORMATION = new FeedbackLabel("misinformation");

    /**
     * Enum DOWNLOAD_SUCCESSFUL for value: "download_successful"
     */
    public static final FeedbackLabel DOWNLOAD_SUCCESSFUL = new FeedbackLabel("download_successful");

    /**
     * Enum PROMISING for value: "promising"
     */
    public static final FeedbackLabel PROMISING = new FeedbackLabel("promising");

    /**
     * Enum SYNTHESIZABLE for value: "synthesizable"
     */
    public static final FeedbackLabel SYNTHESIZABLE = new FeedbackLabel("synthesizable");

    /**
     * Enum VALIDATED for value: "validated"
     */
    public static final FeedbackLabel VALIDATED = new FeedbackLabel("validated");

    /**
     * Enum DOWNLOAD_FAILED for value: "download_failed"
     */
    public static final FeedbackLabel DOWNLOAD_FAILED = new FeedbackLabel("download_failed");

    /**
     * Enum UNPROMISING for value: "unpromising"
     */
    public static final FeedbackLabel UNPROMISING = new FeedbackLabel("unpromising");

    /**
     * Enum HARD_TO_SYNTHESIZE for value: "hard_to_synthesize"
     */
    public static final FeedbackLabel HARD_TO_SYNTHESIZE = new FeedbackLabel("hard_to_synthesize");

    /**
     * Enum NOT_VALIDATED for value: "not_validated"
     */
    public static final FeedbackLabel NOT_VALIDATED = new FeedbackLabel("not_validated");

    /**
     * Enum PLAN_VALIDATED for value: "plan_validated"
     */
    public static final FeedbackLabel PLAN_VALIDATED = new FeedbackLabel("plan_validated");

    /**
     * Enum ACCURATE_RESULTS for value: "accurate_results"
     */
    public static final FeedbackLabel ACCURATE_RESULTS = new FeedbackLabel("accurate_results");

    /**
     * Enum HIGH_PERFORMANCE for value: "high_performance"
     */
    public static final FeedbackLabel HIGH_PERFORMANCE = new FeedbackLabel("high_performance");

    /**
     * Enum PLAN_FLAWED for value: "plan_flawed"
     */
    public static final FeedbackLabel PLAN_FLAWED = new FeedbackLabel("plan_flawed");

    /**
     * Enum INACCURATE_RESULTS for value: "inaccurate_results"
     */
    public static final FeedbackLabel INACCURATE_RESULTS = new FeedbackLabel("inaccurate_results");

    /**
     * Enum LOW_PERFORMANCE for value: "low_performance"
     */
    public static final FeedbackLabel LOW_PERFORMANCE = new FeedbackLabel("low_performance");

    private static final Map<String, FeedbackLabel> STATIC_FIELDS = createStaticFields();

    private static Map<String, FeedbackLabel> createStaticFields() {
        Map<String, FeedbackLabel> map = new HashMap<>();
        map.put("others", OTHERS);
        map.put("professional", PROFESSIONAL);
        map.put("helpful", HELPFUL);
        map.put("unprofessional", UNPROFESSIONAL);
        map.put("unhelpful", UNHELPFUL);
        map.put("unsafe", UNSAFE);
        map.put("misinformation", MISINFORMATION);
        map.put("download_successful", DOWNLOAD_SUCCESSFUL);
        map.put("promising", PROMISING);
        map.put("synthesizable", SYNTHESIZABLE);
        map.put("validated", VALIDATED);
        map.put("download_failed", DOWNLOAD_FAILED);
        map.put("unpromising", UNPROMISING);
        map.put("hard_to_synthesize", HARD_TO_SYNTHESIZE);
        map.put("not_validated", NOT_VALIDATED);
        map.put("plan_validated", PLAN_VALIDATED);
        map.put("accurate_results", ACCURATE_RESULTS);
        map.put("high_performance", HIGH_PERFORMANCE);
        map.put("plan_flawed", PLAN_FLAWED);
        map.put("inaccurate_results", INACCURATE_RESULTS);
        map.put("low_performance", LOW_PERFORMANCE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FeedbackLabel(String value) {
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
    public static FeedbackLabel fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FeedbackLabel(value));
    }

    public static FeedbackLabel valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FeedbackLabel) {
            return this.value.equals(((FeedbackLabel) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
