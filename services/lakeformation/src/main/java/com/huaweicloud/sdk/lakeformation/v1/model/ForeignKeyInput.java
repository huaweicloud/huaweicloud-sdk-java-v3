package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ForeignKeyInput
 */
public class ForeignKeyInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_key_database_name")

    private String parentKeyDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_key_table_name")

    private String parentKeyTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_key_column_name")

    private String parentKeyColumnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_key_name")

    private String parentKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "foreign_key_column_name")

    private String foreignKeyColumnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "foreign_key_name")

    private String foreignKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_rule")

    private Integer deleteRule;

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
    @JsonProperty(value = "update_rule")

    private Integer updateRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validate_constraint")

    private Boolean validateConstraint;

    public ForeignKeyInput withParentKeyDatabaseName(String parentKeyDatabaseName) {
        this.parentKeyDatabaseName = parentKeyDatabaseName;
        return this;
    }

    /**
     * 被引用表的数据库名
     * @return parentKeyDatabaseName
     */
    public String getParentKeyDatabaseName() {
        return parentKeyDatabaseName;
    }

    public void setParentKeyDatabaseName(String parentKeyDatabaseName) {
        this.parentKeyDatabaseName = parentKeyDatabaseName;
    }

    public ForeignKeyInput withParentKeyTableName(String parentKeyTableName) {
        this.parentKeyTableName = parentKeyTableName;
        return this;
    }

    /**
     * 被引用表的表名
     * @return parentKeyTableName
     */
    public String getParentKeyTableName() {
        return parentKeyTableName;
    }

    public void setParentKeyTableName(String parentKeyTableName) {
        this.parentKeyTableName = parentKeyTableName;
    }

    public ForeignKeyInput withParentKeyColumnName(String parentKeyColumnName) {
        this.parentKeyColumnName = parentKeyColumnName;
        return this;
    }

    /**
     * 被引用列名
     * @return parentKeyColumnName
     */
    public String getParentKeyColumnName() {
        return parentKeyColumnName;
    }

    public void setParentKeyColumnName(String parentKeyColumnName) {
        this.parentKeyColumnName = parentKeyColumnName;
    }

    public ForeignKeyInput withParentKeyName(String parentKeyName) {
        this.parentKeyName = parentKeyName;
        return this;
    }

    /**
     * 被引用键名称
     * @return parentKeyName
     */
    public String getParentKeyName() {
        return parentKeyName;
    }

    public void setParentKeyName(String parentKeyName) {
        this.parentKeyName = parentKeyName;
    }

    public ForeignKeyInput withForeignKeyColumnName(String foreignKeyColumnName) {
        this.foreignKeyColumnName = foreignKeyColumnName;
        return this;
    }

    /**
     * 引用列名
     * @return foreignKeyColumnName
     */
    public String getForeignKeyColumnName() {
        return foreignKeyColumnName;
    }

    public void setForeignKeyColumnName(String foreignKeyColumnName) {
        this.foreignKeyColumnName = foreignKeyColumnName;
    }

    public ForeignKeyInput withForeignKeyName(String foreignKeyName) {
        this.foreignKeyName = foreignKeyName;
        return this;
    }

    /**
     * 外键名称
     * @return foreignKeyName
     */
    public String getForeignKeyName() {
        return foreignKeyName;
    }

    public void setForeignKeyName(String foreignKeyName) {
        this.foreignKeyName = foreignKeyName;
    }

    public ForeignKeyInput withDeleteRule(Integer deleteRule) {
        this.deleteRule = deleteRule;
        return this;
    }

    /**
     * 当被引用表中被引用的记录被删除，本表中对应记录的删除规则
     * @return deleteRule
     */
    public Integer getDeleteRule() {
        return deleteRule;
    }

    public void setDeleteRule(Integer deleteRule) {
        this.deleteRule = deleteRule;
    }

    public ForeignKeyInput withEnableConstraint(Boolean enableConstraint) {
        this.enableConstraint = enableConstraint;
        return this;
    }

    /**
     * 外键是否启用
     * @return enableConstraint
     */
    public Boolean getEnableConstraint() {
        return enableConstraint;
    }

    public void setEnableConstraint(Boolean enableConstraint) {
        this.enableConstraint = enableConstraint;
    }

    public ForeignKeyInput withKeySequence(Integer keySequence) {
        this.keySequence = keySequence;
        return this;
    }

    /**
     * 外键排列规则
     * @return keySequence
     */
    public Integer getKeySequence() {
        return keySequence;
    }

    public void setKeySequence(Integer keySequence) {
        this.keySequence = keySequence;
    }

    public ForeignKeyInput withRelyConstraint(Boolean relyConstraint) {
        this.relyConstraint = relyConstraint;
        return this;
    }

    /**
     * is foreign Key rely
     * @return relyConstraint
     */
    public Boolean getRelyConstraint() {
        return relyConstraint;
    }

    public void setRelyConstraint(Boolean relyConstraint) {
        this.relyConstraint = relyConstraint;
    }

    public ForeignKeyInput withUpdateRule(Integer updateRule) {
        this.updateRule = updateRule;
        return this;
    }

    /**
     * 当被引用表中被引用的记录被修改，本表中对应记录的更新规则
     * @return updateRule
     */
    public Integer getUpdateRule() {
        return updateRule;
    }

    public void setUpdateRule(Integer updateRule) {
        this.updateRule = updateRule;
    }

    public ForeignKeyInput withValidateConstraint(Boolean validateConstraint) {
        this.validateConstraint = validateConstraint;
        return this;
    }

    /**
     * 外键是否可用
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
        ForeignKeyInput that = (ForeignKeyInput) obj;
        return Objects.equals(this.parentKeyDatabaseName, that.parentKeyDatabaseName)
            && Objects.equals(this.parentKeyTableName, that.parentKeyTableName)
            && Objects.equals(this.parentKeyColumnName, that.parentKeyColumnName)
            && Objects.equals(this.parentKeyName, that.parentKeyName)
            && Objects.equals(this.foreignKeyColumnName, that.foreignKeyColumnName)
            && Objects.equals(this.foreignKeyName, that.foreignKeyName)
            && Objects.equals(this.deleteRule, that.deleteRule)
            && Objects.equals(this.enableConstraint, that.enableConstraint)
            && Objects.equals(this.keySequence, that.keySequence)
            && Objects.equals(this.relyConstraint, that.relyConstraint)
            && Objects.equals(this.updateRule, that.updateRule)
            && Objects.equals(this.validateConstraint, that.validateConstraint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentKeyDatabaseName,
            parentKeyTableName,
            parentKeyColumnName,
            parentKeyName,
            foreignKeyColumnName,
            foreignKeyName,
            deleteRule,
            enableConstraint,
            keySequence,
            relyConstraint,
            updateRule,
            validateConstraint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForeignKeyInput {\n");
        sb.append("    parentKeyDatabaseName: ").append(toIndentedString(parentKeyDatabaseName)).append("\n");
        sb.append("    parentKeyTableName: ").append(toIndentedString(parentKeyTableName)).append("\n");
        sb.append("    parentKeyColumnName: ").append(toIndentedString(parentKeyColumnName)).append("\n");
        sb.append("    parentKeyName: ").append(toIndentedString(parentKeyName)).append("\n");
        sb.append("    foreignKeyColumnName: ").append(toIndentedString(foreignKeyColumnName)).append("\n");
        sb.append("    foreignKeyName: ").append(toIndentedString(foreignKeyName)).append("\n");
        sb.append("    deleteRule: ").append(toIndentedString(deleteRule)).append("\n");
        sb.append("    enableConstraint: ").append(toIndentedString(enableConstraint)).append("\n");
        sb.append("    keySequence: ").append(toIndentedString(keySequence)).append("\n");
        sb.append("    relyConstraint: ").append(toIndentedString(relyConstraint)).append("\n");
        sb.append("    updateRule: ").append(toIndentedString(updateRule)).append("\n");
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
