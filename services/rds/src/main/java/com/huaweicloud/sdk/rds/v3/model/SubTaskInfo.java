package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 子任务进度信息
 */
public class SubTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_name")

    private String subTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percent")

    private String percent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executed_time")

    private String executedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_time")

    private String remainingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_detail")

    private Boolean showDetail;

    public SubTaskInfo withSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
        return this;
    }

    /**
     * 子任务名
     * @return subTaskName
     */
    public String getSubTaskName() {
        return subTaskName;
    }

    public void setSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
    }

    public SubTaskInfo withPercent(String percent) {
        this.percent = percent;
        return this;
    }

    /**
     * 子任务进度
     * @return percent
     */
    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public SubTaskInfo withExecutedTime(String executedTime) {
        this.executedTime = executedTime;
        return this;
    }

    /**
     * 子任务执行时间
     * @return executedTime
     */
    public String getExecutedTime() {
        return executedTime;
    }

    public void setExecutedTime(String executedTime) {
        this.executedTime = executedTime;
    }

    public SubTaskInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 子任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SubTaskInfo withRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
        return this;
    }

    /**
     * 子任务剩余预估时长
     * @return remainingTime
     */
    public String getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
    }

    public SubTaskInfo withShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
        return this;
    }

    /**
     * 是否展示已恢复库表
     * @return showDetail
     */
    public Boolean getShowDetail() {
        return showDetail;
    }

    public void setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubTaskInfo that = (SubTaskInfo) obj;
        return Objects.equals(this.subTaskName, that.subTaskName) && Objects.equals(this.percent, that.percent)
            && Objects.equals(this.executedTime, that.executedTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.remainingTime, that.remainingTime)
            && Objects.equals(this.showDetail, that.showDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subTaskName, percent, executedTime, status, remainingTime, showDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTaskInfo {\n");
        sb.append("    subTaskName: ").append(toIndentedString(subTaskName)).append("\n");
        sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
        sb.append("    executedTime: ").append(toIndentedString(executedTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    remainingTime: ").append(toIndentedString(remainingTime)).append("\n");
        sb.append("    showDetail: ").append(toIndentedString(showDetail)).append("\n");
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
