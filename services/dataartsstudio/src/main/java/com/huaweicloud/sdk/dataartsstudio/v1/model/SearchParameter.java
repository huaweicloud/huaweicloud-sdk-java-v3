package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产查询条件
 */
public class SearchParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private DataMapFilterCriteria filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "facets")

    private List<String> facets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relationship_attributes")

    private List<String> relationshipAttributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private List<Sort> sort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_privilege")

    private Boolean queryPrivilege;

    public SearchParameter withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 查询关键字
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public SearchParameter withFilter(DataMapFilterCriteria filter) {
        this.filter = filter;
        return this;
    }

    public SearchParameter withFilter(Consumer<DataMapFilterCriteria> filterSetter) {
        if (this.filter == null) {
            this.filter = new DataMapFilterCriteria();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public DataMapFilterCriteria getFilter() {
        return filter;
    }

    public void setFilter(DataMapFilterCriteria filter) {
        this.filter = filter;
    }

    public SearchParameter withFacets(List<String> facets) {
        this.facets = facets;
        return this;
    }

    public SearchParameter addFacetsItem(String facetsItem) {
        if (this.facets == null) {
            this.facets = new ArrayList<>();
        }
        this.facets.add(facetsItem);
        return this;
    }

    public SearchParameter withFacets(Consumer<List<String>> facetsSetter) {
        if (this.facets == null) {
            this.facets = new ArrayList<>();
        }
        facetsSetter.accept(this.facets);
        return this;
    }

    /**
     * 条件参数列表
     * @return facets
     */
    public List<String> getFacets() {
        return facets;
    }

    public void setFacets(List<String> facets) {
        this.facets = facets;
    }

    public SearchParameter withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页显示每页返回结果数。默认值100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchParameter withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，默认值0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchParameter withRelationshipAttributes(List<String> relationshipAttributes) {
        this.relationshipAttributes = relationshipAttributes;
        return this;
    }

    public SearchParameter addRelationshipAttributesItem(String relationshipAttributesItem) {
        if (this.relationshipAttributes == null) {
            this.relationshipAttributes = new ArrayList<>();
        }
        this.relationshipAttributes.add(relationshipAttributesItem);
        return this;
    }

    public SearchParameter withRelationshipAttributes(Consumer<List<String>> relationshipAttributesSetter) {
        if (this.relationshipAttributes == null) {
            this.relationshipAttributes = new ArrayList<>();
        }
        relationshipAttributesSetter.accept(this.relationshipAttributes);
        return this;
    }

    /**
     * 关联关系属性
     * @return relationshipAttributes
     */
    public List<String> getRelationshipAttributes() {
        return relationshipAttributes;
    }

    public void setRelationshipAttributes(List<String> relationshipAttributes) {
        this.relationshipAttributes = relationshipAttributes;
    }

    public SearchParameter withSort(List<Sort> sort) {
        this.sort = sort;
        return this;
    }

    public SearchParameter addSortItem(Sort sortItem) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        this.sort.add(sortItem);
        return this;
    }

    public SearchParameter withSort(Consumer<List<Sort>> sortSetter) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        sortSetter.accept(this.sort);
        return this;
    }

    /**
     * 排序信息
     * @return sort
     */
    public List<Sort> getSort() {
        return sort;
    }

    public void setSort(List<Sort> sort) {
        this.sort = sort;
    }

    public SearchParameter withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 所有者
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public SearchParameter withQueryPrivilege(Boolean queryPrivilege) {
        this.queryPrivilege = queryPrivilege;
        return this;
    }

    /**
     * 是否校验权限，默认值false
     * @return queryPrivilege
     */
    public Boolean getQueryPrivilege() {
        return queryPrivilege;
    }

    public void setQueryPrivilege(Boolean queryPrivilege) {
        this.queryPrivilege = queryPrivilege;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchParameter that = (SearchParameter) obj;
        return Objects.equals(this.query, that.query) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.facets, that.facets) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.relationshipAttributes, that.relationshipAttributes)
            && Objects.equals(this.sort, that.sort) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.queryPrivilege, that.queryPrivilege);
    }

    @Override
    public int hashCode() {
        return Objects.hash(query, filter, facets, limit, offset, relationshipAttributes, sort, owner, queryPrivilege);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchParameter {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    relationshipAttributes: ").append(toIndentedString(relationshipAttributes)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    queryPrivilege: ").append(toIndentedString(queryPrivilege)).append("\n");
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
