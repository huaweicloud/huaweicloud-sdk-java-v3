package com.huaweicloud.sdk.oms.v2.model;

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
public class ListTaskGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskgroups")

    private List<TaskGroupResp> taskgroups = null;

    public ListTaskGroupResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 满足查询条件的任务组总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListTaskGroupResponse withTaskgroups(List<TaskGroupResp> taskgroups) {
        this.taskgroups = taskgroups;
        return this;
    }

    public ListTaskGroupResponse addTaskgroupsItem(TaskGroupResp taskgroupsItem) {
        if (this.taskgroups == null) {
            this.taskgroups = new ArrayList<>();
        }
        this.taskgroups.add(taskgroupsItem);
        return this;
    }

    public ListTaskGroupResponse withTaskgroups(Consumer<List<TaskGroupResp>> taskgroupsSetter) {
        if (this.taskgroups == null) {
            this.taskgroups = new ArrayList<>();
        }
        taskgroupsSetter.accept(this.taskgroups);
        return this;
    }

    /**
     * 查询的迁移任务组详情
     * @return taskgroups
     */
    public List<TaskGroupResp> getTaskgroups() {
        return taskgroups;
    }

    public void setTaskgroups(List<TaskGroupResp> taskgroups) {
        this.taskgroups = taskgroups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTaskGroupResponse listTaskGroupResponse = (ListTaskGroupResponse) o;
        return Objects.equals(this.count, listTaskGroupResponse.count)
            && Objects.equals(this.taskgroups, listTaskGroupResponse.taskgroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, taskgroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskGroupResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    taskgroups: ").append(toIndentedString(taskgroups)).append("\n");
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
