package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryRequirementsOverviewInfo
 */
public class QueryRequirementsOverviewInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_version_id")

    private String fixedVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pi_filter")

    private PiFilterInfo piFilter;

    public QueryRequirementsOverviewInfo withFixedVersionId(String fixedVersionId) {
        this.fixedVersionId = fixedVersionId;
        return this;
    }

    /**
     * 筛选迭代ID
     * @return fixedVersionId
     */
    public String getFixedVersionId() {
        return fixedVersionId;
    }

    public void setFixedVersionId(String fixedVersionId) {
        this.fixedVersionId = fixedVersionId;
    }

    public QueryRequirementsOverviewInfo withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块ID
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public QueryRequirementsOverviewInfo withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    /**
     * 关键字
     * @return keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public QueryRequirementsOverviewInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页数量
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public QueryRequirementsOverviewInfo withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 页码
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public QueryRequirementsOverviewInfo withPiFilter(PiFilterInfo piFilter) {
        this.piFilter = piFilter;
        return this;
    }

    public QueryRequirementsOverviewInfo withPiFilter(Consumer<PiFilterInfo> piFilterSetter) {
        if (this.piFilter == null) {
            this.piFilter = new PiFilterInfo();
            piFilterSetter.accept(this.piFilter);
        }

        return this;
    }

    /**
     * Get piFilter
     * @return piFilter
     */
    public PiFilterInfo getPiFilter() {
        return piFilter;
    }

    public void setPiFilter(PiFilterInfo piFilter) {
        this.piFilter = piFilter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryRequirementsOverviewInfo that = (QueryRequirementsOverviewInfo) obj;
        return Objects.equals(this.fixedVersionId, that.fixedVersionId) && Objects.equals(this.moduleId, that.moduleId)
            && Objects.equals(this.keyWord, that.keyWord) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.pageNo, that.pageNo) && Objects.equals(this.piFilter, that.piFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fixedVersionId, moduleId, keyWord, pageSize, pageNo, piFilter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryRequirementsOverviewInfo {\n");
        sb.append("    fixedVersionId: ").append(toIndentedString(fixedVersionId)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    piFilter: ").append(toIndentedString(piFilter)).append("\n");
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
