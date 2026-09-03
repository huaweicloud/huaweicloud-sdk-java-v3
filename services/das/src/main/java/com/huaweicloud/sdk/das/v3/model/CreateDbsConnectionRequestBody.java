package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DBS连接请求体
 */
public class CreateDbsConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private String networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_save_password")

    private Boolean isSavePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_record_flag")

    private Boolean sqlRecordFlag;

    public CreateDbsConnectionRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎类型，取值范围：mysql, sqlserver, postgresql, taurus, gaussdbv5, mongodb, ddm
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public CreateDbsConnectionRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，实例的唯一标识
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateDbsConnectionRequestBody withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 数据库来源类型，取值范围：rds, gaussdb, dds, ddm
     * @return networkType
     */
    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public CreateDbsConnectionRequestBody withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public CreateDbsConnectionRequestBody withIsSavePassword(Boolean isSavePassword) {
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

    public CreateDbsConnectionRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateDbsConnectionRequestBody withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public CreateDbsConnectionRequestBody addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public CreateDbsConnectionRequestBody withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * 节点ID列表，实例节点的唯一标识
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public CreateDbsConnectionRequestBody withRemarks(String remarks) {
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

    public CreateDbsConnectionRequestBody withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口，取值范围：[1,65536]
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public CreateDbsConnectionRequestBody withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名字
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public CreateDbsConnectionRequestBody withSqlRecordFlag(Boolean sqlRecordFlag) {
        this.sqlRecordFlag = sqlRecordFlag;
        return this;
    }

    /**
     * SQL记录开关
     * @return sqlRecordFlag
     */
    public Boolean getSqlRecordFlag() {
        return sqlRecordFlag;
    }

    public void setSqlRecordFlag(Boolean sqlRecordFlag) {
        this.sqlRecordFlag = sqlRecordFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDbsConnectionRequestBody that = (CreateDbsConnectionRequestBody) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.networkType, that.networkType) && Objects.equals(this.username, that.username)
            && Objects.equals(this.isSavePassword, that.isSavePassword) && Objects.equals(this.password, that.password)
            && Objects.equals(this.nodeIds, that.nodeIds) && Objects.equals(this.remarks, that.remarks)
            && Objects.equals(this.port, that.port) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.sqlRecordFlag, that.sqlRecordFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType,
            instanceId,
            networkType,
            username,
            isSavePassword,
            password,
            nodeIds,
            remarks,
            port,
            databaseName,
            sqlRecordFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDbsConnectionRequestBody {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    isSavePassword: ").append(toIndentedString(isSavePassword)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    sqlRecordFlag: ").append(toIndentedString(sqlRecordFlag)).append("\n");
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
