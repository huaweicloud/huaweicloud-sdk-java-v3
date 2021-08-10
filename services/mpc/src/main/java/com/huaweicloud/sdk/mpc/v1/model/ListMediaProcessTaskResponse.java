package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListMediaProcessTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_array")

    private List<MediaProcessTaskInfo> taskArray = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_truncated")

    private Integer isTruncated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListMediaProcessTaskResponse withTaskArray(List<MediaProcessTaskInfo> taskArray) {
        this.taskArray = taskArray;
        return this;
    }

    public ListMediaProcessTaskResponse addTaskArrayItem(MediaProcessTaskInfo taskArrayItem) {
        if (this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        this.taskArray.add(taskArrayItem);
        return this;
    }

    public ListMediaProcessTaskResponse withTaskArray(Consumer<List<MediaProcessTaskInfo>> taskArraySetter) {
        if (this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        taskArraySetter.accept(this.taskArray);
        return this;
    }

    /** 任务列表
     * 
     * @return taskArray */
    public List<MediaProcessTaskInfo> getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(List<MediaProcessTaskInfo> taskArray) {
        this.taskArray = taskArray;
    }

    public ListMediaProcessTaskResponse withIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /** 是否截断 minimum: 0 maximum: 2
     * 
     * @return isTruncated */
    public Integer getIsTruncated() {
        return isTruncated;
    }

    public void setIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
    }

    public ListMediaProcessTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 任务总数 minimum: 0 maximum: 2147483647
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMediaProcessTaskResponse listMediaProcessTaskResponse = (ListMediaProcessTaskResponse) o;
        return Objects.equals(this.taskArray, listMediaProcessTaskResponse.taskArray)
            && Objects.equals(this.isTruncated, listMediaProcessTaskResponse.isTruncated)
            && Objects.equals(this.total, listMediaProcessTaskResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskArray, isTruncated, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMediaProcessTaskResponse {\n");
        sb.append("    taskArray: ").append(toIndentedString(taskArray)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
