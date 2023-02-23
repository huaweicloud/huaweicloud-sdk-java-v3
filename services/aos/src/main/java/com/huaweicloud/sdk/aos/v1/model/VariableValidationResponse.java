package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * variable-validation response
 */
public class VariableValidationResponse  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="condition")
    

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_message")
    

    private String errorMessage;

    public VariableValidationResponse withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    


    /**
     * 校验表达式。支持Terraform表达式
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    

    public VariableValidationResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    


    /**
     * 校验失败后的错误信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VariableValidationResponse variableValidationResponse = (VariableValidationResponse) o;
        return Objects.equals(this.condition, variableValidationResponse.condition) &&
            Objects.equals(this.errorMessage, variableValidationResponse.errorMessage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(condition, errorMessage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableValidationResponse {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

