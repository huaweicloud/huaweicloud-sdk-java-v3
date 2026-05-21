package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ApplyHistory
 */
public class ApplyHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_name")

    private String targetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_result")

    private String applyResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applied_at")

    private OffsetDateTime appliedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public ApplyHistory withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * **参数解释**：  参数组ID。  **参数范围**：  不涉及。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public ApplyHistory withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * **参数解释**：  参数组的名称。  **参数范围**：  不涉及。
     * @return targetName
     */
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public ApplyHistory withApplyResult(String applyResult) {
        this.applyResult = applyResult;
        return this;
    }

    /**
     * **参数解释**：  应用结果。  **参数范围**：  不涉及。
     * @return applyResult
     */
    public String getApplyResult() {
        return applyResult;
    }

    public void setApplyResult(String applyResult) {
        this.applyResult = applyResult;
    }

    public ApplyHistory withAppliedAt(OffsetDateTime appliedAt) {
        this.appliedAt = appliedAt;
        return this;
    }

    /**
     * **参数解释**：  应用日期。  **参数范围**：  不涉及。
     * @return appliedAt
     */
    public OffsetDateTime getAppliedAt() {
        return appliedAt;
    }

    public void setAppliedAt(OffsetDateTime appliedAt) {
        this.appliedAt = appliedAt;
    }

    public ApplyHistory withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * **参数解释**：  实例应用参数组的报错信息，若实例应用参数组成功则返回空。  **取值范围**：  不涉及。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyHistory that = (ApplyHistory) obj;
        return Objects.equals(this.targetId, that.targetId) && Objects.equals(this.targetName, that.targetName)
            && Objects.equals(this.applyResult, that.applyResult) && Objects.equals(this.appliedAt, that.appliedAt)
            && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetId, targetName, applyResult, appliedAt, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyHistory {\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
        sb.append("    applyResult: ").append(toIndentedString(applyResult)).append("\n");
        sb.append("    appliedAt: ").append(toIndentedString(appliedAt)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
