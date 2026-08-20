package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 评审配置
 */
public class ProcessInstanceResponseResultReviewConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_type")

    private Integer approvalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio_value")

    private String ratioValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_decisioning")

    private Boolean skipDecisioning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_roles")

    private String approvalRoles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_roles")

    private String reviewRoles;

    public ProcessInstanceResponseResultReviewConfig withApprovalType(Integer approvalType) {
        this.approvalType = approvalType;
        return this;
    }

    /**
     * 审批类型
     * @return approvalType
     */
    public Integer getApprovalType() {
        return approvalType;
    }

    public void setApprovalType(Integer approvalType) {
        this.approvalType = approvalType;
    }

    public ProcessInstanceResponseResultReviewConfig withRatioValue(String ratioValue) {
        this.ratioValue = ratioValue;
        return this;
    }

    /**
     * 审批进度
     * @return ratioValue
     */
    public String getRatioValue() {
        return ratioValue;
    }

    public void setRatioValue(String ratioValue) {
        this.ratioValue = ratioValue;
    }

    public ProcessInstanceResponseResultReviewConfig withSkipDecisioning(Boolean skipDecisioning) {
        this.skipDecisioning = skipDecisioning;
        return this;
    }

    /**
     * 是否跳过决策
     * @return skipDecisioning
     */
    public Boolean getSkipDecisioning() {
        return skipDecisioning;
    }

    public void setSkipDecisioning(Boolean skipDecisioning) {
        this.skipDecisioning = skipDecisioning;
    }

    public ProcessInstanceResponseResultReviewConfig withApprovalRoles(String approvalRoles) {
        this.approvalRoles = approvalRoles;
        return this;
    }

    /**
     * 决策角色
     * @return approvalRoles
     */
    public String getApprovalRoles() {
        return approvalRoles;
    }

    public void setApprovalRoles(String approvalRoles) {
        this.approvalRoles = approvalRoles;
    }

    public ProcessInstanceResponseResultReviewConfig withReviewRoles(String reviewRoles) {
        this.reviewRoles = reviewRoles;
        return this;
    }

    /**
     * 审批角色
     * @return reviewRoles
     */
    public String getReviewRoles() {
        return reviewRoles;
    }

    public void setReviewRoles(String reviewRoles) {
        this.reviewRoles = reviewRoles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessInstanceResponseResultReviewConfig that = (ProcessInstanceResponseResultReviewConfig) obj;
        return Objects.equals(this.approvalType, that.approvalType) && Objects.equals(this.ratioValue, that.ratioValue)
            && Objects.equals(this.skipDecisioning, that.skipDecisioning)
            && Objects.equals(this.approvalRoles, that.approvalRoles)
            && Objects.equals(this.reviewRoles, that.reviewRoles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvalType, ratioValue, skipDecisioning, approvalRoles, reviewRoles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInstanceResponseResultReviewConfig {\n");
        sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
        sb.append("    ratioValue: ").append(toIndentedString(ratioValue)).append("\n");
        sb.append("    skipDecisioning: ").append(toIndentedString(skipDecisioning)).append("\n");
        sb.append("    approvalRoles: ").append(toIndentedString(approvalRoles)).append("\n");
        sb.append("    reviewRoles: ").append(toIndentedString(reviewRoles)).append("\n");
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
