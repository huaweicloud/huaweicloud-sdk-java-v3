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
public class ListScriptTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_tasks")

    private List<ScriptTaskInfo> scriptTasks = null;

    public ListScriptTasksResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListScriptTasksResponse withScriptTasks(List<ScriptTaskInfo> scriptTasks) {
        this.scriptTasks = scriptTasks;
        return this;
    }

    public ListScriptTasksResponse addScriptTasksItem(ScriptTaskInfo scriptTasksItem) {
        if (this.scriptTasks == null) {
            this.scriptTasks = new ArrayList<>();
        }
        this.scriptTasks.add(scriptTasksItem);
        return this;
    }

    public ListScriptTasksResponse withScriptTasks(Consumer<List<ScriptTaskInfo>> scriptTasksSetter) {
        if (this.scriptTasks == null) {
            this.scriptTasks = new ArrayList<>();
        }
        scriptTasksSetter.accept(this.scriptTasks);
        return this;
    }

    /**
     * 脚本任务列表。
     * @return scriptTasks
     */
    public List<ScriptTaskInfo> getScriptTasks() {
        return scriptTasks;
    }

    public void setScriptTasks(List<ScriptTaskInfo> scriptTasks) {
        this.scriptTasks = scriptTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScriptTasksResponse that = (ListScriptTasksResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.scriptTasks, that.scriptTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, scriptTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScriptTasksResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    scriptTasks: ").append(toIndentedString(scriptTasks)).append("\n");
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
