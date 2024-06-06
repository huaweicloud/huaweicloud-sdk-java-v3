package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AutoScalingRecordInfo
 */
public class AutoScalingRecordInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

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
    @JsonProperty(value = "create_at")

    private String createAt;

    public AutoScalingRecordInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 记录ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AutoScalingRecordInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AutoScalingRecordInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public AutoScalingRecordInfo withScalingType(String scalingType) {
        this.scalingType = scalingType;
        return this;
    }

    /**
     * 变配类型。
     * @return scalingType
     */
    public String getScalingType() {
        return scalingType;
    }

    public void setScalingType(String scalingType) {
        this.scalingType = scalingType;
    }

    public AutoScalingRecordInfo withOriginalValue(String originalValue) {
        this.originalValue = originalValue;
        return this;
    }

    /**
     * 原始值。
     * @return originalValue
     */
    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    public AutoScalingRecordInfo withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * 目标值。
     * @return targetValue
     */
    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public AutoScalingRecordInfo withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 变配结果。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public AutoScalingRecordInfo withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 变配时间。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoScalingRecordInfo that = (AutoScalingRecordInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.scalingType, that.scalingType)
            && Objects.equals(this.originalValue, that.originalValue)
            && Objects.equals(this.targetValue, that.targetValue) && Objects.equals(this.result, that.result)
            && Objects.equals(this.createAt, that.createAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instanceId, instanceName, scalingType, originalValue, targetValue, result, createAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoScalingRecordInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    scalingType: ").append(toIndentedString(scalingType)).append("\n");
        sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
        sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
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
