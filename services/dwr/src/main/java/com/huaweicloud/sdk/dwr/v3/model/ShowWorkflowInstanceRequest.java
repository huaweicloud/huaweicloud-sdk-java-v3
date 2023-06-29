package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowWorkflowInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_name")

    private String executionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_name")

    private String graphName;

    public ShowWorkflowInstanceRequest withExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }

    /**
     * 工作流实例名称。
     * @return executionName
     */
    public String getExecutionName() {
        return executionName;
    }

    public void setExecutionName(String executionName) {
        this.executionName = executionName;
    }

    public ShowWorkflowInstanceRequest withGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }

    /**
     * 工作流名称。
     * @return graphName
     */
    public String getGraphName() {
        return graphName;
    }

    public void setGraphName(String graphName) {
        this.graphName = graphName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkflowInstanceRequest that = (ShowWorkflowInstanceRequest) obj;
        return Objects.equals(this.executionName, that.executionName) && Objects.equals(this.graphName, that.graphName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionName, graphName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkflowInstanceRequest {\n");
        sb.append("    executionName: ").append(toIndentedString(executionName)).append("\n");
        sb.append("    graphName: ").append(toIndentedString(graphName)).append("\n");
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
