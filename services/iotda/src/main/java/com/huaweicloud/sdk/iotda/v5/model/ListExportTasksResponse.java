package com.huaweicloud.sdk.iotda.v5.model;

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

    private List<ExportTask> exportTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListExportTasksResponse withExportTasks(List<ExportTask> exportTasks) {
        this.exportTasks = exportTasks;
        return this;
    }

    public ListExportTasksResponse addExportTasksItem(ExportTask exportTasksItem) {
        if (this.exportTasks == null) {
            this.exportTasks = new ArrayList<>();
        }
        this.exportTasks.add(exportTasksItem);
        return this;
    }

    public ListExportTasksResponse withExportTasks(Consumer<List<ExportTask>> exportTasksSetter) {
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
    public List<ExportTask> getExportTasks() {
        return exportTasks;
    }

    public void setExportTasks(List<ExportTask> exportTasks) {
        this.exportTasks = exportTasks;
    }

    public ListExportTasksResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListExportTasksResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
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
        return Objects.equals(this.exportTasks, that.exportTasks) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportTasks, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExportTasksResponse {\n");
        sb.append("    exportTasks: ").append(toIndentedString(exportTasks)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
