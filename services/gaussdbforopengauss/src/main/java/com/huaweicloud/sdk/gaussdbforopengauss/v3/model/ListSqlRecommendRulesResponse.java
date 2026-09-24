package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListSqlRecommendRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommend_rules")

    private List<ListSqlRecommendRulesResponseResult> recommendRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListSqlRecommendRulesResponse withRecommendRules(List<ListSqlRecommendRulesResponseResult> recommendRules) {
        this.recommendRules = recommendRules;
        return this;
    }

    public ListSqlRecommendRulesResponse addRecommendRulesItem(ListSqlRecommendRulesResponseResult recommendRulesItem) {
        if (this.recommendRules == null) {
            this.recommendRules = new ArrayList<>();
        }
        this.recommendRules.add(recommendRulesItem);
        return this;
    }

    public ListSqlRecommendRulesResponse withRecommendRules(
        Consumer<List<ListSqlRecommendRulesResponseResult>> recommendRulesSetter) {
        if (this.recommendRules == null) {
            this.recommendRules = new ArrayList<>();
        }
        recommendRulesSetter.accept(this.recommendRules);
        return this;
    }

    /**
     * **参数解释**: 推荐规则列表。
     * @return recommendRules
     */
    public List<ListSqlRecommendRulesResponseResult> getRecommendRules() {
        return recommendRules;
    }

    public void setRecommendRules(List<ListSqlRecommendRulesResponseResult> recommendRules) {
        this.recommendRules = recommendRules;
    }

    public ListSqlRecommendRulesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 推荐总数。 **取值范围**: 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSqlRecommendRulesResponse that = (ListSqlRecommendRulesResponse) obj;
        return Objects.equals(this.recommendRules, that.recommendRules)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recommendRules, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSqlRecommendRulesResponse {\n");
        sb.append("    recommendRules: ").append(toIndentedString(recommendRules)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
