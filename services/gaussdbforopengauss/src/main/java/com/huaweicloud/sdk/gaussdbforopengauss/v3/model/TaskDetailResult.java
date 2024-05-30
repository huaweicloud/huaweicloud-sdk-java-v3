package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskDetailResult
 */
public class TaskDetailResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_info")

    private InstanceInfoResult instanceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private String process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ended_at")

    private String endedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    public TaskDetailResult withInstanceInfo(InstanceInfoResult instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }

    public TaskDetailResult withInstanceInfo(Consumer<InstanceInfoResult> instanceInfoSetter) {
        if (this.instanceInfo == null) {
            this.instanceInfo = new InstanceInfoResult();
            instanceInfoSetter.accept(this.instanceInfo);
        }

        return this;
    }

    /**
     * Get instanceInfo
     * @return instanceInfo
     */
    public InstanceInfoResult getInstanceInfo() {
        return instanceInfo;
    }

    public void setInstanceInfo(InstanceInfoResult instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

    public TaskDetailResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public TaskDetailResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskDetailResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskDetailResult withProcess(String process) {
        this.process = process;
        return this;
    }

    /**
     * 任务进度，单位：%。
     * @return process
     */
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public TaskDetailResult withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间，格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public TaskDetailResult withEndedAt(String endedAt) {
        this.endedAt = endedAt;
        return this;
    }

    /**
     * 结束时间，格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return endedAt
     */
    public String getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(String endedAt) {
        this.endedAt = endedAt;
    }

    public TaskDetailResult withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 失败原因。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskDetailResult that = (TaskDetailResult) obj;
        return Objects.equals(this.instanceInfo, that.instanceInfo) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.process, that.process) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.endedAt, that.endedAt) && Objects.equals(this.failReason, that.failReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceInfo, jobId, name, status, process, createdAt, endedAt, failReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskDetailResult {\n");
        sb.append("    instanceInfo: ").append(toIndentedString(instanceInfo)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
