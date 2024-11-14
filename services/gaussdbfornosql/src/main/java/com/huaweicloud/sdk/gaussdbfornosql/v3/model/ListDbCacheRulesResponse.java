package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ListDbCacheRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbcache_mapping_id")

    private String dbcacheMappingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<QueryDBCacheRuleResponse> rules = null;

    public ListDbCacheRulesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListDbCacheRulesResponse withDbcacheMappingId(String dbcacheMappingId) {
        this.dbcacheMappingId = dbcacheMappingId;
        return this;
    }

    /**
     * 内存加速映射ID。
     * @return dbcacheMappingId
     */
    public String getDbcacheMappingId() {
        return dbcacheMappingId;
    }

    public void setDbcacheMappingId(String dbcacheMappingId) {
        this.dbcacheMappingId = dbcacheMappingId;
    }

    public ListDbCacheRulesResponse withRules(List<QueryDBCacheRuleResponse> rules) {
        this.rules = rules;
        return this;
    }

    public ListDbCacheRulesResponse addRulesItem(QueryDBCacheRuleResponse rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public ListDbCacheRulesResponse withRules(Consumer<List<QueryDBCacheRuleResponse>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 内存加速规则详情。
     * @return rules
     */
    public List<QueryDBCacheRuleResponse> getRules() {
        return rules;
    }

    public void setRules(List<QueryDBCacheRuleResponse> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDbCacheRulesResponse that = (ListDbCacheRulesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.dbcacheMappingId, that.dbcacheMappingId) && Objects.equals(this.rules, that.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, dbcacheMappingId, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbCacheRulesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    dbcacheMappingId: ").append(toIndentedString(dbcacheMappingId)).append("\n");
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
