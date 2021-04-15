package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.RuleResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRulesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Long count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    private List<RuleResponse> rules = null;
    
    public ListRulesResponse withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 本次分页查询结果中最后一条记录的ID，可在下一次分页查询时使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public ListRulesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    


    /**
     * 满足查询条件的记录总数。
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    

    public ListRulesResponse withRules(List<RuleResponse> rules) {
        this.rules = rules;
        return this;
    }

    
    public ListRulesResponse addRulesItem(RuleResponse rulesItem) {
        if(this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public ListRulesResponse withRules(Consumer<List<RuleResponse>> rulesSetter) {
        if(this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 规则信息列表。
     * @return rules
     */
    public List<RuleResponse> getRules() {
        return rules;
    }

    public void setRules(List<RuleResponse> rules) {
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
        ListRulesResponse listRulesResponse = (ListRulesResponse) o;
        return Objects.equals(this.marker, listRulesResponse.marker) &&
            Objects.equals(this.count, listRulesResponse.count) &&
            Objects.equals(this.rules, listRulesResponse.rules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(marker, count, rules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRulesResponse {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

