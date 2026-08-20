package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作项优先级
 */
public class ProcessInstanceResponseResultIssuePriority {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_value")

    private String displayValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_py")

    private String valuePy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_definition_type")

    private String belongDefinitionType;

    public ProcessInstanceResponseResultIssuePriority withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessInstanceResponseResultIssuePriority withDisplayValue(String displayValue) {
        this.displayValue = displayValue;
        return this;
    }

    /**
     * 显示名称
     * @return displayValue
     */
    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public ProcessInstanceResponseResultIssuePriority withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ProcessInstanceResponseResultIssuePriority withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 编码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProcessInstanceResponseResultIssuePriority withValuePy(String valuePy) {
        this.valuePy = valuePy;
        return this;
    }

    /**
     * 值(拼音首字母)
     * @return valuePy
     */
    public String getValuePy() {
        return valuePy;
    }

    public void setValuePy(String valuePy) {
        this.valuePy = valuePy;
    }

    public ProcessInstanceResponseResultIssuePriority withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * 序列
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public ProcessInstanceResponseResultIssuePriority withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 层级
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public ProcessInstanceResponseResultIssuePriority withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 项目ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ProcessInstanceResponseResultIssuePriority withBelongDefinitionType(String belongDefinitionType) {
        this.belongDefinitionType = belongDefinitionType;
        return this;
    }

    /**
     * 所属定义级别
     * @return belongDefinitionType
     */
    public String getBelongDefinitionType() {
        return belongDefinitionType;
    }

    public void setBelongDefinitionType(String belongDefinitionType) {
        this.belongDefinitionType = belongDefinitionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessInstanceResponseResultIssuePriority that = (ProcessInstanceResponseResultIssuePriority) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.displayValue, that.displayValue)
            && Objects.equals(this.value, that.value) && Objects.equals(this.code, that.code)
            && Objects.equals(this.valuePy, that.valuePy) && Objects.equals(this.sequence, that.sequence)
            && Objects.equals(this.level, that.level) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.belongDefinitionType, that.belongDefinitionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, displayValue, value, code, valuePy, sequence, level, domainId, belongDefinitionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInstanceResponseResultIssuePriority {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    displayValue: ").append(toIndentedString(displayValue)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    valuePy: ").append(toIndentedString(valuePy)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    belongDefinitionType: ").append(toIndentedString(belongDefinitionType)).append("\n");
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
