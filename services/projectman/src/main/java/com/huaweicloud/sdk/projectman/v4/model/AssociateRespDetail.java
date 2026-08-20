package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AssociateRespDetail
 */
public class AssociateRespDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_msg")

    private String failMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_flag")

    private Integer operationFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private Long modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    public AssociateRespDetail withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 关联的工作项ID，多个ID使用逗号分割。
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public AssociateRespDetail withFailMsg(String failMsg) {
        this.failMsg = failMsg;
        return this;
    }

    /**
     * 失败原因。
     * @return failMsg
     */
    public String getFailMsg() {
        return failMsg;
    }

    public void setFailMsg(String failMsg) {
        this.failMsg = failMsg;
    }

    public AssociateRespDetail withOperationFlag(Integer operationFlag) {
        this.operationFlag = operationFlag;
        return this;
    }

    /**
     * 操作类型标记位。
     * @return operationFlag
     */
    public Integer getOperationFlag() {
        return operationFlag;
    }

    public void setOperationFlag(Integer operationFlag) {
        this.operationFlag = operationFlag;
    }

    public AssociateRespDetail withModifiedDate(Long modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 修改日期。
     * @return modifiedDate
     */
    public Long getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Long modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public AssociateRespDetail withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 修改人。
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateRespDetail that = (AssociateRespDetail) obj;
        return Objects.equals(this.issueId, that.issueId) && Objects.equals(this.failMsg, that.failMsg)
            && Objects.equals(this.operationFlag, that.operationFlag)
            && Objects.equals(this.modifiedDate, that.modifiedDate) && Objects.equals(this.modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueId, failMsg, operationFlag, modifiedDate, modifiedBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateRespDetail {\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    failMsg: ").append(toIndentedString(failMsg)).append("\n");
        sb.append("    operationFlag: ").append(toIndentedString(operationFlag)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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
