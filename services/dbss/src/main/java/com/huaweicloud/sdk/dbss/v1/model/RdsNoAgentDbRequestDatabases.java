package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RdsNoAgentDbRequestDatabases
 */
public class RdsNoAgentDbRequestDatabases {

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
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_id")

    private String enterpriseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_name")

    private String enterpriseName;

    public RdsNoAgentDbRequestDatabases withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RdsNoAgentDbRequestDatabases withDbName(String dbName) {
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

    public RdsNoAgentDbRequestDatabases withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 数据库状态 - ON：启用 - OFF：关闭
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RdsNoAgentDbRequestDatabases withPort(String port) {
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

    public RdsNoAgentDbRequestDatabases withIp(String ip) {
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

    public RdsNoAgentDbRequestDatabases withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 数据库实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public RdsNoAgentDbRequestDatabases withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 数据库版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public RdsNoAgentDbRequestDatabases withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库类型 - MYSQL：MySQL - ORACLE：Oracle - POSTGRESQL：PostgreSQL - TAURUS：Taurus DB - DWS：GaussDB(DWS) - GAUSSDBOPENGAUSS：GaussDB/openGauss - DDS：DDS(MongoDB)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RdsNoAgentDbRequestDatabases withEnterpriseId(String enterpriseId) {
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

    public RdsNoAgentDbRequestDatabases withEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }

    /**
     * 企业项目名称
     * @return enterpriseName
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdsNoAgentDbRequestDatabases that = (RdsNoAgentDbRequestDatabases) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.port, that.port)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.version, that.version) && Objects.equals(this.type, that.type)
            && Objects.equals(this.enterpriseId, that.enterpriseId)
            && Objects.equals(this.enterpriseName, that.enterpriseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dbName, status, port, ip, instanceName, version, type, enterpriseId, enterpriseName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RdsNoAgentDbRequestDatabases {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
        sb.append("    enterpriseName: ").append(toIndentedString(enterpriseName)).append("\n");
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
