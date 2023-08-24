package com.huaweicloud.sdk.mssi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 连接配置内容
 */
public class BaseConnectionInfo {

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
    @JsonProperty(value = "auth_info")

    private Object authInfo;

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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_config")

    private Object hostConfig;

    public BaseConnectionInfo withAuthConfig(Object authConfig) {
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

    public BaseConnectionInfo withAuthConfigId(String authConfigId) {
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

    public BaseConnectionInfo withAuthDynamic(Object authDynamic) {
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

    public BaseConnectionInfo withAuthInfo(Object authInfo) {
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

    public BaseConnectionInfo withAuthProp(Object authProp) {
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

    public BaseConnectionInfo withAuthType(String authType) {
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

    public BaseConnectionInfo withCdmParamsConfig(Object cdmParamsConfig) {
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

    public BaseConnectionInfo withConnectionName(String connectionName) {
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

    public BaseConnectionInfo withConnectorId(String connectorId) {
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

    public BaseConnectionInfo withDescription(String description) {
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

    public BaseConnectionInfo withHostConfig(Object hostConfig) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseConnectionInfo that = (BaseConnectionInfo) obj;
        return Objects.equals(this.authConfig, that.authConfig) && Objects.equals(this.authConfigId, that.authConfigId)
            && Objects.equals(this.authDynamic, that.authDynamic) && Objects.equals(this.authInfo, that.authInfo)
            && Objects.equals(this.authProp, that.authProp) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.cdmParamsConfig, that.cdmParamsConfig)
            && Objects.equals(this.connectionName, that.connectionName)
            && Objects.equals(this.connectorId, that.connectorId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.hostConfig, that.hostConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authConfig,
            authConfigId,
            authDynamic,
            authInfo,
            authProp,
            authType,
            cdmParamsConfig,
            connectionName,
            connectorId,
            description,
            hostConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseConnectionInfo {\n");
        sb.append("    authConfig: ").append(toIndentedString(authConfig)).append("\n");
        sb.append("    authConfigId: ").append(toIndentedString(authConfigId)).append("\n");
        sb.append("    authDynamic: ").append(toIndentedString(authDynamic)).append("\n");
        sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
        sb.append("    authProp: ").append(toIndentedString(authProp)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    cdmParamsConfig: ").append(toIndentedString(cdmParamsConfig)).append("\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hostConfig: ").append(toIndentedString(hostConfig)).append("\n");
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
