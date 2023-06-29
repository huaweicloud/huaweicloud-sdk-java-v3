package com.huaweicloud.sdk.functiongraph.v2.model;

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
public class ShowWorkflowExecutionForPageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executions")

    private List<FlowExecutionBriefV2> executions = null;

    public ShowWorkflowExecutionForPageResponse withTotal(Long total) {
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

    public ShowWorkflowExecutionForPageResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 返回对象的大小
     * minimum: 0
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShowWorkflowExecutionForPageResponse withExecutions(List<FlowExecutionBriefV2> executions) {
        this.executions = executions;
        return this;
    }

    public ShowWorkflowExecutionForPageResponse addExecutionsItem(FlowExecutionBriefV2 executionsItem) {
        if (this.executions == null) {
            this.executions = new ArrayList<>();
        }
        this.executions.add(executionsItem);
        return this;
    }

    public ShowWorkflowExecutionForPageResponse withExecutions(Consumer<List<FlowExecutionBriefV2>> executionsSetter) {
        if (this.executions == null) {
            this.executions = new ArrayList<>();
        }
        executionsSetter.accept(this.executions);
        return this;
    }

    /**
     * 函数流返回体信息
     * @return executions
     */
    public List<FlowExecutionBriefV2> getExecutions() {
        return executions;
    }

    public void setExecutions(List<FlowExecutionBriefV2> executions) {
        this.executions = executions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkflowExecutionForPageResponse that = (ShowWorkflowExecutionForPageResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.size, that.size)
            && Objects.equals(this.executions, that.executions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, size, executions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkflowExecutionForPageResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    executions: ").append(toIndentedString(executions)).append("\n");
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
