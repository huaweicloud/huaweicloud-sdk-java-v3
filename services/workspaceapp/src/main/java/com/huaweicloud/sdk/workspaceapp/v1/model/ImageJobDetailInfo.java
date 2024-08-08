package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageJobDetailInfo
 */
public class ImageJobDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private ImageJobType jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_resource_info")

    private ImageJobResourceInfo jobResourceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private OffsetDateTime beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ImageJobDetailStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_execute_info")

    private ImageJobExecuteInfo jobExecuteInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public ImageJobDetailInfo withId(String id) {
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

    public ImageJobDetailInfo withJobType(ImageJobType jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get jobType
     * @return jobType
     */
    public ImageJobType getJobType() {
        return jobType;
    }

    public void setJobType(ImageJobType jobType) {
        this.jobType = jobType;
    }

    public ImageJobDetailInfo withJobResourceInfo(ImageJobResourceInfo jobResourceInfo) {
        this.jobResourceInfo = jobResourceInfo;
        return this;
    }

    public ImageJobDetailInfo withJobResourceInfo(Consumer<ImageJobResourceInfo> jobResourceInfoSetter) {
        if (this.jobResourceInfo == null) {
            this.jobResourceInfo = new ImageJobResourceInfo();
            jobResourceInfoSetter.accept(this.jobResourceInfo);
        }

        return this;
    }

    /**
     * Get jobResourceInfo
     * @return jobResourceInfo
     */
    public ImageJobResourceInfo getJobResourceInfo() {
        return jobResourceInfo;
    }

    public void setJobResourceInfo(ImageJobResourceInfo jobResourceInfo) {
        this.jobResourceInfo = jobResourceInfo;
    }

    public ImageJobDetailInfo withBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 任务创建时间。
     * @return beginTime
     */
    public OffsetDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public ImageJobDetailInfo withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ImageJobDetailInfo withStatus(ImageJobDetailStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ImageJobDetailStatus getStatus() {
        return status;
    }

    public void setStatus(ImageJobDetailStatus status) {
        this.status = status;
    }

    public ImageJobDetailInfo withJobExecuteInfo(ImageJobExecuteInfo jobExecuteInfo) {
        this.jobExecuteInfo = jobExecuteInfo;
        return this;
    }

    public ImageJobDetailInfo withJobExecuteInfo(Consumer<ImageJobExecuteInfo> jobExecuteInfoSetter) {
        if (this.jobExecuteInfo == null) {
            this.jobExecuteInfo = new ImageJobExecuteInfo();
            jobExecuteInfoSetter.accept(this.jobExecuteInfo);
        }

        return this;
    }

    /**
     * Get jobExecuteInfo
     * @return jobExecuteInfo
     */
    public ImageJobExecuteInfo getJobExecuteInfo() {
        return jobExecuteInfo;
    }

    public void setJobExecuteInfo(ImageJobExecuteInfo jobExecuteInfo) {
        this.jobExecuteInfo = jobExecuteInfo;
    }

    public ImageJobDetailInfo withProjectId(String projectId) {
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

    public ImageJobDetailInfo withJobId(String jobId) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageJobDetailInfo that = (ImageJobDetailInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.jobResourceInfo, that.jobResourceInfo)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.jobExecuteInfo, that.jobExecuteInfo)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobType, jobResourceInfo, beginTime, endTime, status, jobExecuteInfo, projectId, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageJobDetailInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobResourceInfo: ").append(toIndentedString(jobResourceInfo)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    jobExecuteInfo: ").append(toIndentedString(jobExecuteInfo)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
