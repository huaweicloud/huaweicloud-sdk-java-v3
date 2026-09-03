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
public class ListBinlogExportsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_list")

    private List<BinlogExportTaskDetailResp> taskList = null;

    public ListBinlogExportsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListBinlogExportsResponse withTaskList(List<BinlogExportTaskDetailResp> taskList) {
        this.taskList = taskList;
        return this;
    }

    public ListBinlogExportsResponse addTaskListItem(BinlogExportTaskDetailResp taskListItem) {
        if (this.taskList == null) {
            this.taskList = new ArrayList<>();
        }
        this.taskList.add(taskListItem);
        return this;
    }

    public ListBinlogExportsResponse withTaskList(Consumer<List<BinlogExportTaskDetailResp>> taskListSetter) {
        if (this.taskList == null) {
            this.taskList = new ArrayList<>();
        }
        taskListSetter.accept(this.taskList);
        return this;
    }

    /**
     * 导出任务列表
     * @return taskList
     */
    public List<BinlogExportTaskDetailResp> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<BinlogExportTaskDetailResp> taskList) {
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
        ListBinlogExportsResponse that = (ListBinlogExportsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.taskList, that.taskList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, taskList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBinlogExportsResponse {\n");
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
