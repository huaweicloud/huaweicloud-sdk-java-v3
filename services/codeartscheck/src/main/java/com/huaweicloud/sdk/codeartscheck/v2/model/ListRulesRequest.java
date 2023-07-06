package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_languages")

    private String ruleLanguages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_severity")

    private String ruleSeverity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListRulesRequest withRuleLanguages(String ruleLanguages) {
        this.ruleLanguages = ruleLanguages;
        return this;
    }

    /**
     * 规则对应的语言
     * @return ruleLanguages
     */
    public String getRuleLanguages() {
        return ruleLanguages;
    }

    public void setRuleLanguages(String ruleLanguages) {
        this.ruleLanguages = ruleLanguages;
    }

    public ListRulesRequest withRuleSeverity(String ruleSeverity) {
        this.ruleSeverity = ruleSeverity;
        return this;
    }

    /**
     * 缺陷等级，0致命，1严重，2一般，3提示
     * @return ruleSeverity
     */
    public String getRuleSeverity() {
        return ruleSeverity;
    }

    public void setRuleSeverity(String ruleSeverity) {
        this.ruleSeverity = ruleSeverity;
    }

    public ListRulesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页索引，偏移量
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的数量
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRulesRequest that = (ListRulesRequest) obj;
        return Objects.equals(this.ruleLanguages, that.ruleLanguages)
            && Objects.equals(this.ruleSeverity, that.ruleSeverity) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleLanguages, ruleSeverity, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRulesRequest {\n");
        sb.append("    ruleLanguages: ").append(toIndentedString(ruleLanguages)).append("\n");
        sb.append("    ruleSeverity: ").append(toIndentedString(ruleSeverity)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
