package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 项目列表
 */
public class BuildRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private Integer statusCode;

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
    @JsonProperty(value = "duration")

    private Integer duration;

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
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_name")

    private String triggerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<BuildRecordParameters> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository")

    private String repository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revision")

    private String revision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_yml_path")

    private String buildYmlPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_yml_url")

    private String buildYmlUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily_build_number")

    private String dailyBuildNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_record_type")

    private BuildRecordBuildRecordType buildRecordType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_type")

    private String scmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_web_url")

    private String scmWebUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_no")

    private String buildNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily_build_no")

    private String dailyBuildNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_cloud_build_type")

    private String devCloudBuildType;

    public BuildRecord withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BuildRecord withStatus(String status) {
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

    public BuildRecord withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态码
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public BuildRecord withCreateTime(String createTime) {
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

    public BuildRecord withScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }

    /**
     * 等待时间
     * @return scheduleTime
     */
    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public BuildRecord withQueuedTime(String queuedTime) {
        this.queuedTime = queuedTime;
        return this;
    }

    /**
     * 排队时间
     * @return queuedTime
     */
    public String getQueuedTime() {
        return queuedTime;
    }

    public void setQueuedTime(String queuedTime) {
        this.queuedTime = queuedTime;
    }

    public BuildRecord withStartTime(String startTime) {
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

    public BuildRecord withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 完成时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public BuildRecord withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 持续时间
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public BuildRecord withBuildDuration(Integer buildDuration) {
        this.buildDuration = buildDuration;
        return this;
    }

    /**
     * 构建时间
     * @return buildDuration
     */
    public Integer getBuildDuration() {
        return buildDuration;
    }

    public void setBuildDuration(Integer buildDuration) {
        this.buildDuration = buildDuration;
    }

    public BuildRecord withPendingDuration(Integer pendingDuration) {
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

    public BuildRecord withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 工程ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BuildRecord withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 子任务名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BuildRecord withTriggerName(String triggerName) {
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

    public BuildRecord withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 分组名
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public BuildRecord withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 八爪鱼任务ID
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public BuildRecord withParameters(List<BuildRecordParameters> parameters) {
        this.parameters = parameters;
        return this;
    }

    public BuildRecord addParametersItem(BuildRecordParameters parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public BuildRecord withParameters(Consumer<List<BuildRecordParameters>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 构建执行参数列表
     * @return parameters
     */
    public List<BuildRecordParameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<BuildRecordParameters> parameters) {
        this.parameters = parameters;
    }

    public BuildRecord withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * 仓库地址
     * @return repository
     */
    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public BuildRecord withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 分支名
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public BuildRecord withRevision(String revision) {
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

    public BuildRecord withBuildYmlPath(String buildYmlPath) {
        this.buildYmlPath = buildYmlPath;
        return this;
    }

    /**
     * yaml路径
     * @return buildYmlPath
     */
    public String getBuildYmlPath() {
        return buildYmlPath;
    }

    public void setBuildYmlPath(String buildYmlPath) {
        this.buildYmlPath = buildYmlPath;
    }

    public BuildRecord withBuildYmlUrl(String buildYmlUrl) {
        this.buildYmlUrl = buildYmlUrl;
        return this;
    }

    /**
     * yaml地址
     * @return buildYmlUrl
     */
    public String getBuildYmlUrl() {
        return buildYmlUrl;
    }

    public void setBuildYmlUrl(String buildYmlUrl) {
        this.buildYmlUrl = buildYmlUrl;
    }

    public BuildRecord withDailyBuildNumber(String dailyBuildNumber) {
        this.dailyBuildNumber = dailyBuildNumber;
        return this;
    }

    /**
     * 构建每日编号
     * @return dailyBuildNumber
     */
    public String getDailyBuildNumber() {
        return dailyBuildNumber;
    }

    public void setDailyBuildNumber(String dailyBuildNumber) {
        this.dailyBuildNumber = dailyBuildNumber;
    }

    public BuildRecord withBuildRecordType(BuildRecordBuildRecordType buildRecordType) {
        this.buildRecordType = buildRecordType;
        return this;
    }

    public BuildRecord withBuildRecordType(Consumer<BuildRecordBuildRecordType> buildRecordTypeSetter) {
        if (this.buildRecordType == null) {
            this.buildRecordType = new BuildRecordBuildRecordType();
            buildRecordTypeSetter.accept(this.buildRecordType);
        }

        return this;
    }

    /**
     * Get buildRecordType
     * @return buildRecordType
     */
    public BuildRecordBuildRecordType getBuildRecordType() {
        return buildRecordType;
    }

    public void setBuildRecordType(BuildRecordBuildRecordType buildRecordType) {
        this.buildRecordType = buildRecordType;
    }

    public BuildRecord withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发类型
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public BuildRecord withScmType(String scmType) {
        this.scmType = scmType;
        return this;
    }

    /**
     * 代码源类型
     * @return scmType
     */
    public String getScmType() {
        return scmType;
    }

    public void setScmType(String scmType) {
        this.scmType = scmType;
    }

    public BuildRecord withScmWebUrl(String scmWebUrl) {
        this.scmWebUrl = scmWebUrl;
        return this;
    }

    /**
     * 代码源地址
     * @return scmWebUrl
     */
    public String getScmWebUrl() {
        return scmWebUrl;
    }

    public void setScmWebUrl(String scmWebUrl) {
        this.scmWebUrl = scmWebUrl;
    }

    public BuildRecord withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BuildRecord withBuildNo(String buildNo) {
        this.buildNo = buildNo;
        return this;
    }

    /**
     * 构建编码
     * @return buildNo
     */
    public String getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(String buildNo) {
        this.buildNo = buildNo;
    }

    public BuildRecord withDailyBuildNo(String dailyBuildNo) {
        this.dailyBuildNo = dailyBuildNo;
        return this;
    }

    /**
     * 构建每日编号
     * @return dailyBuildNo
     */
    public String getDailyBuildNo() {
        return dailyBuildNo;
    }

    public void setDailyBuildNo(String dailyBuildNo) {
        this.dailyBuildNo = dailyBuildNo;
    }

    public BuildRecord withDevCloudBuildType(String devCloudBuildType) {
        this.devCloudBuildType = devCloudBuildType;
        return this;
    }

    /**
     * 构建类型
     * @return devCloudBuildType
     */
    public String getDevCloudBuildType() {
        return devCloudBuildType;
    }

    public void setDevCloudBuildType(String devCloudBuildType) {
        this.devCloudBuildType = devCloudBuildType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BuildRecord that = (BuildRecord) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.scheduleTime, that.scheduleTime) && Objects.equals(this.queuedTime, that.queuedTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.buildDuration, that.buildDuration)
            && Objects.equals(this.pendingDuration, that.pendingDuration)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.triggerName, that.triggerName) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.executionId, that.executionId) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.repository, that.repository) && Objects.equals(this.branch, that.branch)
            && Objects.equals(this.revision, that.revision) && Objects.equals(this.buildYmlPath, that.buildYmlPath)
            && Objects.equals(this.buildYmlUrl, that.buildYmlUrl)
            && Objects.equals(this.dailyBuildNumber, that.dailyBuildNumber)
            && Objects.equals(this.buildRecordType, that.buildRecordType)
            && Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.scmType, that.scmType)
            && Objects.equals(this.scmWebUrl, that.scmWebUrl) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.buildNo, that.buildNo) && Objects.equals(this.dailyBuildNo, that.dailyBuildNo)
            && Objects.equals(this.devCloudBuildType, that.devCloudBuildType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            statusCode,
            createTime,
            scheduleTime,
            queuedTime,
            startTime,
            finishTime,
            duration,
            buildDuration,
            pendingDuration,
            projectId,
            displayName,
            triggerName,
            groupName,
            executionId,
            parameters,
            repository,
            branch,
            revision,
            buildYmlPath,
            buildYmlUrl,
            dailyBuildNumber,
            buildRecordType,
            triggerType,
            scmType,
            scmWebUrl,
            userId,
            buildNo,
            dailyBuildNo,
            devCloudBuildType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
        sb.append("    queuedTime: ").append(toIndentedString(queuedTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    buildDuration: ").append(toIndentedString(buildDuration)).append("\n");
        sb.append("    pendingDuration: ").append(toIndentedString(pendingDuration)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    triggerName: ").append(toIndentedString(triggerName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
        sb.append("    buildYmlPath: ").append(toIndentedString(buildYmlPath)).append("\n");
        sb.append("    buildYmlUrl: ").append(toIndentedString(buildYmlUrl)).append("\n");
        sb.append("    dailyBuildNumber: ").append(toIndentedString(dailyBuildNumber)).append("\n");
        sb.append("    buildRecordType: ").append(toIndentedString(buildRecordType)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    scmType: ").append(toIndentedString(scmType)).append("\n");
        sb.append("    scmWebUrl: ").append(toIndentedString(scmWebUrl)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    buildNo: ").append(toIndentedString(buildNo)).append("\n");
        sb.append("    dailyBuildNo: ").append(toIndentedString(dailyBuildNo)).append("\n");
        sb.append("    devCloudBuildType: ").append(toIndentedString(devCloudBuildType)).append("\n");
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
