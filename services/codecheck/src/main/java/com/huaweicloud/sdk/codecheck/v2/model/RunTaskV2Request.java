package com.huaweicloud.sdk.codecheck.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codecheck.v2.model.RunRequestV2;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RunTaskV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private RunRequestV2 body;

    public RunTaskV2Request withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    

    public RunTaskV2Request withBody(RunRequestV2 body) {
        this.body = body;
        return this;
    }

    public RunTaskV2Request withBody(Consumer<RunRequestV2> bodySetter) {
        if(this.body == null ){
            this.body = new RunRequestV2();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RunRequestV2 getBody() {
        return body;
    }

    public void setBody(RunRequestV2 body) {
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
        RunTaskV2Request runTaskV2Request = (RunTaskV2Request) o;
        return Objects.equals(this.taskId, runTaskV2Request.taskId) &&
            Objects.equals(this.body, runTaskV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunTaskV2Request {\n");
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

