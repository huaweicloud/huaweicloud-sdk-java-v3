package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckConstraint
 */
public class CheckConstraint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraint_name")

    private String constraintName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_expression")

    private String checkExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_constraint")

    private Boolean enableConstraint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rely_constraint")

    private Boolean relyConstraint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validate_constraint")

    private Boolean validateConstraint;

    public CheckConstraint withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * catalog名字
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public CheckConstraint withDatabaseName(String databaseName) {
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

    public CheckConstraint withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public CheckConstraint withColumnName(String columnName) {
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

    public CheckConstraint withConstraintName(String constraintName) {
        this.constraintName = constraintName;
        return this;
    }

    /**
     * constraint Name
     * @return constraintName
     */
    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public CheckConstraint withCheckExpression(String checkExpression) {
        this.checkExpression = checkExpression;
        return this;
    }

    /**
     * 检查条件表达式
     * @return checkExpression
     */
    public String getCheckExpression() {
        return checkExpression;
    }

    public void setCheckExpression(String checkExpression) {
        this.checkExpression = checkExpression;
    }

    public CheckConstraint withEnableConstraint(Boolean enableConstraint) {
        this.enableConstraint = enableConstraint;
        return this;
    }

    /**
     * enable constraint
     * @return enableConstraint
     */
    public Boolean getEnableConstraint() {
        return enableConstraint;
    }

    public void setEnableConstraint(Boolean enableConstraint) {
        this.enableConstraint = enableConstraint;
    }

    public CheckConstraint withRelyConstraint(Boolean relyConstraint) {
        this.relyConstraint = relyConstraint;
        return this;
    }

    /**
     * constraint is rely when Query
     * @return relyConstraint
     */
    public Boolean getRelyConstraint() {
        return relyConstraint;
    }

    public void setRelyConstraint(Boolean relyConstraint) {
        this.relyConstraint = relyConstraint;
    }

    public CheckConstraint withValidateConstraint(Boolean validateConstraint) {
        this.validateConstraint = validateConstraint;
        return this;
    }

    /**
     * constraint is validated
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
        CheckConstraint checkConstraint = (CheckConstraint) o;
        return Objects.equals(this.catalogName, checkConstraint.catalogName)
            && Objects.equals(this.databaseName, checkConstraint.databaseName)
            && Objects.equals(this.tableName, checkConstraint.tableName)
            && Objects.equals(this.columnName, checkConstraint.columnName)
            && Objects.equals(this.constraintName, checkConstraint.constraintName)
            && Objects.equals(this.checkExpression, checkConstraint.checkExpression)
            && Objects.equals(this.enableConstraint, checkConstraint.enableConstraint)
            && Objects.equals(this.relyConstraint, checkConstraint.relyConstraint)
            && Objects.equals(this.validateConstraint, checkConstraint.validateConstraint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogName,
            databaseName,
            tableName,
            columnName,
            constraintName,
            checkExpression,
            enableConstraint,
            relyConstraint,
            validateConstraint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckConstraint {\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    constraintName: ").append(toIndentedString(constraintName)).append("\n");
        sb.append("    checkExpression: ").append(toIndentedString(checkExpression)).append("\n");
        sb.append("    enableConstraint: ").append(toIndentedString(enableConstraint)).append("\n");
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
