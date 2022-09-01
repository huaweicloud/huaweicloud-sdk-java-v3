package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRuleDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    @JacksonXmlProperty(localName = "rule")

    private RuleResponse rule;

    public ShowRuleDetailResponse withRule(RuleResponse rule) {
        this.rule = rule;
        return this;
    }

    public ShowRuleDetailResponse withRule(Consumer<RuleResponse> ruleSetter) {
        if (this.rule == null) {
            this.rule = new RuleResponse();
            ruleSetter.accept(this.rule);
        }

        return this;
    }

    /**
     * Get rule
     * @return rule
     */
    public RuleResponse getRule() {
        return rule;
    }

    public void setRule(RuleResponse rule) {
        this.rule = rule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRuleDetailResponse showRuleDetailResponse = (ShowRuleDetailResponse) o;
        return Objects.equals(this.rule, showRuleDetailResponse.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRuleDetailResponse {\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
