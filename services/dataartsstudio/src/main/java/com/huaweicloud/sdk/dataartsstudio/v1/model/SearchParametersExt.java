package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求参数
 */
public class SearchParametersExt {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Object attributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classifications")

    private List<String> classifications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_names")

    private List<String> connectionNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_classifications")

    private Boolean excludeClassifications;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_security_levels")

    private Boolean excludeSecurityLevels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_tags")

    private Boolean excludeTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_classification_attributes")

    private Boolean includeClassificationAttributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_sub_classifications")

    private Boolean includeSubClassifications;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_name_and_description")

    private Boolean searchNameAndDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_levels")

    private List<String> securityLevels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "term_names")

    private List<String> termNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_names")

    private List<String> typeNames = null;

    public SearchParametersExt withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * 属性
     * @return attributes
     */
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public SearchParametersExt withClassifications(List<String> classifications) {
        this.classifications = classifications;
        return this;
    }

    public SearchParametersExt addClassificationsItem(String classificationsItem) {
        if (this.classifications == null) {
            this.classifications = new ArrayList<>();
        }
        this.classifications.add(classificationsItem);
        return this;
    }

    public SearchParametersExt withClassifications(Consumer<List<String>> classificationsSetter) {
        if (this.classifications == null) {
            this.classifications = new ArrayList<>();
        }
        classificationsSetter.accept(this.classifications);
        return this;
    }

    /**
     * 分类
     * @return classifications
     */
    public List<String> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<String> classifications) {
        this.classifications = classifications;
    }

    public SearchParametersExt withConnectionNames(List<String> connectionNames) {
        this.connectionNames = connectionNames;
        return this;
    }

    public SearchParametersExt addConnectionNamesItem(String connectionNamesItem) {
        if (this.connectionNames == null) {
            this.connectionNames = new ArrayList<>();
        }
        this.connectionNames.add(connectionNamesItem);
        return this;
    }

    public SearchParametersExt withConnectionNames(Consumer<List<String>> connectionNamesSetter) {
        if (this.connectionNames == null) {
            this.connectionNames = new ArrayList<>();
        }
        connectionNamesSetter.accept(this.connectionNames);
        return this;
    }

    /**
     * 数据连接
     * @return connectionNames
     */
    public List<String> getConnectionNames() {
        return connectionNames;
    }

    public void setConnectionNames(List<String> connectionNames) {
        this.connectionNames = connectionNames;
    }

    public SearchParametersExt withExcludeClassifications(Boolean excludeClassifications) {
        this.excludeClassifications = excludeClassifications;
        return this;
    }

    /**
     * 是否排除分类
     * @return excludeClassifications
     */
    public Boolean getExcludeClassifications() {
        return excludeClassifications;
    }

    public void setExcludeClassifications(Boolean excludeClassifications) {
        this.excludeClassifications = excludeClassifications;
    }

    public SearchParametersExt withExcludeSecurityLevels(Boolean excludeSecurityLevels) {
        this.excludeSecurityLevels = excludeSecurityLevels;
        return this;
    }

    /**
     * 是否排除密级
     * @return excludeSecurityLevels
     */
    public Boolean getExcludeSecurityLevels() {
        return excludeSecurityLevels;
    }

    public void setExcludeSecurityLevels(Boolean excludeSecurityLevels) {
        this.excludeSecurityLevels = excludeSecurityLevels;
    }

    public SearchParametersExt withExcludeTags(Boolean excludeTags) {
        this.excludeTags = excludeTags;
        return this;
    }

    /**
     * 是否排除标签
     * @return excludeTags
     */
    public Boolean getExcludeTags() {
        return excludeTags;
    }

    public void setExcludeTags(Boolean excludeTags) {
        this.excludeTags = excludeTags;
    }

    public SearchParametersExt withIncludeClassificationAttributes(Boolean includeClassificationAttributes) {
        this.includeClassificationAttributes = includeClassificationAttributes;
        return this;
    }

    /**
     * 包含分类属性
     * @return includeClassificationAttributes
     */
    public Boolean getIncludeClassificationAttributes() {
        return includeClassificationAttributes;
    }

    public void setIncludeClassificationAttributes(Boolean includeClassificationAttributes) {
        this.includeClassificationAttributes = includeClassificationAttributes;
    }

    public SearchParametersExt withIncludeSubClassifications(Boolean includeSubClassifications) {
        this.includeSubClassifications = includeSubClassifications;
        return this;
    }

    /**
     * 包含子分类
     * @return includeSubClassifications
     */
    public Boolean getIncludeSubClassifications() {
        return includeSubClassifications;
    }

    public void setIncludeSubClassifications(Boolean includeSubClassifications) {
        this.includeSubClassifications = includeSubClassifications;
    }

    public SearchParametersExt withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页参数，每页限制数量，默认查询所有
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchParametersExt withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页参数，偏移量，默认查询所有
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchParametersExt withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 排序方式
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public SearchParametersExt withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 查询参数
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public SearchParametersExt withSearchNameAndDescription(Boolean searchNameAndDescription) {
        this.searchNameAndDescription = searchNameAndDescription;
        return this;
    }

    /**
     * 是否按名称和描述搜索
     * @return searchNameAndDescription
     */
    public Boolean getSearchNameAndDescription() {
        return searchNameAndDescription;
    }

    public void setSearchNameAndDescription(Boolean searchNameAndDescription) {
        this.searchNameAndDescription = searchNameAndDescription;
    }

    public SearchParametersExt withSecurityLevels(List<String> securityLevels) {
        this.securityLevels = securityLevels;
        return this;
    }

    public SearchParametersExt addSecurityLevelsItem(String securityLevelsItem) {
        if (this.securityLevels == null) {
            this.securityLevels = new ArrayList<>();
        }
        this.securityLevels.add(securityLevelsItem);
        return this;
    }

    public SearchParametersExt withSecurityLevels(Consumer<List<String>> securityLevelsSetter) {
        if (this.securityLevels == null) {
            this.securityLevels = new ArrayList<>();
        }
        securityLevelsSetter.accept(this.securityLevels);
        return this;
    }

    /**
     * 安全密级列表
     * @return securityLevels
     */
    public List<String> getSecurityLevels() {
        return securityLevels;
    }

    public void setSecurityLevels(List<String> securityLevels) {
        this.securityLevels = securityLevels;
    }

    public SearchParametersExt withTermNames(List<String> termNames) {
        this.termNames = termNames;
        return this;
    }

    public SearchParametersExt addTermNamesItem(String termNamesItem) {
        if (this.termNames == null) {
            this.termNames = new ArrayList<>();
        }
        this.termNames.add(termNamesItem);
        return this;
    }

    public SearchParametersExt withTermNames(Consumer<List<String>> termNamesSetter) {
        if (this.termNames == null) {
            this.termNames = new ArrayList<>();
        }
        termNamesSetter.accept(this.termNames);
        return this;
    }

    /**
     * 标签列表
     * @return termNames
     */
    public List<String> getTermNames() {
        return termNames;
    }

    public void setTermNames(List<String> termNames) {
        this.termNames = termNames;
    }

    public SearchParametersExt withTypeNames(List<String> typeNames) {
        this.typeNames = typeNames;
        return this;
    }

    public SearchParametersExt addTypeNamesItem(String typeNamesItem) {
        if (this.typeNames == null) {
            this.typeNames = new ArrayList<>();
        }
        this.typeNames.add(typeNamesItem);
        return this;
    }

    public SearchParametersExt withTypeNames(Consumer<List<String>> typeNamesSetter) {
        if (this.typeNames == null) {
            this.typeNames = new ArrayList<>();
        }
        typeNamesSetter.accept(this.typeNames);
        return this;
    }

    /**
     * 类型列表
     * @return typeNames
     */
    public List<String> getTypeNames() {
        return typeNames;
    }

    public void setTypeNames(List<String> typeNames) {
        this.typeNames = typeNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchParametersExt searchParametersExt = (SearchParametersExt) o;
        return Objects.equals(this.attributes, searchParametersExt.attributes)
            && Objects.equals(this.classifications, searchParametersExt.classifications)
            && Objects.equals(this.connectionNames, searchParametersExt.connectionNames)
            && Objects.equals(this.excludeClassifications, searchParametersExt.excludeClassifications)
            && Objects.equals(this.excludeSecurityLevels, searchParametersExt.excludeSecurityLevels)
            && Objects.equals(this.excludeTags, searchParametersExt.excludeTags)
            && Objects.equals(this.includeClassificationAttributes, searchParametersExt.includeClassificationAttributes)
            && Objects.equals(this.includeSubClassifications, searchParametersExt.includeSubClassifications)
            && Objects.equals(this.limit, searchParametersExt.limit)
            && Objects.equals(this.offset, searchParametersExt.offset)
            && Objects.equals(this.order, searchParametersExt.order)
            && Objects.equals(this.query, searchParametersExt.query)
            && Objects.equals(this.searchNameAndDescription, searchParametersExt.searchNameAndDescription)
            && Objects.equals(this.securityLevels, searchParametersExt.securityLevels)
            && Objects.equals(this.termNames, searchParametersExt.termNames)
            && Objects.equals(this.typeNames, searchParametersExt.typeNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributes,
            classifications,
            connectionNames,
            excludeClassifications,
            excludeSecurityLevels,
            excludeTags,
            includeClassificationAttributes,
            includeSubClassifications,
            limit,
            offset,
            order,
            query,
            searchNameAndDescription,
            securityLevels,
            termNames,
            typeNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchParametersExt {\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
        sb.append("    connectionNames: ").append(toIndentedString(connectionNames)).append("\n");
        sb.append("    excludeClassifications: ").append(toIndentedString(excludeClassifications)).append("\n");
        sb.append("    excludeSecurityLevels: ").append(toIndentedString(excludeSecurityLevels)).append("\n");
        sb.append("    excludeTags: ").append(toIndentedString(excludeTags)).append("\n");
        sb.append("    includeClassificationAttributes: ")
            .append(toIndentedString(includeClassificationAttributes))
            .append("\n");
        sb.append("    includeSubClassifications: ").append(toIndentedString(includeSubClassifications)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    searchNameAndDescription: ").append(toIndentedString(searchNameAndDescription)).append("\n");
        sb.append("    securityLevels: ").append(toIndentedString(securityLevels)).append("\n");
        sb.append("    termNames: ").append(toIndentedString(termNames)).append("\n");
        sb.append("    typeNames: ").append(toIndentedString(typeNames)).append("\n");
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
