package com.huaweicloud.sdk.mssi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowSingleConnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_config")

    private Object authConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_config_id")

    private String authConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_dynamic")

    private Object authDynamic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_id")

    private String authId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info")

    private Object authInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_key")

    private String authKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_name")

    private String authName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_prop")

    private Object authProp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cdm_params_config")

    private Object cdmParamsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_name")

    private String connectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_id")

    private String connectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_name")

    private String connectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_config")

    private Object hostConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open")

    private Integer isOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo")

    private String logo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private String updatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private OffsetDateTime updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    public ShowSingleConnectionResponse withAuthConfig(Object authConfig) {
        this.authConfig = authConfig;
        return this;
    }

    /**
     * Get authConfig
     * @return authConfig
     */
    public Object getAuthConfig() {
        return authConfig;
    }

    public void setAuthConfig(Object authConfig) {
        this.authConfig = authConfig;
    }

    public ShowSingleConnectionResponse withAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
        return this;
    }

    /**
     * Get authConfigId
     * @return authConfigId
     */
    public String getAuthConfigId() {
        return authConfigId;
    }

    public void setAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
    }

    public ShowSingleConnectionResponse withAuthDynamic(Object authDynamic) {
        this.authDynamic = authDynamic;
        return this;
    }

    /**
     * Get authDynamic
     * @return authDynamic
     */
    public Object getAuthDynamic() {
        return authDynamic;
    }

    public void setAuthDynamic(Object authDynamic) {
        this.authDynamic = authDynamic;
    }

    public ShowSingleConnectionResponse withAuthId(String authId) {
        this.authId = authId;
        return this;
    }

    /**
     * Get authId
     * @return authId
     */
    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public ShowSingleConnectionResponse withAuthInfo(Object authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    /**
     * Get authInfo
     * @return authInfo
     */
    public Object getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(Object authInfo) {
        this.authInfo = authInfo;
    }

    public ShowSingleConnectionResponse withAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }

    /**
     * Get authKey
     * @return authKey
     */
    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public ShowSingleConnectionResponse withAuthName(String authName) {
        this.authName = authName;
        return this;
    }

    /**
     * Get authName
     * @return authName
     */
    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public ShowSingleConnectionResponse withAuthProp(Object authProp) {
        this.authProp = authProp;
        return this;
    }

    /**
     * Get authProp
     * @return authProp
     */
    public Object getAuthProp() {
        return authProp;
    }

    public void setAuthProp(Object authProp) {
        this.authProp = authProp;
    }

    public ShowSingleConnectionResponse withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get authType
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public ShowSingleConnectionResponse withCdmParamsConfig(Object cdmParamsConfig) {
        this.cdmParamsConfig = cdmParamsConfig;
        return this;
    }

    /**
     * Get cdmParamsConfig
     * @return cdmParamsConfig
     */
    public Object getCdmParamsConfig() {
        return cdmParamsConfig;
    }

    public void setCdmParamsConfig(Object cdmParamsConfig) {
        this.cdmParamsConfig = cdmParamsConfig;
    }

    public ShowSingleConnectionResponse withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * Get connectionName
     * @return connectionName
     */
    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public ShowSingleConnectionResponse withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * Get connectorId
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public ShowSingleConnectionResponse withConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }

    /**
     * Get connectorName
     * @return connectorName
     */
    public String getConnectorName() {
        return connectorName;
    }

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    public ShowSingleConnectionResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get createTime
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowSingleConnectionResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ShowSingleConnectionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowSingleConnectionResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * Get domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowSingleConnectionResponse withHostConfig(Object hostConfig) {
        this.hostConfig = hostConfig;
        return this;
    }

    /**
     * Get hostConfig
     * @return hostConfig
     */
    public Object getHostConfig() {
        return hostConfig;
    }

    public void setHostConfig(Object hostConfig) {
        this.hostConfig = hostConfig;
    }

    public ShowSingleConnectionResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowSingleConnectionResponse withIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
        return this;
    }

    /**
     * Get isOpen
     * @return isOpen
     */
    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    public ShowSingleConnectionResponse withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    /**
     * Get logo
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public ShowSingleConnectionResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get projectId
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowSingleConnectionResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowSingleConnectionResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowSingleConnectionResponse withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Get updatedBy
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public ShowSingleConnectionResponse withUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * Get updatedTime
     * @return updatedTime
     */
    public OffsetDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public ShowSingleConnectionResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSingleConnectionResponse that = (ShowSingleConnectionResponse) obj;
        return Objects.equals(this.authConfig, that.authConfig) && Objects.equals(this.authConfigId, that.authConfigId)
            && Objects.equals(this.authDynamic, that.authDynamic) && Objects.equals(this.authId, that.authId)
            && Objects.equals(this.authInfo, that.authInfo) && Objects.equals(this.authKey, that.authKey)
            && Objects.equals(this.authName, that.authName) && Objects.equals(this.authProp, that.authProp)
            && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.cdmParamsConfig, that.cdmParamsConfig)
            && Objects.equals(this.connectionName, that.connectionName)
            && Objects.equals(this.connectorId, that.connectorId)
            && Objects.equals(this.connectorName, that.connectorName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.description, that.description) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.hostConfig, that.hostConfig) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isOpen, that.isOpen) && Objects.equals(this.logo, that.logo)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.type, that.type) && Objects.equals(this.updatedBy, that.updatedBy)
            && Objects.equals(this.updatedTime, that.updatedTime) && Objects.equals(this.userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authConfig,
            authConfigId,
            authDynamic,
            authId,
            authInfo,
            authKey,
            authName,
            authProp,
            authType,
            cdmParamsConfig,
            connectionName,
            connectorId,
            connectorName,
            createTime,
            createdBy,
            description,
            domainId,
            hostConfig,
            id,
            isOpen,
            logo,
            projectId,
            status,
            type,
            updatedBy,
            updatedTime,
            userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSingleConnectionResponse {\n");
        sb.append("    authConfig: ").append(toIndentedString(authConfig)).append("\n");
        sb.append("    authConfigId: ").append(toIndentedString(authConfigId)).append("\n");
        sb.append("    authDynamic: ").append(toIndentedString(authDynamic)).append("\n");
        sb.append("    authId: ").append(toIndentedString(authId)).append("\n");
        sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
        sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
        sb.append("    authName: ").append(toIndentedString(authName)).append("\n");
        sb.append("    authProp: ").append(toIndentedString(authProp)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    cdmParamsConfig: ").append(toIndentedString(cdmParamsConfig)).append("\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
        sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    hostConfig: ").append(toIndentedString(hostConfig)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
