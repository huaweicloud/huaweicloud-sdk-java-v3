package com.huaweicloud.sdk.swr.v2.model;

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
public class ListInstanceReplicationPolicyExecSubTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtasks")

    private List<SubtaskDetail> subtasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListInstanceReplicationPolicyExecSubTasksResponse withSubtasks(List<SubtaskDetail> subtasks) {
        this.subtasks = subtasks;
        return this;
    }

    public ListInstanceReplicationPolicyExecSubTasksResponse addSubtasksItem(SubtaskDetail subtasksItem) {
        if (this.subtasks == null) {
            this.subtasks = new ArrayList<>();
        }
        this.subtasks.add(subtasksItem);
        return this;
    }

    public ListInstanceReplicationPolicyExecSubTasksResponse withSubtasks(
        Consumer<List<SubtaskDetail>> subtasksSetter) {
        if (this.subtasks == null) {
            this.subtasks = new ArrayList<>();
        }
        subtasksSetter.accept(this.subtasks);
        return this;
    }

    /**
     * 老化策略执行记录子任务列表
     * @return subtasks
     */
    public List<SubtaskDetail> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(List<SubtaskDetail> subtasks) {
        this.subtasks = subtasks;
    }

    public ListInstanceReplicationPolicyExecSubTasksResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 老化策略执行记录子任务总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceReplicationPolicyExecSubTasksResponse that =
            (ListInstanceReplicationPolicyExecSubTasksResponse) obj;
        return Objects.equals(this.subtasks, that.subtasks) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subtasks, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceReplicationPolicyExecSubTasksResponse {\n");
        sb.append("    subtasks: ").append(toIndentedString(subtasks)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
