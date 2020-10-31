package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.MappingRules;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class MappingOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    private List<MappingRules> rules = new ArrayList<>();
    
    public MappingOption withRules(List<MappingRules> rules) {
        this.rules = rules;
        return this;
    }

    
    public MappingOption addRulesItem(MappingRules rulesItem) {
        this.rules.add(rulesItem);
        return this;
    }

    public MappingOption withRules(Consumer<List<MappingRules>> rulesSetter) {
        if(this.rules == null ){
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 将联邦用户映射为本地用户的规则列表。
     * @return rules
     */
    public List<MappingRules> getRules() {
        return rules;
    }

    public void setRules(List<MappingRules> rules) {
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
        MappingOption mappingOption = (MappingOption) o;
        return Objects.equals(this.rules, mappingOption.rules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MappingOption {\n");
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

