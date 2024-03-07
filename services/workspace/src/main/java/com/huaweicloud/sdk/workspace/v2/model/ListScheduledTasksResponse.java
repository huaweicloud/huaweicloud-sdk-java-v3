package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListScheduledTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_tasks")

    private List<ScheduledTask> scheduledTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListScheduledTasksResponse withScheduledTasks(List<ScheduledTask> scheduledTasks) {
        this.scheduledTasks = scheduledTasks;
        return this;
    }

    public ListScheduledTasksResponse addScheduledTasksItem(ScheduledTask scheduledTasksItem) {
        if (this.scheduledTasks == null) {
            this.scheduledTasks = new ArrayList<>();
        }
        this.scheduledTasks.add(scheduledTasksItem);
        return this;
    }

    public ListScheduledTasksResponse withScheduledTasks(Consumer<List<ScheduledTask>> scheduledTasksSetter) {
        if (this.scheduledTasks == null) {
            this.scheduledTasks = new ArrayList<>();
        }
        scheduledTasksSetter.accept(this.scheduledTasks);
        return this;
    }

    /**
     * 定时任务列表。
     * @return scheduledTasks
     */
    public List<ScheduledTask> getScheduledTasks() {
        return scheduledTasks;
    }

    public void setScheduledTasks(List<ScheduledTask> scheduledTasks) {
        this.scheduledTasks = scheduledTasks;
    }

    public ListScheduledTasksResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总个数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScheduledTasksResponse that = (ListScheduledTasksResponse) obj;
        return Objects.equals(this.scheduledTasks, that.scheduledTasks)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduledTasks, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledTasksResponse {\n");
        sb.append("    scheduledTasks: ").append(toIndentedString(scheduledTasks)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
