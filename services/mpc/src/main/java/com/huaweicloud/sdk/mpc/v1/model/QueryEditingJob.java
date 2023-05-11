package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryEditingJob
 */
public class QueryEditingJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_description")

    private String execDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

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
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editing_output")

    private EditingOutputFileInfo editingOutput;

    public QueryEditingJob withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID 
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public QueryEditingJob withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务执行状态，取值如下。WAITING：等待启动 PROCESSING：处理中 SUCCEEDED：处理成功。FAILED：处理失败。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QueryEditingJob withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 任务的返回码。 
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public QueryEditingJob withExecDescription(String execDescription) {
        this.execDescription = execDescription;
        return this;
    }

    /**
     * 处理信息。 
     * @return execDescription
     */
    public String getExecDescription() {
        return execDescription;
    }

    public void setExecDescription(String execDescription) {
        this.execDescription = execDescription;
    }

    public QueryEditingJob withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 处理信息。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QueryEditingJob withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 任务执行进度百分比, 取值范围：[0, 100]。 
     * minimum: 0
     * maximum: 100
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public QueryEditingJob withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 剪切拼接任务创建时间 格式 yyyyMMddHHmmss 必须是与时区无关的UTC时间 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public QueryEditingJob withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 剪切拼接任务开始时间 格式 yyyyMMddHHmmss 必须是与时区无关的UTC时间 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public QueryEditingJob withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 剪切拼接任务结束时间 格式 yyyyMMddHHmmss 必须是与时区无关的UTC时间 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public QueryEditingJob withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 用户自定义数据
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public QueryEditingJob withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public QueryEditingJob withOutput(Consumer<ObsObjInfo> outputSetter) {
        if (this.output == null) {
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

    public QueryEditingJob withEditingOutput(EditingOutputFileInfo editingOutput) {
        this.editingOutput = editingOutput;
        return this;
    }

    public QueryEditingJob withEditingOutput(Consumer<EditingOutputFileInfo> editingOutputSetter) {
        if (this.editingOutput == null) {
            this.editingOutput = new EditingOutputFileInfo();
            editingOutputSetter.accept(this.editingOutput);
        }

        return this;
    }

    /**
     * Get editingOutput
     * @return editingOutput
     */
    public EditingOutputFileInfo getEditingOutput() {
        return editingOutput;
    }

    public void setEditingOutput(EditingOutputFileInfo editingOutput) {
        this.editingOutput = editingOutput;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryEditingJob queryEditingJob = (QueryEditingJob) o;
        return Objects.equals(this.jobId, queryEditingJob.jobId) && Objects.equals(this.status, queryEditingJob.status)
            && Objects.equals(this.errorCode, queryEditingJob.errorCode)
            && Objects.equals(this.execDescription, queryEditingJob.execDescription)
            && Objects.equals(this.description, queryEditingJob.description)
            && Objects.equals(this.progress, queryEditingJob.progress)
            && Objects.equals(this.createTime, queryEditingJob.createTime)
            && Objects.equals(this.startTime, queryEditingJob.startTime)
            && Objects.equals(this.endTime, queryEditingJob.endTime)
            && Objects.equals(this.userData, queryEditingJob.userData)
            && Objects.equals(this.output, queryEditingJob.output)
            && Objects.equals(this.editingOutput, queryEditingJob.editingOutput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            status,
            errorCode,
            execDescription,
            description,
            progress,
            createTime,
            startTime,
            endTime,
            userData,
            output,
            editingOutput);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryEditingJob {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    execDescription: ").append(toIndentedString(execDescription)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    editingOutput: ").append(toIndentedString(editingOutput)).append("\n");
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
