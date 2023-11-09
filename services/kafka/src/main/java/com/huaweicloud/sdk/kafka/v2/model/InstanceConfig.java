package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * InstanceConfig
 */
public class InstanceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_values")

    private String validValues;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    /**
     * 配置类型：static/dynamic。
     */
    public static final class ConfigTypeEnum {

        /**
         * Enum STATIC for value: "static"
         */
        public static final ConfigTypeEnum STATIC = new ConfigTypeEnum("static");

        /**
         * Enum DYNAMIC for value: "dynamic"
         */
        public static final ConfigTypeEnum DYNAMIC = new ConfigTypeEnum("dynamic");

        private static final Map<String, ConfigTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfigTypeEnum> createStaticFields() {
            Map<String, ConfigTypeEnum> map = new HashMap<>();
            map.put("static", STATIC);
            map.put("dynamic", DYNAMIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfigTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ConfigTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConfigTypeEnum(value));
        }

        public static ConfigTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConfigTypeEnum) {
                return this.value.equals(((ConfigTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_type")

    private ConfigTypeEnum configType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private String valueType;

    public InstanceConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 配置名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceConfig withValidValues(String validValues) {
        this.validValues = validValues;
        return this;
    }

    /**
     * 有效值。
     * @return validValues
     */
    public String getValidValues() {
        return validValues;
    }

    public void setValidValues(String validValues) {
        this.validValues = validValues;
    }

    public InstanceConfig withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 默认值。
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public InstanceConfig withConfigType(ConfigTypeEnum configType) {
        this.configType = configType;
        return this;
    }

    /**
     * 配置类型：static/dynamic。
     * @return configType
     */
    public ConfigTypeEnum getConfigType() {
        return configType;
    }

    public void setConfigType(ConfigTypeEnum configType) {
        this.configType = configType;
    }

    public InstanceConfig withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 配置当前值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public InstanceConfig withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * 值类型。
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
        InstanceConfig that = (InstanceConfig) obj;
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
        sb.append("class InstanceConfig {\n");
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
