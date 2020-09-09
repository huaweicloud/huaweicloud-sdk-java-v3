package com.huaweicloud.sdk.rabbitmq.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rabbitmq.v2.model.ListBackgroundTasksRespTasks;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowBackgroundTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_count")
    
    private String taskCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tasks")
    
    private List<ListBackgroundTasksRespTasks> tasks = null;
    
    public ShowBackgroundTaskResponse withTaskCount(String taskCount) {
        this.taskCount = taskCount;
        return this;
    }

    


    /**
     * 任务数量。
     * @return taskCount
     */
    public String getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(String taskCount) {
        this.taskCount = taskCount;
    }

    public ShowBackgroundTaskResponse withTasks(List<ListBackgroundTasksRespTasks> tasks) {
        this.tasks = tasks;
        return this;
    }

    
    public ShowBackgroundTaskResponse addTasksItem(ListBackgroundTasksRespTasks tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ShowBackgroundTaskResponse withTasks(Consumer<List<ListBackgroundTasksRespTasks>> tasksSetter) {
        if(this.tasks == null ){
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 任务列表。
     * @return tasks
     */
    public List<ListBackgroundTasksRespTasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<ListBackgroundTasksRespTasks> tasks) {
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
        ShowBackgroundTaskResponse showBackgroundTaskResponse = (ShowBackgroundTaskResponse) o;
        return Objects.equals(this.taskCount, showBackgroundTaskResponse.taskCount) &&
            Objects.equals(this.tasks, showBackgroundTaskResponse.tasks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskCount, tasks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackgroundTaskResponse {\n");
        sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
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

