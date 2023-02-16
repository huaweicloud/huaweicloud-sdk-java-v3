package com.huaweicloud.sdk.aos.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.VariableResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ParseTemplateVariablesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="variables")
    
    
    private List<VariableResponse> variables = null;
    
    public ParseTemplateVariablesResponse withVariables(List<VariableResponse> variables) {
        this.variables = variables;
        return this;
    }

    
    public ParseTemplateVariablesResponse addVariablesItem(VariableResponse variablesItem) {
        if(this.variables == null) {
            this.variables = new ArrayList<>();
        }
        this.variables.add(variablesItem);
        return this;
    }

    public ParseTemplateVariablesResponse withVariables(Consumer<List<VariableResponse>> variablesSetter) {
        if(this.variables == null) {
            this.variables = new ArrayList<>();
        }
        variablesSetter.accept(this.variables);
        return this;
    }

    /**
     * 模板中的所有参数
     * @return variables
     */
    public List<VariableResponse> getVariables() {
        return variables;
    }

    public void setVariables(List<VariableResponse> variables) {
        this.variables = variables;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParseTemplateVariablesResponse parseTemplateVariablesResponse = (ParseTemplateVariablesResponse) o;
        return Objects.equals(this.variables, parseTemplateVariablesResponse.variables);
    }
    @Override
    public int hashCode() {
        return Objects.hash(variables);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParseTemplateVariablesResponse {\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

