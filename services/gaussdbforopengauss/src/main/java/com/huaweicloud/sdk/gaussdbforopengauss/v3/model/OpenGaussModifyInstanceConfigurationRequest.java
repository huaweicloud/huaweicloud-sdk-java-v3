package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OpenGaussModifyInstanceConfigurationRequest
 */
public class OpenGaussModifyInstanceConfigurationRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    
    private Map<String, String> values = null;
    
    public OpenGaussModifyInstanceConfigurationRequest withValues(Map<String, String> values) {
        this.values = values;
        return this;
    }

    

    public OpenGaussModifyInstanceConfigurationRequest putValuesItem(String key, String valuesItem) {
        if(this.values == null) {
            this.values = new HashMap<>();
        }
        this.values.put(key, valuesItem);
        return this;
    }

    public OpenGaussModifyInstanceConfigurationRequest withValues(Consumer<Map<String, String>> valuesSetter) {
        if(this.values == null) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenGaussModifyInstanceConfigurationRequest openGaussModifyInstanceConfigurationRequest = (OpenGaussModifyInstanceConfigurationRequest) o;
        return Objects.equals(this.values, openGaussModifyInstanceConfigurationRequest.values);
    }
    @Override
    public int hashCode() {
        return Objects.hash(values);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussModifyInstanceConfigurationRequest {\n");
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

