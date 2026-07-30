package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAssociatedResourceRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<AssociatedResourceRule> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errors")

    private List<ErrorInfo> errors = null;

    public UpdateAssociatedResourceRulesResponse withRules(List<AssociatedResourceRule> rules) {
        this.rules = rules;
        return this;
    }

    public UpdateAssociatedResourceRulesResponse addRulesItem(AssociatedResourceRule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public UpdateAssociatedResourceRulesResponse withRules(Consumer<List<AssociatedResourceRule>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 本次操作的规则信息
     * @return rules
     */
    public List<AssociatedResourceRule> getRules() {
        return rules;
    }

    public void setRules(List<AssociatedResourceRule> rules) {
        this.rules = rules;
    }

    public UpdateAssociatedResourceRulesResponse withErrors(List<ErrorInfo> errors) {
        this.errors = errors;
        return this;
    }

    public UpdateAssociatedResourceRulesResponse addErrorsItem(ErrorInfo errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    public UpdateAssociatedResourceRulesResponse withErrors(Consumer<List<ErrorInfo>> errorsSetter) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        errorsSetter.accept(this.errors);
        return this;
    }

    /**
     * 操作的错误信息
     * @return errors
     */
    public List<ErrorInfo> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorInfo> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAssociatedResourceRulesResponse that = (UpdateAssociatedResourceRulesResponse) obj;
        return Objects.equals(this.rules, that.rules) && Objects.equals(this.errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rules, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAssociatedResourceRulesResponse {\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
