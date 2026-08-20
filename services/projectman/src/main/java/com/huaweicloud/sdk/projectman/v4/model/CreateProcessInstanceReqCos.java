package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateProcessInstanceReqCos
 */
public class CreateProcessInstanceReqCos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_category")

    private String issueCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private String changeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "before_change")

    private String beforeChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "after_change")

    private String afterChange;

    public CreateProcessInstanceReqCos withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 工作项编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CreateProcessInstanceReqCos withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 工作项ID
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public CreateProcessInstanceReqCos withIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
        return this;
    }

    /**
     * 工作项类型
     * @return issueCategory
     */
    public String getIssueCategory() {
        return issueCategory;
    }

    public void setIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
    }

    public CreateProcessInstanceReqCos withChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * 变更类型
     * @return changeType
     */
    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public CreateProcessInstanceReqCos withBeforeChange(String beforeChange) {
        this.beforeChange = beforeChange;
        return this;
    }

    /**
     * 变更前
     * @return beforeChange
     */
    public String getBeforeChange() {
        return beforeChange;
    }

    public void setBeforeChange(String beforeChange) {
        this.beforeChange = beforeChange;
    }

    public CreateProcessInstanceReqCos withAfterChange(String afterChange) {
        this.afterChange = afterChange;
        return this;
    }

    /**
     * 变更后
     * @return afterChange
     */
    public String getAfterChange() {
        return afterChange;
    }

    public void setAfterChange(String afterChange) {
        this.afterChange = afterChange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProcessInstanceReqCos that = (CreateProcessInstanceReqCos) obj;
        return Objects.equals(this.number, that.number) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.issueCategory, that.issueCategory)
            && Objects.equals(this.changeType, that.changeType) && Objects.equals(this.beforeChange, that.beforeChange)
            && Objects.equals(this.afterChange, that.afterChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, issueId, issueCategory, changeType, beforeChange, afterChange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProcessInstanceReqCos {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    issueCategory: ").append(toIndentedString(issueCategory)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    beforeChange: ").append(toIndentedString(beforeChange)).append("\n");
        sb.append("    afterChange: ").append(toIndentedString(afterChange)).append("\n");
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
