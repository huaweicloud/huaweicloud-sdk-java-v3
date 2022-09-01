package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListWorkflowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflows")

    @JacksonXmlProperty(localName = "workflows")

    private List<WorkflowSimpleInfo> workflows = null;

    public ListWorkflowResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 返回所有满足条件的对象个数
     * minimum: 0
     * maximum: 1000000
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListWorkflowResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 返回对象的大小
     * minimum: 0
     * maximum: 200
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListWorkflowResponse withWorkflows(List<WorkflowSimpleInfo> workflows) {
        this.workflows = workflows;
        return this;
    }

    public ListWorkflowResponse addWorkflowsItem(WorkflowSimpleInfo workflowsItem) {
        if (this.workflows == null) {
            this.workflows = new ArrayList<>();
        }
        this.workflows.add(workflowsItem);
        return this;
    }

    public ListWorkflowResponse withWorkflows(Consumer<List<WorkflowSimpleInfo>> workflowsSetter) {
        if (this.workflows == null) {
            this.workflows = new ArrayList<>();
        }
        workflowsSetter.accept(this.workflows);
        return this;
    }

    /**
     * 返回的实体对象
     * @return workflows
     */
    public List<WorkflowSimpleInfo> getWorkflows() {
        return workflows;
    }

    public void setWorkflows(List<WorkflowSimpleInfo> workflows) {
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
        ListWorkflowResponse listWorkflowResponse = (ListWorkflowResponse) o;
        return Objects.equals(this.total, listWorkflowResponse.total)
            && Objects.equals(this.size, listWorkflowResponse.size)
            && Objects.equals(this.workflows, listWorkflowResponse.workflows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, size, workflows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkflowResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
