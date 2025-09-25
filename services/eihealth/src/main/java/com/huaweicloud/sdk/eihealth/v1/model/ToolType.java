package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 实验类型。 **约束限制**： 不涉及 **取值范围**： * drug_job：药物实验作业 * workflow_job：流程实验作业 **默认取值**： 不涉及 
 */
public class ToolType {

    /**
     * Enum DRUG_JOB for value: "drug_job"
     */
    public static final ToolType DRUG_JOB = new ToolType("drug_job");

    /**
     * Enum WORKFLOW_JOB for value: "workflow_job"
     */
    public static final ToolType WORKFLOW_JOB = new ToolType("workflow_job");

    private static final Map<String, ToolType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ToolType> createStaticFields() {
        Map<String, ToolType> map = new HashMap<>();
        map.put("drug_job", DRUG_JOB);
        map.put("workflow_job", WORKFLOW_JOB);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ToolType(String value) {
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
    public static ToolType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ToolType(value));
    }

    public static ToolType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ToolType) {
            return this.value.equals(((ToolType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
