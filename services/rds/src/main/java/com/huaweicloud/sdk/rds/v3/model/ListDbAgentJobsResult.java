package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库代理作业响应信息。
 */
public class ListDbAgentJobsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enabled")

    private Boolean isEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_time")

    private String runTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_status")

    private String runStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_failure_time")

    private String lastFailureTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_count")

    private Integer failureCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private String agentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile_id")

    private String profileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile_name")

    private String profileName;

    public ListDbAgentJobsResult withJobId(String jobId) {
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

    public ListDbAgentJobsResult withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ListDbAgentJobsResult withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * 是否可用。  true：可用。 false：不可用。
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public ListDbAgentJobsResult withRunTime(String runTime) {
        this.runTime = runTime;
        return this;
    }

    /**
     * 最新执行时间。格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return runTime
     */
    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public ListDbAgentJobsResult withRunStatus(String runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * 作业执行状态。取值如下:  failed:失败。 succeeded:成功。 retrying:重试中。 canceled:已取消。 in_progress:正在运行。
     * @return runStatus
     */
    public String getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

    public ListDbAgentJobsResult withLastFailureTime(String lastFailureTime) {
        this.lastFailureTime = lastFailureTime;
        return this;
    }

    /**
     * 最近失败时间。格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return lastFailureTime
     */
    public String getLastFailureTime() {
        return lastFailureTime;
    }

    public void setLastFailureTime(String lastFailureTime) {
        this.lastFailureTime = lastFailureTime;
    }

    public ListDbAgentJobsResult withFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
        return this;
    }

    /**
     * 历史失败次数。
     * @return failureCount
     */
    public Integer getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }

    public ListDbAgentJobsResult withAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * 作业代理的类型。  snapshot：快照代理 log_reader：日志读取器代理 distribution：分发代理 merge:合并代理 queue_reader：队列读取器代理。
     * @return agentType
     */
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public ListDbAgentJobsResult withProfileId(String profileId) {
        this.profileId = profileId;
        return this;
    }

    /**
     * 配置文件id。作业类型为replication时特有。
     * @return profileId
     */
    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public ListDbAgentJobsResult withProfileName(String profileName) {
        this.profileName = profileName;
        return this;
    }

    /**
     * 配置文件名。作业类型为replication时特有。
     * @return profileName
     */
    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDbAgentJobsResult that = (ListDbAgentJobsResult) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.isEnabled, that.isEnabled) && Objects.equals(this.runTime, that.runTime)
            && Objects.equals(this.runStatus, that.runStatus)
            && Objects.equals(this.lastFailureTime, that.lastFailureTime)
            && Objects.equals(this.failureCount, that.failureCount) && Objects.equals(this.agentType, that.agentType)
            && Objects.equals(this.profileId, that.profileId) && Objects.equals(this.profileName, that.profileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            jobName,
            isEnabled,
            runTime,
            runStatus,
            lastFailureTime,
            failureCount,
            agentType,
            profileId,
            profileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbAgentJobsResult {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
        sb.append("    runTime: ").append(toIndentedString(runTime)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    lastFailureTime: ").append(toIndentedString(lastFailureTime)).append("\n");
        sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
        sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
        sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
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
