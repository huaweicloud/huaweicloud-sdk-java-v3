package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListTaskTableReferenceDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_table_detail_list")

    private List<TaskTableReferenceDetailResponse> taskTableDetailList = null;

    public ListTaskTableReferenceDetailResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 引用的作业数量。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListTaskTableReferenceDetailResponse withTaskTableDetailList(
        List<TaskTableReferenceDetailResponse> taskTableDetailList) {
        this.taskTableDetailList = taskTableDetailList;
        return this;
    }

    public ListTaskTableReferenceDetailResponse addTaskTableDetailListItem(
        TaskTableReferenceDetailResponse taskTableDetailListItem) {
        if (this.taskTableDetailList == null) {
            this.taskTableDetailList = new ArrayList<>();
        }
        this.taskTableDetailList.add(taskTableDetailListItem);
        return this;
    }

    public ListTaskTableReferenceDetailResponse withTaskTableDetailList(
        Consumer<List<TaskTableReferenceDetailResponse>> taskTableDetailListSetter) {
        if (this.taskTableDetailList == null) {
            this.taskTableDetailList = new ArrayList<>();
        }
        taskTableDetailListSetter.accept(this.taskTableDetailList);
        return this;
    }

    /**
     * 引用作业的详情。
     * @return taskTableDetailList
     */
    public List<TaskTableReferenceDetailResponse> getTaskTableDetailList() {
        return taskTableDetailList;
    }

    public void setTaskTableDetailList(List<TaskTableReferenceDetailResponse> taskTableDetailList) {
        this.taskTableDetailList = taskTableDetailList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTaskTableReferenceDetailResponse that = (ListTaskTableReferenceDetailResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.taskTableDetailList, that.taskTableDetailList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, taskTableDetailList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskTableReferenceDetailResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    taskTableDetailList: ").append(toIndentedString(taskTableDetailList)).append("\n");
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
