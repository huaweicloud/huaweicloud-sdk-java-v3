package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.TaskParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 全局参数
 */
public class Parameter  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="param_name")
    

    private String paramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="param_type")
    

    private String paramType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="param_group")
    

    private String paramGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_value")
    

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encryption")
    

    private Boolean encryption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hint")
    

    private String hint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quote_param")
    

    private Boolean quoteParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="required")
    

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    public Parameter withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    


    /**
     * 参数名称,满足：[^\\>+<;#\";&?%=']{1,64}。
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    

    public Parameter withParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }

    


    /**
     * 参数类型。
     * @return paramType
     */
    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    

    public Parameter withParamGroup(String paramGroup) {
        this.paramGroup = paramGroup;
        return this;
    }

    


    /**
     * 参数分组。
     * @return paramGroup
     */
    public String getParamGroup() {
        return paramGroup;
    }

    public void setParamGroup(String paramGroup) {
        this.paramGroup = paramGroup;
    }

    

    public Parameter withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    


    /**
     * 参数初始值。
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    

    public Parameter withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 参数id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Parameter withEncryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }

    


    /**
     * 是否加密。
     * @return encryption
     */
    public Boolean getEncryption() {
        return encryption;
    }

    public void setEncryption(Boolean encryption) {
        this.encryption = encryption;
    }

    

    public Parameter withHint(String hint) {
        this.hint = hint;
        return this;
    }

    


    /**
     * 参数提示。
     * @return hint
     */
    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    

    public Parameter withQuoteParam(Boolean quoteParam) {
        this.quoteParam = quoteParam;
        return this;
    }

    


    /**
     * 是否从参数库选择。
     * @return quoteParam
     */
    public Boolean getQuoteParam() {
        return quoteParam;
    }

    public void setQuoteParam(Boolean quoteParam) {
        this.quoteParam = quoteParam;
    }

    

    public Parameter withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    


    /**
     * 是否为必填参数。
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    

    public Parameter withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 参数描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Parameter parameter = (Parameter) o;
        return Objects.equals(this.paramName, parameter.paramName) &&
            Objects.equals(this.paramType, parameter.paramType) &&
            Objects.equals(this.paramGroup, parameter.paramGroup) &&
            Objects.equals(this.defaultValue, parameter.defaultValue) &&
            Objects.equals(this.id, parameter.id) &&
            Objects.equals(this.encryption, parameter.encryption) &&
            Objects.equals(this.hint, parameter.hint) &&
            Objects.equals(this.quoteParam, parameter.quoteParam) &&
            Objects.equals(this.required, parameter.required) &&
            Objects.equals(this.description, parameter.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(paramName, paramType, paramGroup, defaultValue, id, encryption, hint, quoteParam, required, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Parameter {\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    paramType: ").append(toIndentedString(paramType)).append("\n");
        sb.append("    paramGroup: ").append(toIndentedString(paramGroup)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
        sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
        sb.append("    quoteParam: ").append(toIndentedString(quoteParam)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

