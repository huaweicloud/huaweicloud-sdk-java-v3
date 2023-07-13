package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 批量执行错误信息
 */
public class OperateErrorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_urn")

    private String workflowUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_detail")

    private String errorDetail;

    public OperateErrorInfo withWorkflowUrn(String workflowUrn) {
        this.workflowUrn = workflowUrn;
        return this;
    }

    /**
     * 唯一标识ID，流程URN
     * @return workflowUrn
     */
    public String getWorkflowUrn() {
        return workflowUrn;
    }

    public void setWorkflowUrn(String workflowUrn) {
        this.workflowUrn = workflowUrn;
    }

    public OperateErrorInfo withErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    /**
     * 错误详情
     * @return errorDetail
     */
    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperateErrorInfo that = (OperateErrorInfo) obj;
        return Objects.equals(this.workflowUrn, that.workflowUrn) && Objects.equals(this.errorDetail, that.errorDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowUrn, errorDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateErrorInfo {\n");
        sb.append("    workflowUrn: ").append(toIndentedString(workflowUrn)).append("\n");
        sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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
