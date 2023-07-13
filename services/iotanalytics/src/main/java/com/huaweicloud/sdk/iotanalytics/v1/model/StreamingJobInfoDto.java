package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实时分析作业基础信息，包括：实时分析作业ID、实时分析作业名称、作业类型等。
 */
public class StreamingJobInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_input_type")

    private String jobInputType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_description")

    private String jobDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_state")

    private String jobState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtu")

    private Integer rtu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_savepoint")

    private Boolean hasSavepoint;

    public StreamingJobInfoDto withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public StreamingJobInfoDto withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public StreamingJobInfoDto withJobInputType(String jobInputType) {
        this.jobInputType = jobInputType;
        return this;
    }

    /**
     * 接收数据类型
     * @return jobInputType
     */
    public String getJobInputType() {
        return jobInputType;
    }

    public void setJobInputType(String jobInputType) {
        this.jobInputType = jobInputType;
    }

    public StreamingJobInfoDto withJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }

    /**
     * 作业描述
     * @return jobDescription
     */
    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public StreamingJobInfoDto withJobState(String jobState) {
        this.jobState = jobState;
        return this;
    }

    /**
     * 作业状态
     * @return jobState
     */
    public String getJobState() {
        return jobState;
    }

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    public StreamingJobInfoDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 操作状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StreamingJobInfoDto withRtu(Integer rtu) {
        this.rtu = rtu;
        return this;
    }

    /**
     * 运行作业的RTU个数
     * minimum: 0
     * maximum: 1000
     * @return rtu
     */
    public Integer getRtu() {
        return rtu;
    }

    public void setRtu(Integer rtu) {
        this.rtu = rtu;
    }

    public StreamingJobInfoDto withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public StreamingJobInfoDto withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 修改时间
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public StreamingJobInfoDto withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public StreamingJobInfoDto withHasSavepoint(Boolean hasSavepoint) {
        this.hasSavepoint = hasSavepoint;
        return this;
    }

    /**
     * 已停止作业是否有历史缓存数据
     * @return hasSavepoint
     */
    public Boolean getHasSavepoint() {
        return hasSavepoint;
    }

    public void setHasSavepoint(Boolean hasSavepoint) {
        this.hasSavepoint = hasSavepoint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamingJobInfoDto that = (StreamingJobInfoDto) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.jobInputType, that.jobInputType)
            && Objects.equals(this.jobDescription, that.jobDescription) && Objects.equals(this.jobState, that.jobState)
            && Objects.equals(this.status, that.status) && Objects.equals(this.rtu, that.rtu)
            && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.modifiedTime, that.modifiedTime) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.hasSavepoint, that.hasSavepoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            jobName,
            jobInputType,
            jobDescription,
            jobState,
            status,
            rtu,
            createdTime,
            modifiedTime,
            userId,
            hasSavepoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamingJobInfoDto {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobInputType: ").append(toIndentedString(jobInputType)).append("\n");
        sb.append("    jobDescription: ").append(toIndentedString(jobDescription)).append("\n");
        sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    rtu: ").append(toIndentedString(rtu)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    hasSavepoint: ").append(toIndentedString(hasSavepoint)).append("\n");
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
