package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IssueRecordV4Details
 */
public class IssueRecordV4Details {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property")

    private String property;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_value")

    private String oldValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_value")

    private String newValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public IssueRecordV4Details withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * 操作属性
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public IssueRecordV4Details withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     * 上次的记录
     * @return oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public IssueRecordV4Details withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     * 当前值
     * @return newValue
     */
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public IssueRecordV4Details withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public IssueRecordV4Details withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 操作记录的id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IssueRecordV4Details withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 操作的字段
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueRecordV4Details issueRecordV4Details = (IssueRecordV4Details) o;
        return Objects.equals(this.property, issueRecordV4Details.property)
            && Objects.equals(this.oldValue, issueRecordV4Details.oldValue)
            && Objects.equals(this.newValue, issueRecordV4Details.newValue)
            && Objects.equals(this.operation, issueRecordV4Details.operation)
            && Objects.equals(this.id, issueRecordV4Details.id) && Objects.equals(this.name, issueRecordV4Details.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(property, oldValue, newValue, operation, id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueRecordV4Details {\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
