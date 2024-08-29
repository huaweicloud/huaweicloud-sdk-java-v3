package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 任务状态。 * CREATING: 创建中 * SYSTEM_AUDITING: 系统审核中 * AUDITING: 人工审核中 * WAITING_SPLIT: 等待切割 * SPLITTING: 切割中 * SPLIT_FAILED: 切割失败 * ANNOTATING: 标注中 * WAITING: 等待训练 * PROCESSING: 任务训练中 * RESULT_REVIEW: 审核结果 * AUDIT_FAILED: 审核失败,等待用户重传数据 * FAILED: 失败 * SUCCEED: 成功
 */
public class JobState {

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final JobState CREATING = new JobState("CREATING");

    /**
     * Enum SYSTEM_AUDITING for value: "SYSTEM_AUDITING"
     */
    public static final JobState SYSTEM_AUDITING = new JobState("SYSTEM_AUDITING");

    /**
     * Enum AUDITING for value: "AUDITING"
     */
    public static final JobState AUDITING = new JobState("AUDITING");

    /**
     * Enum WAITING_SPLIT for value: "WAITING_SPLIT"
     */
    public static final JobState WAITING_SPLIT = new JobState("WAITING_SPLIT");

    /**
     * Enum SPLITTING for value: "SPLITTING"
     */
    public static final JobState SPLITTING = new JobState("SPLITTING");

    /**
     * Enum SPLIT_FAILED for value: "SPLIT_FAILED"
     */
    public static final JobState SPLIT_FAILED = new JobState("SPLIT_FAILED");

    /**
     * Enum ANNOTATING for value: "ANNOTATING"
     */
    public static final JobState ANNOTATING = new JobState("ANNOTATING");

    /**
     * Enum WAITING for value: "WAITING"
     */
    public static final JobState WAITING = new JobState("WAITING");

    /**
     * Enum PROCESSING for value: "PROCESSING"
     */
    public static final JobState PROCESSING = new JobState("PROCESSING");

    /**
     * Enum RESULT_REVIEW for value: "RESULT_REVIEW"
     */
    public static final JobState RESULT_REVIEW = new JobState("RESULT_REVIEW");

    /**
     * Enum AUDIT_FAILED for value: "AUDIT_FAILED"
     */
    public static final JobState AUDIT_FAILED = new JobState("AUDIT_FAILED");

    /**
     * Enum USER_RESULT_REVIEW for value: "USER_RESULT_REVIEW"
     */
    public static final JobState USER_RESULT_REVIEW = new JobState("USER_RESULT_REVIEW");

    /**
     * Enum USER_REVIEW_REJECT for value: "USER_REVIEW_REJECT"
     */
    public static final JobState USER_REVIEW_REJECT = new JobState("USER_REVIEW_REJECT");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final JobState FAILED = new JobState("FAILED");

    /**
     * Enum SUCCEED for value: "SUCCEED"
     */
    public static final JobState SUCCEED = new JobState("SUCCEED");

    private static final Map<String, JobState> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobState> createStaticFields() {
        Map<String, JobState> map = new HashMap<>();
        map.put("CREATING", CREATING);
        map.put("SYSTEM_AUDITING", SYSTEM_AUDITING);
        map.put("AUDITING", AUDITING);
        map.put("WAITING_SPLIT", WAITING_SPLIT);
        map.put("SPLITTING", SPLITTING);
        map.put("SPLIT_FAILED", SPLIT_FAILED);
        map.put("ANNOTATING", ANNOTATING);
        map.put("WAITING", WAITING);
        map.put("PROCESSING", PROCESSING);
        map.put("RESULT_REVIEW", RESULT_REVIEW);
        map.put("AUDIT_FAILED", AUDIT_FAILED);
        map.put("USER_RESULT_REVIEW", USER_RESULT_REVIEW);
        map.put("USER_REVIEW_REJECT", USER_REVIEW_REJECT);
        map.put("FAILED", FAILED);
        map.put("SUCCEED", SUCCEED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobState(String value) {
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
    public static JobState fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobState(value));
    }

    public static JobState valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobState) {
            return this.value.equals(((JobState) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
