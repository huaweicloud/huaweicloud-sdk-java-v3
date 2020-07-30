package com.huaweicloud.sdk.mpc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateThumbnailsTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    private ObsObjInfo output = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_file_name")
    
    private String outputFileName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="thumbnail_time")
    
    private String thumbnailTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public CreateThumbnailsTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CreateThumbnailsTaskResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateThumbnailsTaskResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 任务创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreateThumbnailsTaskResponse withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public CreateThumbnailsTaskResponse withOutput(Consumer<ObsObjInfo> outputSetter) {
        if(this.output == null ){
            this.output = new ObsObjInfo();
            outputSetter.accept(this.output);
        }
        
        return this;
    }


    /**
     * Get output
     * @return output
     */
    public ObsObjInfo getOutput() {
        return output;
    }

    public void setOutput(ObsObjInfo output) {
        this.output = output;
    }

    public CreateThumbnailsTaskResponse withOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
        return this;
    }

    


    /**
     * 截图文件名称
     * @return outputFileName
     */
    public String getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    public CreateThumbnailsTaskResponse withThumbnailTime(String thumbnailTime) {
        this.thumbnailTime = thumbnailTime;
        return this;
    }

    


    /**
     * 指定的截图时间点
     * @return thumbnailTime
     */
    public String getThumbnailTime() {
        return thumbnailTime;
    }

    public void setThumbnailTime(String thumbnailTime) {
        this.thumbnailTime = thumbnailTime;
    }

    public CreateThumbnailsTaskResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 截图任务描述，当截图出现异常时，此字段为异常的原因
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateThumbnailsTaskResponse createThumbnailsTaskResponse = (CreateThumbnailsTaskResponse) o;
        return Objects.equals(this.taskId, createThumbnailsTaskResponse.taskId) &&
            Objects.equals(this.status, createThumbnailsTaskResponse.status) &&
            Objects.equals(this.createTime, createThumbnailsTaskResponse.createTime) &&
            Objects.equals(this.output, createThumbnailsTaskResponse.output) &&
            Objects.equals(this.outputFileName, createThumbnailsTaskResponse.outputFileName) &&
            Objects.equals(this.thumbnailTime, createThumbnailsTaskResponse.thumbnailTime) &&
            Objects.equals(this.description, createThumbnailsTaskResponse.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, createTime, output, outputFileName, thumbnailTime, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateThumbnailsTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    outputFileName: ").append(toIndentedString(outputFileName)).append("\n");
        sb.append("    thumbnailTime: ").append(toIndentedString(thumbnailTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

