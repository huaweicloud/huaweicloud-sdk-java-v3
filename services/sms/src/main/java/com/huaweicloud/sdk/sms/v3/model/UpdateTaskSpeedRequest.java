package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.UpdateTaskSpeedReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateTaskSpeedRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateTaskSpeedReq body;

    public UpdateTaskSpeedRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 主机迁移任务的id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    

    public UpdateTaskSpeedRequest withBody(UpdateTaskSpeedReq body) {
        this.body = body;
        return this;
    }

    public UpdateTaskSpeedRequest withBody(Consumer<UpdateTaskSpeedReq> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateTaskSpeedReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateTaskSpeedReq getBody() {
        return body;
    }

    public void setBody(UpdateTaskSpeedReq body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTaskSpeedRequest updateTaskSpeedRequest = (UpdateTaskSpeedRequest) o;
        return Objects.equals(this.taskId, updateTaskSpeedRequest.taskId) &&
            Objects.equals(this.body, updateTaskSpeedRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskSpeedRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

