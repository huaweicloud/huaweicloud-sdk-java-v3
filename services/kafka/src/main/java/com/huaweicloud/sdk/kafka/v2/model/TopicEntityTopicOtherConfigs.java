package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TopicEntityTopicOtherConfigs
 */
public class TopicEntityTopicOtherConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_values")

    private String validValues;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_type")

    private String configType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private String valueType;

    public TopicEntityTopicOtherConfigs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 配置名称。 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TopicEntityTopicOtherConfigs withValidValues(String validValues) {
        this.validValues = validValues;
        return this;
    }

    /**
     * **参数解释**： 配置有效值。 **取值范围**： 不涉及
     * @return validValues
     */
    public String getValidValues() {
        return validValues;
    }

    public void setValidValues(String validValues) {
        this.validValues = validValues;
    }

    public TopicEntityTopicOtherConfigs withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * **参数解释**： 配置默认值。 **取值范围**： 不涉及
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public TopicEntityTopicOtherConfigs withConfigType(String configType) {
        this.configType = configType;
        return this;
    }

    /**
     * **参数解释**： 配置类型。 **取值范围**： - dynamic：动态。 - static：静态。
     * @return configType
     */
    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public TopicEntityTopicOtherConfigs withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 配置值。 **取值范围**： 不涉及
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TopicEntityTopicOtherConfigs withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * **参数解释**： 配置值类型。 **取值范围**： - string：字符串类型。 - integer：整数类型。 - enum：枚举值类型。
     * @return valueType
     */
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopicEntityTopicOtherConfigs that = (TopicEntityTopicOtherConfigs) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.validValues, that.validValues)
            && Objects.equals(this.defaultValue, that.defaultValue) && Objects.equals(this.configType, that.configType)
            && Objects.equals(this.value, that.value) && Objects.equals(this.valueType, that.valueType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, validValues, defaultValue, configType, value, valueType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicEntityTopicOtherConfigs {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    validValues: ").append(toIndentedString(validValues)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
