package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 主键信息
 */
public class PrimaryKey {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key_name")

    private String primaryKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_constraint")

    private Boolean enableConstraint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_sequence")

    private Integer keySequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rely_constraint")

    private Boolean relyConstraint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validate_constraint")

    private Boolean validateConstraint;

    public PrimaryKey withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * catalog名称
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public PrimaryKey withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 列名称
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public PrimaryKey withDatabaseName(String databaseName) {
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

    public PrimaryKey withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名字
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public PrimaryKey withPrimaryKeyName(String primaryKeyName) {
        this.primaryKeyName = primaryKeyName;
        return this;
    }

    /**
     * 主键名称
     * @return primaryKeyName
     */
    public String getPrimaryKeyName() {
        return primaryKeyName;
    }

    public void setPrimaryKeyName(String primaryKeyName) {
        this.primaryKeyName = primaryKeyName;
    }

    public PrimaryKey withEnableConstraint(Boolean enableConstraint) {
        this.enableConstraint = enableConstraint;
        return this;
    }

    /**
     * 是否启用主键
     * @return enableConstraint
     */
    public Boolean getEnableConstraint() {
        return enableConstraint;
    }

    public void setEnableConstraint(Boolean enableConstraint) {
        this.enableConstraint = enableConstraint;
    }

    public PrimaryKey withKeySequence(Integer keySequence) {
        this.keySequence = keySequence;
        return this;
    }

    /**
     * 主键排序顺序
     * minimum: 0
     * @return keySequence
     */
    public Integer getKeySequence() {
        return keySequence;
    }

    public void setKeySequence(Integer keySequence) {
        this.keySequence = keySequence;
    }

    public PrimaryKey withRelyConstraint(Boolean relyConstraint) {
        this.relyConstraint = relyConstraint;
        return this;
    }

    /**
     * 是否被外键依赖
     * @return relyConstraint
     */
    public Boolean getRelyConstraint() {
        return relyConstraint;
    }

    public void setRelyConstraint(Boolean relyConstraint) {
        this.relyConstraint = relyConstraint;
    }

    public PrimaryKey withValidateConstraint(Boolean validateConstraint) {
        this.validateConstraint = validateConstraint;
        return this;
    }

    /**
     * 限制条件是否可用
     * @return validateConstraint
     */
    public Boolean getValidateConstraint() {
        return validateConstraint;
    }

    public void setValidateConstraint(Boolean validateConstraint) {
        this.validateConstraint = validateConstraint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrimaryKey primaryKey = (PrimaryKey) o;
        return Objects.equals(this.catalogName, primaryKey.catalogName)
            && Objects.equals(this.columnName, primaryKey.columnName)
            && Objects.equals(this.databaseName, primaryKey.databaseName)
            && Objects.equals(this.tableName, primaryKey.tableName)
            && Objects.equals(this.primaryKeyName, primaryKey.primaryKeyName)
            && Objects.equals(this.enableConstraint, primaryKey.enableConstraint)
            && Objects.equals(this.keySequence, primaryKey.keySequence)
            && Objects.equals(this.relyConstraint, primaryKey.relyConstraint)
            && Objects.equals(this.validateConstraint, primaryKey.validateConstraint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogName,
            columnName,
            databaseName,
            tableName,
            primaryKeyName,
            enableConstraint,
            keySequence,
            relyConstraint,
            validateConstraint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrimaryKey {\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    primaryKeyName: ").append(toIndentedString(primaryKeyName)).append("\n");
        sb.append("    enableConstraint: ").append(toIndentedString(enableConstraint)).append("\n");
        sb.append("    keySequence: ").append(toIndentedString(keySequence)).append("\n");
        sb.append("    relyConstraint: ").append(toIndentedString(relyConstraint)).append("\n");
        sb.append("    validateConstraint: ").append(toIndentedString(validateConstraint)).append("\n");
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
