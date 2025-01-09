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
public class ShowDesktopPoolsScriptExecTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_execution_tasks")

    private List<ScriptExecutionTask> scriptExecutionTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowDesktopPoolsScriptExecTasksResponse withScriptExecutionTasks(
        List<ScriptExecutionTask> scriptExecutionTasks) {
        this.scriptExecutionTasks = scriptExecutionTasks;
        return this;
    }

    public ShowDesktopPoolsScriptExecTasksResponse addScriptExecutionTasksItem(
        ScriptExecutionTask scriptExecutionTasksItem) {
        if (this.scriptExecutionTasks == null) {
            this.scriptExecutionTasks = new ArrayList<>();
        }
        this.scriptExecutionTasks.add(scriptExecutionTasksItem);
        return this;
    }

    public ShowDesktopPoolsScriptExecTasksResponse withScriptExecutionTasks(
        Consumer<List<ScriptExecutionTask>> scriptExecutionTasksSetter) {
        if (this.scriptExecutionTasks == null) {
            this.scriptExecutionTasks = new ArrayList<>();
        }
        scriptExecutionTasksSetter.accept(this.scriptExecutionTasks);
        return this;
    }

    /**
     * 脚本执行任务列表。
     * @return scriptExecutionTasks
     */
    public List<ScriptExecutionTask> getScriptExecutionTasks() {
        return scriptExecutionTasks;
    }

    public void setScriptExecutionTasks(List<ScriptExecutionTask> scriptExecutionTasks) {
        this.scriptExecutionTasks = scriptExecutionTasks;
    }

    public ShowDesktopPoolsScriptExecTasksResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDesktopPoolsScriptExecTasksResponse that = (ShowDesktopPoolsScriptExecTasksResponse) obj;
        return Objects.equals(this.scriptExecutionTasks, that.scriptExecutionTasks)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptExecutionTasks, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDesktopPoolsScriptExecTasksResponse {\n");
        sb.append("    scriptExecutionTasks: ").append(toIndentedString(scriptExecutionTasks)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
