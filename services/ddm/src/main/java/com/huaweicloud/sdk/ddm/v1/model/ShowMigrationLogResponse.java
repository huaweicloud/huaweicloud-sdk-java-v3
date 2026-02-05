package com.huaweicloud.sdk.ddm.v1.model;

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
public class ShowMigrationLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_logs")

    private List<TaskLogsVO> taskLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_page")

    private Integer curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private Integer perPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowMigrationLogResponse withTaskLogs(List<TaskLogsVO> taskLogs) {
        this.taskLogs = taskLogs;
        return this;
    }

    public ShowMigrationLogResponse addTaskLogsItem(TaskLogsVO taskLogsItem) {
        if (this.taskLogs == null) {
            this.taskLogs = new ArrayList<>();
        }
        this.taskLogs.add(taskLogsItem);
        return this;
    }

    public ShowMigrationLogResponse withTaskLogs(Consumer<List<TaskLogsVO>> taskLogsSetter) {
        if (this.taskLogs == null) {
            this.taskLogs = new ArrayList<>();
        }
        taskLogsSetter.accept(this.taskLogs);
        return this;
    }

    /**
     * **参数解释**：  分片变更任务日志的集合。  **参数范围**：  不涉及。
     * @return taskLogs
     */
    public List<TaskLogsVO> getTaskLogs() {
        return taskLogs;
    }

    public void setTaskLogs(List<TaskLogsVO> taskLogs) {
        this.taskLogs = taskLogs;
    }

    public ShowMigrationLogResponse withCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * **参数解释**：  当前页。  **参数范围**：  不涉及。
     * minimum: 0
     * maximum: 2147483647
     * @return curPage
     */
    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public ShowMigrationLogResponse withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * **参数解释**：  每页条数。  **参数范围**：  不涉及。
     * minimum: 0
     * maximum: 2147483647
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public ShowMigrationLogResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：  总量。  **参数范围**：  不涉及。
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMigrationLogResponse that = (ShowMigrationLogResponse) obj;
        return Objects.equals(this.taskLogs, that.taskLogs) && Objects.equals(this.curPage, that.curPage)
            && Objects.equals(this.perPage, that.perPage) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskLogs, curPage, perPage, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMigrationLogResponse {\n");
        sb.append("    taskLogs: ").append(toIndentedString(taskLogs)).append("\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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
