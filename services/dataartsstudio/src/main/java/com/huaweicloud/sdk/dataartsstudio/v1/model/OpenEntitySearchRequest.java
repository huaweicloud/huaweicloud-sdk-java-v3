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
public class OpenEntitySearchRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_names")

    private List<String> typeNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_names")

    private List<String> connectionNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_all_attributes")

    private Boolean searchAllAttributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Object attributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_criteria")

    private FilterCriteria filterCriteria;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private TimeRange timeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scroll_id")

    private String scrollId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_levels")

    private List<String> securityLevels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_import")

    private Boolean isImport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classifications")

    private List<String> classifications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public OpenEntitySearchRequest withQuery(String query) {
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

    public OpenEntitySearchRequest withTypeNames(List<String> typeNames) {
        this.typeNames = typeNames;
        return this;
    }

    public OpenEntitySearchRequest addTypeNamesItem(String typeNamesItem) {
        if (this.typeNames == null) {
            this.typeNames = new ArrayList<>();
        }
        this.typeNames.add(typeNamesItem);
        return this;
    }

    public OpenEntitySearchRequest withTypeNames(Consumer<List<String>> typeNamesSetter) {
        if (this.typeNames == null) {
            this.typeNames = new ArrayList<>();
        }
        typeNamesSetter.accept(this.typeNames);
        return this;
    }

    /**
     * 分类名称 List<String>
     * @return typeNames
     */
    public List<String> getTypeNames() {
        return typeNames;
    }

    public void setTypeNames(List<String> typeNames) {
        this.typeNames = typeNames;
    }

    public OpenEntitySearchRequest withConnectionNames(List<String> connectionNames) {
        this.connectionNames = connectionNames;
        return this;
    }

    public OpenEntitySearchRequest addConnectionNamesItem(String connectionNamesItem) {
        if (this.connectionNames == null) {
            this.connectionNames = new ArrayList<>();
        }
        this.connectionNames.add(connectionNamesItem);
        return this;
    }

    public OpenEntitySearchRequest withConnectionNames(Consumer<List<String>> connectionNamesSetter) {
        if (this.connectionNames == null) {
            this.connectionNames = new ArrayList<>();
        }
        connectionNamesSetter.accept(this.connectionNames);
        return this;
    }

    /**
     * List<String> 连接名称
     * @return connectionNames
     */
    public List<String> getConnectionNames() {
        return connectionNames;
    }

    public void setConnectionNames(List<String> connectionNames) {
        this.connectionNames = connectionNames;
    }

    public OpenEntitySearchRequest withSearchAllAttributes(Boolean searchAllAttributes) {
        this.searchAllAttributes = searchAllAttributes;
        return this;
    }

    /**
     * 查询关键字是否匹配资产的名称描述信息，true:匹配所有属性，false:只匹配名称、描述，默认false
     * @return searchAllAttributes
     */
    public Boolean getSearchAllAttributes() {
        return searchAllAttributes;
    }

    public void setSearchAllAttributes(Boolean searchAllAttributes) {
        this.searchAllAttributes = searchAllAttributes;
    }

    public OpenEntitySearchRequest withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public OpenEntitySearchRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public OpenEntitySearchRequest withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * List<String> 标签的名称
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public OpenEntitySearchRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页显示每页返回结果数。默认值，10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public OpenEntitySearchRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，默认值，0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public OpenEntitySearchRequest withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * key当前支持Table，value可为以下中的一个或多个：rowCounts、tableSize、database、schema、namespace、ddlUpdateTime、dataUpdateTime、ddlCreateTime Map<String,Set<String>>
     * @return attributes
     */
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public OpenEntitySearchRequest withFilterCriteria(FilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
        return this;
    }

    public OpenEntitySearchRequest withFilterCriteria(Consumer<FilterCriteria> filterCriteriaSetter) {
        if (this.filterCriteria == null) {
            this.filterCriteria = new FilterCriteria();
            filterCriteriaSetter.accept(this.filterCriteria);
        }

        return this;
    }

    /**
     * Get filterCriteria
     * @return filterCriteria
     */
    public FilterCriteria getFilterCriteria() {
        return filterCriteria;
    }

    public void setFilterCriteria(FilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    public OpenEntitySearchRequest withTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public OpenEntitySearchRequest withTimeRange(Consumer<TimeRange> timeRangeSetter) {
        if (this.timeRange == null) {
            this.timeRange = new TimeRange();
            timeRangeSetter.accept(this.timeRange);
        }

        return this;
    }

    /**
     * Get timeRange
     * @return timeRange
     */
    public TimeRange getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
    }

    public OpenEntitySearchRequest withScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }

    /**
     * scroll_id
     * @return scrollId
     */
    public String getScrollId() {
        return scrollId;
    }

    public void setScrollId(String scrollId) {
        this.scrollId = scrollId;
    }

    public OpenEntitySearchRequest withSecurityLevels(List<String> securityLevels) {
        this.securityLevels = securityLevels;
        return this;
    }

    public OpenEntitySearchRequest addSecurityLevelsItem(String securityLevelsItem) {
        if (this.securityLevels == null) {
            this.securityLevels = new ArrayList<>();
        }
        this.securityLevels.add(securityLevelsItem);
        return this;
    }

    public OpenEntitySearchRequest withSecurityLevels(Consumer<List<String>> securityLevelsSetter) {
        if (this.securityLevels == null) {
            this.securityLevels = new ArrayList<>();
        }
        securityLevelsSetter.accept(this.securityLevels);
        return this;
    }

    /**
     * List<String> 安全级别
     * @return securityLevels
     */
    public List<String> getSecurityLevels() {
        return securityLevels;
    }

    public void setSecurityLevels(List<String> securityLevels) {
        this.securityLevels = securityLevels;
    }

    public OpenEntitySearchRequest withIsImport(Boolean isImport) {
        this.isImport = isImport;
        return this;
    }

    /**
     * 是否导入
     * @return isImport
     */
    public Boolean getIsImport() {
        return isImport;
    }

    public void setIsImport(Boolean isImport) {
        this.isImport = isImport;
    }

    public OpenEntitySearchRequest withClassifications(List<String> classifications) {
        this.classifications = classifications;
        return this;
    }

    public OpenEntitySearchRequest addClassificationsItem(String classificationsItem) {
        if (this.classifications == null) {
            this.classifications = new ArrayList<>();
        }
        this.classifications.add(classificationsItem);
        return this;
    }

    public OpenEntitySearchRequest withClassifications(Consumer<List<String>> classificationsSetter) {
        if (this.classifications == null) {
            this.classifications = new ArrayList<>();
        }
        classificationsSetter.accept(this.classifications);
        return this;
    }

    /**
     * List<String> 分类
     * @return classifications
     */
    public List<String> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<String> classifications) {
        this.classifications = classifications;
    }

    public OpenEntitySearchRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenEntitySearchRequest that = (OpenEntitySearchRequest) obj;
        return Objects.equals(this.query, that.query) && Objects.equals(this.typeNames, that.typeNames)
            && Objects.equals(this.connectionNames, that.connectionNames)
            && Objects.equals(this.searchAllAttributes, that.searchAllAttributes)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.attributes, that.attributes)
            && Objects.equals(this.filterCriteria, that.filterCriteria)
            && Objects.equals(this.timeRange, that.timeRange) && Objects.equals(this.scrollId, that.scrollId)
            && Objects.equals(this.securityLevels, that.securityLevels) && Objects.equals(this.isImport, that.isImport)
            && Objects.equals(this.classifications, that.classifications)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(query,
            typeNames,
            connectionNames,
            searchAllAttributes,
            tags,
            limit,
            offset,
            attributes,
            filterCriteria,
            timeRange,
            scrollId,
            securityLevels,
            isImport,
            classifications,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenEntitySearchRequest {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    typeNames: ").append(toIndentedString(typeNames)).append("\n");
        sb.append("    connectionNames: ").append(toIndentedString(connectionNames)).append("\n");
        sb.append("    searchAllAttributes: ").append(toIndentedString(searchAllAttributes)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    filterCriteria: ").append(toIndentedString(filterCriteria)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
        sb.append("    scrollId: ").append(toIndentedString(scrollId)).append("\n");
        sb.append("    securityLevels: ").append(toIndentedString(securityLevels)).append("\n");
        sb.append("    isImport: ").append(toIndentedString(isImport)).append("\n");
        sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
