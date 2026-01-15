package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RiskBackupTemplateBean
 */
public class RiskBackupTemplateBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_id")

    private String dbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ip")

    private String dbIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_port")

    private Integer dbPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public RiskBackupTemplateBean withDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * 数据库ID
     * @return dbId
     */
    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public RiskBackupTemplateBean withDbIp(String dbIp) {
        this.dbIp = dbIp;
        return this;
    }

    /**
     * 数据库IP
     * @return dbIp
     */
    public String getDbIp() {
        return dbIp;
    }

    public void setDbIp(String dbIp) {
        this.dbIp = dbIp;
    }

    public RiskBackupTemplateBean withDbName(String dbName) {
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

    public RiskBackupTemplateBean withDbPort(Integer dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * 数据库端口
     * @return dbPort
     */
    public Integer getDbPort() {
        return dbPort;
    }

    public void setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
    }

    public RiskBackupTemplateBean withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 配置ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RiskBackupTemplateBean withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态 - 0：关闭 - 1：开启
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RiskBackupTemplateBean that = (RiskBackupTemplateBean) obj;
        return Objects.equals(this.dbId, that.dbId) && Objects.equals(this.dbIp, that.dbIp)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.dbPort, that.dbPort)
            && Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, dbIp, dbName, dbPort, id, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RiskBackupTemplateBean {\n");
        sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
        sb.append("    dbIp: ").append(toIndentedString(dbIp)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    dbPort: ").append(toIndentedString(dbPort)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
