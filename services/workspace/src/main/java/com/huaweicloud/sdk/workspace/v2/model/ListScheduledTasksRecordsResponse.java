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
public class ListScheduledTasksRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks_records")

    private List<ScheduledTasksRecords> tasksRecords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListScheduledTasksRecordsResponse withTasksRecords(List<ScheduledTasksRecords> tasksRecords) {
        this.tasksRecords = tasksRecords;
        return this;
    }

    public ListScheduledTasksRecordsResponse addTasksRecordsItem(ScheduledTasksRecords tasksRecordsItem) {
        if (this.tasksRecords == null) {
            this.tasksRecords = new ArrayList<>();
        }
        this.tasksRecords.add(tasksRecordsItem);
        return this;
    }

    public ListScheduledTasksRecordsResponse withTasksRecords(
        Consumer<List<ScheduledTasksRecords>> tasksRecordsSetter) {
        if (this.tasksRecords == null) {
            this.tasksRecords = new ArrayList<>();
        }
        tasksRecordsSetter.accept(this.tasksRecords);
        return this;
    }

    /**
     * 定时任务执行记录列表。
     * @return tasksRecords
     */
    public List<ScheduledTasksRecords> getTasksRecords() {
        return tasksRecords;
    }

    public void setTasksRecords(List<ScheduledTasksRecords> tasksRecords) {
        this.tasksRecords = tasksRecords;
    }

    public ListScheduledTasksRecordsResponse withTotalCount(Integer totalCount) {
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
        ListScheduledTasksRecordsResponse that = (ListScheduledTasksRecordsResponse) obj;
        return Objects.equals(this.tasksRecords, that.tasksRecords) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasksRecords, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledTasksRecordsResponse {\n");
        sb.append("    tasksRecords: ").append(toIndentedString(tasksRecords)).append("\n");
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
