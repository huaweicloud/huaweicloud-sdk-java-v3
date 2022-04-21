package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群日志记录实体对象。
 */
public class ClusterLogRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterId")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createAt")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logPath")

    private String logPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finishedAt")

    private Long finishedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobTypes")

    private String jobTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedMsg")

    private String failedMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobId")

    private String jobId;

    public ClusterLogRecord withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 日志任务ID，通过系统uuid生成。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClusterLogRecord withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ClusterLogRecord withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public ClusterLogRecord withLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    /**
     * 备份路径。
     * @return logPath
     */
    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public ClusterLogRecord withStatus(String status) {
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

    public ClusterLogRecord withFinishedAt(Long finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * 结束时间。
     * @return finishedAt
     */
    public Long getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(Long finishedAt) {
        this.finishedAt = finishedAt;
    }

    public ClusterLogRecord withJobTypes(String jobTypes) {
        this.jobTypes = jobTypes;
        return this;
    }

    /**
     * 任务类型。
     * @return jobTypes
     */
    public String getJobTypes() {
        return jobTypes;
    }

    public void setJobTypes(String jobTypes) {
        this.jobTypes = jobTypes;
    }

    public ClusterLogRecord withFailedMsg(String failedMsg) {
        this.failedMsg = failedMsg;
        return this;
    }

    /**
     * 错误信息。
     * @return failedMsg
     */
    public String getFailedMsg() {
        return failedMsg;
    }

    public void setFailedMsg(String failedMsg) {
        this.failedMsg = failedMsg;
    }

    public ClusterLogRecord withJobId(String jobId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterLogRecord clusterLogRecord = (ClusterLogRecord) o;
        return Objects.equals(this.id, clusterLogRecord.id)
            && Objects.equals(this.clusterId, clusterLogRecord.clusterId)
            && Objects.equals(this.createAt, clusterLogRecord.createAt)
            && Objects.equals(this.logPath, clusterLogRecord.logPath)
            && Objects.equals(this.status, clusterLogRecord.status)
            && Objects.equals(this.finishedAt, clusterLogRecord.finishedAt)
            && Objects.equals(this.jobTypes, clusterLogRecord.jobTypes)
            && Objects.equals(this.failedMsg, clusterLogRecord.failedMsg)
            && Objects.equals(this.jobId, clusterLogRecord.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clusterId, createAt, logPath, status, finishedAt, jobTypes, failedMsg, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterLogRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    jobTypes: ").append(toIndentedString(jobTypes)).append("\n");
        sb.append("    failedMsg: ").append(toIndentedString(failedMsg)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
