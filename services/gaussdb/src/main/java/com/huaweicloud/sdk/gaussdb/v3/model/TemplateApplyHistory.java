package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * TemplateApplyHistory
 */
public class TemplateApplyHistory {

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

    private BigDecimal appliedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public TemplateApplyHistory withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 应用实例ID。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public TemplateApplyHistory withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * 应用实例名称。
     * @return targetName
     */
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public TemplateApplyHistory withApplyResult(String applyResult) {
        this.applyResult = applyResult;
        return this;
    }

    /**
     * 应用结果。
     * @return applyResult
     */
    public String getApplyResult() {
        return applyResult;
    }

    public void setApplyResult(String applyResult) {
        this.applyResult = applyResult;
    }

    public TemplateApplyHistory withAppliedAt(BigDecimal appliedAt) {
        this.appliedAt = appliedAt;
        return this;
    }

    /**
     * 应用时间。
     * @return appliedAt
     */
    public BigDecimal getAppliedAt() {
        return appliedAt;
    }

    public void setAppliedAt(BigDecimal appliedAt) {
        this.appliedAt = appliedAt;
    }

    public TemplateApplyHistory withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码。
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
        TemplateApplyHistory that = (TemplateApplyHistory) obj;
        return Objects.equals(this.targetId, that.targetId) && Objects.equals(this.targetName, that.targetName)
            && Objects.equals(this.applyResult, that.applyResult) && Objects.equals(this.appliedAt, that.appliedAt)
            && Objects.equals(this.errorCode, that.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetId, targetName, applyResult, appliedAt, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateApplyHistory {\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
        sb.append("    applyResult: ").append(toIndentedString(applyResult)).append("\n");
        sb.append("    appliedAt: ").append(toIndentedString(appliedAt)).append("\n");
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
