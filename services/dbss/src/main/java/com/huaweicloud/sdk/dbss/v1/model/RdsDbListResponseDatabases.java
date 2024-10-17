package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RdsDbListResponseDatabases
 */
public class RdsDbListResponseDatabases {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_supported")

    private Boolean isSupported;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_id")

    private String enterpriseId;

    public RdsDbListResponseDatabases withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RdsDbListResponseDatabases withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public RdsDbListResponseDatabases withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态。 - BUILD：表示实例正在创建。 - ACTIVE：表示实例正常。 - FAILED：表示实例异常。 - FROZEN：表示实例冻结。 - MODIFYING：表示实例正在扩容。 - REBOOTING：表示实例正在重启。 - RESTORING：表示实例正在恢复。 - MODIFYING INSTANCE TYPE：表示实例正在转主备。 - SWITCHOVER：表示实例正在主备切换。 - MIGRATING：表示实例正在迁移。 - BACKING UP：表示实例正在进行备份。 - MODIFYING DATABASE PORT：表示实例正在修改数据库端口。 - STORAGE FULL：表示实例磁盘空间满。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RdsDbListResponseDatabases withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 数据库端口
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public RdsDbListResponseDatabases withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 数据库IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public RdsDbListResponseDatabases withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * rds实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public RdsDbListResponseDatabases withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库类型 - MYSQL - ORACLE - POSTGRESQL - SQLSERVER - DAMENG - TAURUS - DWS - KINGBASE - MARIADB - GAUSSDBOPENGAUSS
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RdsDbListResponseDatabases withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public RdsDbListResponseDatabases withIsSupported(Boolean isSupported) {
        this.isSupported = isSupported;
        return this;
    }

    /**
     * 是否支持免agent审计
     * @return isSupported
     */
    public Boolean getIsSupported() {
        return isSupported;
    }

    public void setIsSupported(Boolean isSupported) {
        this.isSupported = isSupported;
    }

    public RdsDbListResponseDatabases withEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseId
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdsDbListResponseDatabases that = (RdsDbListResponseDatabases) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.port, that.port)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.isSupported, that.isSupported)
            && Objects.equals(this.enterpriseId, that.enterpriseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dbName, status, port, ip, instanceName, type, version, isSupported, enterpriseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RdsDbListResponseDatabases {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    isSupported: ").append(toIndentedString(isSupported)).append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
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
