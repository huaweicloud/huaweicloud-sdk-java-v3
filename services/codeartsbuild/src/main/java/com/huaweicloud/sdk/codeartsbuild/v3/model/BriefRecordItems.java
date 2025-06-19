package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BriefRecordItems
 */
public class BriefRecordItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_time")

    private String scheduleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queued_time")

    private String queuedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_duration")

    private Integer buildDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending_duration")

    private Integer pendingDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_no")

    private Integer buildNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revision")

    private String revision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_name")

    private String triggerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily_build_number")

    private String dailyBuildNumber;

    public BriefRecordItems withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 构建任务的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BriefRecordItems withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BriefRecordItems withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 构建时长
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public BriefRecordItems withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public BriefRecordItems withScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }

    /**
     * 构建下发时间
     * @return scheduleTime
     */
    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public BriefRecordItems withQueuedTime(String queuedTime) {
        this.queuedTime = queuedTime;
        return this;
    }

    /**
     * 构建排队耗时
     * @return queuedTime
     */
    public String getQueuedTime() {
        return queuedTime;
    }

    public void setQueuedTime(String queuedTime) {
        this.queuedTime = queuedTime;
    }

    public BriefRecordItems withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public BriefRecordItems withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 结束时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public BriefRecordItems withBuildDuration(Integer buildDuration) {
        this.buildDuration = buildDuration;
        return this;
    }

    /**
     * 子任务构建耗时
     * @return buildDuration
     */
    public Integer getBuildDuration() {
        return buildDuration;
    }

    public void setBuildDuration(Integer buildDuration) {
        this.buildDuration = buildDuration;
    }

    public BriefRecordItems withPendingDuration(Integer pendingDuration) {
        this.pendingDuration = pendingDuration;
        return this;
    }

    /**
     * 等待时间
     * @return pendingDuration
     */
    public Integer getPendingDuration() {
        return pendingDuration;
    }

    public void setPendingDuration(Integer pendingDuration) {
        this.pendingDuration = pendingDuration;
    }

    public BriefRecordItems withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 所属的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BriefRecordItems withBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
        return this;
    }

    /**
     * 构建任务的构建编号，从1开始，每次构建递增1
     * @return buildNo
     */
    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public BriefRecordItems withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 代码分支
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public BriefRecordItems withRevision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * commitId
     * @return revision
     */
    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public BriefRecordItems withTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    /**
     * 触发者名称
     * @return triggerName
     */
    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public BriefRecordItems withDailyBuildNumber(String dailyBuildNumber) {
        this.dailyBuildNumber = dailyBuildNumber;
        return this;
    }

    /**
     * 构建编号，每日从1开始
     * @return dailyBuildNumber
     */
    public String getDailyBuildNumber() {
        return dailyBuildNumber;
    }

    public void setDailyBuildNumber(String dailyBuildNumber) {
        this.dailyBuildNumber = dailyBuildNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BriefRecordItems that = (BriefRecordItems) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.scheduleTime, that.scheduleTime) && Objects.equals(this.queuedTime, that.queuedTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.buildDuration, that.buildDuration)
            && Objects.equals(this.pendingDuration, that.pendingDuration)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.buildNo, that.buildNo)
            && Objects.equals(this.branch, that.branch) && Objects.equals(this.revision, that.revision)
            && Objects.equals(this.triggerName, that.triggerName)
            && Objects.equals(this.dailyBuildNumber, that.dailyBuildNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            duration,
            createTime,
            scheduleTime,
            queuedTime,
            startTime,
            finishTime,
            buildDuration,
            pendingDuration,
            projectId,
            buildNo,
            branch,
            revision,
            triggerName,
            dailyBuildNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BriefRecordItems {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
        sb.append("    queuedTime: ").append(toIndentedString(queuedTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    buildDuration: ").append(toIndentedString(buildDuration)).append("\n");
        sb.append("    pendingDuration: ").append(toIndentedString(pendingDuration)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    buildNo: ").append(toIndentedString(buildNo)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    triggerName: ").append(toIndentedString(triggerName)).append("\n");
        sb.append("    dailyBuildNumber: ").append(toIndentedString(dailyBuildNumber)).append("\n");
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
