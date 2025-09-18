package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RuleProperty
 */
public class RuleProperty {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private String valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_valid")

    private Boolean isValid;

    public RuleProperty withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**： 属性键。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public RuleProperty withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RuleProperty withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 展示名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuleProperty withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数解释**： 比较运算符。 **约束限制**： 不涉及。 **取值范围**： - ‘=’：等于。 - ‘>’：大于。 - ‘<’：小于。 - ‘>=’：大于等于。 - ‘<=’：小于等于。 - ‘!=’：不等于。 - ‘in’：包含其中。 - ‘not in’：不被包含。 **默认取值**： 不涉及。 
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public RuleProperty withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 属性值。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public RuleProperty withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * **参数解释**： 数据类型。 **约束限制**： 不涉及。 **取值范围**： - float：数值型。 - string：字符型。 **默认取值**： 不涉及。 
     * @return valueType
     */
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public RuleProperty withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * **参数解释**： 属性是否启用。 **约束限制**： 不涉及。 **取值范围**： - true：启用。 - false：未启用。 **默认取值**： false。 
     * @return isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleProperty that = (RuleProperty) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.type, that.type)
            && Objects.equals(this.name, that.name) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.value, that.value) && Objects.equals(this.valueType, that.valueType)
            && Objects.equals(this.isValid, that.isValid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, type, name, operator, value, valueType, isValid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleProperty {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
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
