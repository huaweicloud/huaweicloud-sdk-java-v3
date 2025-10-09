package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：  参数组应用历史详情  **约束限制**：  不涉及。
 */
public class ApplyHistoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_result")

    private String applyResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_time")

    private String applyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public ApplyHistoryInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  参数组应用目标实例ID,，此参数是实例的唯一标识。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，长度为36个字符。  **默认取值**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ApplyHistoryInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释**：  参数组应用目标实例名称  **约束限制**：  不涉及。  **取值范围**：  不涉及  **默认取值**：  不涉及。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ApplyHistoryInfo withApplyResult(String applyResult) {
        this.applyResult = applyResult;
        return this;
    }

    /**
     * **参数解释**：  参数组应用结果。  **约束限制**：  不涉及。  **取值范围**：  不涉及  **默认取值**：  不涉及。
     * @return applyResult
     */
    public String getApplyResult() {
        return applyResult;
    }

    public void setApplyResult(String applyResult) {
        this.applyResult = applyResult;
    }

    public ApplyHistoryInfo withApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /**
     * **参数解释**：  参数组应用时间。  **约束限制**：  不涉及。  **取值范围**：  不涉及  **默认取值**：  不涉及。
     * @return applyTime
     */
    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public ApplyHistoryInfo withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * **参数解释**：  参数组应用错误码  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyHistoryInfo that = (ApplyHistoryInfo) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.applyResult, that.applyResult) && Objects.equals(this.applyTime, that.applyTime)
            && Objects.equals(this.errorCode, that.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, applyResult, applyTime, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyHistoryInfo {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    applyResult: ").append(toIndentedString(applyResult)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
