package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubTaskCaseSuccessLineDetailVo
 */
public class SubTaskCaseSuccessLineDetailVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private Long date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pass_rate")

    private Float passRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    public SubTaskCaseSuccessLineDetailVo withDate(Long date) {
        this.date = date;
        return this;
    }

    /**
     * 统计时间
     * @return date
     */
    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public SubTaskCaseSuccessLineDetailVo withPassRate(Float passRate) {
        this.passRate = passRate;
        return this;
    }

    /**
     * 成功率
     * @return passRate
     */
    public Float getPassRate() {
        return passRate;
    }

    public void setPassRate(Float passRate) {
        this.passRate = passRate;
    }

    public SubTaskCaseSuccessLineDetailVo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public SubTaskCaseSuccessLineDetailVo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubTaskCaseSuccessLineDetailVo that = (SubTaskCaseSuccessLineDetailVo) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.passRate, that.passRate)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, passRate, taskId, taskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTaskCaseSuccessLineDetailVo {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    passRate: ").append(toIndentedString(passRate)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
