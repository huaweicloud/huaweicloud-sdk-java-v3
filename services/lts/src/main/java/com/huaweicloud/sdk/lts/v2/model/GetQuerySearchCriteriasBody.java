package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetQuerySearchCriteriasBody
 */
public class GetQuerySearchCriteriasBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criteria")

    private String criteria;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_type")

    private String searchType;

    public GetQuerySearchCriteriasBody withCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * 快速查询字段
     * @return criteria
     */
    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public GetQuerySearchCriteriasBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 快速查询名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetQuerySearchCriteriasBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 快速查询id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetQuerySearchCriteriasBody withSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }

    /**
     * 快速查询类型： 原始日志：ORIGINALLOG 可视化日志: VISUALIZATION
     * @return searchType
     */
    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetQuerySearchCriteriasBody getQuerySearchCriteriasBody = (GetQuerySearchCriteriasBody) o;
        return Objects.equals(this.criteria, getQuerySearchCriteriasBody.criteria)
            && Objects.equals(this.name, getQuerySearchCriteriasBody.name)
            && Objects.equals(this.id, getQuerySearchCriteriasBody.id)
            && Objects.equals(this.searchType, getQuerySearchCriteriasBody.searchType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criteria, name, id, searchType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetQuerySearchCriteriasBody {\n");
        sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
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
