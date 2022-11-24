package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询多个任务的执行成功率的请求体
 */
public class TasksSuccessRateQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private String endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_ids")

    private List<String> taskIds = null;

    public TasksSuccessRateQuery withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 任务执行开始时间范围的左边界（包含），格式yyyy-MM-dd
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public TasksSuccessRateQuery withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 任务执行开始时间范围的右边界（包含），格式yyyy-MM-dd 。最大时间范围为1年。
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public TasksSuccessRateQuery withTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    public TasksSuccessRateQuery addTaskIdsItem(String taskIdsItem) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskIdsItem);
        return this;
    }

    public TasksSuccessRateQuery withTaskIds(Consumer<List<String>> taskIdsSetter) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        taskIdsSetter.accept(this.taskIds);
        return this;
    }

    /**
     * 任务id列表
     * @return taskIds
     */
    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TasksSuccessRateQuery tasksSuccessRateQuery = (TasksSuccessRateQuery) o;
        return Objects.equals(this.startDate, tasksSuccessRateQuery.startDate)
            && Objects.equals(this.endDate, tasksSuccessRateQuery.endDate)
            && Objects.equals(this.taskIds, tasksSuccessRateQuery.taskIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, endDate, taskIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TasksSuccessRateQuery {\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
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
