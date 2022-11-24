package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.VariableValidationResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * variable response
 */
public class VariableResponse  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default")
    
    
    private Object _default;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sensitive")
    
    
    private Boolean sensitive;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nullable")
    
    
    private Boolean nullable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="validations")
    
    
    private List<VariableValidationResponse> validations = null;
    
    public VariableResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 参数的名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public VariableResponse withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 参数类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public VariableResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述参数的用途
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public VariableResponse withDefault(Object _default) {
        this._default = _default;
        return this;
    }

    


    /**
     * 参数默认值。该类型与type保持一致
     * @return _default
     */
    public Object getDefault() {
        return _default;
    }

    public void setDefault(Object _default) {
        this._default = _default;
    }

    

    public VariableResponse withSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }

    


    /**
     * 参数是否为敏感字段
     * @return sensitive
     */
    public Boolean getSensitive() {
        return sensitive;
    }

    public void setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
    }

    

    public VariableResponse withNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    


    /**
     * 参数是否可设置为null
     * @return nullable
     */
    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    

    public VariableResponse withValidations(List<VariableValidationResponse> validations) {
        this.validations = validations;
        return this;
    }

    
    public VariableResponse addValidationsItem(VariableValidationResponse validationsItem) {
        if(this.validations == null) {
            this.validations = new ArrayList<>();
        }
        this.validations.add(validationsItem);
        return this;
    }

    public VariableResponse withValidations(Consumer<List<VariableValidationResponse>> validationsSetter) {
        if(this.validations == null) {
            this.validations = new ArrayList<>();
        }
        validationsSetter.accept(this.validations);
        return this;
    }

    /**
     * 参数校验模块
     * @return validations
     */
    public List<VariableValidationResponse> getValidations() {
        return validations;
    }

    public void setValidations(List<VariableValidationResponse> validations) {
        this.validations = validations;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VariableResponse variableResponse = (VariableResponse) o;
        return Objects.equals(this.name, variableResponse.name) &&
            Objects.equals(this.type, variableResponse.type) &&
            Objects.equals(this.description, variableResponse.description) &&
            Objects.equals(this._default, variableResponse._default) &&
            Objects.equals(this.sensitive, variableResponse.sensitive) &&
            Objects.equals(this.nullable, variableResponse.nullable) &&
            Objects.equals(this.validations, variableResponse.validations);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, type, description, _default, sensitive, nullable, validations);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
        sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
        sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
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

