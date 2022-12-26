package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateSearchCriteriasBody
 */
public class CreateSearchCriteriasBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criteria")

    private String criteria;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "epsId")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_type")

    private String searchType;

    public CreateSearchCriteriasBody withCriteria(String criteria) {
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

    public CreateSearchCriteriasBody withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目id
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public CreateSearchCriteriasBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建快速查询名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSearchCriteriasBody withSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }

    /**
     * 查询类型 原始日志：ORIGINALLOG 可视化日志: VISUALIZATION
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
        CreateSearchCriteriasBody createSearchCriteriasBody = (CreateSearchCriteriasBody) o;
        return Objects.equals(this.criteria, createSearchCriteriasBody.criteria)
            && Objects.equals(this.epsId, createSearchCriteriasBody.epsId)
            && Objects.equals(this.name, createSearchCriteriasBody.name)
            && Objects.equals(this.searchType, createSearchCriteriasBody.searchType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criteria, epsId, name, searchType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSearchCriteriasBody {\n");
        sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
