package com.huaweicloud.sdk.swr.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.swr.v2.model.Rule;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateRetentionRequestBody
 */
public class UpdateRetentionRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="algorithm")
    
    private String algorithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    private List<Rule> rules = new ArrayList<>();
    
    public UpdateRetentionRequestBody withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    


    /**
     * 算法
     * @return algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public UpdateRetentionRequestBody withRules(List<Rule> rules) {
        this.rules = rules;
        return this;
    }

    
    public UpdateRetentionRequestBody addRulesItem(Rule rulesItem) {
        this.rules.add(rulesItem);
        return this;
    }

    public UpdateRetentionRequestBody withRules(Consumer<List<Rule>> rulesSetter) {
        if(this.rules == null ){
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 镜像老化规则
     * @return rules
     */
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
        UpdateRetentionRequestBody updateRetentionRequestBody = (UpdateRetentionRequestBody) o;
        return Objects.equals(this.algorithm, updateRetentionRequestBody.algorithm) &&
            Objects.equals(this.rules, updateRetentionRequestBody.rules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(algorithm, rules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRetentionRequestBody {\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
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

