package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询应急策略列表入参
 */
public class SearchPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private SearchPolicyRequestBodyCondition condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private List<SearchPolicyRequestBodySort> sort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private SearchPolicyRequestBodyGroupBy groupBy;

    public SearchPolicyRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页数量
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchPolicyRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * minimum: 1
     * maximum: 9999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchPolicyRequestBody withCondition(SearchPolicyRequestBodyCondition condition) {
        this.condition = condition;
        return this;
    }

    public SearchPolicyRequestBody withCondition(Consumer<SearchPolicyRequestBodyCondition> conditionSetter) {
        if (this.condition == null) {
            this.condition = new SearchPolicyRequestBodyCondition();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public SearchPolicyRequestBodyCondition getCondition() {
        return condition;
    }

    public void setCondition(SearchPolicyRequestBodyCondition condition) {
        this.condition = condition;
    }

    public SearchPolicyRequestBody withSort(List<SearchPolicyRequestBodySort> sort) {
        this.sort = sort;
        return this;
    }

    public SearchPolicyRequestBody addSortItem(SearchPolicyRequestBodySort sortItem) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        this.sort.add(sortItem);
        return this;
    }

    public SearchPolicyRequestBody withSort(Consumer<List<SearchPolicyRequestBodySort>> sortSetter) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        sortSetter.accept(this.sort);
        return this;
    }

    /**
     * 排序条件
     * @return sort
     */
    public List<SearchPolicyRequestBodySort> getSort() {
        return sort;
    }

    public void setSort(List<SearchPolicyRequestBodySort> sort) {
        this.sort = sort;
    }

    public SearchPolicyRequestBody withGroupBy(SearchPolicyRequestBodyGroupBy groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public SearchPolicyRequestBody withGroupBy(Consumer<SearchPolicyRequestBodyGroupBy> groupBySetter) {
        if (this.groupBy == null) {
            this.groupBy = new SearchPolicyRequestBodyGroupBy();
            groupBySetter.accept(this.groupBy);
        }

        return this;
    }

    /**
     * Get groupBy
     * @return groupBy
     */
    public SearchPolicyRequestBodyGroupBy getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(SearchPolicyRequestBodyGroupBy groupBy) {
        this.groupBy = groupBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchPolicyRequestBody that = (SearchPolicyRequestBody) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.condition, that.condition) && Objects.equals(this.sort, that.sort)
            && Objects.equals(this.groupBy, that.groupBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, condition, sort, groupBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchPolicyRequestBody {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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
