package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SearchCheckitemsRequestBody
 */
public class SearchCheckitemsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_uuid")

    private String catalogUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_package_id")

    private String compliancePackageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_list")

    private List<Integer> sourceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private SearchCheckitemsRequestBodyCondition condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_mode")

    private String queryMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    public SearchCheckitemsRequestBody withCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }

    /**
     * 检查项所属的目录id
     * @return catalogUuid
     */
    public String getCatalogUuid() {
        return catalogUuid;
    }

    public void setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
    }

    public SearchCheckitemsRequestBody withCompliancePackageId(String compliancePackageId) {
        this.compliancePackageId = compliancePackageId;
        return this;
    }

    /**
     * 检查项所属的遵从包id
     * @return compliancePackageId
     */
    public String getCompliancePackageId() {
        return compliancePackageId;
    }

    public void setCompliancePackageId(String compliancePackageId) {
        this.compliancePackageId = compliancePackageId;
    }

    public SearchCheckitemsRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchCheckitemsRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示查询该偏移量后面的记录
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchCheckitemsRequestBody withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 排序关键字
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public SearchCheckitemsRequestBody withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 降序或升序 DESC：降序 ASC: 升序
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public SearchCheckitemsRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 按照检查项名称进行筛选
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SearchCheckitemsRequestBody withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 按照检查项建议进行筛选
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public SearchCheckitemsRequestBody withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 表示该检查项的类型 0：内 1: 自定义
     * minimum: 0
     * maximum: 1000
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public SearchCheckitemsRequestBody withSourceList(List<Integer> sourceList) {
        this.sourceList = sourceList;
        return this;
    }

    public SearchCheckitemsRequestBody addSourceListItem(Integer sourceListItem) {
        if (this.sourceList == null) {
            this.sourceList = new ArrayList<>();
        }
        this.sourceList.add(sourceListItem);
        return this;
    }

    public SearchCheckitemsRequestBody withSourceList(Consumer<List<Integer>> sourceListSetter) {
        if (this.sourceList == null) {
            this.sourceList = new ArrayList<>();
        }
        sourceListSetter.accept(this.sourceList);
        return this;
    }

    /**
     * 按照检查项对的执行方式进行筛选。0：kotlin; 2：剧本流程；3：手动；4：主机接入
     * @return sourceList
     */
    public List<Integer> getSourceList() {
        return sourceList;
    }

    public void setSourceList(List<Integer> sourceList) {
        this.sourceList = sourceList;
    }

    public SearchCheckitemsRequestBody withCondition(SearchCheckitemsRequestBodyCondition condition) {
        this.condition = condition;
        return this;
    }

    public SearchCheckitemsRequestBody withCondition(Consumer<SearchCheckitemsRequestBodyCondition> conditionSetter) {
        if (this.condition == null) {
            this.condition = new SearchCheckitemsRequestBodyCondition();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public SearchCheckitemsRequestBodyCondition getCondition() {
        return condition;
    }

    public void setCondition(SearchCheckitemsRequestBodyCondition condition) {
        this.condition = condition;
    }

    public SearchCheckitemsRequestBody withQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }

    /**
     * 按照什么维度进行筛选
     * @return queryMode
     */
    public String getQueryMode() {
        return queryMode;
    }

    public void setQueryMode(String queryMode) {
        this.queryMode = queryMode;
    }

    public SearchCheckitemsRequestBody withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 按照检查项严重等级进行筛选 Fatal：致命 High：高危 Medium：中危 Low：低危 Tips：提示
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchCheckitemsRequestBody that = (SearchCheckitemsRequestBody) obj;
        return Objects.equals(this.catalogUuid, that.catalogUuid)
            && Objects.equals(this.compliancePackageId, that.compliancePackageId)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.sortBy, that.sortBy) && Objects.equals(this.order, that.order)
            && Objects.equals(this.name, that.name) && Objects.equals(this.suggestion, that.suggestion)
            && Objects.equals(this.type, that.type) && Objects.equals(this.sourceList, that.sourceList)
            && Objects.equals(this.condition, that.condition) && Objects.equals(this.queryMode, that.queryMode)
            && Objects.equals(this.severity, that.severity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogUuid,
            compliancePackageId,
            limit,
            offset,
            sortBy,
            order,
            name,
            suggestion,
            type,
            sourceList,
            condition,
            queryMode,
            severity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCheckitemsRequestBody {\n");
        sb.append("    catalogUuid: ").append(toIndentedString(catalogUuid)).append("\n");
        sb.append("    compliancePackageId: ").append(toIndentedString(compliancePackageId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sourceList: ").append(toIndentedString(sourceList)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    queryMode: ").append(toIndentedString(queryMode)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
