package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class RestoreWorkflowExecutionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_name")

    private String executionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_name")

    private String graphName;

    public RestoreWorkflowExecutionRequest withExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }

    /**
     * 工作流实例名。
     * @return executionName
     */
    public String getExecutionName() {
        return executionName;
    }

    public void setExecutionName(String executionName) {
        this.executionName = executionName;
    }

    public RestoreWorkflowExecutionRequest withGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }

    /**
     * 工作流名。
     * @return graphName
     */
    public String getGraphName() {
        return graphName;
    }

    public void setGraphName(String graphName) {
        this.graphName = graphName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreWorkflowExecutionRequest restoreWorkflowExecutionRequest = (RestoreWorkflowExecutionRequest) o;
        return Objects.equals(this.executionName, restoreWorkflowExecutionRequest.executionName)
            && Objects.equals(this.graphName, restoreWorkflowExecutionRequest.graphName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionName, graphName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreWorkflowExecutionRequest {\n");
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
