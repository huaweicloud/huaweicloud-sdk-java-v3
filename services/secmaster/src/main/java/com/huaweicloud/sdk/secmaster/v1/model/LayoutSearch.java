package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 布局搜索条件
 */
public class LayoutSearch {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_by")

    private String usedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_code")

    private String bindingCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_built_in")

    private Boolean isBuiltIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_template")

    private Boolean isTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_type")

    private String layoutType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_txt")

    private String searchTxt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_date")

    private String fromDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_date")

    private String toDate;

    public LayoutSearch withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 布局名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LayoutSearch withUsedBy(String usedBy) {
        this.usedBy = usedBy;
        return this;
    }

    /**
     * 布局类型
     * @return usedBy
     */
    public String getUsedBy() {
        return usedBy;
    }

    public void setUsedBy(String usedBy) {
        this.usedBy = usedBy;
    }

    public LayoutSearch withBindingCode(String bindingCode) {
        this.bindingCode = bindingCode;
        return this;
    }

    /**
     * 创建布局选择的数据类的business_code
     * @return bindingCode
     */
    public String getBindingCode() {
        return bindingCode;
    }

    public void setBindingCode(String bindingCode) {
        this.bindingCode = bindingCode;
    }

    public LayoutSearch withIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
        return this;
    }

    /**
     * 是否为系统内置
     * @return isBuiltIn
     */
    public Boolean getIsBuiltIn() {
        return isBuiltIn;
    }

    public void setIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
    }

    public LayoutSearch withIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }

    /**
     * 是否为模板
     * @return isTemplate
     */
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public LayoutSearch withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 是否为默认布局
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public LayoutSearch withLayoutType(String layoutType) {
        this.layoutType = layoutType;
        return this;
    }

    /**
     * 布局页面类型
     * @return layoutType
     */
    public String getLayoutType() {
        return layoutType;
    }

    public void setLayoutType(String layoutType) {
        this.layoutType = layoutType;
    }

    public LayoutSearch withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页
     * minimum: 0
     * maximum: 65536
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public LayoutSearch withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页个数
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public LayoutSearch withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public LayoutSearch withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 升序或者降序排列
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public LayoutSearch withSearchTxt(String searchTxt) {
        this.searchTxt = searchTxt;
        return this;
    }

    /**
     * 搜索关键字
     * @return searchTxt
     */
    public String getSearchTxt() {
        return searchTxt;
    }

    public void setSearchTxt(String searchTxt) {
        this.searchTxt = searchTxt;
    }

    public LayoutSearch withFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * 起始时间
     * @return fromDate
     */
    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public LayoutSearch withToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * 结束时间
     * @return toDate
     */
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LayoutSearch that = (LayoutSearch) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.usedBy, that.usedBy)
            && Objects.equals(this.bindingCode, that.bindingCode) && Objects.equals(this.isBuiltIn, that.isBuiltIn)
            && Objects.equals(this.isTemplate, that.isTemplate) && Objects.equals(this.isDefault, that.isDefault)
            && Objects.equals(this.layoutType, that.layoutType) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.searchTxt, that.searchTxt)
            && Objects.equals(this.fromDate, that.fromDate) && Objects.equals(this.toDate, that.toDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            usedBy,
            bindingCode,
            isBuiltIn,
            isTemplate,
            isDefault,
            layoutType,
            offset,
            limit,
            sortKey,
            sortDir,
            searchTxt,
            fromDate,
            toDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LayoutSearch {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
        sb.append("    bindingCode: ").append(toIndentedString(bindingCode)).append("\n");
        sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    searchTxt: ").append(toIndentedString(searchTxt)).append("\n");
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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
