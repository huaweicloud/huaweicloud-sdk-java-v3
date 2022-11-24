package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AsyncInvokeApiStartWorkflowRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_name")

    private String graphName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExecuteWorkflowBody body;

    public AsyncInvokeApiStartWorkflowRequest withGraphName(String graphName) {
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

    public AsyncInvokeApiStartWorkflowRequest withBody(ExecuteWorkflowBody body) {
        this.body = body;
        return this;
    }

    public AsyncInvokeApiStartWorkflowRequest withBody(Consumer<ExecuteWorkflowBody> bodySetter) {
        if (this.body == null) {
            this.body = new ExecuteWorkflowBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExecuteWorkflowBody getBody() {
        return body;
    }

    public void setBody(ExecuteWorkflowBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AsyncInvokeApiStartWorkflowRequest asyncInvokeApiStartWorkflowRequest = (AsyncInvokeApiStartWorkflowRequest) o;
        return Objects.equals(this.graphName, asyncInvokeApiStartWorkflowRequest.graphName)
            && Objects.equals(this.body, asyncInvokeApiStartWorkflowRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(graphName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsyncInvokeApiStartWorkflowRequest {\n");
        sb.append("    graphName: ").append(toIndentedString(graphName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
