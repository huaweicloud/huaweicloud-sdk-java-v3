package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RestoreTableListDetail
 */
public class RestoreTableListDetail {

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
    @JsonProperty(value = "new_db_name")

    private String newDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_schema_name")

    private String newSchemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_table_name")

    private String newTableName;

    public RestoreTableListDetail withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 库名参数必传
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public RestoreTableListDetail withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名  备份恢复到新实例和当前实例：使用DATABASE_TABLE级别恢复参数必传, 使用DATABASE类型恢复参数无效。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public RestoreTableListDetail withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名  备份恢复到新实例和当前实例：使用DATABASE_TABLE级别恢复参数必传, 使用DATABASE类型恢复参数无效。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public RestoreTableListDetail withNewDbName(String newDbName) {
        this.newDbName = newDbName;
        return this;
    }

    /**
     * 新库名  备份恢复到新实例和当前实例：   使用DATABASE级别恢复：需注意目标实例不存在当前一样的库名，否则无法下发。   使用DATABASE_TABLE级别恢复，不填时与源库名一致。
     * @return newDbName
     */
    public String getNewDbName() {
        return newDbName;
    }

    public void setNewDbName(String newDbName) {
        this.newDbName = newDbName;
    }

    public RestoreTableListDetail withNewSchemaName(String newSchemaName) {
        this.newSchemaName = newSchemaName;
        return this;
    }

    /**
     * 新schema_name  备份恢复到新实例和当前实例：    使用DATABASE类型恢复参数无效。   使用DATABASE_TABLE级别恢复，不填时与源schema名一致。
     * @return newSchemaName
     */
    public String getNewSchemaName() {
        return newSchemaName;
    }

    public void setNewSchemaName(String newSchemaName) {
        this.newSchemaName = newSchemaName;
    }

    public RestoreTableListDetail withNewTableName(String newTableName) {
        this.newTableName = newTableName;
        return this;
    }

    /**
     * 新表名  备份恢复到新实例和当前实例：   使用DATABASE类型恢复参数无效。   使用DATABASE_TABLE级别恢复，需注意目标实例里不存在当前的表名，否则无法下发。
     * @return newTableName
     */
    public String getNewTableName() {
        return newTableName;
    }

    public void setNewTableName(String newTableName) {
        this.newTableName = newTableName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreTableListDetail that = (RestoreTableListDetail) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.newDbName, that.newDbName)
            && Objects.equals(this.newSchemaName, that.newSchemaName)
            && Objects.equals(this.newTableName, that.newTableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, schemaName, tableName, newDbName, newSchemaName, newTableName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreTableListDetail {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    newDbName: ").append(toIndentedString(newDbName)).append("\n");
        sb.append("    newSchemaName: ").append(toIndentedString(newSchemaName)).append("\n");
        sb.append("    newTableName: ").append(toIndentedString(newTableName)).append("\n");
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
