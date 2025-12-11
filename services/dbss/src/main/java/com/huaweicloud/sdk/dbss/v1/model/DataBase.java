package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库信息
 */
public class DataBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charset")

    private String charset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_status")

    private String auditStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_url")

    private List<String> agentUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_classification")

    private String dbClassification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_audit_switch_mismatch")

    private Boolean rdsAuditSwitchMismatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_id")

    private String rdsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_obj_info")

    private String rdsObjInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dws_obj_info")

    private String dwsObjInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clouddb_obj_info")

    private String clouddbObjInfo;

    public DataBase withId(String id) {
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

    public DataBase withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataBase withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 添加的数据库类型： - MYSQL：MySQL - ORACLE：Oracle - POSTGRESQL: PostgreSQL - SQLSERVER: SqlServer - DAMENG: Dameng - TAURUS: Taurus - DWS: Dws - KINGBASE: Kingbase - GAUSSDBOPENGAUSS：GaussDB(for openGauss) - GREENPLUM：Greenplum - HIGHGO：HighGo - SHENTONG：ShenTong - GBASE8A：GBase 8a - GBASE8S：GBase 8s - GBASEXDM：GBase XDM - MONGODB：MongoDB - DDS：DDS（Document Database Service）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DataBase withVersion(String version) {
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

    public DataBase withCharset(String charset) {
        this.charset = charset;
        return this;
    }

    /**
     * 数据库字符集 - GBK：GBK - UTF8：UTF8
     * @return charset
     */
    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public DataBase withIp(String ip) {
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

    public DataBase withPort(String port) {
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

    public DataBase withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * 数据库操作系统
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public DataBase withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态 - ON :开启 - OFF : 关闭
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataBase withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 数据库实例名
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public DataBase withAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }

    /**
     * 数据库的运行状态 - ACTIVE：运行中 - SHUTOFF：已关闭 - ERROR：故障
     * @return auditStatus
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public DataBase withAgentUrl(List<String> agentUrl) {
        this.agentUrl = agentUrl;
        return this;
    }

    public DataBase addAgentUrlItem(String agentUrlItem) {
        if (this.agentUrl == null) {
            this.agentUrl = new ArrayList<>();
        }
        this.agentUrl.add(agentUrlItem);
        return this;
    }

    public DataBase withAgentUrl(Consumer<List<String>> agentUrlSetter) {
        if (this.agentUrl == null) {
            this.agentUrl = new ArrayList<>();
        }
        agentUrlSetter.accept(this.agentUrl);
        return this;
    }

    /**
     * agent的唯一ID
     * @return agentUrl
     */
    public List<String> getAgentUrl() {
        return agentUrl;
    }

    public void setAgentUrl(List<String> agentUrl) {
        this.agentUrl = agentUrl;
    }

    public DataBase withDbClassification(String dbClassification) {
        this.dbClassification = dbClassification;
        return this;
    }

    /**
     * 数据库分类 - RDS: 表示RDS数据库 - ECS: 自建数据库
     * @return dbClassification
     */
    public String getDbClassification() {
        return dbClassification;
    }

    public void setDbClassification(String dbClassification) {
        this.dbClassification = dbClassification;
    }

    public DataBase withRdsAuditSwitchMismatch(Boolean rdsAuditSwitchMismatch) {
        this.rdsAuditSwitchMismatch = rdsAuditSwitchMismatch;
        return this;
    }

    /**
     * rds实例审计开关状态不匹配。当数据库审计开启且rds侧日志上传开关关闭时该字段为true。
     * @return rdsAuditSwitchMismatch
     */
    public Boolean getRdsAuditSwitchMismatch() {
        return rdsAuditSwitchMismatch;
    }

    public void setRdsAuditSwitchMismatch(Boolean rdsAuditSwitchMismatch) {
        this.rdsAuditSwitchMismatch = rdsAuditSwitchMismatch;
    }

    public DataBase withRdsId(String rdsId) {
        this.rdsId = rdsId;
        return this;
    }

    /**
     * RDS数据库的ID。
     * @return rdsId
     */
    public String getRdsId() {
        return rdsId;
    }

    public void setRdsId(String rdsId) {
        this.rdsId = rdsId;
    }

    public DataBase withRdsObjInfo(String rdsObjInfo) {
        this.rdsObjInfo = rdsObjInfo;
        return this;
    }

    /**
     * RDS数据库信息。
     * @return rdsObjInfo
     */
    public String getRdsObjInfo() {
        return rdsObjInfo;
    }

    public void setRdsObjInfo(String rdsObjInfo) {
        this.rdsObjInfo = rdsObjInfo;
    }

    public DataBase withDwsObjInfo(String dwsObjInfo) {
        this.dwsObjInfo = dwsObjInfo;
        return this;
    }

    /**
     * DWS数据库信息。
     * @return dwsObjInfo
     */
    public String getDwsObjInfo() {
        return dwsObjInfo;
    }

    public void setDwsObjInfo(String dwsObjInfo) {
        this.dwsObjInfo = dwsObjInfo;
    }

    public DataBase withClouddbObjInfo(String clouddbObjInfo) {
        this.clouddbObjInfo = clouddbObjInfo;
        return this;
    }

    /**
     * 云数据库信息，该字段已废弃。
     * @return clouddbObjInfo
     */
    public String getClouddbObjInfo() {
        return clouddbObjInfo;
    }

    public void setClouddbObjInfo(String clouddbObjInfo) {
        this.clouddbObjInfo = clouddbObjInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataBase that = (DataBase) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.charset, that.charset) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.port, that.port) && Objects.equals(this.os, that.os)
            && Objects.equals(this.status, that.status) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.auditStatus, that.auditStatus) && Objects.equals(this.agentUrl, that.agentUrl)
            && Objects.equals(this.dbClassification, that.dbClassification)
            && Objects.equals(this.rdsAuditSwitchMismatch, that.rdsAuditSwitchMismatch)
            && Objects.equals(this.rdsId, that.rdsId) && Objects.equals(this.rdsObjInfo, that.rdsObjInfo)
            && Objects.equals(this.dwsObjInfo, that.dwsObjInfo)
            && Objects.equals(this.clouddbObjInfo, that.clouddbObjInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            version,
            charset,
            ip,
            port,
            os,
            status,
            instanceName,
            auditStatus,
            agentUrl,
            dbClassification,
            rdsAuditSwitchMismatch,
            rdsId,
            rdsObjInfo,
            dwsObjInfo,
            clouddbObjInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataBase {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
        sb.append("    agentUrl: ").append(toIndentedString(agentUrl)).append("\n");
        sb.append("    dbClassification: ").append(toIndentedString(dbClassification)).append("\n");
        sb.append("    rdsAuditSwitchMismatch: ").append(toIndentedString(rdsAuditSwitchMismatch)).append("\n");
        sb.append("    rdsId: ").append(toIndentedString(rdsId)).append("\n");
        sb.append("    rdsObjInfo: ").append(toIndentedString(rdsObjInfo)).append("\n");
        sb.append("    dwsObjInfo: ").append(toIndentedString(dwsObjInfo)).append("\n");
        sb.append("    clouddbObjInfo: ").append(toIndentedString(clouddbObjInfo)).append("\n");
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
