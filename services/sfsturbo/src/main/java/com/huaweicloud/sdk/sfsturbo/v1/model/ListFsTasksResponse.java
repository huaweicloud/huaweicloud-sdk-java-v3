package com.huaweicloud.sdk.sfsturbo.v1.model;

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
public class ListFsTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<OneFsTaskResp> tasks = null;

    public ListFsTasksResponse withTasks(List<OneFsTaskResp> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListFsTasksResponse addTasksItem(OneFsTaskResp tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListFsTasksResponse withTasks(Consumer<List<OneFsTaskResp>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 任务列表
     * @return tasks
     */
    public List<OneFsTaskResp> getTasks() {
        return tasks;
    }

    public void setTasks(List<OneFsTaskResp> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFsTasksResponse that = (ListFsTasksResponse) obj;
        return Objects.equals(this.tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFsTasksResponse {\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
