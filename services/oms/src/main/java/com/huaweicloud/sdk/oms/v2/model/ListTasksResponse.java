package com.huaweicloud.sdk.oms.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.oms.v2.model.TaskResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListTasksResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tasks")
    
    private List<TaskResp> tasks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Long count;

    public ListTasksResponse withTasks(List<TaskResp> tasks) {
        this.tasks = tasks;
        return this;
    }

    
    public ListTasksResponse addTasksItem(TaskResp tasksItem) {
        this.tasks.add(tasksItem);
        return this;
    }

    public ListTasksResponse withTasks(Consumer<List<TaskResp>> tasksSetter) {
        if(this.tasks == null ){
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 查询的任务详情
     * @return tasks
     */
    public List<TaskResp> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskResp> tasks) {
        this.tasks = tasks;
    }

    

    public ListTasksResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    


    /**
     * 满足查询条件的任务总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTasksResponse listTasksResponse = (ListTasksResponse) o;
        return Objects.equals(this.tasks, listTasksResponse.tasks) &&
            Objects.equals(this.count, listTasksResponse.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tasks, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksResponse {\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

