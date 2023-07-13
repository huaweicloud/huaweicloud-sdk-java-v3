package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MetricOpenSearchParams
 */
public class MetricOpenSearchParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture_guid")

    private String architectureGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_name_description")

    private Boolean searchNameDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_sub_architecture")

    private Boolean includeSubArchitecture;

    public MetricOpenSearchParams withArchitectureGuid(String architectureGuid) {
        this.architectureGuid = architectureGuid;
        return this;
    }

    /**
     * 指标资产ID
     * @return architectureGuid
     */
    public String getArchitectureGuid() {
        return architectureGuid;
    }

    public void setArchitectureGuid(String architectureGuid) {
        this.architectureGuid = architectureGuid;
    }

    public MetricOpenSearchParams withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 查询条件
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public MetricOpenSearchParams withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次请求条数
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public MetricOpenSearchParams withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public MetricOpenSearchParams withSearchNameDescription(Boolean searchNameDescription) {
        this.searchNameDescription = searchNameDescription;
        return this;
    }

    /**
     * 是否按名称和描述搜索
     * @return searchNameDescription
     */
    public Boolean getSearchNameDescription() {
        return searchNameDescription;
    }

    public void setSearchNameDescription(Boolean searchNameDescription) {
        this.searchNameDescription = searchNameDescription;
    }

    public MetricOpenSearchParams withIncludeSubArchitecture(Boolean includeSubArchitecture) {
        this.includeSubArchitecture = includeSubArchitecture;
        return this;
    }

    /**
     * 是否查询子指标
     * @return includeSubArchitecture
     */
    public Boolean getIncludeSubArchitecture() {
        return includeSubArchitecture;
    }

    public void setIncludeSubArchitecture(Boolean includeSubArchitecture) {
        this.includeSubArchitecture = includeSubArchitecture;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricOpenSearchParams that = (MetricOpenSearchParams) obj;
        return Objects.equals(this.architectureGuid, that.architectureGuid) && Objects.equals(this.query, that.query)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.searchNameDescription, that.searchNameDescription)
            && Objects.equals(this.includeSubArchitecture, that.includeSubArchitecture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(architectureGuid, query, limit, offset, searchNameDescription, includeSubArchitecture);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricOpenSearchParams {\n");
        sb.append("    architectureGuid: ").append(toIndentedString(architectureGuid)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    searchNameDescription: ").append(toIndentedString(searchNameDescription)).append("\n");
        sb.append("    includeSubArchitecture: ").append(toIndentedString(includeSubArchitecture)).append("\n");
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
