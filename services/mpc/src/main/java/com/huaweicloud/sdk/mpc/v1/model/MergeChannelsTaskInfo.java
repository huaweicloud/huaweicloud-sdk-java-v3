package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.AudioFile;
import com.huaweicloud.sdk.mpc.v1.model.BasicTaskInfo;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MergeChannelsTaskInfo
 */
public class MergeChannelsTaskInfo  {



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
    @JsonProperty(value="output")
    
    private ObsObjInfo output;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio_files")
    
    private List<AudioFile> audioFiles = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_filename")
    
    private String outputFilename;

    public MergeChannelsTaskInfo withTaskId(String taskId) {
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

    

    public MergeChannelsTaskInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务执行状态，取值如下。 \"NO_TASK\"      //无任务，task_id非法 \"WAITING\"      //等待启动 \"PROCESSING\"   //处理中 \"SUCCEEDED\"    //成功 \"FAILED\"       //失败 \"CANCELED\"     //已删除 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public MergeChannelsTaskInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 任务启动时间 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public MergeChannelsTaskInfo withEndTime(String endTime) {
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

    

    public MergeChannelsTaskInfo withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public MergeChannelsTaskInfo withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    

    public MergeChannelsTaskInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 任务描述，当出现异常时，此字段为异常的原因。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public MergeChannelsTaskInfo withAudioFiles(List<AudioFile> audioFiles) {
        this.audioFiles = audioFiles;
        return this;
    }

    
    public MergeChannelsTaskInfo addAudioFilesItem(AudioFile audioFilesItem) {
        this.audioFiles.add(audioFilesItem);
        return this;
    }

    public MergeChannelsTaskInfo withAudioFiles(Consumer<List<AudioFile>> audioFilesSetter) {
        if(this.audioFiles == null ){
            this.audioFiles = new ArrayList<>();
        }
        audioFilesSetter.accept(this.audioFiles);
        return this;
    }

    /**
     * 音频文件列表
     * @return audioFiles
     */
    public List<AudioFile> getAudioFiles() {
        return audioFiles;
    }

    public void setAudioFiles(List<AudioFile> audioFiles) {
        this.audioFiles = audioFiles;
    }

    

    public MergeChannelsTaskInfo withOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
        return this;
    }

    


    /**
     * 输出文件名。
     * @return outputFilename
     */
    public String getOutputFilename() {
        return outputFilename;
    }

    public void setOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MergeChannelsTaskInfo mergeChannelsTaskInfo = (MergeChannelsTaskInfo) o;
        return Objects.equals(this.taskId, mergeChannelsTaskInfo.taskId) &&
            Objects.equals(this.status, mergeChannelsTaskInfo.status) &&
            Objects.equals(this.createTime, mergeChannelsTaskInfo.createTime) &&
            Objects.equals(this.endTime, mergeChannelsTaskInfo.endTime) &&
            Objects.equals(this.output, mergeChannelsTaskInfo.output) &&
            Objects.equals(this.description, mergeChannelsTaskInfo.description) &&
            Objects.equals(this.audioFiles, mergeChannelsTaskInfo.audioFiles) &&
            Objects.equals(this.outputFilename, mergeChannelsTaskInfo.outputFilename);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, createTime, endTime, output, description, audioFiles, outputFilename);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeChannelsTaskInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    audioFiles: ").append(toIndentedString(audioFiles)).append("\n");
        sb.append("    outputFilename: ").append(toIndentedString(outputFilename)).append("\n");
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

