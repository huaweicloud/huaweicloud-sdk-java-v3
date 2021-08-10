package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListExtractTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<ExtractTask> tasks = null;

    public ListExtractTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 任务总数 minimum: 0 maximum: 2147483647
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListExtractTaskResponse withTasks(List<ExtractTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListExtractTaskResponse addTasksItem(ExtractTask tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListExtractTaskResponse withTasks(Consumer<List<ExtractTask>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /** 任务列表
     * 
     * @return tasks */
    public List<ExtractTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<ExtractTask> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListExtractTaskResponse listExtractTaskResponse = (ListExtractTaskResponse) o;
        return Objects.equals(this.total, listExtractTaskResponse.total)
            && Objects.equals(this.tasks, listExtractTaskResponse.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExtractTaskResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
