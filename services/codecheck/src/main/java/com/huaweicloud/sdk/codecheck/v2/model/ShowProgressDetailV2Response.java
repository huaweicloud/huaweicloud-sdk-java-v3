package com.huaweicloud.sdk.codecheck.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codecheck.v2.model.ProgressDetailV2;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowProgressDetailV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_status")
    
    private String taskStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="progress")
    
    private ProgressDetailV2 progress = null;

    public ShowProgressDetailV2Response withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    


    /**
     * 任务状态,0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ShowProgressDetailV2Response withProgress(ProgressDetailV2 progress) {
        this.progress = progress;
        return this;
    }

    public ShowProgressDetailV2Response withProgress(Consumer<ProgressDetailV2> progressSetter) {
        if(this.progress == null ){
            this.progress = new ProgressDetailV2();
            progressSetter.accept(this.progress);
        }
        
        return this;
    }


    /**
     * Get progress
     * @return progress
     */
    public ProgressDetailV2 getProgress() {
        return progress;
    }

    public void setProgress(ProgressDetailV2 progress) {
        this.progress = progress;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProgressDetailV2Response showProgressDetailV2Response = (ShowProgressDetailV2Response) o;
        return Objects.equals(this.taskStatus, showProgressDetailV2Response.taskStatus) &&
            Objects.equals(this.progress, showProgressDetailV2Response.progress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskStatus, progress);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProgressDetailV2Response {\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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

