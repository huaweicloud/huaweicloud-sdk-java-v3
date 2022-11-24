package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowWorkflowExecutionForPageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private QueryRunListParam body;

    public ShowWorkflowExecutionForPageRequest withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * 函数工作流ID
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public ShowWorkflowExecutionForPageRequest withBody(QueryRunListParam body) {
        this.body = body;
        return this;
    }

    public ShowWorkflowExecutionForPageRequest withBody(Consumer<QueryRunListParam> bodySetter) {
        if (this.body == null) {
            this.body = new QueryRunListParam();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public QueryRunListParam getBody() {
        return body;
    }

    public void setBody(QueryRunListParam body) {
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
        ShowWorkflowExecutionForPageRequest showWorkflowExecutionForPageRequest =
            (ShowWorkflowExecutionForPageRequest) o;
        return Objects.equals(this.workflowId, showWorkflowExecutionForPageRequest.workflowId)
            && Objects.equals(this.body, showWorkflowExecutionForPageRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkflowExecutionForPageRequest {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
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
