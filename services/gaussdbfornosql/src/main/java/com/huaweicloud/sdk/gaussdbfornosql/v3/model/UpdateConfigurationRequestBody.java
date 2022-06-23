package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateConfigurationRequestBody
 */
public class UpdateConfigurationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private UpdateConfigurationValuesOption values;

    public UpdateConfigurationRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数模板名称。最长64个字符，只允许大写字母、小写字母、数字和特殊字符中划线、下划线和点。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateConfigurationRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数模板描述。最长256个字符，不支持!<>=&\"'特殊字符。默认为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateConfigurationRequestBody withValues(UpdateConfigurationValuesOption values) {
        this.values = values;
        return this;
    }

    public UpdateConfigurationRequestBody withValues(Consumer<UpdateConfigurationValuesOption> valuesSetter) {
        if (this.values == null) {
            this.values = new UpdateConfigurationValuesOption();
            valuesSetter.accept(this.values);
        }

        return this;
    }

    /**
     * Get values
     * @return values
     */
    public UpdateConfigurationValuesOption getValues() {
        return values;
    }

    public void setValues(UpdateConfigurationValuesOption values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateConfigurationRequestBody updateConfigurationRequestBody = (UpdateConfigurationRequestBody) o;
        return Objects.equals(this.name, updateConfigurationRequestBody.name)
            && Objects.equals(this.description, updateConfigurationRequestBody.description)
            && Objects.equals(this.values, updateConfigurationRequestBody.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigurationRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
