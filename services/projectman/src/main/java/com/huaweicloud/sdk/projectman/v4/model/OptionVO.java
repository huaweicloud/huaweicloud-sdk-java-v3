package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OptionVO
 */
public class OptionVO {

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

    public OptionVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**  选项Id。 **取值范围：**  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OptionVO withDisplayValue(String displayValue) {
        this.displayValue = displayValue;
        return this;
    }

    /**
     * **参数解释：**  选项名称。 **取值范围：**  不涉及。
     * @return displayValue
     */
    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public OptionVO withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：**  选项的唯一标识，自定义的选项id和value相同。 **取值范围：**  不涉及。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public OptionVO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释：**  选项code。 **取值范围：**  不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OptionVO withValuePy(String valuePy) {
        this.valuePy = valuePy;
        return this;
    }

    /**
     * **参数解释：**  选项名称的中文拼音首字母。 **取值范围：**  不涉及。
     * @return valuePy
     */
    public String getValuePy() {
        return valuePy;
    }

    public void setValuePy(String valuePy) {
        this.valuePy = valuePy;
    }

    public OptionVO withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * **参数解释：**  选项在选项列表中的排序。 **取值范围：**  不涉及。
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public OptionVO withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释：**  层级选项的分层标识，单选列表和多选列表值都为1，层级字段按照层级依次为1,2,3,4。 **取值范围：**  不涉及。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public OptionVO withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释：**  选项所在的项目空间Id。 **取值范围：**  不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public OptionVO withBelongDefinitionType(String belongDefinitionType) {
        this.belongDefinitionType = belongDefinitionType;
        return this;
    }

    /**
     * **参数解释：**  选项归属的定义级别。1,2,3为系统级，4为租户自定义，5为项目自定义。 **取值范围：**  不涉及。
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
        OptionVO that = (OptionVO) obj;
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
        sb.append("class OptionVO {\n");
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
