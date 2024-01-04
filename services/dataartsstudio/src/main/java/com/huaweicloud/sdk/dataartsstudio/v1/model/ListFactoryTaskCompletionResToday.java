package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListFactoryTaskCompletionResToday
 */
public class ListFactoryTaskCompletionResToday {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private Long recordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_completion_num")

    private Long taskCompletionNum;

    public ListFactoryTaskCompletionResToday withRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * 整时的时间点
     * @return recordTime
     */
    public Long getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
    }

    public ListFactoryTaskCompletionResToday withTaskCompletionNum(Long taskCompletionNum) {
        this.taskCompletionNum = taskCompletionNum;
        return this;
    }

    /**
     * 到当前时间点完成的任务数量
     * @return taskCompletionNum
     */
    public Long getTaskCompletionNum() {
        return taskCompletionNum;
    }

    public void setTaskCompletionNum(Long taskCompletionNum) {
        this.taskCompletionNum = taskCompletionNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactoryTaskCompletionResToday that = (ListFactoryTaskCompletionResToday) obj;
        return Objects.equals(this.recordTime, that.recordTime)
            && Objects.equals(this.taskCompletionNum, that.taskCompletionNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordTime, taskCompletionNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryTaskCompletionResToday {\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
        sb.append("    taskCompletionNum: ").append(toIndentedString(taskCompletionNum)).append("\n");
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
