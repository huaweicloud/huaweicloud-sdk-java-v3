package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AuditSqlResponseSqlOperatedObjInfo
 */
public class AuditSqlResponseSqlOperatedObjInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_name")

    private String sysName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    public AuditSqlResponseSqlOperatedObjInfo withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 列名
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public AuditSqlResponseSqlOperatedObjInfo withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 操作对象类型
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public AuditSqlResponseSqlOperatedObjInfo withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public AuditSqlResponseSqlOperatedObjInfo withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * sql类型
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public AuditSqlResponseSqlOperatedObjInfo withSysName(String sysName) {
        this.sysName = sysName;
        return this;
    }

    /**
     * 系统名称
     * @return sysName
     */
    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public AuditSqlResponseSqlOperatedObjInfo withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditSqlResponseSqlOperatedObjInfo that = (AuditSqlResponseSqlOperatedObjInfo) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.objectType, that.objectType)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.sqlType, that.sqlType)
            && Objects.equals(this.sysName, that.sysName) && Objects.equals(this.tableName, that.tableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, objectType, schemaName, sqlType, sysName, tableName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditSqlResponseSqlOperatedObjInfo {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    sysName: ").append(toIndentedString(sysName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
