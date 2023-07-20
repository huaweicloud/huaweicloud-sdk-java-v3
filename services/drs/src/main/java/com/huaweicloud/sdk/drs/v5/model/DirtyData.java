package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 异常数据。
 */
public class DirtyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_sql")

    private String errorSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_time")

    private String errorTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public DirtyData withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DirtyData withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * 模式名称。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public DirtyData withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DirtyData withErrorSql(String errorSql) {
        this.errorSql = errorSql;
        return this;
    }

    /**
     * 异常SQL。
     * @return errorSql
     */
    public String getErrorSql() {
        return errorSql;
    }

    public void setErrorSql(String errorSql) {
        this.errorSql = errorSql;
    }

    public DirtyData withErrorTime(String errorTime) {
        this.errorTime = errorTime;
        return this;
    }

    /**
     * 发生异常时间，UTC时间，例如：2023-06-10T03:01:52Z
     * @return errorTime
     */
    public String getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(String errorTime) {
        this.errorTime = errorTime;
    }

    public DirtyData withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 异常信息。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirtyData that = (DirtyData) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.errorSql, that.errorSql)
            && Objects.equals(this.errorTime, that.errorTime) && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, schemaName, tableName, errorSql, errorTime, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirtyData {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    errorSql: ").append(toIndentedString(errorSql)).append("\n");
        sb.append("    errorTime: ").append(toIndentedString(errorTime)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
