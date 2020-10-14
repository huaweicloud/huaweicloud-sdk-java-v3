package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * EachEncryptRsp
 */
public class EachEncryptRsp  {



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
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    private ObsObjInfo input = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    private ObsObjInfo output = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_file_name")
    
    private List<String> outputFileName = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_data")
    
    private String userData;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public EachEncryptRsp withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 任务Id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public EachEncryptRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务执行状态。  取值如下： - NO_TASK：无任务 - WAITING：等待启动 - PROCESSING：加密中 - SUCCEEDED：加密成功 - FAILED：加密失败 - CANCELED：已删除 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EachEncryptRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 加密任务启动时间。 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public EachEncryptRsp withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 加密任务结束时间。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public EachEncryptRsp withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public EachEncryptRsp withInput(Consumer<ObsObjInfo> inputSetter) {
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

    public EachEncryptRsp withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public EachEncryptRsp withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public EachEncryptRsp withOutputFileName(List<String> outputFileName) {
        this.outputFileName = outputFileName;
        return this;
    }

    
    public EachEncryptRsp addOutputFileNameItem(String outputFileNameItem) {
        if (this.outputFileName == null) {
            this.outputFileName = new ArrayList<>();
        }
        this.outputFileName.add(outputFileNameItem);
        return this;
    }

    public EachEncryptRsp withOutputFileName(Consumer<List<String>> outputFileNameSetter) {
        if(this.outputFileName == null ){
            this.outputFileName = new ArrayList<>();
        }
        outputFileNameSetter.accept(this.outputFileName);
        return this;
    }

    /**
     * 加密生成的文件名，数组类型，可能包含多个，包含加密文件名。 
     * @return outputFileName
     */
    public List<String> getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(List<String> outputFileName) {
        this.outputFileName = outputFileName;
    }

    public EachEncryptRsp withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    


    /**
     * 用户数据。 
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public EachEncryptRsp withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 加密任务描述，当加密出现异常时，此字段为异常的原因。 
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
        EachEncryptRsp eachEncryptRsp = (EachEncryptRsp) o;
        return Objects.equals(this.taskId, eachEncryptRsp.taskId) &&
            Objects.equals(this.status, eachEncryptRsp.status) &&
            Objects.equals(this.createTime, eachEncryptRsp.createTime) &&
            Objects.equals(this.endTime, eachEncryptRsp.endTime) &&
            Objects.equals(this.input, eachEncryptRsp.input) &&
            Objects.equals(this.output, eachEncryptRsp.output) &&
            Objects.equals(this.outputFileName, eachEncryptRsp.outputFileName) &&
            Objects.equals(this.userData, eachEncryptRsp.userData) &&
            Objects.equals(this.description, eachEncryptRsp.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, createTime, endTime, input, output, outputFileName, userData, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EachEncryptRsp {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    outputFileName: ").append(toIndentedString(outputFileName)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

