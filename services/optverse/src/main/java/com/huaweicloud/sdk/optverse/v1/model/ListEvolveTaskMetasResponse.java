package com.huaweicloud.sdk.optverse.v1.model;

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
public class ListEvolveTaskMetasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<EvolveTaskRsp> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_records")

    private Integer totalRecords;

    public ListEvolveTaskMetasResponse withTasks(List<EvolveTaskRsp> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListEvolveTaskMetasResponse addTasksItem(EvolveTaskRsp tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListEvolveTaskMetasResponse withTasks(Consumer<List<EvolveTaskRsp>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 演化任务结构体列表
     * @return tasks
     */
    public List<EvolveTaskRsp> getTasks() {
        return tasks;
    }

    public void setTasks(List<EvolveTaskRsp> tasks) {
        this.tasks = tasks;
    }

    public ListEvolveTaskMetasResponse withTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * 查询列表总数
     * minimum: 0
     * maximum: 100000000
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEvolveTaskMetasResponse that = (ListEvolveTaskMetasResponse) obj;
        return Objects.equals(this.tasks, that.tasks) && Objects.equals(this.totalRecords, that.totalRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks, totalRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEvolveTaskMetasResponse {\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
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
