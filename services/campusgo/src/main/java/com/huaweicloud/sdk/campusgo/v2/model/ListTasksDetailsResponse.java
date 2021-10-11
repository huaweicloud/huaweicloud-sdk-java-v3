package com.huaweicloud.sdk.campusgo.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListTasksDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<TaskDetails> tasks = null;

    public ListTasksDetailsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /** 符合检索条件的总条目数 minimum: 0 maximum: 9223372036854775807
     * 
     * @return count */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListTasksDetailsResponse withTasks(List<TaskDetails> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListTasksDetailsResponse addTasksItem(TaskDetails tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListTasksDetailsResponse withTasks(Consumer<List<TaskDetails>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /** 检索到的服务作业条目
     * 
     * @return tasks */
    public List<TaskDetails> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskDetails> tasks) {
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
        ListTasksDetailsResponse listTasksDetailsResponse = (ListTasksDetailsResponse) o;
        return Objects.equals(this.count, listTasksDetailsResponse.count)
            && Objects.equals(this.tasks, listTasksDetailsResponse.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksDetailsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
