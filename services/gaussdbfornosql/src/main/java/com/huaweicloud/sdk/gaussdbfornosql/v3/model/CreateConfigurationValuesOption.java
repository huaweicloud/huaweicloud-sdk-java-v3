package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 参数值对象，用户基于默认参数模板自定义的参数值。默认不修改参数值。
 */
public class CreateConfigurationValuesOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public CreateConfigurationValuesOption withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 参数名称。 示例：\"max_connections\":\"10\"中，key值为“max_connections”。 - key为空时，不修改参数值。 - key不为空时，value也不可为空。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CreateConfigurationValuesOption withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 参数值。 - 示例：\"max_connections\":\"10\"中，value值为“10”。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConfigurationValuesOption createConfigurationValuesOption = (CreateConfigurationValuesOption) o;
        return Objects.equals(this.key, createConfigurationValuesOption.key)
            && Objects.equals(this.value, createConfigurationValuesOption.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfigurationValuesOption {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
