package com.huaweicloud.sdk.cloudpipeline.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceStatusResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_status")
    
    private String taskStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline_id")
    
    private String pipelineId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline_name")
    
    private String pipelineName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline_url")
    
    private String pipelineUrl;

    public ShowInstanceStatusResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 实例ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowInstanceStatusResponse withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    


    /**
     * 实例创建状态
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ShowInstanceStatusResponse withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    


    /**
     * 流水线ID
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public ShowInstanceStatusResponse withPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    


    /**
     * 流水线名字
     * @return pipelineName
     */
    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public ShowInstanceStatusResponse withPipelineUrl(String pipelineUrl) {
        this.pipelineUrl = pipelineUrl;
        return this;
    }

    


    /**
     * 流水线详情页面url
     * @return pipelineUrl
     */
    public String getPipelineUrl() {
        return pipelineUrl;
    }

    public void setPipelineUrl(String pipelineUrl) {
        this.pipelineUrl = pipelineUrl;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceStatusResponse showInstanceStatusResponse = (ShowInstanceStatusResponse) o;
        return Objects.equals(this.taskId, showInstanceStatusResponse.taskId) &&
            Objects.equals(this.taskStatus, showInstanceStatusResponse.taskStatus) &&
            Objects.equals(this.pipelineId, showInstanceStatusResponse.pipelineId) &&
            Objects.equals(this.pipelineName, showInstanceStatusResponse.pipelineName) &&
            Objects.equals(this.pipelineUrl, showInstanceStatusResponse.pipelineUrl);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskStatus, pipelineId, pipelineName, pipelineUrl);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceStatusResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
        sb.append("    pipelineUrl: ").append(toIndentedString(pipelineUrl)).append("\n");
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

