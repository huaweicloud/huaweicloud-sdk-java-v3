package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除函数流的Body体
 */
public class WorkflowDeleteBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_urns")

    @JacksonXmlProperty(localName = "workflow_urns")

    private List<String> workflowUrns = null;

    public WorkflowDeleteBody withWorkflowUrns(List<String> workflowUrns) {
        this.workflowUrns = workflowUrns;
        return this;
    }

    public WorkflowDeleteBody addWorkflowUrnsItem(String workflowUrnsItem) {
        if (this.workflowUrns == null) {
            this.workflowUrns = new ArrayList<>();
        }
        this.workflowUrns.add(workflowUrnsItem);
        return this;
    }

    public WorkflowDeleteBody withWorkflowUrns(Consumer<List<String>> workflowUrnsSetter) {
        if (this.workflowUrns == null) {
            this.workflowUrns = new ArrayList<>();
        }
        workflowUrnsSetter.accept(this.workflowUrns);
        return this;
    }

    /**
     * 函数流URN列表
     * @return workflowUrns
     */
    public List<String> getWorkflowUrns() {
        return workflowUrns;
    }

    public void setWorkflowUrns(List<String> workflowUrns) {
        this.workflowUrns = workflowUrns;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowDeleteBody workflowDeleteBody = (WorkflowDeleteBody) o;
        return Objects.equals(this.workflowUrns, workflowDeleteBody.workflowUrns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowUrns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowDeleteBody {\n");
        sb.append("    workflowUrns: ").append(toIndentedString(workflowUrns)).append("\n");
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
