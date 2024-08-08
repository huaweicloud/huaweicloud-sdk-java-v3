package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ImageJobInfo
 */
public class ImageJobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private ImageJobType jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private OffsetDateTime beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ImageJobStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs_total")

    private Integer subJobsTotal;

    public ImageJobInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageJobInfo withJobType(ImageJobType jobType) {
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

    public ImageJobInfo withBeginTime(OffsetDateTime beginTime) {
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

    public ImageJobInfo withEndTime(OffsetDateTime endTime) {
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

    public ImageJobInfo withStatus(ImageJobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ImageJobStatus getStatus() {
        return status;
    }

    public void setStatus(ImageJobStatus status) {
        this.status = status;
    }

    public ImageJobInfo withSubJobsTotal(Integer subJobsTotal) {
        this.subJobsTotal = subJobsTotal;
        return this;
    }

    /**
     * 子任务总数。
     * @return subJobsTotal
     */
    public Integer getSubJobsTotal() {
        return subJobsTotal;
    }

    public void setSubJobsTotal(Integer subJobsTotal) {
        this.subJobsTotal = subJobsTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageJobInfo that = (ImageJobInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.subJobsTotal, that.subJobsTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobType, beginTime, endTime, status, subJobsTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageJobInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subJobsTotal: ").append(toIndentedString(subJobsTotal)).append("\n");
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
