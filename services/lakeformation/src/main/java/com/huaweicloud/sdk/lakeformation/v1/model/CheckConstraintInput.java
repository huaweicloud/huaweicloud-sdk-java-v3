package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckConstraintInput
 */
public class CheckConstraintInput {

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

    public CheckConstraintInput withColumnName(String columnName) {
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

    public CheckConstraintInput withConstraintName(String constraintName) {
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

    public CheckConstraintInput withCheckExpression(String checkExpression) {
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

    public CheckConstraintInput withEnableConstraint(Boolean enableConstraint) {
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

    public CheckConstraintInput withRelyConstraint(Boolean relyConstraint) {
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

    public CheckConstraintInput withValidateConstraint(Boolean validateConstraint) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckConstraintInput that = (CheckConstraintInput) obj;
        return Objects.equals(this.columnName, that.columnName)
            && Objects.equals(this.constraintName, that.constraintName)
            && Objects.equals(this.checkExpression, that.checkExpression)
            && Objects.equals(this.enableConstraint, that.enableConstraint)
            && Objects.equals(this.relyConstraint, that.relyConstraint)
            && Objects.equals(this.validateConstraint, that.validateConstraint);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(columnName, constraintName, checkExpression, enableConstraint, relyConstraint, validateConstraint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckConstraintInput {\n");
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
