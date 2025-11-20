package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MigrateRouteSwitchReqVO
 */
public class MigrateRouteSwitchReqVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_account")

    private IamAccount iamAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_route_begin_time")

    private String switchRouteBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_route_end_time")

    private String switchRouteEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open_api")

    private Boolean isOpenApi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_db_name")

    private String logicDbName;

    public MigrateRouteSwitchReqVO withIamAccount(IamAccount iamAccount) {
        this.iamAccount = iamAccount;
        return this;
    }

    public MigrateRouteSwitchReqVO withIamAccount(Consumer<IamAccount> iamAccountSetter) {
        if (this.iamAccount == null) {
            this.iamAccount = new IamAccount();
            iamAccountSetter.accept(this.iamAccount);
        }

        return this;
    }

    /**
     * Get iamAccount
     * @return iamAccount
     */
    public IamAccount getIamAccount() {
        return iamAccount;
    }

    public void setIamAccount(IamAccount iamAccount) {
        this.iamAccount = iamAccount;
    }

    public MigrateRouteSwitchReqVO withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public MigrateRouteSwitchReqVO withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public MigrateRouteSwitchReqVO withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public MigrateRouteSwitchReqVO withSwitchRouteBeginTime(String switchRouteBeginTime) {
        this.switchRouteBeginTime = switchRouteBeginTime;
        return this;
    }

    /**
     * 自动切换路由开始时间。
     * @return switchRouteBeginTime
     */
    public String getSwitchRouteBeginTime() {
        return switchRouteBeginTime;
    }

    public void setSwitchRouteBeginTime(String switchRouteBeginTime) {
        this.switchRouteBeginTime = switchRouteBeginTime;
    }

    public MigrateRouteSwitchReqVO withSwitchRouteEndTime(String switchRouteEndTime) {
        this.switchRouteEndTime = switchRouteEndTime;
        return this;
    }

    /**
     * 自动切换路由结束时间。
     * @return switchRouteEndTime
     */
    public String getSwitchRouteEndTime() {
        return switchRouteEndTime;
    }

    public void setSwitchRouteEndTime(String switchRouteEndTime) {
        this.switchRouteEndTime = switchRouteEndTime;
    }

    public MigrateRouteSwitchReqVO withIsOpenApi(Boolean isOpenApi) {
        this.isOpenApi = isOpenApi;
        return this;
    }

    /**
     * 是否openapi。
     * @return isOpenApi
     */
    public Boolean getIsOpenApi() {
        return isOpenApi;
    }

    public void setIsOpenApi(Boolean isOpenApi) {
        this.isOpenApi = isOpenApi;
    }

    public MigrateRouteSwitchReqVO withLogicDbName(String logicDbName) {
        this.logicDbName = logicDbName;
        return this;
    }

    /**
     * 逻辑库名称。
     * @return logicDbName
     */
    public String getLogicDbName() {
        return logicDbName;
    }

    public void setLogicDbName(String logicDbName) {
        this.logicDbName = logicDbName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrateRouteSwitchReqVO that = (MigrateRouteSwitchReqVO) obj;
        return Objects.equals(this.iamAccount, that.iamAccount) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.switchRouteBeginTime, that.switchRouteBeginTime)
            && Objects.equals(this.switchRouteEndTime, that.switchRouteEndTime)
            && Objects.equals(this.isOpenApi, that.isOpenApi) && Objects.equals(this.logicDbName, that.logicDbName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iamAccount,
            projectId,
            instanceId,
            taskId,
            switchRouteBeginTime,
            switchRouteEndTime,
            isOpenApi,
            logicDbName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateRouteSwitchReqVO {\n");
        sb.append("    iamAccount: ").append(toIndentedString(iamAccount)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    switchRouteBeginTime: ").append(toIndentedString(switchRouteBeginTime)).append("\n");
        sb.append("    switchRouteEndTime: ").append(toIndentedString(switchRouteEndTime)).append("\n");
        sb.append("    isOpenApi: ").append(toIndentedString(isOpenApi)).append("\n");
        sb.append("    logicDbName: ").append(toIndentedString(logicDbName)).append("\n");
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
