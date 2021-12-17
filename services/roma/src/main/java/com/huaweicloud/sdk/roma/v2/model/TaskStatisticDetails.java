package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 每种状态任务的数量信息 */
public class TaskStatisticDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_tasks_count")

    private Integer runningTasksCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_tasks_count")

    private Integer abnormalTasksCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminated_tasks_count")

    private Integer terminatedTasksCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_tasks_count")

    private Integer completedTasksCount;

    public TaskStatisticDetails withRunningTasksCount(Integer runningTasksCount) {
        this.runningTasksCount = runningTasksCount;
        return this;
    }

    /** 运行任务数量 minimum: 0 maximum: 999999999999
     * 
     * @return runningTasksCount */
    public Integer getRunningTasksCount() {
        return runningTasksCount;
    }

    public void setRunningTasksCount(Integer runningTasksCount) {
        this.runningTasksCount = runningTasksCount;
    }

    public TaskStatisticDetails withAbnormalTasksCount(Integer abnormalTasksCount) {
        this.abnormalTasksCount = abnormalTasksCount;
        return this;
    }

    /** 异常任务数量 minimum: 0 maximum: 999999999999
     * 
     * @return abnormalTasksCount */
    public Integer getAbnormalTasksCount() {
        return abnormalTasksCount;
    }

    public void setAbnormalTasksCount(Integer abnormalTasksCount) {
        this.abnormalTasksCount = abnormalTasksCount;
    }

    public TaskStatisticDetails withTerminatedTasksCount(Integer terminatedTasksCount) {
        this.terminatedTasksCount = terminatedTasksCount;
        return this;
    }

    /** 终止任务数量 minimum: 0 maximum: 999999999999
     * 
     * @return terminatedTasksCount */
    public Integer getTerminatedTasksCount() {
        return terminatedTasksCount;
    }

    public void setTerminatedTasksCount(Integer terminatedTasksCount) {
        this.terminatedTasksCount = terminatedTasksCount;
    }

    public TaskStatisticDetails withCompletedTasksCount(Integer completedTasksCount) {
        this.completedTasksCount = completedTasksCount;
        return this;
    }

    /** 成功任务数量 minimum: 0 maximum: 999999999999
     * 
     * @return completedTasksCount */
    public Integer getCompletedTasksCount() {
        return completedTasksCount;
    }

    public void setCompletedTasksCount(Integer completedTasksCount) {
        this.completedTasksCount = completedTasksCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskStatisticDetails taskStatisticDetails = (TaskStatisticDetails) o;
        return Objects.equals(this.runningTasksCount, taskStatisticDetails.runningTasksCount)
            && Objects.equals(this.abnormalTasksCount, taskStatisticDetails.abnormalTasksCount)
            && Objects.equals(this.terminatedTasksCount, taskStatisticDetails.terminatedTasksCount)
            && Objects.equals(this.completedTasksCount, taskStatisticDetails.completedTasksCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runningTasksCount, abnormalTasksCount, terminatedTasksCount, completedTasksCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskStatisticDetails {\n");
        sb.append("    runningTasksCount: ").append(toIndentedString(runningTasksCount)).append("\n");
        sb.append("    abnormalTasksCount: ").append(toIndentedString(abnormalTasksCount)).append("\n");
        sb.append("    terminatedTasksCount: ").append(toIndentedString(terminatedTasksCount)).append("\n");
        sb.append("    completedTasksCount: ").append(toIndentedString(completedTasksCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
