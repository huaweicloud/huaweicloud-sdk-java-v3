package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListExportTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_tasks")

    private List<ExportTaskItem> exportTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListExportTasksResponse withExportTasks(List<ExportTaskItem> exportTasks) {
        this.exportTasks = exportTasks;
        return this;
    }

    public ListExportTasksResponse addExportTasksItem(ExportTaskItem exportTasksItem) {
        if (this.exportTasks == null) {
            this.exportTasks = new ArrayList<>();
        }
        this.exportTasks.add(exportTasksItem);
        return this;
    }

    public ListExportTasksResponse withExportTasks(Consumer<List<ExportTaskItem>> exportTasksSetter) {
        if (this.exportTasks == null) {
            this.exportTasks = new ArrayList<>();
        }
        exportTasksSetter.accept(this.exportTasks);
        return this;
    }

    /**
     * 导出任务列表。
     * @return exportTasks
     */
    public List<ExportTaskItem> getExportTasks() {
        return exportTasks;
    }

    public void setExportTasks(List<ExportTaskItem> exportTasks) {
        this.exportTasks = exportTasks;
    }

    public ListExportTasksResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 导出任务列表总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExportTasksResponse that = (ListExportTasksResponse) obj;
        return Objects.equals(this.exportTasks, that.exportTasks) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportTasks, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExportTasksResponse {\n");
        sb.append("    exportTasks: ").append(toIndentedString(exportTasks)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
