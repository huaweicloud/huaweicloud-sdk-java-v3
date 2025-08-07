package com.huaweicloud.sdk.eps.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourceMigrateRecord
 */
public class ResourceMigrateRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated")

    private Boolean associated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_time")

    private String eventTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initiate_ep_id")

    private String initiateEpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initiate_ep_name")

    private String initiateEpName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_ep_id")

    private String originEpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_ep_name")

    private String originEpName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_ep_id")

    private String targetEpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_ep_name")

    private String targetEpName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist_failed")

    private String existFailed;

    public ResourceMigrateRecord withAssociated(Boolean associated) {
        this.associated = associated;
        return this;
    }

    /**
     * 是否关联迁移
     * @return associated
     */
    public Boolean getAssociated() {
        return associated;
    }

    public void setAssociated(Boolean associated) {
        this.associated = associated;
    }

    public ResourceMigrateRecord withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 响应码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ResourceMigrateRecord withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 响应信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResourceMigrateRecord withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ResourceMigrateRecord withProjectName(String projectName) {
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

    public ResourceMigrateRecord withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ResourceMigrateRecord withEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * 事件时间
     * @return eventTime
     */
    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public ResourceMigrateRecord withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ResourceMigrateRecord withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 迁移类型
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public ResourceMigrateRecord withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ResourceMigrateRecord withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ResourceMigrateRecord withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ResourceMigrateRecord withInitiateEpId(String initiateEpId) {
        this.initiateEpId = initiateEpId;
        return this;
    }

    /**
     * 发起迁移的企业项目ID
     * @return initiateEpId
     */
    public String getInitiateEpId() {
        return initiateEpId;
    }

    public void setInitiateEpId(String initiateEpId) {
        this.initiateEpId = initiateEpId;
    }

    public ResourceMigrateRecord withInitiateEpName(String initiateEpName) {
        this.initiateEpName = initiateEpName;
        return this;
    }

    /**
     * 发起迁移的业项目名称
     * @return initiateEpName
     */
    public String getInitiateEpName() {
        return initiateEpName;
    }

    public void setInitiateEpName(String initiateEpName) {
        this.initiateEpName = initiateEpName;
    }

    public ResourceMigrateRecord withOriginEpId(String originEpId) {
        this.originEpId = originEpId;
        return this;
    }

    /**
     * 源企业项目ID
     * @return originEpId
     */
    public String getOriginEpId() {
        return originEpId;
    }

    public void setOriginEpId(String originEpId) {
        this.originEpId = originEpId;
    }

    public ResourceMigrateRecord withOriginEpName(String originEpName) {
        this.originEpName = originEpName;
        return this;
    }

    /**
     * 源企业项目名称
     * @return originEpName
     */
    public String getOriginEpName() {
        return originEpName;
    }

    public void setOriginEpName(String originEpName) {
        this.originEpName = originEpName;
    }

    public ResourceMigrateRecord withTargetEpId(String targetEpId) {
        this.targetEpId = targetEpId;
        return this;
    }

    /**
     * 目标企业项目ID
     * @return targetEpId
     */
    public String getTargetEpId() {
        return targetEpId;
    }

    public void setTargetEpId(String targetEpId) {
        this.targetEpId = targetEpId;
    }

    public ResourceMigrateRecord withTargetEpName(String targetEpName) {
        this.targetEpName = targetEpName;
        return this;
    }

    /**
     * 目标企业项目名称
     * @return targetEpName
     */
    public String getTargetEpName() {
        return targetEpName;
    }

    public void setTargetEpName(String targetEpName) {
        this.targetEpName = targetEpName;
    }

    public ResourceMigrateRecord withExistFailed(String existFailed) {
        this.existFailed = existFailed;
        return this;
    }

    /**
     * 是否存在失败
     * @return existFailed
     */
    public String getExistFailed() {
        return existFailed;
    }

    public void setExistFailed(String existFailed) {
        this.existFailed = existFailed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceMigrateRecord that = (ResourceMigrateRecord) obj;
        return Objects.equals(this.associated, that.associated) && Objects.equals(this.code, that.code)
            && Objects.equals(this.message, that.message) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.eventTime, that.eventTime) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.operateType, that.operateType) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.initiateEpId, that.initiateEpId)
            && Objects.equals(this.initiateEpName, that.initiateEpName)
            && Objects.equals(this.originEpId, that.originEpId) && Objects.equals(this.originEpName, that.originEpName)
            && Objects.equals(this.targetEpId, that.targetEpId) && Objects.equals(this.targetEpName, that.targetEpName)
            && Objects.equals(this.existFailed, that.existFailed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associated,
            code,
            message,
            projectId,
            projectName,
            regionId,
            eventTime,
            userName,
            operateType,
            resourceId,
            resourceName,
            resourceType,
            initiateEpId,
            initiateEpName,
            originEpId,
            originEpName,
            targetEpId,
            targetEpName,
            existFailed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceMigrateRecord {\n");
        sb.append("    associated: ").append(toIndentedString(associated)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    initiateEpId: ").append(toIndentedString(initiateEpId)).append("\n");
        sb.append("    initiateEpName: ").append(toIndentedString(initiateEpName)).append("\n");
        sb.append("    originEpId: ").append(toIndentedString(originEpId)).append("\n");
        sb.append("    originEpName: ").append(toIndentedString(originEpName)).append("\n");
        sb.append("    targetEpId: ").append(toIndentedString(targetEpId)).append("\n");
        sb.append("    targetEpName: ").append(toIndentedString(targetEpName)).append("\n");
        sb.append("    existFailed: ").append(toIndentedString(existFailed)).append("\n");
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
