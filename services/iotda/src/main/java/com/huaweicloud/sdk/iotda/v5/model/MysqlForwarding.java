package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MySql配置信息
 */
public class MysqlForwarding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private NetAddress address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ssl")

    private Boolean enableSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_mappings")

    private List<ColumnMapping> columnMappings = null;

    public MysqlForwarding withAddress(NetAddress address) {
        this.address = address;
        return this;
    }

    public MysqlForwarding withAddress(Consumer<NetAddress> addressSetter) {
        if (this.address == null) {
            this.address = new NetAddress();
            addressSetter.accept(this.address);
        }

        return this;
    }

    /**
     * Get address
     * @return address
     */
    public NetAddress getAddress() {
        return address;
    }

    public void setAddress(NetAddress address) {
        this.address = address;
    }

    public MysqlForwarding withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * **参数说明**：连接MYSQL数据库的库名。 **取值范围**：长度不超过64，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public MysqlForwarding withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数说明**：连接MYSQL数据库的用户名
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MysqlForwarding withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数说明**：连接MYSQL数据库的密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MysqlForwarding withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * **参数说明**：客户端是否使用SSL连接服务端，默认为true
     * @return enableSsl
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public MysqlForwarding withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * **参数说明**：MYSQL数据库的表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public MysqlForwarding withColumnMappings(List<ColumnMapping> columnMappings) {
        this.columnMappings = columnMappings;
        return this;
    }

    public MysqlForwarding addColumnMappingsItem(ColumnMapping columnMappingsItem) {
        if (this.columnMappings == null) {
            this.columnMappings = new ArrayList<>();
        }
        this.columnMappings.add(columnMappingsItem);
        return this;
    }

    public MysqlForwarding withColumnMappings(Consumer<List<ColumnMapping>> columnMappingsSetter) {
        if (this.columnMappings == null) {
            this.columnMappings = new ArrayList<>();
        }
        columnMappingsSetter.accept(this.columnMappings);
        return this;
    }

    /**
     * **参数说明**：MYSQL数据库的列和流转数据的对应关系列表。
     * @return columnMappings
     */
    public List<ColumnMapping> getColumnMappings() {
        return columnMappings;
    }

    public void setColumnMappings(List<ColumnMapping> columnMappings) {
        this.columnMappings = columnMappings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MysqlForwarding that = (MysqlForwarding) obj;
        return Objects.equals(this.address, that.address) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.username, that.username) && Objects.equals(this.password, that.password)
            && Objects.equals(this.enableSsl, that.enableSsl) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.columnMappings, that.columnMappings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, dbName, username, password, enableSsl, tableName, columnMappings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlForwarding {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    columnMappings: ").append(toIndentedString(columnMappings)).append("\n");
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
