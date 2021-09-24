package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** UpdateInstanceConfigurationRequestBody */
public class UpdateInstanceConfigurationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private Map<String, String> values = null;

    public UpdateInstanceConfigurationRequestBody withValues(Map<String, String> values) {
        this.values = values;
        return this;
    }

    public UpdateInstanceConfigurationRequestBody putValuesItem(String key, String valuesItem) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        this.values.put(key, valuesItem);
        return this;
    }

    public UpdateInstanceConfigurationRequestBody withValues(Consumer<Map<String, String>> valuesSetter) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /** 参数值对象，用户基于默认参数模板自定义的参数值。为空时不修改参数值。 - key：参数名称，\"max_connections\":\"10\"。为空时不修改参数值，key不为空时value也不可为空。 -
     * value：参数值，\"max_connections\":\"10\"。
     * 
     * @return values */
    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
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
        UpdateInstanceConfigurationRequestBody updateInstanceConfigurationRequestBody =
            (UpdateInstanceConfigurationRequestBody) o;
        return Objects.equals(this.values, updateInstanceConfigurationRequestBody.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceConfigurationRequestBody {\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
