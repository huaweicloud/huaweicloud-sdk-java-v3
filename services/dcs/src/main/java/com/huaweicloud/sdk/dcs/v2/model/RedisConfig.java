package com.huaweicloud.sdk.dcs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RedisConfig
 */
public class RedisConfig  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="param_value")
    
    private String paramValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="param_name")
    
    private String paramName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="param_id")
    
    private String paramId;

    public RedisConfig withParamValue(String paramValue) {
        this.paramValue = paramValue;
        return this;
    }

    


    /**
     * 实例配置项的值。
     * @return paramValue
     */
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public RedisConfig withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    


    /**
     * 实例配置项名。
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public RedisConfig withParamId(String paramId) {
        this.paramId = paramId;
        return this;
    }

    


    /**
     * 实例配置项ID。
     * @return paramId
     */
    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RedisConfig redisConfig = (RedisConfig) o;
        return Objects.equals(this.paramValue, redisConfig.paramValue) &&
            Objects.equals(this.paramName, redisConfig.paramName) &&
            Objects.equals(this.paramId, redisConfig.paramId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(paramValue, paramName, paramId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisConfig {\n");
        sb.append("    paramValue: ").append(toIndentedString(paramValue)).append("\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    paramId: ").append(toIndentedString(paramId)).append("\n");
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

