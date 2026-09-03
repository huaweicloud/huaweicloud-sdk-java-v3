package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowFactoryDependInstancesRespDependInstancesInfo
 */
public class ShowFactoryDependInstancesRespDependInstancesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private Long jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_path")

    private String directoryPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_success")

    private Boolean forceSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_success")

    private Boolean ignoreSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_instance_ids")

    private List<Long> parentInstanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_time")

    private Long planTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_time")

    private Long runningTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit_time")

    private Long submitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_name")

    private String workspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_execute_time_ms")

    private Long avgExecuteTimeMs;

    public ShowFactoryDependInstancesRespDependInstancesInfo withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id。
     * @return jobId
     */
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withJobName(String jobName) {
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

    public ShowFactoryDependInstancesRespDependInstancesInfo withDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
        return this;
    }

    /**
     * 作业路径。
     * @return directoryPath
     */
    public String getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withForceSuccess(Boolean forceSuccess) {
        this.forceSuccess = forceSuccess;
        return this;
    }

    /**
     * 实例是否是执行了强制成功。
     * @return forceSuccess
     */
    public Boolean getForceSuccess() {
        return forceSuccess;
    }

    public void setForceSuccess(Boolean forceSuccess) {
        this.forceSuccess = forceSuccess;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withIgnoreSuccess(Boolean ignoreSuccess) {
        this.ignoreSuccess = ignoreSuccess;
        return this;
    }

    /**
     * 实例是否是执行了忽略失败。
     * @return ignoreSuccess
     */
    public Boolean getIgnoreSuccess() {
        return ignoreSuccess;
    }

    public void setIgnoreSuccess(Boolean ignoreSuccess) {
        this.ignoreSuccess = ignoreSuccess;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withParentInstanceIds(List<Long> parentInstanceIds) {
        this.parentInstanceIds = parentInstanceIds;
        return this;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo addParentInstanceIdsItem(Long parentInstanceIdsItem) {
        if (this.parentInstanceIds == null) {
            this.parentInstanceIds = new ArrayList<>();
        }
        this.parentInstanceIds.add(parentInstanceIdsItem);
        return this;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withParentInstanceIds(
        Consumer<List<Long>> parentInstanceIdsSetter) {
        if (this.parentInstanceIds == null) {
            this.parentInstanceIds = new ArrayList<>();
        }
        parentInstanceIdsSetter.accept(this.parentInstanceIds);
        return this;
    }

    /**
     * 依赖的上游实例ID。
     * @return parentInstanceIds
     */
    public List<Long> getParentInstanceIds() {
        return parentInstanceIds;
    }

    public void setParentInstanceIds(List<Long> parentInstanceIds) {
        this.parentInstanceIds = parentInstanceIds;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withPlanTime(Long planTime) {
        this.planTime = planTime;
        return this;
    }

    /**
     * 计划开始时间。
     * @return planTime
     */
    public Long getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Long planTime) {
        this.planTime = planTime;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withRunningTime(Long runningTime) {
        this.runningTime = runningTime;
        return this;
    }

    /**
     * 运行时长，单位：毫秒。 - 当实例是运行中时，运行时长为当前时间减去开始时间； - 当实例运行结束时，运行时长为结束时间减去开始时间；
     * @return runningTime
     */
    public Long getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Long runningTime) {
        this.runningTime = runningTime;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * 提交时间。
     * @return submitTime
     */
    public Long getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号。
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 所在的工作空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * 所在的工作空间名称。
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public ShowFactoryDependInstancesRespDependInstancesInfo withAvgExecuteTimeMs(Long avgExecuteTimeMs) {
        this.avgExecuteTimeMs = avgExecuteTimeMs;
        return this;
    }

    /**
     * 作业平均执行时长，单位：毫秒。
     * @return avgExecuteTimeMs
     */
    public Long getAvgExecuteTimeMs() {
        return avgExecuteTimeMs;
    }

    public void setAvgExecuteTimeMs(Long avgExecuteTimeMs) {
        this.avgExecuteTimeMs = avgExecuteTimeMs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFactoryDependInstancesRespDependInstancesInfo that =
            (ShowFactoryDependInstancesRespDependInstancesInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.directoryPath, that.directoryPath)
            && Objects.equals(this.forceSuccess, that.forceSuccess)
            && Objects.equals(this.ignoreSuccess, that.ignoreSuccess)
            && Objects.equals(this.parentInstanceIds, that.parentInstanceIds)
            && Objects.equals(this.planTime, that.planTime) && Objects.equals(this.runningTime, that.runningTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.submitTime, that.submitTime)
            && Objects.equals(this.version, that.version) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.workspaceName, that.workspaceName)
            && Objects.equals(this.avgExecuteTimeMs, that.avgExecuteTimeMs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            jobId,
            jobName,
            directoryPath,
            forceSuccess,
            ignoreSuccess,
            parentInstanceIds,
            planTime,
            runningTime,
            startTime,
            endTime,
            status,
            submitTime,
            version,
            workspaceId,
            workspaceName,
            avgExecuteTimeMs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFactoryDependInstancesRespDependInstancesInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    directoryPath: ").append(toIndentedString(directoryPath)).append("\n");
        sb.append("    forceSuccess: ").append(toIndentedString(forceSuccess)).append("\n");
        sb.append("    ignoreSuccess: ").append(toIndentedString(ignoreSuccess)).append("\n");
        sb.append("    parentInstanceIds: ").append(toIndentedString(parentInstanceIds)).append("\n");
        sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
        sb.append("    runningTime: ").append(toIndentedString(runningTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
        sb.append("    avgExecuteTimeMs: ").append(toIndentedString(avgExecuteTimeMs)).append("\n");
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
