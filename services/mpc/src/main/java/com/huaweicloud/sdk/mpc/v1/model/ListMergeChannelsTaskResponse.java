package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListMergeChannelsTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_array")

    @JacksonXmlProperty(localName = "task_array")

    private List<MergeChannelsTaskInfo> taskArray = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_truncated")

    @JacksonXmlProperty(localName = "is_truncated")

    private Integer isTruncated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    public ListMergeChannelsTaskResponse withTaskArray(List<MergeChannelsTaskInfo> taskArray) {
        this.taskArray = taskArray;
        return this;
    }

    public ListMergeChannelsTaskResponse addTaskArrayItem(MergeChannelsTaskInfo taskArrayItem) {
        if (this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        this.taskArray.add(taskArrayItem);
        return this;
    }

    public ListMergeChannelsTaskResponse withTaskArray(Consumer<List<MergeChannelsTaskInfo>> taskArraySetter) {
        if (this.taskArray == null) {
            this.taskArray = new ArrayList<>();
        }
        taskArraySetter.accept(this.taskArray);
        return this;
    }

    /**
     * 任务列表
     * @return taskArray
     */
    public List<MergeChannelsTaskInfo> getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(List<MergeChannelsTaskInfo> taskArray) {
        this.taskArray = taskArray;
    }

    public ListMergeChannelsTaskResponse withIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * 查询结果是否被截取。 - 1：表示被截取，即还有结果未被返回，可以通过设置page和size参数继续查询。 - 0：表示未被截取，即所有结果已被返回。 
     * minimum: 0
     * maximum: 2
     * @return isTruncated
     */
    public Integer getIsTruncated() {
        return isTruncated;
    }

    public void setIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
    }

    public ListMergeChannelsTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询结果的数量。 
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
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
        ListMergeChannelsTaskResponse listMergeChannelsTaskResponse = (ListMergeChannelsTaskResponse) o;
        return Objects.equals(this.taskArray, listMergeChannelsTaskResponse.taskArray)
            && Objects.equals(this.isTruncated, listMergeChannelsTaskResponse.isTruncated)
            && Objects.equals(this.total, listMergeChannelsTaskResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskArray, isTruncated, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMergeChannelsTaskResponse {\n");
        sb.append("    taskArray: ").append(toIndentedString(taskArray)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
