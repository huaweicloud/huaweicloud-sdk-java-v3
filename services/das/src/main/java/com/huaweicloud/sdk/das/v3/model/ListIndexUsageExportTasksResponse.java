package com.huaweicloud.sdk.das.v3.model;

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
public class ListIndexUsageExportTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_list")

    private List<IndexUsageExportTaskInfo> taskList = null;

    public ListIndexUsageExportTasksResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListIndexUsageExportTasksResponse withTaskList(List<IndexUsageExportTaskInfo> taskList) {
        this.taskList = taskList;
        return this;
    }

    public ListIndexUsageExportTasksResponse addTaskListItem(IndexUsageExportTaskInfo taskListItem) {
        if (this.taskList == null) {
            this.taskList = new ArrayList<>();
        }
        this.taskList.add(taskListItem);
        return this;
    }

    public ListIndexUsageExportTasksResponse withTaskList(Consumer<List<IndexUsageExportTaskInfo>> taskListSetter) {
        if (this.taskList == null) {
            this.taskList = new ArrayList<>();
        }
        taskListSetter.accept(this.taskList);
        return this;
    }

    /**
     * 任务列表
     * @return taskList
     */
    public List<IndexUsageExportTaskInfo> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<IndexUsageExportTaskInfo> taskList) {
        this.taskList = taskList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIndexUsageExportTasksResponse that = (ListIndexUsageExportTasksResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.taskList, that.taskList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, taskList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIndexUsageExportTasksResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    taskList: ").append(toIndentedString(taskList)).append("\n");
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
