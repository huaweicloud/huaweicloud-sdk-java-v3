package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 结果
 */
public class RecordInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_project_id")

    private String buildProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_record_id")

    private String buildRecordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_record_id")

    private String parentRecordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devcloud_project_id")

    private String devcloudProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codeci_job_id")

    private String codeciJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_no")

    private Integer buildNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily_build_num")

    private String dailyBuildNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private String repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit")

    private String commit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message")

    private String commitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_create_time")

    private String commitCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_type")

    private String buildType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

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
    @JsonProperty(value = "runnable_time")

    private String runnableTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_status")

    private String recordStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_private_slave")

    private Integer usePrivateSlave;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_msg")

    private String errMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_config_type")

    private String buildConfigType;

    public RecordInfoResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RecordInfoResult withBuildProjectId(String buildProjectId) {
        this.buildProjectId = buildProjectId;
        return this;
    }

    /**
     * 构建工程ID,唯一对应codeci_job_id
     * @return buildProjectId
     */
    public String getBuildProjectId() {
        return buildProjectId;
    }

    public void setBuildProjectId(String buildProjectId) {
        this.buildProjectId = buildProjectId;
    }

    public RecordInfoResult withBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }

    /**
     * 构建记录ID
     * @return buildRecordId
     */
    public String getBuildRecordId() {
        return buildRecordId;
    }

    public void setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
    }

    public RecordInfoResult withParentRecordId(String parentRecordId) {
        this.parentRecordId = parentRecordId;
        return this;
    }

    /**
     * 父构建记录ID
     * @return parentRecordId
     */
    public String getParentRecordId() {
        return parentRecordId;
    }

    public void setParentRecordId(String parentRecordId) {
        this.parentRecordId = parentRecordId;
    }

    public RecordInfoResult withDevcloudProjectId(String devcloudProjectId) {
        this.devcloudProjectId = devcloudProjectId;
        return this;
    }

    /**
     * 项目ID
     * @return devcloudProjectId
     */
    public String getDevcloudProjectId() {
        return devcloudProjectId;
    }

    public void setDevcloudProjectId(String devcloudProjectId) {
        this.devcloudProjectId = devcloudProjectId;
    }

    public RecordInfoResult withCodeciJobId(String codeciJobId) {
        this.codeciJobId = codeciJobId;
        return this;
    }

    /**
     * codeci任务ID,唯一对应build_project_id
     * @return codeciJobId
     */
    public String getCodeciJobId() {
        return codeciJobId;
    }

    public void setCodeciJobId(String codeciJobId) {
        this.codeciJobId = codeciJobId;
    }

    public RecordInfoResult withUserId(String userId) {
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

    public RecordInfoResult withBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
        return this;
    }

    /**
     * 构建编号
     * @return buildNo
     */
    public Integer getBuildNo() {
        return buildNo;
    }

    public void setBuildNo(Integer buildNo) {
        this.buildNo = buildNo;
    }

    public RecordInfoResult withDailyBuildNum(String dailyBuildNum) {
        this.dailyBuildNum = dailyBuildNum;
        return this;
    }

    /**
     * 每日构建编号，每日从1开始
     * @return dailyBuildNum
     */
    public String getDailyBuildNum() {
        return dailyBuildNum;
    }

    public void setDailyBuildNum(String dailyBuildNum) {
        this.dailyBuildNum = dailyBuildNum;
    }

    public RecordInfoResult withExecutionId(String executionId) {
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

    public RecordInfoResult withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * 仓库名称
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public RecordInfoResult withRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * 仓库id
     * @return repoId
     */
    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public RecordInfoResult withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 仓库分支
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public RecordInfoResult withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 仓库tag
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public RecordInfoResult withCommit(String commit) {
        this.commit = commit;
        return this;
    }

    /**
     * 仓库commit ID
     * @return commit
     */
    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public RecordInfoResult withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * 仓库commit提交信息
     * @return commitMessage
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public RecordInfoResult withCommitCreateTime(String commitCreateTime) {
        this.commitCreateTime = commitCreateTime;
        return this;
    }

    /**
     * commit创建时间
     * @return commitCreateTime
     */
    public String getCommitCreateTime() {
        return commitCreateTime;
    }

    public void setCommitCreateTime(String commitCreateTime) {
        this.commitCreateTime = commitCreateTime;
    }

    public RecordInfoResult withTriggerType(String triggerType) {
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

    public RecordInfoResult withBuildType(String buildType) {
        this.buildType = buildType;
        return this;
    }

    /**
     * 构建类型
     * @return buildType
     */
    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public RecordInfoResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 构建状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RecordInfoResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public RecordInfoResult withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public RecordInfoResult withScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }

    /**
     * 构建下发耗时
     * @return scheduleTime
     */
    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public RecordInfoResult withQueuedTime(String queuedTime) {
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

    public RecordInfoResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始构建时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public RecordInfoResult withRunnableTime(String runnableTime) {
        this.runnableTime = runnableTime;
        return this;
    }

    /**
     * 八爪鱼真正开始构建时间
     * @return runnableTime
     */
    public String getRunnableTime() {
        return runnableTime;
    }

    public void setRunnableTime(String runnableTime) {
        this.runnableTime = runnableTime;
    }

    public RecordInfoResult withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 构建结束时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public RecordInfoResult withRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
        return this;
    }

    /**
     * record状态
     * @return recordStatus
     */
    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public RecordInfoResult withUsePrivateSlave(Integer usePrivateSlave) {
        this.usePrivateSlave = usePrivateSlave;
        return this;
    }

    /**
     * 是否使用自定义执行机
     * @return usePrivateSlave
     */
    public Integer getUsePrivateSlave() {
        return usePrivateSlave;
    }

    public void setUsePrivateSlave(Integer usePrivateSlave) {
        this.usePrivateSlave = usePrivateSlave;
    }

    public RecordInfoResult withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 租户所在region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public RecordInfoResult withErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errMsg
     */
    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public RecordInfoResult withBuildConfigType(String buildConfigType) {
        this.buildConfigType = buildConfigType;
        return this;
    }

    /**
     * 构建配置类型，YAML或ACTION
     * @return buildConfigType
     */
    public String getBuildConfigType() {
        return buildConfigType;
    }

    public void setBuildConfigType(String buildConfigType) {
        this.buildConfigType = buildConfigType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordInfoResult that = (RecordInfoResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.buildProjectId, that.buildProjectId)
            && Objects.equals(this.buildRecordId, that.buildRecordId)
            && Objects.equals(this.parentRecordId, that.parentRecordId)
            && Objects.equals(this.devcloudProjectId, that.devcloudProjectId)
            && Objects.equals(this.codeciJobId, that.codeciJobId) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.buildNo, that.buildNo) && Objects.equals(this.dailyBuildNum, that.dailyBuildNum)
            && Objects.equals(this.executionId, that.executionId) && Objects.equals(this.repoName, that.repoName)
            && Objects.equals(this.repoId, that.repoId) && Objects.equals(this.branch, that.branch)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.commit, that.commit)
            && Objects.equals(this.commitMessage, that.commitMessage)
            && Objects.equals(this.commitCreateTime, that.commitCreateTime)
            && Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.buildType, that.buildType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.scheduleTime, that.scheduleTime)
            && Objects.equals(this.queuedTime, that.queuedTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.runnableTime, that.runnableTime) && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.recordStatus, that.recordStatus)
            && Objects.equals(this.usePrivateSlave, that.usePrivateSlave) && Objects.equals(this.region, that.region)
            && Objects.equals(this.errMsg, that.errMsg) && Objects.equals(this.buildConfigType, that.buildConfigType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            buildProjectId,
            buildRecordId,
            parentRecordId,
            devcloudProjectId,
            codeciJobId,
            userId,
            buildNo,
            dailyBuildNum,
            executionId,
            repoName,
            repoId,
            branch,
            tag,
            commit,
            commitMessage,
            commitCreateTime,
            triggerType,
            buildType,
            status,
            domainId,
            createTime,
            scheduleTime,
            queuedTime,
            startTime,
            runnableTime,
            finishTime,
            recordStatus,
            usePrivateSlave,
            region,
            errMsg,
            buildConfigType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordInfoResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    buildProjectId: ").append(toIndentedString(buildProjectId)).append("\n");
        sb.append("    buildRecordId: ").append(toIndentedString(buildRecordId)).append("\n");
        sb.append("    parentRecordId: ").append(toIndentedString(parentRecordId)).append("\n");
        sb.append("    devcloudProjectId: ").append(toIndentedString(devcloudProjectId)).append("\n");
        sb.append("    codeciJobId: ").append(toIndentedString(codeciJobId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    buildNo: ").append(toIndentedString(buildNo)).append("\n");
        sb.append("    dailyBuildNum: ").append(toIndentedString(dailyBuildNum)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
        sb.append("    commitCreateTime: ").append(toIndentedString(commitCreateTime)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
        sb.append("    queuedTime: ").append(toIndentedString(queuedTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    runnableTime: ").append(toIndentedString(runnableTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    recordStatus: ").append(toIndentedString(recordStatus)).append("\n");
        sb.append("    usePrivateSlave: ").append(toIndentedString(usePrivateSlave)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    errMsg: ").append(toIndentedString(errMsg)).append("\n");
        sb.append("    buildConfigType: ").append(toIndentedString(buildConfigType)).append("\n");
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
