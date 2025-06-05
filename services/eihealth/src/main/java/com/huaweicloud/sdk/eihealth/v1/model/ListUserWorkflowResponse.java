package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListUserWorkflowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflows")

    private List<WorkflowListDto> workflows = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListUserWorkflowResponse withWorkflows(List<WorkflowListDto> workflows) {
        this.workflows = workflows;
        return this;
    }

    public ListUserWorkflowResponse addWorkflowsItem(WorkflowListDto workflowsItem) {
        if (this.workflows == null) {
            this.workflows = new ArrayList<>();
        }
        this.workflows.add(workflowsItem);
        return this;
    }

    public ListUserWorkflowResponse withWorkflows(Consumer<List<WorkflowListDto>> workflowsSetter) {
        if (this.workflows == null) {
            this.workflows = new ArrayList<>();
        }
        workflowsSetter.accept(this.workflows);
        return this;
    }

    /**
     * 所查询类型的流程总数
     * @return workflows
     */
    public List<WorkflowListDto> getWorkflows() {
        return workflows;
    }

    public void setWorkflows(List<WorkflowListDto> workflows) {
        this.workflows = workflows;
    }

    public ListUserWorkflowResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 当前页的流程列表
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUserWorkflowResponse that = (ListUserWorkflowResponse) obj;
        return Objects.equals(this.workflows, that.workflows) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflows, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserWorkflowResponse {\n");
        sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
