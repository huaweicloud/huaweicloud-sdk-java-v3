package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 参数值对象，用户基于默认参数模板自定义的参数值。为空时不修改参数值。
 */
public class UpdateConfigurationValuesOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public UpdateConfigurationValuesOption withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Parameter name 示例：\"concurrent_reads\":\"64\"中，key值为“concurrent_reads”。 - key不为空时，value也不可为空。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public UpdateConfigurationValuesOption withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Parameter value 示例：\"concurrent_reads\":\"64\"，value值为“64”。
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
        UpdateConfigurationValuesOption updateConfigurationValuesOption = (UpdateConfigurationValuesOption) o;
        return Objects.equals(this.key, updateConfigurationValuesOption.key)
            && Objects.equals(this.value, updateConfigurationValuesOption.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigurationValuesOption {\n");
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
