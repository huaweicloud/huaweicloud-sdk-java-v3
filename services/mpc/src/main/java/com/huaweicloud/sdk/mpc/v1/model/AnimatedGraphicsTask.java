package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.AnimatedGraphicsOutputParam;
import com.huaweicloud.sdk.mpc.v1.model.CommonTask;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AnimatedGraphicsTask
 */
public class AnimatedGraphicsTask  {



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
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    private ObsObjInfo input = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    private ObsObjInfo output = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_param")
    
    private AnimatedGraphicsOutputParam outputParam = null;

    public AnimatedGraphicsTask withTaskId(String taskId) {
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

    public AnimatedGraphicsTask withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务状态。  取值如下： - INIT：初始状态。 - WAITING：等待启动。 - PROCESSING：处理中。 - SUCCEED：处理成功。 - FAILED：处理失败。 - CANCELED：已取消。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AnimatedGraphicsTask withCreateTime(String createTime) {
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

    public AnimatedGraphicsTask withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 任务启动时间 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public AnimatedGraphicsTask withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 任务结束时间 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public AnimatedGraphicsTask withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 错误描述 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AnimatedGraphicsTask withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public AnimatedGraphicsTask withInput(Consumer<ObsObjInfo> inputSetter) {
        if(this.input == null ){
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }
        
        return this;
    }


    /**
     * Get input
     * @return input
     */
    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    public AnimatedGraphicsTask withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public AnimatedGraphicsTask withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public AnimatedGraphicsTask withOutputParam(AnimatedGraphicsOutputParam outputParam) {
        this.outputParam = outputParam;
        return this;
    }

    public AnimatedGraphicsTask withOutputParam(Consumer<AnimatedGraphicsOutputParam> outputParamSetter) {
        if(this.outputParam == null ){
            this.outputParam = new AnimatedGraphicsOutputParam();
            outputParamSetter.accept(this.outputParam);
        }
        
        return this;
    }


    /**
     * Get outputParam
     * @return outputParam
     */
    public AnimatedGraphicsOutputParam getOutputParam() {
        return outputParam;
    }

    public void setOutputParam(AnimatedGraphicsOutputParam outputParam) {
        this.outputParam = outputParam;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnimatedGraphicsTask animatedGraphicsTask = (AnimatedGraphicsTask) o;
        return Objects.equals(this.taskId, animatedGraphicsTask.taskId) &&
            Objects.equals(this.status, animatedGraphicsTask.status) &&
            Objects.equals(this.createTime, animatedGraphicsTask.createTime) &&
            Objects.equals(this.startTime, animatedGraphicsTask.startTime) &&
            Objects.equals(this.endTime, animatedGraphicsTask.endTime) &&
            Objects.equals(this.description, animatedGraphicsTask.description) &&
            Objects.equals(this.input, animatedGraphicsTask.input) &&
            Objects.equals(this.output, animatedGraphicsTask.output) &&
            Objects.equals(this.outputParam, animatedGraphicsTask.outputParam);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, createTime, startTime, endTime, description, input, output, outputParam);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnimatedGraphicsTask {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    outputParam: ").append(toIndentedString(outputParam)).append("\n");
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

