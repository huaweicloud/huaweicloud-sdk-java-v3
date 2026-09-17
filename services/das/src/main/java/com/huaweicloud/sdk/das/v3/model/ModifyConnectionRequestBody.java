package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改实例连接请求体
 */
public class ModifyConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_save_password")

    private Boolean isSavePassword;

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

    public ModifyConnectionRequestBody withUsername(String username) {
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

    public ModifyConnectionRequestBody withPassword(String password) {
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

    public ModifyConnectionRequestBody withIsSavePassword(Boolean isSavePassword) {
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

    public ModifyConnectionRequestBody withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public ModifyConnectionRequestBody addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public ModifyConnectionRequestBody withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * 节点ID列表
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public ModifyConnectionRequestBody withRemarks(String remarks) {
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

    public ModifyConnectionRequestBody withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ModifyConnectionRequestBody withDatabaseName(String databaseName) {
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

    public ModifyConnectionRequestBody withSqlRecordFlag(Boolean sqlRecordFlag) {
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
        ModifyConnectionRequestBody that = (ModifyConnectionRequestBody) obj;
        return Objects.equals(this.username, that.username) && Objects.equals(this.password, that.password)
            && Objects.equals(this.isSavePassword, that.isSavePassword) && Objects.equals(this.nodeIds, that.nodeIds)
            && Objects.equals(this.remarks, that.remarks) && Objects.equals(this.port, that.port)
            && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.sqlRecordFlag, that.sqlRecordFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, isSavePassword, nodeIds, remarks, port, databaseName, sqlRecordFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyConnectionRequestBody {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    isSavePassword: ").append(toIndentedString(isSavePassword)).append("\n");
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
