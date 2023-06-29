package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Jobs
 */
public class Jobs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_info")

    private String configInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_schedule_time")

    private Integer nextScheduleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private String schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private JobConfig jobConfig;

    public Jobs withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 类别。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Jobs withConfigInfo(String configInfo) {
        this.configInfo = configInfo;
        return this;
    }

    /**
     * 配置信息。
     * @return configInfo
     */
    public String getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(String configInfo) {
        this.configInfo = configInfo;
    }

    public Jobs withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Jobs withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Jobs withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Jobs withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Jobs withNextScheduleTime(Integer nextScheduleTime) {
        this.nextScheduleTime = nextScheduleTime;
        return this;
    }

    /**
     * 下次调度时间。
     * @return nextScheduleTime
     */
    public Integer getNextScheduleTime() {
        return nextScheduleTime;
    }

    public void setNextScheduleTime(Integer nextScheduleTime) {
        this.nextScheduleTime = nextScheduleTime;
    }

    public Jobs withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 平台。
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Jobs withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Jobs withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * 调度参数。
     * @return schedule
     */
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Jobs withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Jobs withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public Jobs withJobConfig(JobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public Jobs withJobConfig(Consumer<JobConfig> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new JobConfig();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * Get jobConfig
     * @return jobConfig
     */
    public JobConfig getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(JobConfig jobConfig) {
        this.jobConfig = jobConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Jobs that = (Jobs) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.configInfo, that.configInfo)
            && Objects.equals(this.description, that.description) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.nextScheduleTime, that.nextScheduleTime)
            && Objects.equals(this.platform, that.platform) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.status, that.status)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.jobConfig, that.jobConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            configInfo,
            description,
            jobId,
            jobName,
            jobType,
            nextScheduleTime,
            platform,
            resourceId,
            schedule,
            status,
            workspaceId,
            jobConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Jobs {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    configInfo: ").append(toIndentedString(configInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    nextScheduleTime: ").append(toIndentedString(nextScheduleTime)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
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
