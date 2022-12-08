package com.huaweicloud.sdk.dsc.v1.model;

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
public class ListDbMaskTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<DBMaskTaskInfo> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListDbMaskTaskResponse withTasks(List<DBMaskTaskInfo> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListDbMaskTaskResponse addTasksItem(DBMaskTaskInfo tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListDbMaskTaskResponse withTasks(Consumer<List<DBMaskTaskInfo>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 脱敏任务列表
     * @return tasks
     */
    public List<DBMaskTaskInfo> getTasks() {
        return tasks;
    }

    public void setTasks(List<DBMaskTaskInfo> tasks) {
        this.tasks = tasks;
    }

    public ListDbMaskTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 脱敏任务总数
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
        ListDbMaskTaskResponse listDbMaskTaskResponse = (ListDbMaskTaskResponse) o;
        return Objects.equals(this.tasks, listDbMaskTaskResponse.tasks)
            && Objects.equals(this.total, listDbMaskTaskResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbMaskTaskResponse {\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
