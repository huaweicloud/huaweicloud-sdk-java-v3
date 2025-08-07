package com.huaweicloud.sdk.rds.v3.model;

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
public class ListScheduleTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_tasks")

    private List<ScheduleTaskInfo> scheduleTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListScheduleTasksResponse withScheduleTasks(List<ScheduleTaskInfo> scheduleTasks) {
        this.scheduleTasks = scheduleTasks;
        return this;
    }

    public ListScheduleTasksResponse addScheduleTasksItem(ScheduleTaskInfo scheduleTasksItem) {
        if (this.scheduleTasks == null) {
            this.scheduleTasks = new ArrayList<>();
        }
        this.scheduleTasks.add(scheduleTasksItem);
        return this;
    }

    public ListScheduleTasksResponse withScheduleTasks(Consumer<List<ScheduleTaskInfo>> scheduleTasksSetter) {
        if (this.scheduleTasks == null) {
            this.scheduleTasks = new ArrayList<>();
        }
        scheduleTasksSetter.accept(this.scheduleTasks);
        return this;
    }

    /**
     * 定时任务列表。
     * @return scheduleTasks
     */
    public List<ScheduleTaskInfo> getScheduleTasks() {
        return scheduleTasks;
    }

    public void setScheduleTasks(List<ScheduleTaskInfo> scheduleTasks) {
        this.scheduleTasks = scheduleTasks;
    }

    public ListScheduleTasksResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总任务数量。
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
        ListScheduleTasksResponse that = (ListScheduleTasksResponse) obj;
        return Objects.equals(this.scheduleTasks, that.scheduleTasks)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleTasks, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduleTasksResponse {\n");
        sb.append("    scheduleTasks: ").append(toIndentedString(scheduleTasks)).append("\n");
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
