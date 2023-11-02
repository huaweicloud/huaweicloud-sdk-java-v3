package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowWorkflowRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Show-Param-Detail")

    private Boolean showParamDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    public ShowWorkflowRequest withShowParamDetail(Boolean showParamDetail) {
        this.showParamDetail = showParamDetail;
        return this;
    }

    /**
     * 是否显示模板参数详情
     * @return showParamDetail
     */
    public Boolean getShowParamDetail() {
        return showParamDetail;
    }

    public void setShowParamDetail(Boolean showParamDetail) {
        this.showParamDetail = showParamDetail;
    }

    public ShowWorkflowRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 平台项目ID，您可以在平台单击所需的项目名称，进入项目设置页面查看。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public ShowWorkflowRequest withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * 流程id
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkflowRequest that = (ShowWorkflowRequest) obj;
        return Objects.equals(this.showParamDetail, that.showParamDetail)
            && Objects.equals(this.eihealthProjectId, that.eihealthProjectId)
            && Objects.equals(this.workflowId, that.workflowId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(showParamDetail, eihealthProjectId, workflowId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkflowRequest {\n");
        sb.append("    showParamDetail: ").append(toIndentedString(showParamDetail)).append("\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
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
