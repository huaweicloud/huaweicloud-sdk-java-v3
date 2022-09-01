package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListL7rulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    @JacksonXmlProperty(localName = "rules")

    private List<L7ruleResp> rules = null;

    public ListL7rulesResponse withRules(List<L7ruleResp> rules) {
        this.rules = rules;
        return this;
    }

    public ListL7rulesResponse addRulesItem(L7ruleResp rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public ListL7rulesResponse withRules(Consumer<List<L7ruleResp>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 转发规则对象的列表
     * @return rules
     */
    public List<L7ruleResp> getRules() {
        return rules;
    }

    public void setRules(List<L7ruleResp> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListL7rulesResponse listL7rulesResponse = (ListL7rulesResponse) o;
        return Objects.equals(this.rules, listL7rulesResponse.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListL7rulesResponse {\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
