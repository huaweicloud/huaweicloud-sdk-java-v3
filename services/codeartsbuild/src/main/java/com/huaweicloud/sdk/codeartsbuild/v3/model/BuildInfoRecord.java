package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 构建历史详情
 */
public class BuildInfoRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private Integer number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_time")

    private Integer buildTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_running_status")

    private String jobRunningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor")

    private String executor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nickname")

    private String nickname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily_build_number")

    private String dailyBuildNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_time")

    private Integer costTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_info")

    private BuildInfoRecordCommitInfo commitInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_type")

    private String buildType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_branch")

    private String codeBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_type")

    private String scmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_web_url")

    private String scmWebUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_detail_url")

    private String commitDetailUrl;

    public BuildInfoRecord withNumber(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * 构建编号
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BuildInfoRecord withBuildTime(Integer buildTime) {
        this.buildTime = buildTime;
        return this;
    }

    /**
     * 执行时间
     * @return buildTime
     */
    public Integer getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Integer buildTime) {
        this.buildTime = buildTime;
    }

    public BuildInfoRecord withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，时间戳
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public BuildInfoRecord withJobRunningStatus(String jobRunningStatus) {
        this.jobRunningStatus = jobRunningStatus;
        return this;
    }

    /**
     * 运行状态
     * @return jobRunningStatus
     */
    public String getJobRunningStatus() {
        return jobRunningStatus;
    }

    public void setJobRunningStatus(String jobRunningStatus) {
        this.jobRunningStatus = jobRunningStatus;
    }

    public BuildInfoRecord withState(String state) {
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

    public BuildInfoRecord withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * IAM用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BuildInfoRecord withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    /**
     * 触发构建用户
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public BuildInfoRecord withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * 用户名称
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public BuildInfoRecord withDailyBuildNumber(String dailyBuildNumber) {
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

    public BuildInfoRecord withTriggerType(String triggerType) {
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

    public BuildInfoRecord withCostTime(Integer costTime) {
        this.costTime = costTime;
        return this;
    }

    /**
     * 执行时间
     * @return costTime
     */
    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    public BuildInfoRecord withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * 代码提交的commit id
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public BuildInfoRecord withCommitInfo(BuildInfoRecordCommitInfo commitInfo) {
        this.commitInfo = commitInfo;
        return this;
    }

    public BuildInfoRecord withCommitInfo(Consumer<BuildInfoRecordCommitInfo> commitInfoSetter) {
        if (this.commitInfo == null) {
            this.commitInfo = new BuildInfoRecordCommitInfo();
            commitInfoSetter.accept(this.commitInfo);
        }

        return this;
    }

    /**
     * Get commitInfo
     * @return commitInfo
     */
    public BuildInfoRecordCommitInfo getCommitInfo() {
        return commitInfo;
    }

    public void setCommitInfo(BuildInfoRecordCommitInfo commitInfo) {
        this.commitInfo = commitInfo;
    }

    public BuildInfoRecord withBuildType(String buildType) {
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

    public BuildInfoRecord withCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
        return this;
    }

    /**
     * 代码仓分支
     * @return codeBranch
     */
    public String getCodeBranch() {
        return codeBranch;
    }

    public void setCodeBranch(String codeBranch) {
        this.codeBranch = codeBranch;
    }

    public BuildInfoRecord withScmType(String scmType) {
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

    public BuildInfoRecord withScmWebUrl(String scmWebUrl) {
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

    public BuildInfoRecord withCommitDetailUrl(String commitDetailUrl) {
        this.commitDetailUrl = commitDetailUrl;
        return this;
    }

    /**
     * 代码提交记录信息地址（代码源为Repo)
     * @return commitDetailUrl
     */
    public String getCommitDetailUrl() {
        return commitDetailUrl;
    }

    public void setCommitDetailUrl(String commitDetailUrl) {
        this.commitDetailUrl = commitDetailUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BuildInfoRecord that = (BuildInfoRecord) obj;
        return Objects.equals(this.number, that.number) && Objects.equals(this.buildTime, that.buildTime)
            && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.jobRunningStatus, that.jobRunningStatus) && Objects.equals(this.state, that.state)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.executor, that.executor)
            && Objects.equals(this.nickname, that.nickname)
            && Objects.equals(this.dailyBuildNumber, that.dailyBuildNumber)
            && Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.costTime, that.costTime)
            && Objects.equals(this.commitId, that.commitId) && Objects.equals(this.commitInfo, that.commitInfo)
            && Objects.equals(this.buildType, that.buildType) && Objects.equals(this.codeBranch, that.codeBranch)
            && Objects.equals(this.scmType, that.scmType) && Objects.equals(this.scmWebUrl, that.scmWebUrl)
            && Objects.equals(this.commitDetailUrl, that.commitDetailUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number,
            buildTime,
            startTime,
            jobRunningStatus,
            state,
            userId,
            executor,
            nickname,
            dailyBuildNumber,
            triggerType,
            costTime,
            commitId,
            commitInfo,
            buildType,
            codeBranch,
            scmType,
            scmWebUrl,
            commitDetailUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildInfoRecord {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    buildTime: ").append(toIndentedString(buildTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    jobRunningStatus: ").append(toIndentedString(jobRunningStatus)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
        sb.append("    dailyBuildNumber: ").append(toIndentedString(dailyBuildNumber)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    costTime: ").append(toIndentedString(costTime)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    commitInfo: ").append(toIndentedString(commitInfo)).append("\n");
        sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
        sb.append("    codeBranch: ").append(toIndentedString(codeBranch)).append("\n");
        sb.append("    scmType: ").append(toIndentedString(scmType)).append("\n");
        sb.append("    scmWebUrl: ").append(toIndentedString(scmWebUrl)).append("\n");
        sb.append("    commitDetailUrl: ").append(toIndentedString(commitDetailUrl)).append("\n");
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
