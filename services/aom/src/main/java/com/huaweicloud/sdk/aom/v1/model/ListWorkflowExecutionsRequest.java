package com.huaweicloud.sdk.aom.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListWorkflowExecutionsRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="workflow_id")
    

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x_enterprise_project_id")
    

    private String xEnterpriseProjectId;

    public ListWorkflowExecutionsRequest withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    


    /**
     * 任务id，从工作流命令列表中获取的工作流id。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    

    public ListWorkflowExecutionsRequest withXEnterpriseProjectId(String xEnterpriseProjectId) {
        this.xEnterpriseProjectId = xEnterpriseProjectId;
        return this;
    }

    


    /**
     * 所属的企业项目id。
     * @return xEnterpriseProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x_enterprise_project_id")
    public String getXEnterpriseProjectId() {
        return xEnterpriseProjectId;
    }

    public void setXEnterpriseProjectId(String xEnterpriseProjectId) {
        this.xEnterpriseProjectId = xEnterpriseProjectId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWorkflowExecutionsRequest listWorkflowExecutionsRequest = (ListWorkflowExecutionsRequest) o;
        return Objects.equals(this.workflowId, listWorkflowExecutionsRequest.workflowId) &&
            Objects.equals(this.xEnterpriseProjectId, listWorkflowExecutionsRequest.xEnterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(workflowId, xEnterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkflowExecutionsRequest {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    xEnterpriseProjectId: ").append(toIndentedString(xEnterpriseProjectId)).append("\n");
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

