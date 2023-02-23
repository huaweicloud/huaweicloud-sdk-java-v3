package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.ConfigurationSummary2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowGaussMySqlConfigurationResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configurations")
    

    private ConfigurationSummary2 configurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameter_values")
    
    private Map<String, String> parameterValues = null;
    
    public ShowGaussMySqlConfigurationResponse withConfigurations(ConfigurationSummary2 configurations) {
        this.configurations = configurations;
        return this;
    }

    public ShowGaussMySqlConfigurationResponse withConfigurations(Consumer<ConfigurationSummary2> configurationsSetter) {
        if(this.configurations == null ){
            this.configurations = new ConfigurationSummary2();
            configurationsSetter.accept(this.configurations);
        }
        
        return this;
    }


    /**
     * Get configurations
     * @return configurations
     */
    public ConfigurationSummary2 getConfigurations() {
        return configurations;
    }

    public void setConfigurations(ConfigurationSummary2 configurations) {
        this.configurations = configurations;
    }

    

    public ShowGaussMySqlConfigurationResponse withParameterValues(Map<String, String> parameterValues) {
        this.parameterValues = parameterValues;
        return this;
    }

    

    public ShowGaussMySqlConfigurationResponse putParameterValuesItem(String key, String parameterValuesItem) {
        if(this.parameterValues == null) {
            this.parameterValues = new HashMap<>();
        }
        this.parameterValues.put(key, parameterValuesItem);
        return this;
    }

    public ShowGaussMySqlConfigurationResponse withParameterValues(Consumer<Map<String, String>> parameterValuesSetter) {
        if(this.parameterValues == null) {
            this.parameterValues = new HashMap<>();
        }
        parameterValuesSetter.accept(this.parameterValues);
        return this;
    }
    /**
     * 参数名和参数值映射关系。用户可以基于默认参数模板的参数，自定义的参数值。
     * @return parameterValues
     */
    public Map<String, String> getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(Map<String, String> parameterValues) {
        this.parameterValues = parameterValues;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGaussMySqlConfigurationResponse showGaussMySqlConfigurationResponse = (ShowGaussMySqlConfigurationResponse) o;
        return Objects.equals(this.configurations, showGaussMySqlConfigurationResponse.configurations) &&
            Objects.equals(this.parameterValues, showGaussMySqlConfigurationResponse.parameterValues);
    }
    @Override
    public int hashCode() {
        return Objects.hash(configurations, parameterValues);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGaussMySqlConfigurationResponse {\n");
        sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
        sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
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

