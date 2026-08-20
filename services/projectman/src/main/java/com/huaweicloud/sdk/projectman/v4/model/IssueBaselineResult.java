package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作项基线返回值
 */
public class IssueBaselineResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline")

    private String baseline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_message")

    private String failMessage;

    public IssueBaselineResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 变更的工作项ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IssueBaselineResult withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 工作项变更人ID。
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public IssueBaselineResult withBaseline(String baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * 工作项基线结果。
     * @return baseline
     */
    public String getBaseline() {
        return baseline;
    }

    public void setBaseline(String baseline) {
        this.baseline = baseline;
    }

    public IssueBaselineResult withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * 工作项基线的操作记录ID。
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public IssueBaselineResult withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 工作项完成基线的unix时间戳，单位：毫秒。
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public IssueBaselineResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 基线的工作项编号。 基线失败时返回。
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public IssueBaselineResult withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 基线的工作项标题。 基线失败时返回。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IssueBaselineResult withFailMessage(String failMessage) {
        this.failMessage = failMessage;
        return this;
    }

    /**
     * 工作项基线失败原因。 基线失败时返回。
     * @return failMessage
     */
    public String getFailMessage() {
        return failMessage;
    }

    public void setFailMessage(String failMessage) {
        this.failMessage = failMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueBaselineResult that = (IssueBaselineResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.baseline, that.baseline) && Objects.equals(this.operationId, that.operationId)
            && Objects.equals(this.modifiedDate, that.modifiedDate) && Objects.equals(this.number, that.number)
            && Objects.equals(this.title, that.title) && Objects.equals(this.failMessage, that.failMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modifiedBy, baseline, operationId, modifiedDate, number, title, failMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueBaselineResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    failMessage: ").append(toIndentedString(failMessage)).append("\n");
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
