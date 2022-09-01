package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTakeOverTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    @JacksonXmlProperty(localName = "tasks")

    private List<TakeOverTask> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    public ListTakeOverTaskResponse withTasks(List<TakeOverTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListTakeOverTaskResponse addTasksItem(TakeOverTask tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListTakeOverTaskResponse withTasks(Consumer<List<TakeOverTask>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 托管任务信息。
     * @return tasks
     */
    public List<TakeOverTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<TakeOverTask> tasks) {
        this.tasks = tasks;
    }

    public ListTakeOverTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 任务数量。
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
        ListTakeOverTaskResponse listTakeOverTaskResponse = (ListTakeOverTaskResponse) o;
        return Objects.equals(this.tasks, listTakeOverTaskResponse.tasks)
            && Objects.equals(this.total, listTakeOverTaskResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTakeOverTaskResponse {\n");
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
