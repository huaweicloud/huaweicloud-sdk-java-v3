package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询应用详情响应体
 */
public class AppExecutionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_disable")

    private Boolean isDisable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_care")

    private Boolean isCare;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_modify")

    private Boolean canModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_delete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_view")

    private Boolean canView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_execute")

    private Boolean canExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_copy")

    private Boolean canCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_manage")

    private Boolean canManage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_create_env")

    private Boolean canCreateEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_disable")

    private Boolean canDisable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_system")

    private String deploySystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_id")

    private String createUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_tenant_id")

    private String createTenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time")

    private String executionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_state")

    private String executionState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_id")

    private Integer releaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_id")

    private String executorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_nick_name")

    private String executorNickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arrange_infos")

    private List<TaskBaseResponseBody> arrangeInfos = null;

    public AppExecutionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppExecutionInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppExecutionInfo withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 部署时间
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public AppExecutionInfo withIsDisable(Boolean isDisable) {
        this.isDisable = isDisable;
        return this;
    }

    /**
     * 当前应用是否被禁用
     * @return isDisable
     */
    public Boolean getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(Boolean isDisable) {
        this.isDisable = isDisable;
    }

    public AppExecutionInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AppExecutionInfo withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public AppExecutionInfo withIsCare(Boolean isCare) {
        this.isCare = isCare;
        return this;
    }

    /**
     * 当前用户是否已收藏
     * @return isCare
     */
    public Boolean getIsCare() {
        return isCare;
    }

    public void setIsCare(Boolean isCare) {
        this.isCare = isCare;
    }

    public AppExecutionInfo withCanModify(Boolean canModify) {
        this.canModify = canModify;
        return this;
    }

    /**
     * 是否有编辑权限
     * @return canModify
     */
    public Boolean getCanModify() {
        return canModify;
    }

    public void setCanModify(Boolean canModify) {
        this.canModify = canModify;
    }

    public AppExecutionInfo withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * 是否有删除的权限
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public AppExecutionInfo withCanView(Boolean canView) {
        this.canView = canView;
        return this;
    }

    /**
     * 是否有查看权限
     * @return canView
     */
    public Boolean getCanView() {
        return canView;
    }

    public void setCanView(Boolean canView) {
        this.canView = canView;
    }

    public AppExecutionInfo withCanExecute(Boolean canExecute) {
        this.canExecute = canExecute;
        return this;
    }

    /**
     * 是否有部署权限
     * @return canExecute
     */
    public Boolean getCanExecute() {
        return canExecute;
    }

    public void setCanExecute(Boolean canExecute) {
        this.canExecute = canExecute;
    }

    public AppExecutionInfo withCanCopy(Boolean canCopy) {
        this.canCopy = canCopy;
        return this;
    }

    /**
     * 是否有复制权限
     * @return canCopy
     */
    public Boolean getCanCopy() {
        return canCopy;
    }

    public void setCanCopy(Boolean canCopy) {
        this.canCopy = canCopy;
    }

    public AppExecutionInfo withCanManage(Boolean canManage) {
        this.canManage = canManage;
        return this;
    }

    /**
     * 是否有编辑应用权限矩阵的权限
     * @return canManage
     */
    public Boolean getCanManage() {
        return canManage;
    }

    public void setCanManage(Boolean canManage) {
        this.canManage = canManage;
    }

    public AppExecutionInfo withCanCreateEnv(Boolean canCreateEnv) {
        this.canCreateEnv = canCreateEnv;
        return this;
    }

    /**
     * 是否有创建环境的权限
     * @return canCreateEnv
     */
    public Boolean getCanCreateEnv() {
        return canCreateEnv;
    }

    public void setCanCreateEnv(Boolean canCreateEnv) {
        this.canCreateEnv = canCreateEnv;
    }

    public AppExecutionInfo withCanDisable(Boolean canDisable) {
        this.canDisable = canDisable;
        return this;
    }

    /**
     * 是否有禁用应用的权限
     * @return canDisable
     */
    public Boolean getCanDisable() {
        return canDisable;
    }

    public void setCanDisable(Boolean canDisable) {
        this.canDisable = canDisable;
    }

    public AppExecutionInfo withDeploySystem(String deploySystem) {
        this.deploySystem = deploySystem;
        return this;
    }

    /**
     * 部署类型模式，包括deployTemplate、ansible、shell
     * @return deploySystem
     */
    public String getDeploySystem() {
        return deploySystem;
    }

    public void setDeploySystem(String deploySystem) {
        this.deploySystem = deploySystem;
    }

    public AppExecutionInfo withCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * 应用创建者用户id
     * @return createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public AppExecutionInfo withCreateTenantId(String createTenantId) {
        this.createTenantId = createTenantId;
        return this;
    }

    /**
     * 应用创建者租户id
     * @return createTenantId
     */
    public String getCreateTenantId() {
        return createTenantId;
    }

    public void setCreateTenantId(String createTenantId) {
        this.createTenantId = createTenantId;
    }

    public AppExecutionInfo withCreateTime(String createTime) {
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

    public AppExecutionInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public AppExecutionInfo withExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * 最后一次部署时间
     * @return executionTime
     */
    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public AppExecutionInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 部署结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public AppExecutionInfo withExecutionState(String executionState) {
        this.executionState = executionState;
        return this;
    }

    /**
     * 部署状态
     * @return executionState
     */
    public String getExecutionState() {
        return executionState;
    }

    public void setExecutionState(String executionState) {
        this.executionState = executionState;
    }

    public AppExecutionInfo withReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
        return this;
    }

    /**
     * 部署记录序列号
     * @return releaseId
     */
    public Integer getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    public AppExecutionInfo withExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }

    /**
     * 部署者id
     * @return executorId
     */
    public String getExecutorId() {
        return executorId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public AppExecutionInfo withExecutorNickName(String executorNickName) {
        this.executorNickName = executorNickName;
        return this;
    }

    /**
     * 部署者名称
     * @return executorNickName
     */
    public String getExecutorNickName() {
        return executorNickName;
    }

    public void setExecutorNickName(String executorNickName) {
        this.executorNickName = executorNickName;
    }

    public AppExecutionInfo withArrangeInfos(List<TaskBaseResponseBody> arrangeInfos) {
        this.arrangeInfos = arrangeInfos;
        return this;
    }

    public AppExecutionInfo addArrangeInfosItem(TaskBaseResponseBody arrangeInfosItem) {
        if (this.arrangeInfos == null) {
            this.arrangeInfos = new ArrayList<>();
        }
        this.arrangeInfos.add(arrangeInfosItem);
        return this;
    }

    public AppExecutionInfo withArrangeInfos(Consumer<List<TaskBaseResponseBody>> arrangeInfosSetter) {
        if (this.arrangeInfos == null) {
            this.arrangeInfos = new ArrayList<>();
        }
        arrangeInfosSetter.accept(this.arrangeInfos);
        return this;
    }

    /**
     * 部署任务信息
     * @return arrangeInfos
     */
    public List<TaskBaseResponseBody> getArrangeInfos() {
        return arrangeInfos;
    }

    public void setArrangeInfos(List<TaskBaseResponseBody> arrangeInfos) {
        this.arrangeInfos = arrangeInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppExecutionInfo that = (AppExecutionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.isDisable, that.isDisable)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.isCare, that.isCare) && Objects.equals(this.canModify, that.canModify)
            && Objects.equals(this.canDelete, that.canDelete) && Objects.equals(this.canView, that.canView)
            && Objects.equals(this.canExecute, that.canExecute) && Objects.equals(this.canCopy, that.canCopy)
            && Objects.equals(this.canManage, that.canManage) && Objects.equals(this.canCreateEnv, that.canCreateEnv)
            && Objects.equals(this.canDisable, that.canDisable) && Objects.equals(this.deploySystem, that.deploySystem)
            && Objects.equals(this.createUserId, that.createUserId)
            && Objects.equals(this.createTenantId, that.createTenantId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.executionTime, that.executionTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.executionState, that.executionState)
            && Objects.equals(this.releaseId, that.releaseId) && Objects.equals(this.executorId, that.executorId)
            && Objects.equals(this.executorNickName, that.executorNickName)
            && Objects.equals(this.arrangeInfos, that.arrangeInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            duration,
            isDisable,
            projectId,
            projectName,
            isCare,
            canModify,
            canDelete,
            canView,
            canExecute,
            canCopy,
            canManage,
            canCreateEnv,
            canDisable,
            deploySystem,
            createUserId,
            createTenantId,
            createTime,
            updateTime,
            executionTime,
            endTime,
            executionState,
            releaseId,
            executorId,
            executorNickName,
            arrangeInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppExecutionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    isDisable: ").append(toIndentedString(isDisable)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    isCare: ").append(toIndentedString(isCare)).append("\n");
        sb.append("    canModify: ").append(toIndentedString(canModify)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
        sb.append("    canExecute: ").append(toIndentedString(canExecute)).append("\n");
        sb.append("    canCopy: ").append(toIndentedString(canCopy)).append("\n");
        sb.append("    canManage: ").append(toIndentedString(canManage)).append("\n");
        sb.append("    canCreateEnv: ").append(toIndentedString(canCreateEnv)).append("\n");
        sb.append("    canDisable: ").append(toIndentedString(canDisable)).append("\n");
        sb.append("    deploySystem: ").append(toIndentedString(deploySystem)).append("\n");
        sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
        sb.append("    createTenantId: ").append(toIndentedString(createTenantId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executionState: ").append(toIndentedString(executionState)).append("\n");
        sb.append("    releaseId: ").append(toIndentedString(releaseId)).append("\n");
        sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
        sb.append("    executorNickName: ").append(toIndentedString(executorNickName)).append("\n");
        sb.append("    arrangeInfos: ").append(toIndentedString(arrangeInfos)).append("\n");
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
