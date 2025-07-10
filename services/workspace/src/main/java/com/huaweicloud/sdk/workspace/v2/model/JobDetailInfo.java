package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * JobDetailInfo
 */
public class JobDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private JobEntities entities;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private Integer process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_user")

    private String attachUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity")

    private String entity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    public JobDetailInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 子任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JobDetailInfo withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 任务类型。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public JobDetailInfo withEntities(JobEntities entities) {
        this.entities = entities;
        return this;
    }

    public JobDetailInfo withEntities(Consumer<JobEntities> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new JobEntities();
            entitiesSetter.accept(this.entities);
        }

        return this;
    }

    /**
     * Get entities
     * @return entities
     */
    public JobEntities getEntities() {
        return entities;
    }

    public void setEntities(JobEntities entities) {
        this.entities = entities;
    }

    public JobDetailInfo withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 任务创建时间。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public JobDetailInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public JobDetailInfo withStatus(String status) {
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

    public JobDetailInfo withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 任务执行失败时的错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public JobDetailInfo withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 任务失败原因。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public JobDetailInfo withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 任务执行的服务器IP。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public JobDetailInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public JobDetailInfo withJobId(String jobId) {
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

    public JobDetailInfo withProcess(Integer process) {
        this.process = process;
        return this;
    }

    /**
     * 任务进度。
     * @return process
     */
    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public JobDetailInfo withAttachUser(String attachUser) {
        this.attachUser = attachUser;
        return this;
    }

    /**
     * 关联用户。
     * @return attachUser
     */
    public String getAttachUser() {
        return attachUser;
    }

    public void setAttachUser(String attachUser) {
        this.attachUser = attachUser;
    }

    public JobDetailInfo withEntity(String entity) {
        this.entity = entity;
        return this;
    }

    /**
     * 操作对象。
     * @return entity
     */
    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public JobDetailInfo withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * ip地址。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobDetailInfo that = (JobDetailInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.entities, that.entities) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.failReason, that.failReason)
            && Objects.equals(this.host, that.host) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.process, that.process)
            && Objects.equals(this.attachUser, that.attachUser) && Objects.equals(this.entity, that.entity)
            && Objects.equals(this.ipAddress, that.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            jobType,
            entities,
            beginTime,
            endTime,
            status,
            errorCode,
            failReason,
            host,
            projectId,
            jobId,
            process,
            attachUser,
            entity,
            ipAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDetailInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    attachUser: ").append(toIndentedString(attachUser)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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
