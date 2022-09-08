package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowIssuesWrokFlowConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflows")

    private List<ScrumStatusFlowVo> workflows = null;

    public ShowIssuesWrokFlowConfigResponse withWorkflows(List<ScrumStatusFlowVo> workflows) {
        this.workflows = workflows;
        return this;
    }

    public ShowIssuesWrokFlowConfigResponse addWorkflowsItem(ScrumStatusFlowVo workflowsItem) {
        if (this.workflows == null) {
            this.workflows = new ArrayList<>();
        }
        this.workflows.add(workflowsItem);
        return this;
    }

    public ShowIssuesWrokFlowConfigResponse withWorkflows(Consumer<List<ScrumStatusFlowVo>> workflowsSetter) {
        if (this.workflows == null) {
            this.workflows = new ArrayList<>();
        }
        workflowsSetter.accept(this.workflows);
        return this;
    }

    /**
     * 流转数据
     * @return workflows
     */
    public List<ScrumStatusFlowVo> getWorkflows() {
        return workflows;
    }

    public void setWorkflows(List<ScrumStatusFlowVo> workflows) {
        this.workflows = workflows;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowIssuesWrokFlowConfigResponse showIssuesWrokFlowConfigResponse = (ShowIssuesWrokFlowConfigResponse) o;
        return Objects.equals(this.workflows, showIssuesWrokFlowConfigResponse.workflows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIssuesWrokFlowConfigResponse {\n");
        sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
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
