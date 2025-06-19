package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Job
 */
public class Job {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_creator")

    private String jobCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_build_time")

    private BigDecimal lastBuildTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_score")

    private Integer healthScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_code")

    private String sourceCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_build_status")

    private String lastBuildStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_finished")

    private Boolean isFinished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorite")

    private Boolean favorite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_modify")

    private Boolean isModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete")

    private Boolean isDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_execute")

    private Boolean isExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_copy")

    private Boolean isCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_forbidden")

    private Boolean isForbidden;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_view")

    private Boolean isView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_build_user")

    private String lastBuildUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_time")

    private Long buildTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_web_url")

    private String scmWebUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_type")

    private String scmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private String repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_project_id")

    private String buildProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_job_running_status")

    private String lastJobRunningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_build_user_id")

    private String lastBuildUserId;

    public Job withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Job withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 任务名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Job withJobCreator(String jobCreator) {
        this.jobCreator = jobCreator;
        return this;
    }

    /**
     * 任务创建者
     * @return jobCreator
     */
    public String getJobCreator() {
        return jobCreator;
    }

    public void setJobCreator(String jobCreator) {
        this.jobCreator = jobCreator;
    }

    public Job withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Job withLastBuildTime(BigDecimal lastBuildTime) {
        this.lastBuildTime = lastBuildTime;
        return this;
    }

    /**
     * 最新执行时间
     * @return lastBuildTime
     */
    public BigDecimal getLastBuildTime() {
        return lastBuildTime;
    }

    public void setLastBuildTime(BigDecimal lastBuildTime) {
        this.lastBuildTime = lastBuildTime;
    }

    public Job withHealthScore(Integer healthScore) {
        this.healthScore = healthScore;
        return this;
    }

    /**
     * 健康分值
     * @return healthScore
     */
    public Integer getHealthScore() {
        return healthScore;
    }

    public void setHealthScore(Integer healthScore) {
        this.healthScore = healthScore;
    }

    public Job withSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }

    /**
     * 代码来源
     * @return sourceCode
     */
    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Job withLastBuildStatus(String lastBuildStatus) {
        this.lastBuildStatus = lastBuildStatus;
        return this;
    }

    /**
     * 最新构建状态
     * @return lastBuildStatus
     */
    public String getLastBuildStatus() {
        return lastBuildStatus;
    }

    public void setLastBuildStatus(String lastBuildStatus) {
        this.lastBuildStatus = lastBuildStatus;
    }

    public Job withIsFinished(Boolean isFinished) {
        this.isFinished = isFinished;
        return this;
    }

    /**
     * 是否已结束
     * @return isFinished
     */
    public Boolean getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Boolean isFinished) {
        this.isFinished = isFinished;
    }

    public Job withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 是否已禁用
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Job withFavorite(Boolean favorite) {
        this.favorite = favorite;
        return this;
    }

    /**
     * 是否已收藏
     * @return favorite
     */
    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Job withIsModify(Boolean isModify) {
        this.isModify = isModify;
        return this;
    }

    /**
     * 是否有修改任务权限
     * @return isModify
     */
    public Boolean getIsModify() {
        return isModify;
    }

    public void setIsModify(Boolean isModify) {
        this.isModify = isModify;
    }

    public Job withIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    /**
     * 是否有删除任务权限
     * @return isDelete
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Job withIsExecute(Boolean isExecute) {
        this.isExecute = isExecute;
        return this;
    }

    /**
     * 是否有执行任务权限
     * @return isExecute
     */
    public Boolean getIsExecute() {
        return isExecute;
    }

    public void setIsExecute(Boolean isExecute) {
        this.isExecute = isExecute;
    }

    public Job withIsCopy(Boolean isCopy) {
        this.isCopy = isCopy;
        return this;
    }

    /**
     * 是否有复制任务权限
     * @return isCopy
     */
    public Boolean getIsCopy() {
        return isCopy;
    }

    public void setIsCopy(Boolean isCopy) {
        this.isCopy = isCopy;
    }

    public Job withIsForbidden(Boolean isForbidden) {
        this.isForbidden = isForbidden;
        return this;
    }

    /**
     * 是否有禁用任务权限
     * @return isForbidden
     */
    public Boolean getIsForbidden() {
        return isForbidden;
    }

    public void setIsForbidden(Boolean isForbidden) {
        this.isForbidden = isForbidden;
    }

    public Job withIsView(Boolean isView) {
        this.isView = isView;
        return this;
    }

    /**
     * 是否有查看任务权限
     * @return isView
     */
    public Boolean getIsView() {
        return isView;
    }

    public void setIsView(Boolean isView) {
        this.isView = isView;
    }

    public Job withLastBuildUser(String lastBuildUser) {
        this.lastBuildUser = lastBuildUser;
        return this;
    }

    /**
     * 最后一次构建用户
     * @return lastBuildUser
     */
    public String getLastBuildUser() {
        return lastBuildUser;
    }

    public void setLastBuildUser(String lastBuildUser) {
        this.lastBuildUser = lastBuildUser;
    }

    public Job withTriggerType(String triggerType) {
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

    public Job withBuildTime(Long buildTime) {
        this.buildTime = buildTime;
        return this;
    }

    /**
     * 构建时间
     * @return buildTime
     */
    public Long getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Long buildTime) {
        this.buildTime = buildTime;
    }

    public Job withScmWebUrl(String scmWebUrl) {
        this.scmWebUrl = scmWebUrl;
        return this;
    }

    /**
     * 代码仓web地址
     * @return scmWebUrl
     */
    public String getScmWebUrl() {
        return scmWebUrl;
    }

    public void setScmWebUrl(String scmWebUrl) {
        this.scmWebUrl = scmWebUrl;
    }

    public Job withScmType(String scmType) {
        this.scmType = scmType;
        return this;
    }

    /**
     * 代码仓类型
     * @return scmType
     */
    public String getScmType() {
        return scmType;
    }

    public void setScmType(String scmType) {
        this.scmType = scmType;
    }

    public Job withRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * 代码仓ID
     * @return repoId
     */
    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public Job withBuildProjectId(String buildProjectId) {
        this.buildProjectId = buildProjectId;
        return this;
    }

    /**
     * 构建项目ID
     * @return buildProjectId
     */
    public String getBuildProjectId() {
        return buildProjectId;
    }

    public void setBuildProjectId(String buildProjectId) {
        this.buildProjectId = buildProjectId;
    }

    public Job withLastJobRunningStatus(String lastJobRunningStatus) {
        this.lastJobRunningStatus = lastJobRunningStatus;
        return this;
    }

    /**
     * 最后一次构建时间
     * @return lastJobRunningStatus
     */
    public String getLastJobRunningStatus() {
        return lastJobRunningStatus;
    }

    public void setLastJobRunningStatus(String lastJobRunningStatus) {
        this.lastJobRunningStatus = lastJobRunningStatus;
    }

    public Job withLastBuildUserId(String lastBuildUserId) {
        this.lastBuildUserId = lastBuildUserId;
        return this;
    }

    /**
     * 最后一次构建用户ID
     * @return lastBuildUserId
     */
    public String getLastBuildUserId() {
        return lastBuildUserId;
    }

    public void setLastBuildUserId(String lastBuildUserId) {
        this.lastBuildUserId = lastBuildUserId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Job that = (Job) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.jobCreator, that.jobCreator) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.lastBuildTime, that.lastBuildTime)
            && Objects.equals(this.healthScore, that.healthScore) && Objects.equals(this.sourceCode, that.sourceCode)
            && Objects.equals(this.lastBuildStatus, that.lastBuildStatus)
            && Objects.equals(this.isFinished, that.isFinished) && Objects.equals(this.disabled, that.disabled)
            && Objects.equals(this.favorite, that.favorite) && Objects.equals(this.isModify, that.isModify)
            && Objects.equals(this.isDelete, that.isDelete) && Objects.equals(this.isExecute, that.isExecute)
            && Objects.equals(this.isCopy, that.isCopy) && Objects.equals(this.isForbidden, that.isForbidden)
            && Objects.equals(this.isView, that.isView) && Objects.equals(this.lastBuildUser, that.lastBuildUser)
            && Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.buildTime, that.buildTime)
            && Objects.equals(this.scmWebUrl, that.scmWebUrl) && Objects.equals(this.scmType, that.scmType)
            && Objects.equals(this.repoId, that.repoId) && Objects.equals(this.buildProjectId, that.buildProjectId)
            && Objects.equals(this.lastJobRunningStatus, that.lastJobRunningStatus)
            && Objects.equals(this.lastBuildUserId, that.lastBuildUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            jobName,
            jobCreator,
            userName,
            lastBuildTime,
            healthScore,
            sourceCode,
            lastBuildStatus,
            isFinished,
            disabled,
            favorite,
            isModify,
            isDelete,
            isExecute,
            isCopy,
            isForbidden,
            isView,
            lastBuildUser,
            triggerType,
            buildTime,
            scmWebUrl,
            scmType,
            repoId,
            buildProjectId,
            lastJobRunningStatus,
            lastBuildUserId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Job {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobCreator: ").append(toIndentedString(jobCreator)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    lastBuildTime: ").append(toIndentedString(lastBuildTime)).append("\n");
        sb.append("    healthScore: ").append(toIndentedString(healthScore)).append("\n");
        sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
        sb.append("    lastBuildStatus: ").append(toIndentedString(lastBuildStatus)).append("\n");
        sb.append("    isFinished: ").append(toIndentedString(isFinished)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
        sb.append("    isModify: ").append(toIndentedString(isModify)).append("\n");
        sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
        sb.append("    isExecute: ").append(toIndentedString(isExecute)).append("\n");
        sb.append("    isCopy: ").append(toIndentedString(isCopy)).append("\n");
        sb.append("    isForbidden: ").append(toIndentedString(isForbidden)).append("\n");
        sb.append("    isView: ").append(toIndentedString(isView)).append("\n");
        sb.append("    lastBuildUser: ").append(toIndentedString(lastBuildUser)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    buildTime: ").append(toIndentedString(buildTime)).append("\n");
        sb.append("    scmWebUrl: ").append(toIndentedString(scmWebUrl)).append("\n");
        sb.append("    scmType: ").append(toIndentedString(scmType)).append("\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    buildProjectId: ").append(toIndentedString(buildProjectId)).append("\n");
        sb.append("    lastJobRunningStatus: ").append(toIndentedString(lastJobRunningStatus)).append("\n");
        sb.append("    lastBuildUserId: ").append(toIndentedString(lastBuildUserId)).append("\n");
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
