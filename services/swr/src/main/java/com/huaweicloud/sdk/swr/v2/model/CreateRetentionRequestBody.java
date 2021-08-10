package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** CreateRetentionRequestBody */
public class CreateRetentionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private String algorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<Rule> rules = null;

    public CreateRetentionRequestBody withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /** 回收规则匹配策略，固定为\"or\"
     * 
     * @return algorithm */
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public CreateRetentionRequestBody withRules(List<Rule> rules) {
        this.rules = rules;
        return this;
    }

    public CreateRetentionRequestBody addRulesItem(Rule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public CreateRetentionRequestBody withRules(Consumer<List<Rule>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /** 镜像老化规则
     * 
     * @return rules */
    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
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
        CreateRetentionRequestBody createRetentionRequestBody = (CreateRetentionRequestBody) o;
        return Objects.equals(this.algorithm, createRetentionRequestBody.algorithm)
            && Objects.equals(this.rules, createRetentionRequestBody.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(algorithm, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRetentionRequestBody {\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
