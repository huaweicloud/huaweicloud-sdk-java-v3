package com.huaweicloud.sdk.vias.v2.model;

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
public class ListBatchTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_task_list")

    private List<BatchTaskDto> batchTaskList = null;

    public ListBatchTasksResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 条目总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListBatchTasksResponse withBatchTaskList(List<BatchTaskDto> batchTaskList) {
        this.batchTaskList = batchTaskList;
        return this;
    }

    public ListBatchTasksResponse addBatchTaskListItem(BatchTaskDto batchTaskListItem) {
        if (this.batchTaskList == null) {
            this.batchTaskList = new ArrayList<>();
        }
        this.batchTaskList.add(batchTaskListItem);
        return this;
    }

    public ListBatchTasksResponse withBatchTaskList(Consumer<List<BatchTaskDto>> batchTaskListSetter) {
        if (this.batchTaskList == null) {
            this.batchTaskList = new ArrayList<>();
        }
        batchTaskListSetter.accept(this.batchTaskList);
        return this;
    }

    /**
     * 批量作业列表
     * @return batchTaskList
     */
    public List<BatchTaskDto> getBatchTaskList() {
        return batchTaskList;
    }

    public void setBatchTaskList(List<BatchTaskDto> batchTaskList) {
        this.batchTaskList = batchTaskList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBatchTasksResponse that = (ListBatchTasksResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.batchTaskList, that.batchTaskList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, batchTaskList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBatchTasksResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    batchTaskList: ").append(toIndentedString(batchTaskList)).append("\n");
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
