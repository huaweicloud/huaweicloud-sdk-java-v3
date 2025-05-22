package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListFactoryPendingItemsRespData
 */
public class ListFactoryPendingItemsRespData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployed_version")

    private Integer deployedVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_name")

    private String itemName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_flag")

    private Integer packageFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending_item_id")

    private String pendingItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending_version")

    private Integer pendingVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit_timestamp")

    private Long submitTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit_user_id")

    private String submitUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit_user_name")

    private String submitUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private Integer taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_type")

    private Integer updateType;

    public ListFactoryPendingItemsRespData withDeployedVersion(Integer deployedVersion) {
        this.deployedVersion = deployedVersion;
        return this;
    }

    /**
     * 已发布节点版本
     * @return deployedVersion
     */
    public Integer getDeployedVersion() {
        return deployedVersion;
    }

    public void setDeployedVersion(Integer deployedVersion) {
        this.deployedVersion = deployedVersion;
    }

    public ListFactoryPendingItemsRespData withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    /**
     * 任务名称
     * @return itemName
     */
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ListFactoryPendingItemsRespData withPackageFlag(Integer packageFlag) {
        this.packageFlag = packageFlag;
        return this;
    }

    /**
     * 打包状态，0表示未打包。
     * @return packageFlag
     */
    public Integer getPackageFlag() {
        return packageFlag;
    }

    public void setPackageFlag(Integer packageFlag) {
        this.packageFlag = packageFlag;
    }

    public ListFactoryPendingItemsRespData withPendingItemId(String pendingItemId) {
        this.pendingItemId = pendingItemId;
        return this;
    }

    /**
     * 待发布包ID
     * @return pendingItemId
     */
    public String getPendingItemId() {
        return pendingItemId;
    }

    public void setPendingItemId(String pendingItemId) {
        this.pendingItemId = pendingItemId;
    }

    public ListFactoryPendingItemsRespData withPendingVersion(Integer pendingVersion) {
        this.pendingVersion = pendingVersion;
        return this;
    }

    /**
     * 待发布包版本
     * @return pendingVersion
     */
    public Integer getPendingVersion() {
        return pendingVersion;
    }

    public void setPendingVersion(Integer pendingVersion) {
        this.pendingVersion = pendingVersion;
    }

    public ListFactoryPendingItemsRespData withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户id+空间id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListFactoryPendingItemsRespData withSubmitTimestamp(Long submitTimestamp) {
        this.submitTimestamp = submitTimestamp;
        return this;
    }

    /**
     * 提交时间
     * @return submitTimestamp
     */
    public Long getSubmitTimestamp() {
        return submitTimestamp;
    }

    public void setSubmitTimestamp(Long submitTimestamp) {
        this.submitTimestamp = submitTimestamp;
    }

    public ListFactoryPendingItemsRespData withSubmitUserId(String submitUserId) {
        this.submitUserId = submitUserId;
        return this;
    }

    /**
     * 提交人id
     * @return submitUserId
     */
    public String getSubmitUserId() {
        return submitUserId;
    }

    public void setSubmitUserId(String submitUserId) {
        this.submitUserId = submitUserId;
    }

    public ListFactoryPendingItemsRespData withSubmitUserName(String submitUserName) {
        this.submitUserName = submitUserName;
        return this;
    }

    /**
     * 提交人名称
     * @return submitUserName
     */
    public String getSubmitUserName() {
        return submitUserName;
    }

    public void setSubmitUserName(String submitUserName) {
        this.submitUserName = submitUserName;
    }

    public ListFactoryPendingItemsRespData withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListFactoryPendingItemsRespData withTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型，取值为1和2。 1: job 2: script
     * @return taskType
     */
    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public ListFactoryPendingItemsRespData withUpdateType(Integer updateType) {
        this.updateType = updateType;
        return this;
    }

    /**
     * 变更类型，取值为1，2和3. 1: 新增 2: 变更 3: 删除
     * @return updateType
     */
    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactoryPendingItemsRespData that = (ListFactoryPendingItemsRespData) obj;
        return Objects.equals(this.deployedVersion, that.deployedVersion)
            && Objects.equals(this.itemName, that.itemName) && Objects.equals(this.packageFlag, that.packageFlag)
            && Objects.equals(this.pendingItemId, that.pendingItemId)
            && Objects.equals(this.pendingVersion, that.pendingVersion)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.submitTimestamp, that.submitTimestamp)
            && Objects.equals(this.submitUserId, that.submitUserId)
            && Objects.equals(this.submitUserName, that.submitUserName) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.updateType, that.updateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deployedVersion,
            itemName,
            packageFlag,
            pendingItemId,
            pendingVersion,
            projectId,
            submitTimestamp,
            submitUserId,
            submitUserName,
            taskId,
            taskType,
            updateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryPendingItemsRespData {\n");
        sb.append("    deployedVersion: ").append(toIndentedString(deployedVersion)).append("\n");
        sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
        sb.append("    packageFlag: ").append(toIndentedString(packageFlag)).append("\n");
        sb.append("    pendingItemId: ").append(toIndentedString(pendingItemId)).append("\n");
        sb.append("    pendingVersion: ").append(toIndentedString(pendingVersion)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    submitTimestamp: ").append(toIndentedString(submitTimestamp)).append("\n");
        sb.append("    submitUserId: ").append(toIndentedString(submitUserId)).append("\n");
        sb.append("    submitUserName: ").append(toIndentedString(submitUserName)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
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
