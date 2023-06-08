package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 定义过滤规则的元素，该规则用以匹配对象名前缀和后缀。 
 */
@JacksonXmlRootElement(localName = "FilterObject")
public class FilterObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FilterRule")

    @JacksonXmlProperty(localName = "FilterRule")
    private List<FilterRule> filterRule = null;

    public FilterObject withFilterRule(List<FilterRule> filterRule) {
        this.filterRule = filterRule;
        return this;
    }

    public FilterObject addFilterRuleItem(FilterRule filterRuleItem) {
        if (this.filterRule == null) {
            this.filterRule = new ArrayList<>();
        }
        this.filterRule.add(filterRuleItem);
        return this;
    }

    public FilterObject withFilterRule(Consumer<List<FilterRule>> filterRuleSetter) {
        if (this.filterRule == null) {
            this.filterRule = new ArrayList<>();
        }
        filterRuleSetter.accept(this.filterRule);
        return this;
    }

    /**
     * Get filterRule
     * @return filterRule
     */
    public List<FilterRule> getFilterRule() {
        return filterRule;
    }

    public void setFilterRule(List<FilterRule> filterRule) {
        this.filterRule = filterRule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilterObject filterObject = (FilterObject) o;
        return Objects.equals(this.filterRule, filterObject.filterRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilterObject {\n");
        sb.append("    filterRule: ").append(toIndentedString(filterRule)).append("\n");
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
