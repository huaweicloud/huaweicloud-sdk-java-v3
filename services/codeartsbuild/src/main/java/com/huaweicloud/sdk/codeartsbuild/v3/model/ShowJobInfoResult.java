package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务信息
 */
public class ShowJobInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_permission_switch")

    private Boolean projectPermissionSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_time")

    private String buildTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_time")

    private String chargeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorite")

    private Boolean favorite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_code")

    private String sourceCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_status")

    private String runningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_build")

    private Boolean newBuild;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_copy")

    private Boolean isCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delete")

    private Boolean isDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_execute")

    private Boolean isExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_forbidden")

    private Boolean isForbidden;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_manager")

    private Boolean isManager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_modify")

    private Boolean isModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_view")

    private Boolean isView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_build_status")

    private String lastBuildStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_build_time")

    private Long lastBuildTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_score")

    private Integer healthScore;

    public ShowJobInfoResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 构建任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowJobInfoResult withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 构建工程ID,唯一对应codeci_job_id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowJobInfoResult withProjectPermissionSwitch(Boolean projectPermissionSwitch) {
        this.projectPermissionSwitch = projectPermissionSwitch;
        return this;
    }

    /**
     * 使用项目权限
     * @return projectPermissionSwitch
     */
    public Boolean getProjectPermissionSwitch() {
        return projectPermissionSwitch;
    }

    public void setProjectPermissionSwitch(Boolean projectPermissionSwitch) {
        this.projectPermissionSwitch = projectPermissionSwitch;
    }

    public ShowJobInfoResult withBuildTime(String buildTime) {
        this.buildTime = buildTime;
        return this;
    }

    /**
     * 执行时间
     * @return buildTime
     */
    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public ShowJobInfoResult withChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
        return this;
    }

    /**
     * 收费时间
     * @return chargeTime
     */
    public String getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
    }

    public ShowJobInfoResult withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowJobInfoResult withDisabled(Boolean disabled) {
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

    public ShowJobInfoResult withFavorite(Boolean favorite) {
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

    public ShowJobInfoResult withSourceCode(String sourceCode) {
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

    public ShowJobInfoResult withRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
        return this;
    }

    /**
     * 运行状态
     * @return runningStatus
     */
    public String getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
    }

    public ShowJobInfoResult withNewBuild(Boolean newBuild) {
        this.newBuild = newBuild;
        return this;
    }

    /**
     * 重新运行
     * @return newBuild
     */
    public Boolean getNewBuild() {
        return newBuild;
    }

    public void setNewBuild(Boolean newBuild) {
        this.newBuild = newBuild;
    }

    public ShowJobInfoResult withJobName(String jobName) {
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

    public ShowJobInfoResult withIsCopy(Boolean isCopy) {
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

    public ShowJobInfoResult withIsDelete(Boolean isDelete) {
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

    public ShowJobInfoResult withIsExecute(Boolean isExecute) {
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

    public ShowJobInfoResult withIsForbidden(Boolean isForbidden) {
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

    public ShowJobInfoResult withIsManager(Boolean isManager) {
        this.isManager = isManager;
        return this;
    }

    /**
     * 是否有管理任务权限
     * @return isManager
     */
    public Boolean getIsManager() {
        return isManager;
    }

    public void setIsManager(Boolean isManager) {
        this.isManager = isManager;
    }

    public ShowJobInfoResult withIsModify(Boolean isModify) {
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

    public ShowJobInfoResult withIsView(Boolean isView) {
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

    public ShowJobInfoResult withLastBuildStatus(String lastBuildStatus) {
        this.lastBuildStatus = lastBuildStatus;
        return this;
    }

    /**
     * 最终构建状态
     * @return lastBuildStatus
     */
    public String getLastBuildStatus() {
        return lastBuildStatus;
    }

    public void setLastBuildStatus(String lastBuildStatus) {
        this.lastBuildStatus = lastBuildStatus;
    }

    public ShowJobInfoResult withLastBuildTime(Long lastBuildTime) {
        this.lastBuildTime = lastBuildTime;
        return this;
    }

    /**
     * 最后构建时间
     * @return lastBuildTime
     */
    public Long getLastBuildTime() {
        return lastBuildTime;
    }

    public void setLastBuildTime(Long lastBuildTime) {
        this.lastBuildTime = lastBuildTime;
    }

    public ShowJobInfoResult withHealthScore(Integer healthScore) {
        this.healthScore = healthScore;
        return this;
    }

    /**
     * 健康度
     * @return healthScore
     */
    public Integer getHealthScore() {
        return healthScore;
    }

    public void setHealthScore(Integer healthScore) {
        this.healthScore = healthScore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobInfoResult that = (ShowJobInfoResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectPermissionSwitch, that.projectPermissionSwitch)
            && Objects.equals(this.buildTime, that.buildTime) && Objects.equals(this.chargeTime, that.chargeTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.disabled, that.disabled)
            && Objects.equals(this.favorite, that.favorite) && Objects.equals(this.sourceCode, that.sourceCode)
            && Objects.equals(this.runningStatus, that.runningStatus) && Objects.equals(this.newBuild, that.newBuild)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.isCopy, that.isCopy)
            && Objects.equals(this.isDelete, that.isDelete) && Objects.equals(this.isExecute, that.isExecute)
            && Objects.equals(this.isForbidden, that.isForbidden) && Objects.equals(this.isManager, that.isManager)
            && Objects.equals(this.isModify, that.isModify) && Objects.equals(this.isView, that.isView)
            && Objects.equals(this.lastBuildStatus, that.lastBuildStatus)
            && Objects.equals(this.lastBuildTime, that.lastBuildTime)
            && Objects.equals(this.healthScore, that.healthScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            projectPermissionSwitch,
            buildTime,
            chargeTime,
            createTime,
            disabled,
            favorite,
            sourceCode,
            runningStatus,
            newBuild,
            jobName,
            isCopy,
            isDelete,
            isExecute,
            isForbidden,
            isManager,
            isModify,
            isView,
            lastBuildStatus,
            lastBuildTime,
            healthScore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobInfoResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectPermissionSwitch: ").append(toIndentedString(projectPermissionSwitch)).append("\n");
        sb.append("    buildTime: ").append(toIndentedString(buildTime)).append("\n");
        sb.append("    chargeTime: ").append(toIndentedString(chargeTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
        sb.append("    sourceCode: ").append(toIndentedString(sourceCode)).append("\n");
        sb.append("    runningStatus: ").append(toIndentedString(runningStatus)).append("\n");
        sb.append("    newBuild: ").append(toIndentedString(newBuild)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    isCopy: ").append(toIndentedString(isCopy)).append("\n");
        sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
        sb.append("    isExecute: ").append(toIndentedString(isExecute)).append("\n");
        sb.append("    isForbidden: ").append(toIndentedString(isForbidden)).append("\n");
        sb.append("    isManager: ").append(toIndentedString(isManager)).append("\n");
        sb.append("    isModify: ").append(toIndentedString(isModify)).append("\n");
        sb.append("    isView: ").append(toIndentedString(isView)).append("\n");
        sb.append("    lastBuildStatus: ").append(toIndentedString(lastBuildStatus)).append("\n");
        sb.append("    lastBuildTime: ").append(toIndentedString(lastBuildTime)).append("\n");
        sb.append("    healthScore: ").append(toIndentedString(healthScore)).append("\n");
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
