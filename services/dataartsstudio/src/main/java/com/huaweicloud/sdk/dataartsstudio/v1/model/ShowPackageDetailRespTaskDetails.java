package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowPackageDetailRespTaskDetails
 */
public class ShowPackageDetailRespTaskDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_status")

    private Integer deployStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployed_version")

    private Integer deployedVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_name")

    private String itemName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending_item_id")

    private String pendingItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending_version")

    private Integer pendingVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

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
    @JsonProperty(value = "task_type")

    private Integer taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_type")

    private Integer updateType;

    public ShowPackageDetailRespTaskDetails withDeployStatus(Integer deployStatus) {
        this.deployStatus = deployStatus;
        return this;
    }

    /**
     * 发布状态，1:待审批,2:成功,3:失败, 5:发布中
     * @return deployStatus
     */
    public Integer getDeployStatus() {
        return deployStatus;
    }

    public void setDeployStatus(Integer deployStatus) {
        this.deployStatus = deployStatus;
    }

    public ShowPackageDetailRespTaskDetails withDeployedVersion(Integer deployedVersion) {
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

    public ShowPackageDetailRespTaskDetails withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    /**
     * 发布任务名称
     * @return itemName
     */
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ShowPackageDetailRespTaskDetails withPendingItemId(String pendingItemId) {
        this.pendingItemId = pendingItemId;
        return this;
    }

    /**
     * 发布任务ID
     * @return pendingItemId
     */
    public String getPendingItemId() {
        return pendingItemId;
    }

    public void setPendingItemId(String pendingItemId) {
        this.pendingItemId = pendingItemId;
    }

    public ShowPackageDetailRespTaskDetails withPendingVersion(Integer pendingVersion) {
        this.pendingVersion = pendingVersion;
        return this;
    }

    /**
     * 节点版本
     * @return pendingVersion
     */
    public Integer getPendingVersion() {
        return pendingVersion;
    }

    public void setPendingVersion(Integer pendingVersion) {
        this.pendingVersion = pendingVersion;
    }

    public ShowPackageDetailRespTaskDetails withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * 具体脚本ID
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public ShowPackageDetailRespTaskDetails withSubmitTimestamp(Long submitTimestamp) {
        this.submitTimestamp = submitTimestamp;
        return this;
    }

    /**
     * 提交时间戳，13位时间戳
     * @return submitTimestamp
     */
    public Long getSubmitTimestamp() {
        return submitTimestamp;
    }

    public void setSubmitTimestamp(Long submitTimestamp) {
        this.submitTimestamp = submitTimestamp;
    }

    public ShowPackageDetailRespTaskDetails withSubmitUserId(String submitUserId) {
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

    public ShowPackageDetailRespTaskDetails withSubmitUserName(String submitUserName) {
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

    public ShowPackageDetailRespTaskDetails withTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型（1-作业，2-脚本，3-资源）
     * @return taskType
     */
    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public ShowPackageDetailRespTaskDetails withUpdateType(Integer updateType) {
        this.updateType = updateType;
        return this;
    }

    /**
     * 变更类型，默认值1，（1-新增，2-修改，3-删除）
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
        ShowPackageDetailRespTaskDetails that = (ShowPackageDetailRespTaskDetails) obj;
        return Objects.equals(this.deployStatus, that.deployStatus)
            && Objects.equals(this.deployedVersion, that.deployedVersion)
            && Objects.equals(this.itemName, that.itemName) && Objects.equals(this.pendingItemId, that.pendingItemId)
            && Objects.equals(this.pendingVersion, that.pendingVersion) && Objects.equals(this.scriptId, that.scriptId)
            && Objects.equals(this.submitTimestamp, that.submitTimestamp)
            && Objects.equals(this.submitUserId, that.submitUserId)
            && Objects.equals(this.submitUserName, that.submitUserName) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.updateType, that.updateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deployStatus,
            deployedVersion,
            itemName,
            pendingItemId,
            pendingVersion,
            scriptId,
            submitTimestamp,
            submitUserId,
            submitUserName,
            taskType,
            updateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPackageDetailRespTaskDetails {\n");
        sb.append("    deployStatus: ").append(toIndentedString(deployStatus)).append("\n");
        sb.append("    deployedVersion: ").append(toIndentedString(deployedVersion)).append("\n");
        sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
        sb.append("    pendingItemId: ").append(toIndentedString(pendingItemId)).append("\n");
        sb.append("    pendingVersion: ").append(toIndentedString(pendingVersion)).append("\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    submitTimestamp: ").append(toIndentedString(submitTimestamp)).append("\n");
        sb.append("    submitUserId: ").append(toIndentedString(submitUserId)).append("\n");
        sb.append("    submitUserName: ").append(toIndentedString(submitUserName)).append("\n");
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
