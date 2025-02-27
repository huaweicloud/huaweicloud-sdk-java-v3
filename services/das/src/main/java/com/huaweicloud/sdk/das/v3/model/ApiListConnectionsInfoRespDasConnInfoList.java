package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApiListConnectionsInfoRespDasConnInfoList
 */
public class ApiListConnectionsInfoRespDasConnInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private String networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version")

    private String datastoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_save_password")

    private Boolean isSavePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conn_share_type")

    private String connShareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_user_name")

    private String sharedUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_user_id")

    private String sharedUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_time")

    private Long expiredTime;

    public ApiListConnectionsInfoRespDasConnInfoList withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 连接Id
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例Id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 数据库来源
     * @return networkType
     */
    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
        return this;
    }

    /**
     * 数据存储版本
     * @return datastoreVersion
     */
    public String getDatastoreVersion() {
        return datastoreVersion;
    }

    public void setDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withUserName(String userName) {
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

    public ApiListConnectionsInfoRespDasConnInfoList withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withIsSavePassword(Boolean isSavePassword) {
        this.isSavePassword = isSavePassword;
        return this;
    }

    /**
     * 是否保存密码
     * @return isSavePassword
     */
    public Boolean getIsSavePassword() {
        return isSavePassword;
    }

    public void setIsSavePassword(Boolean isSavePassword) {
        this.isSavePassword = isSavePassword;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * ip地址
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口号
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 备注
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 连接的创建时间
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，NORMAL-正常，INSTANCE_DELETE-实例删除
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withConnShareType(String connShareType) {
        this.connShareType = connShareType;
        return this;
    }

    /**
     * 连接类型，NORMAL-正常连接，SHARE-共享连接
     * @return connShareType
     */
    public String getConnShareType() {
        return connShareType;
    }

    public void setConnShareType(String connShareType) {
        this.connShareType = connShareType;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withSharedUserName(String sharedUserName) {
        this.sharedUserName = sharedUserName;
        return this;
    }

    /**
     * 共享人名称
     * @return sharedUserName
     */
    public String getSharedUserName() {
        return sharedUserName;
    }

    public void setSharedUserName(String sharedUserName) {
        this.sharedUserName = sharedUserName;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withSharedUserId(String sharedUserId) {
        this.sharedUserId = sharedUserId;
        return this;
    }

    /**
     * 共享人ID
     * @return sharedUserId
     */
    public String getSharedUserId() {
        return sharedUserId;
    }

    public void setSharedUserId(String sharedUserId) {
        this.sharedUserId = sharedUserId;
    }

    public ApiListConnectionsInfoRespDasConnInfoList withExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * 共享过期时间
     * @return expiredTime
     */
    public Long getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiListConnectionsInfoRespDasConnInfoList that = (ApiListConnectionsInfoRespDasConnInfoList) obj;
        return Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.networkType, that.networkType) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.datastoreVersion, that.datastoreVersion)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.isSavePassword, that.isSavePassword)
            && Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.port, that.port)
            && Objects.equals(this.remarks, that.remarks) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.status, that.status) && Objects.equals(this.connShareType, that.connShareType)
            && Objects.equals(this.sharedUserName, that.sharedUserName)
            && Objects.equals(this.sharedUserId, that.sharedUserId)
            && Objects.equals(this.expiredTime, that.expiredTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId,
            instanceId,
            instanceName,
            networkType,
            engineType,
            datastoreVersion,
            userName,
            databaseName,
            isSavePassword,
            ipAddress,
            port,
            remarks,
            createAt,
            status,
            connShareType,
            sharedUserName,
            sharedUserId,
            expiredTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiListConnectionsInfoRespDasConnInfoList {\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    isSavePassword: ").append(toIndentedString(isSavePassword)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    connShareType: ").append(toIndentedString(connShareType)).append("\n");
        sb.append("    sharedUserName: ").append(toIndentedString(sharedUserName)).append("\n");
        sb.append("    sharedUserId: ").append(toIndentedString(sharedUserId)).append("\n");
        sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
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
