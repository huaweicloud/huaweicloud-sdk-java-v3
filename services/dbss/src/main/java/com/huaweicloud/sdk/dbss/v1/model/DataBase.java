package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库信息
 */
public class DataBase  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charset")
    
    
    private String charset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip")
    
    
    private String ip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    
    private String port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os")
    
    
    private String os;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    
    
    private String instanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audit_status")
    
    
    private String auditStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agent_url")
    
    
    private List<String> agentUrl = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_classification")
    
    
    private String dbClassification;

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
     * 添加的数据库类型： 枚举值：  MYSQL  ORACLE  POSTGRESQL  SQLSERVER  DAMENG  TAURUS  DWS  KINGBASE  GAUSSDBOPENGAUSS   GREENPLUM   HIGHGO   SHENTONG   GBASE8A   GBASE8S   GBASEXDM   MONGODB   DDS
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
     * 数据库字符集
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
     * 开启状态（1：开启，0：关闭）
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
     * 数据库的运行状态 枚举值：  ACTIVE  SHUTOFF  ERROR
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
        if(this.agentUrl == null) {
            this.agentUrl = new ArrayList<>();
        }
        this.agentUrl.add(agentUrlItem);
        return this;
    }

    public DataBase withAgentUrl(Consumer<List<String>> agentUrlSetter) {
        if(this.agentUrl == null) {
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
     * 数据库分类，取值范围： RDS（表示RDS数据库）和 ECS（自建数据库）
     * @return dbClassification
     */
    public String getDbClassification() {
        return dbClassification;
    }

    public void setDbClassification(String dbClassification) {
        this.dbClassification = dbClassification;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataBase dataBase = (DataBase) o;
        return Objects.equals(this.id, dataBase.id) &&
            Objects.equals(this.name, dataBase.name) &&
            Objects.equals(this.type, dataBase.type) &&
            Objects.equals(this.version, dataBase.version) &&
            Objects.equals(this.charset, dataBase.charset) &&
            Objects.equals(this.ip, dataBase.ip) &&
            Objects.equals(this.port, dataBase.port) &&
            Objects.equals(this.os, dataBase.os) &&
            Objects.equals(this.status, dataBase.status) &&
            Objects.equals(this.instanceName, dataBase.instanceName) &&
            Objects.equals(this.auditStatus, dataBase.auditStatus) &&
            Objects.equals(this.agentUrl, dataBase.agentUrl) &&
            Objects.equals(this.dbClassification, dataBase.dbClassification);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, version, charset, ip, port, os, status, instanceName, auditStatus, agentUrl, dbClassification);
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

