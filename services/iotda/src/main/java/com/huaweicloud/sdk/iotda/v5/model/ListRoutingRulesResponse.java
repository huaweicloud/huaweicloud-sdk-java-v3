package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.RoutingRule;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRoutingRulesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    private List<RoutingRule> rules = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;

    public ListRoutingRulesResponse withRules(List<RoutingRule> rules) {
        this.rules = rules;
        return this;
    }

    
    public ListRoutingRulesResponse addRulesItem(RoutingRule rulesItem) {
        this.rules.add(rulesItem);
        return this;
    }

    public ListRoutingRulesResponse withRules(Consumer<List<RoutingRule>> rulesSetter) {
        if(this.rules == null ){
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 规则条件信息列表。
     * @return rules
     */
    public List<RoutingRule> getRules() {
        return rules;
    }

    public void setRules(List<RoutingRule> rules) {
        this.rules = rules;
    }

    

    public ListRoutingRulesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 满足查询条件的记录总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public ListRoutingRulesResponse withMarker(String marker) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRoutingRulesResponse listRoutingRulesResponse = (ListRoutingRulesResponse) o;
        return Objects.equals(this.rules, listRoutingRulesResponse.rules) &&
            Objects.equals(this.count, listRoutingRulesResponse.count) &&
            Objects.equals(this.marker, listRoutingRulesResponse.marker);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rules, count, marker);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRoutingRulesResponse {\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

