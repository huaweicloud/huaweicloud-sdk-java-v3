package com.huaweicloud.sdk.cdn.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.TasksObject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowHistoryTasksResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tasks")
    
    private List<TasksObject> tasks = null;
    
    public ShowHistoryTasksResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ShowHistoryTasksResponse withTasks(List<TasksObject> tasks) {
        this.tasks = tasks;
        return this;
    }

    
    public ShowHistoryTasksResponse addTasksItem(TasksObject tasksItem) {
        if(this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ShowHistoryTasksResponse withTasks(Consumer<List<TasksObject>> tasksSetter) {
        if(this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 日志列表数据
     * @return tasks
     */
    public List<TasksObject> getTasks() {
        return tasks;
    }

    public void setTasks(List<TasksObject> tasks) {
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
        ShowHistoryTasksResponse showHistoryTasksResponse = (ShowHistoryTasksResponse) o;
        return Objects.equals(this.total, showHistoryTasksResponse.total) &&
            Objects.equals(this.tasks, showHistoryTasksResponse.tasks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, tasks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHistoryTasksResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

