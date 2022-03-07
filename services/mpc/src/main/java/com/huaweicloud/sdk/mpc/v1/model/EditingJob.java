package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** EditingJob */
public class EditingJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_type")

    private List<String> editType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_task_req")

    private CreateEditingJobReq editTaskReq;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_file_info")

    private List<OutputFileInfo> outputFileInfo = null;

    public EditingJob withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /** 任务ID
     * 
     * @return taskId */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public EditingJob withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 任务状态。 取值如下： - INIT：初始状态。 - WAITING：等待启动。 - PROCESSING：处理中。 - SUCCEED：处理成功。 - FAILED：处理失败。 - CANCELED：已取消。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EditingJob withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 任务创建时间
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public EditingJob withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 任务启动时间
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public EditingJob withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 任务结束时间
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public EditingJob withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /** 任务的返回码。
     * 
     * @return errorCode */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public EditingJob withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 错误描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EditingJob withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /** 用户数据。
     * 
     * @return userData */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public EditingJob withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 任务ID
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public EditingJob withEditType(List<String> editType) {
        this.editType = editType;
        return this;
    }

    public EditingJob addEditTypeItem(String editTypeItem) {
        if (this.editType == null) {
            this.editType = new ArrayList<>();
        }
        this.editType.add(editTypeItem);
        return this;
    }

    public EditingJob withEditType(Consumer<List<String>> editTypeSetter) {
        if (this.editType == null) {
            this.editType = new ArrayList<>();
        }
        editTypeSetter.accept(this.editType);
        return this;
    }

    /** 剪辑任务类型。取值如下：\"CLIP\",\"CONCAT\",\"CONCATS\",\"MIX\"。
     * 
     * @return editType */
    public List<String> getEditType() {
        return editType;
    }

    public void setEditType(List<String> editType) {
        this.editType = editType;
    }

    public EditingJob withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public EditingJob withOutput(Consumer<ObsObjInfo> outputSetter) {
        if (this.output == null) {
            this.output = new ObsObjInfo();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /** Get output
     * 
     * @return output */
    public ObsObjInfo getOutput() {
        return output;
    }

    public void setOutput(ObsObjInfo output) {
        this.output = output;
    }

    public EditingJob withEditTaskReq(CreateEditingJobReq editTaskReq) {
        this.editTaskReq = editTaskReq;
        return this;
    }

    public EditingJob withEditTaskReq(Consumer<CreateEditingJobReq> editTaskReqSetter) {
        if (this.editTaskReq == null) {
            this.editTaskReq = new CreateEditingJobReq();
            editTaskReqSetter.accept(this.editTaskReq);
        }

        return this;
    }

    /** Get editTaskReq
     * 
     * @return editTaskReq */
    public CreateEditingJobReq getEditTaskReq() {
        return editTaskReq;
    }

    public void setEditTaskReq(CreateEditingJobReq editTaskReq) {
        this.editTaskReq = editTaskReq;
    }

    public EditingJob withOutputFileInfo(List<OutputFileInfo> outputFileInfo) {
        this.outputFileInfo = outputFileInfo;
        return this;
    }

    public EditingJob addOutputFileInfoItem(OutputFileInfo outputFileInfoItem) {
        if (this.outputFileInfo == null) {
            this.outputFileInfo = new ArrayList<>();
        }
        this.outputFileInfo.add(outputFileInfoItem);
        return this;
    }

    public EditingJob withOutputFileInfo(Consumer<List<OutputFileInfo>> outputFileInfoSetter) {
        if (this.outputFileInfo == null) {
            this.outputFileInfo = new ArrayList<>();
        }
        outputFileInfoSetter.accept(this.outputFileInfo);
        return this;
    }

    /** 剪辑输出meta信息
     * 
     * @return outputFileInfo */
    public List<OutputFileInfo> getOutputFileInfo() {
        return outputFileInfo;
    }

    public void setOutputFileInfo(List<OutputFileInfo> outputFileInfo) {
        this.outputFileInfo = outputFileInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EditingJob editingJob = (EditingJob) o;
        return Objects.equals(this.taskId, editingJob.taskId) && Objects.equals(this.status, editingJob.status)
            && Objects.equals(this.createTime, editingJob.createTime)
            && Objects.equals(this.startTime, editingJob.startTime) && Objects.equals(this.endTime, editingJob.endTime)
            && Objects.equals(this.errorCode, editingJob.errorCode)
            && Objects.equals(this.description, editingJob.description)
            && Objects.equals(this.userData, editingJob.userData) && Objects.equals(this.jobId, editingJob.jobId)
            && Objects.equals(this.editType, editingJob.editType) && Objects.equals(this.output, editingJob.output)
            && Objects.equals(this.editTaskReq, editingJob.editTaskReq)
            && Objects.equals(this.outputFileInfo, editingJob.outputFileInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            status,
            createTime,
            startTime,
            endTime,
            errorCode,
            description,
            userData,
            jobId,
            editType,
            output,
            editTaskReq,
            outputFileInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditingJob {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    editType: ").append(toIndentedString(editType)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    editTaskReq: ").append(toIndentedString(editTaskReq)).append("\n");
        sb.append("    outputFileInfo: ").append(toIndentedString(outputFileInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
