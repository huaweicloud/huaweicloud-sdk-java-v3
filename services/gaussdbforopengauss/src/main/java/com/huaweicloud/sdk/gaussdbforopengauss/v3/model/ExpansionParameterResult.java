package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExpansionParameterResult
 */
public class ExpansionParameterResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_required")

    private Boolean restartRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_range")

    private String valueRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ExpansionParameterResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 参数名称。 **取值范围**: 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExpansionParameterResult withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**: 参数值。 **取值范围**: 不涉及。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ExpansionParameterResult withRestartRequired(Boolean restartRequired) {
        this.restartRequired = restartRequired;
        return this;
    }

    /**
     * **参数解释**: 修改参数是否需要重启。 **取值范围**: - true：需要重启。 - false：不需要重启。
     * @return restartRequired
     */
    public Boolean getRestartRequired() {
        return restartRequired;
    }

    public void setRestartRequired(Boolean restartRequired) {
        this.restartRequired = restartRequired;
    }

    public ExpansionParameterResult withValueRange(String valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    /**
     * **参数解释**: 参数值的取值范围。 **取值范围**: 不涉及。
     * @return valueRange
     */
    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }

    public ExpansionParameterResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 参数类型。 **取值范围**: - integer：整数。 - boolean：布尔类型。 - string：字符串。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExpansionParameterResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 参数解释。 **取值范围**: 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExpansionParameterResult that = (ExpansionParameterResult) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value)
            && Objects.equals(this.restartRequired, that.restartRequired)
            && Objects.equals(this.valueRange, that.valueRange) && Objects.equals(this.type, that.type)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, restartRequired, valueRange, type, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpansionParameterResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    restartRequired: ").append(toIndentedString(restartRequired)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
