package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTakeOverTaskRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;

    public ListTakeOverTaskRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态<br/> 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ListTakeOverTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 起始时间.指定task_id时该参数无效<br/> 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    

    public ListTakeOverTaskRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * 分页编号,默认为0。<br/> 
     * minimum: 0
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    

    public ListTakeOverTaskRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 每页记录数。默认10，范围[1,100]<br/> 指定task_id时该参数无效<br/> 
     * minimum: 1
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTakeOverTaskRequest listTakeOverTaskRequest = (ListTakeOverTaskRequest) o;
        return Objects.equals(this.status, listTakeOverTaskRequest.status) &&
            Objects.equals(this.taskId, listTakeOverTaskRequest.taskId) &&
            Objects.equals(this.page, listTakeOverTaskRequest.page) &&
            Objects.equals(this.size, listTakeOverTaskRequest.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, taskId, page, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTakeOverTaskRequest {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

