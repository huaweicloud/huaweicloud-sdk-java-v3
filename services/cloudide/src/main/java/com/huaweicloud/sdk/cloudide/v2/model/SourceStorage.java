package com.huaweicloud.sdk.cloudide.v2.model;





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
 * SourceStorage
 */
public class SourceStorage  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="location")
    
    private String location;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    private Map<String, String> parameters = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public SourceStorage withLocation(String location) {
        this.location = location;
        return this;
    }

    


    /**
     * 位置
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public SourceStorage withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    

    public SourceStorage putParametersItem(String key, String parametersItem) {
         if (this.parameters == null) {
            this.parameters = new HashMap<>();
         }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public SourceStorage withParameters(Consumer<Map<String, String>> parametersSetter) {
        if(this.parameters == null ){
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }
    /**
     * 参数值
     * @return parameters
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public SourceStorage withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceStorage sourceStorage = (SourceStorage) o;
        return Objects.equals(this.location, sourceStorage.location) &&
            Objects.equals(this.parameters, sourceStorage.parameters) &&
            Objects.equals(this.type, sourceStorage.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(location, parameters, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceStorage {\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

