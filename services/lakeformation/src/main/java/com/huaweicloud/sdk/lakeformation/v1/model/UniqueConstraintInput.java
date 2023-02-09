package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UniqueConstraintInput
 */
public class UniqueConstraintInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraint_name")

    private String constraintName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_sequence")

    private Integer keySequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_constraint")

    private Boolean enableConstraint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rely_constraint")

    private Boolean relyConstraint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validate_constraint")

    private Boolean validateConstraint;

    public UniqueConstraintInput withColumnName(String columnName) {
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

    public UniqueConstraintInput withConstraintName(String constraintName) {
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

    public UniqueConstraintInput withKeySequence(Integer keySequence) {
        this.keySequence = keySequence;
        return this;
    }

    /**
     * 列序号（限制条件中第几位）
     * @return keySequence
     */
    public Integer getKeySequence() {
        return keySequence;
    }

    public void setKeySequence(Integer keySequence) {
        this.keySequence = keySequence;
    }

    public UniqueConstraintInput withEnableConstraint(Boolean enableConstraint) {
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

    public UniqueConstraintInput withRelyConstraint(Boolean relyConstraint) {
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

    public UniqueConstraintInput withValidateConstraint(Boolean validateConstraint) {
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
        UniqueConstraintInput uniqueConstraintInput = (UniqueConstraintInput) o;
        return Objects.equals(this.columnName, uniqueConstraintInput.columnName)
            && Objects.equals(this.constraintName, uniqueConstraintInput.constraintName)
            && Objects.equals(this.keySequence, uniqueConstraintInput.keySequence)
            && Objects.equals(this.enableConstraint, uniqueConstraintInput.enableConstraint)
            && Objects.equals(this.relyConstraint, uniqueConstraintInput.relyConstraint)
            && Objects.equals(this.validateConstraint, uniqueConstraintInput.validateConstraint);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(columnName, constraintName, keySequence, enableConstraint, relyConstraint, validateConstraint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UniqueConstraintInput {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    constraintName: ").append(toIndentedString(constraintName)).append("\n");
        sb.append("    keySequence: ").append(toIndentedString(keySequence)).append("\n");
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
