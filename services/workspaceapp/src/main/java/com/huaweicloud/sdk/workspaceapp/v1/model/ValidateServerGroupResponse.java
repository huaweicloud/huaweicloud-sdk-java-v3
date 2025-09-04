package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ValidateServerGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Boolean result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validate_rule")

    private ValidateRuleEnum validateRule;

    public ValidateServerGroupResponse withResult(Boolean result) {
        this.result = result;
        return this;
    }

    /**
     * 校验结果。
     * @return result
     */
    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public ValidateServerGroupResponse withValidateRule(ValidateRuleEnum validateRule) {
        this.validateRule = validateRule;
        return this;
    }

    /**
     * Get validateRule
     * @return validateRule
     */
    public ValidateRuleEnum getValidateRule() {
        return validateRule;
    }

    public void setValidateRule(ValidateRuleEnum validateRule) {
        this.validateRule = validateRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateServerGroupResponse that = (ValidateServerGroupResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.validateRule, that.validateRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, validateRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateServerGroupResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    validateRule: ").append(toIndentedString(validateRule)).append("\n");
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
