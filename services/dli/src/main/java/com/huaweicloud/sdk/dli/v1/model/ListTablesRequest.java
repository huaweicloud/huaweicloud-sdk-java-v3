package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTablesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with-detail")

    private Boolean withDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page-size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current-page")

    private Integer currentPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with-priv")

    private Boolean withPriv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table-type")

    private String tableType;

    public ListTablesRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 查看表所在的数据库名称。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ListTablesRequest withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 过滤表名称的关键词。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListTablesRequest withWithDetail(Boolean withDetail) {
        this.withDetail = withDetail;
        return this;
    }

    /**
     * 是否获取表的详细信息（所有者，size等）。
     * @return withDetail
     */
    public Boolean getWithDetail() {
        return withDetail;
    }

    public void setWithDetail(Boolean withDetail) {
        this.withDetail = withDetail;
    }

    public ListTablesRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页大小
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListTablesRequest withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * 当前页数
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public ListTablesRequest withWithPriv(Boolean withPriv) {
        this.withPriv = withPriv;
        return this;
    }

    /**
     * 是否返回权限信息
     * @return withPriv
     */
    public Boolean getWithPriv() {
        return withPriv;
    }

    public void setWithPriv(Boolean withPriv) {
        this.withPriv = withPriv;
    }

    public ListTablesRequest withTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 表类型
     * @return tableType
     */
    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTablesRequest listTablesRequest = (ListTablesRequest) o;
        return Objects.equals(this.databaseName, listTablesRequest.databaseName)
            && Objects.equals(this.keyword, listTablesRequest.keyword)
            && Objects.equals(this.withDetail, listTablesRequest.withDetail)
            && Objects.equals(this.pageSize, listTablesRequest.pageSize)
            && Objects.equals(this.currentPage, listTablesRequest.currentPage)
            && Objects.equals(this.withPriv, listTablesRequest.withPriv)
            && Objects.equals(this.tableType, listTablesRequest.tableType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, keyword, withDetail, pageSize, currentPage, withPriv, tableType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTablesRequest {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    withDetail: ").append(toIndentedString(withDetail)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    withPriv: ").append(toIndentedString(withPriv)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
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
