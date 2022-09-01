package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * IssueAttrHistoryRecord
 */
public class IssueAttrHistoryRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_key")

    @JacksonXmlProperty(localName = "field_key")

    private String fieldKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    @JacksonXmlProperty(localName = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    @JacksonXmlProperty(localName = "issue_id")

    private Long issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_value")

    @JacksonXmlProperty(localName = "new_value")

    private String newValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_value")

    @JacksonXmlProperty(localName = "old_value")

    private String oldValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operated_time")

    @JacksonXmlProperty(localName = "operated_time")

    private Long operatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    @JacksonXmlProperty(localName = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    @JacksonXmlProperty(localName = "operator")

    private IssueUser operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property")

    @JacksonXmlProperty(localName = "property")

    private String property;

    public IssueAttrHistoryRecord withFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }

    /**
     * 操作的字段
     * @return fieldKey
     */
    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public IssueAttrHistoryRecord withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * 操作字段的含义
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public IssueAttrHistoryRecord withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 历史记录id
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IssueAttrHistoryRecord withIssueId(Long issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 工作项id
     * @return issueId
     */
    public Long getIssueId() {
        return issueId;
    }

    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    public IssueAttrHistoryRecord withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     * 变更后的值,json字符串
     * @return newValue
     */
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public IssueAttrHistoryRecord withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     * 变更前的值,json字符串
     * @return oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public IssueAttrHistoryRecord withOperatedTime(Long operatedTime) {
        this.operatedTime = operatedTime;
        return this;
    }

    /**
     * 变更的时间
     * @return operatedTime
     */
    public Long getOperatedTime() {
        return operatedTime;
    }

    public void setOperatedTime(Long operatedTime) {
        this.operatedTime = operatedTime;
    }

    public IssueAttrHistoryRecord withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作类型,新建，修改，删除
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public IssueAttrHistoryRecord withOperator(IssueUser operator) {
        this.operator = operator;
        return this;
    }

    public IssueAttrHistoryRecord withOperator(Consumer<IssueUser> operatorSetter) {
        if (this.operator == null) {
            this.operator = new IssueUser();
            operatorSetter.accept(this.operator);
        }

        return this;
    }

    /**
     * Get operator
     * @return operator
     */
    public IssueUser getOperator() {
        return operator;
    }

    public void setOperator(IssueUser operator) {
        this.operator = operator;
    }

    public IssueAttrHistoryRecord withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * 变更的属性
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueAttrHistoryRecord issueAttrHistoryRecord = (IssueAttrHistoryRecord) o;
        return Objects.equals(this.fieldKey, issueAttrHistoryRecord.fieldKey)
            && Objects.equals(this.fieldName, issueAttrHistoryRecord.fieldName)
            && Objects.equals(this.id, issueAttrHistoryRecord.id)
            && Objects.equals(this.issueId, issueAttrHistoryRecord.issueId)
            && Objects.equals(this.newValue, issueAttrHistoryRecord.newValue)
            && Objects.equals(this.oldValue, issueAttrHistoryRecord.oldValue)
            && Objects.equals(this.operatedTime, issueAttrHistoryRecord.operatedTime)
            && Objects.equals(this.operation, issueAttrHistoryRecord.operation)
            && Objects.equals(this.operator, issueAttrHistoryRecord.operator)
            && Objects.equals(this.property, issueAttrHistoryRecord.property);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(fieldKey, fieldName, id, issueId, newValue, oldValue, operatedTime, operation, operator, property);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueAttrHistoryRecord {\n");
        sb.append("    fieldKey: ").append(toIndentedString(fieldKey)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
        sb.append("    operatedTime: ").append(toIndentedString(operatedTime)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
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
