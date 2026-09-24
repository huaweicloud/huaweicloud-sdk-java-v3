package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自动变配记录。
 */
public class MysqlAutoScalingRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_type")

    private String scalingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_value")

    private String originalValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_value")

    private String targetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    public MysqlAutoScalingRecord withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  记录ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MysqlAutoScalingRecord withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public MysqlAutoScalingRecord withScalingType(String scalingType) {
        this.scalingType = scalingType;
        return this;
    }

    /**
     * **参数解释**：  变配类型。  **约束限制**：  不涉及。  **取值范围**：  - ENLARGE_FLAVOR：升配 - REDUCE_FLAVOR：降配 - COUNT_UP：只读升配 - COUNT_DOWN：只读降配  **默认取值**：  不涉及。
     * @return scalingType
     */
    public String getScalingType() {
        return scalingType;
    }

    public void setScalingType(String scalingType) {
        this.scalingType = scalingType;
    }

    public MysqlAutoScalingRecord withOriginalValue(String originalValue) {
        this.originalValue = originalValue;
        return this;
    }

    /**
     * **参数解释**：  原规格。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return originalValue
     */
    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    public MysqlAutoScalingRecord withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * **参数解释**：  目标规格。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return targetValue
     */
    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public MysqlAutoScalingRecord withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释**：  变更结果。  **约束限制**：  不涉及。  **取值范围**：  - SUCCESSFUL：成功 - FAILED：失败  **默认取值**：  不涉及。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public MysqlAutoScalingRecord withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**：  开始时间。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MysqlAutoScalingRecord that = (MysqlAutoScalingRecord) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.scalingType, that.scalingType)
            && Objects.equals(this.originalValue, that.originalValue)
            && Objects.equals(this.targetValue, that.targetValue) && Objects.equals(this.result, that.result)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instanceId, scalingType, originalValue, targetValue, result, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlAutoScalingRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    scalingType: ").append(toIndentedString(scalingType)).append("\n");
        sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
        sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
