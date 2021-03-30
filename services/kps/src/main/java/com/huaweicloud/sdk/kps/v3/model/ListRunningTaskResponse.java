package com.huaweicloud.sdk.kps.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kps.v3.model.RunningTasks;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRunningTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tasks")
    
    private List<RunningTasks> tasks = null;
    
    public ListRunningTaskResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 正在处理的任务总数。
     * minimum: 0
     * maximum: 1000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListRunningTaskResponse withTasks(List<RunningTasks> tasks) {
        this.tasks = tasks;
        return this;
    }

    
    public ListRunningTaskResponse addTasksItem(RunningTasks tasksItem) {
        this.tasks.add(tasksItem);
        return this;
    }

    public ListRunningTaskResponse withTasks(Consumer<List<RunningTasks>> tasksSetter) {
        if(this.tasks == null ){
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 正在处理的任务列表。
     * @return tasks
     */
    public List<RunningTasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<RunningTasks> tasks) {
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
        ListRunningTaskResponse listRunningTaskResponse = (ListRunningTaskResponse) o;
        return Objects.equals(this.total, listRunningTaskResponse.total) &&
            Objects.equals(this.tasks, listRunningTaskResponse.tasks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, tasks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRunningTaskResponse {\n");
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

