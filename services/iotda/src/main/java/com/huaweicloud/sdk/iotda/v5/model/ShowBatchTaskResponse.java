package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.Page;
import com.huaweicloud.sdk.iotda.v5.model.Task;
import com.huaweicloud.sdk.iotda.v5.model.TaskDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowBatchTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="batchtask")
    
    private Task batchtask = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_details")
    
    private List<TaskDetail> taskDetails = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Page page = null;

    public ShowBatchTaskResponse withBatchtask(Task batchtask) {
        this.batchtask = batchtask;
        return this;
    }

    public ShowBatchTaskResponse withBatchtask(Consumer<Task> batchtaskSetter) {
        if(this.batchtask == null ){
            this.batchtask = new Task();
            batchtaskSetter.accept(this.batchtask);
        }
        
        return this;
    }


    /**
     * Get batchtask
     * @return batchtask
     */
    public Task getBatchtask() {
        return batchtask;
    }

    public void setBatchtask(Task batchtask) {
        this.batchtask = batchtask;
    }

    public ShowBatchTaskResponse withTaskDetails(List<TaskDetail> taskDetails) {
        this.taskDetails = taskDetails;
        return this;
    }

    
    public ShowBatchTaskResponse addTaskDetailsItem(TaskDetail taskDetailsItem) {
        if (this.taskDetails == null) {
            this.taskDetails = new ArrayList<>();
        }
        this.taskDetails.add(taskDetailsItem);
        return this;
    }

    public ShowBatchTaskResponse withTaskDetails(Consumer<List<TaskDetail>> taskDetailsSetter) {
        if(this.taskDetails == null ){
            this.taskDetails = new ArrayList<>();
        }
        taskDetailsSetter.accept(this.taskDetails);
        return this;
    }

    /**
     * 子任务详情列表。
     * @return taskDetails
     */
    public List<TaskDetail> getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(List<TaskDetail> taskDetails) {
        this.taskDetails = taskDetails;
    }

    public ShowBatchTaskResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ShowBatchTaskResponse withPage(Consumer<Page> pageSetter) {
        if(this.page == null ){
            this.page = new Page();
            pageSetter.accept(this.page);
        }
        
        return this;
    }


    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBatchTaskResponse showBatchTaskResponse = (ShowBatchTaskResponse) o;
        return Objects.equals(this.batchtask, showBatchTaskResponse.batchtask) &&
            Objects.equals(this.taskDetails, showBatchTaskResponse.taskDetails) &&
            Objects.equals(this.page, showBatchTaskResponse.page);
    }
    @Override
    public int hashCode() {
        return Objects.hash(batchtask, taskDetails, page);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBatchTaskResponse {\n");
        sb.append("    batchtask: ").append(toIndentedString(batchtask)).append("\n");
        sb.append("    taskDetails: ").append(toIndentedString(taskDetails)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

