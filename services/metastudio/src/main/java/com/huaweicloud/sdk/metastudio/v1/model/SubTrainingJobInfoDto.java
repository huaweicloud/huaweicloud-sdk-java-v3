package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 子任务信息
 */
public class SubTrainingJobInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_job_type")

    private String subJobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "heart_beat_id")

    private String heartBeatId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    public SubTrainingJobInfoDto withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SubTrainingJobInfoDto withSubJobType(String subJobType) {
        this.subJobType = subJobType;
        return this;
    }

    /**
     * 子任务类型
     * @return subJobType
     */
    public String getSubJobType() {
        return subJobType;
    }

    public void setSubJobType(String subJobType) {
        this.subJobType = subJobType;
    }

    public SubTrainingJobInfoDto withHeartBeatId(String heartBeatId) {
        this.heartBeatId = heartBeatId;
        return this;
    }

    /**
     * 子任务心跳id
     * @return heartBeatId
     */
    public String getHeartBeatId() {
        return heartBeatId;
    }

    public void setHeartBeatId(String heartBeatId) {
        this.heartBeatId = heartBeatId;
    }

    public SubTrainingJobInfoDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 任务状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public SubTrainingJobInfoDto withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public SubTrainingJobInfoDto withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最后更新时间
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubTrainingJobInfoDto that = (SubTrainingJobInfoDto) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.subJobType, that.subJobType)
            && Objects.equals(this.heartBeatId, that.heartBeatId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, subJobType, heartBeatId, state, createTime, lastUpdateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTrainingJobInfoDto {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    subJobType: ").append(toIndentedString(subJobType)).append("\n");
        sb.append("    heartBeatId: ").append(toIndentedString(heartBeatId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
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
