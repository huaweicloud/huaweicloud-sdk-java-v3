package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModifyParameterConfigTemplateRequestBody
 */
public class ModifyParameterConfigTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private Map<String, String> values = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ModifyParameterConfigTemplateRequestBody withValues(Map<String, String> values) {
        this.values = values;
        return this;
    }

    public ModifyParameterConfigTemplateRequestBody putValuesItem(String key, String valuesItem) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        this.values.put(key, valuesItem);
        return this;
    }

    public ModifyParameterConfigTemplateRequestBody withValues(Consumer<Map<String, String>> valuesSetter) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 参数值对象Map<String,String>，用户基于默认参数模板自定义的参数值。
     * @return values
     */
    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }

    public ModifyParameterConfigTemplateRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数组模板描述。
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
        ModifyParameterConfigTemplateRequestBody that = (ModifyParameterConfigTemplateRequestBody) obj;
        return Objects.equals(this.values, that.values) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyParameterConfigTemplateRequestBody {\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
