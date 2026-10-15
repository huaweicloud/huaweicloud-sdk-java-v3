package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询数据过滤规则请求
 */
public class QueryDataFilterRuleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_type")

    private String filterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_rules")

    private Boolean isAllRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public QueryDataFilterRuleReq withFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * 数据过滤类型，取值分别是common、config。common表示简单条件过滤， config表示关联表过滤
     * @return filterType
     */
    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public QueryDataFilterRuleReq withIsAllRules(Boolean isAllRules) {
        this.isAllRules = isAllRules;
        return this;
    }

    /**
     * 标记是否查询全部过滤规则（含已同步和未下发的），即 true（查询所有）、false（仅查询已同步）
     * @return isAllRules
     */
    public Boolean getIsAllRules() {
        return isAllRules;
    }

    public void setIsAllRules(Boolean isAllRules) {
        this.isAllRules = isAllRules;
    }

    public QueryDataFilterRuleReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回记录的数量限制。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public QueryDataFilterRuleReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示查询该偏移量后面的记录。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryDataFilterRuleReq that = (QueryDataFilterRuleReq) obj;
        return Objects.equals(this.filterType, that.filterType) && Objects.equals(this.isAllRules, that.isAllRules)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterType, isAllRules, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDataFilterRuleReq {\n");
        sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
        sb.append("    isAllRules: ").append(toIndentedString(isAllRules)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
