package com.huaweicloud.sdk.codecheck.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codecheck.v2.model.SimpleTaskInfoV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTaskListByProjectIdV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tasks")
    
    private List<SimpleTaskInfoV2> tasks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ShowTaskListByProjectIdV2Response withTasks(List<SimpleTaskInfoV2> tasks) {
        this.tasks = tasks;
        return this;
    }

    
    public ShowTaskListByProjectIdV2Response addTasksItem(SimpleTaskInfoV2 tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ShowTaskListByProjectIdV2Response withTasks(Consumer<List<SimpleTaskInfoV2>> tasksSetter) {
        if(this.tasks == null ){
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 任务信息
     * @return tasks
     */
    public List<SimpleTaskInfoV2> getTasks() {
        return tasks;
    }

    public void setTasks(List<SimpleTaskInfoV2> tasks) {
        this.tasks = tasks;
    }

    public ShowTaskListByProjectIdV2Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
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
        ShowTaskListByProjectIdV2Response showTaskListByProjectIdV2Response = (ShowTaskListByProjectIdV2Response) o;
        return Objects.equals(this.tasks, showTaskListByProjectIdV2Response.tasks) &&
            Objects.equals(this.total, showTaskListByProjectIdV2Response.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tasks, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskListByProjectIdV2Response {\n");
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

