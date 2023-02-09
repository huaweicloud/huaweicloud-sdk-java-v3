package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDatabasesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name_pattern")

    private String databaseNamePattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse_page")

    private Boolean reversePage;

    public ListDatabasesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例Id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListDatabasesRequest withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * catalog名字
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public ListDatabasesRequest withDatabaseNamePattern(String databaseNamePattern) {
        this.databaseNamePattern = databaseNamePattern;
        return this;
    }

    /**
     * 数据库名字通配符
     * @return databaseNamePattern
     */
    public String getDatabaseNamePattern() {
        return databaseNamePattern;
    }

    public void setDatabaseNamePattern(String databaseNamePattern) {
        this.databaseNamePattern = databaseNamePattern;
    }

    public ListDatabasesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回的条目数量
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDatabasesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 查询的起始记录ID
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListDatabasesRequest withReversePage(Boolean reversePage) {
        this.reversePage = reversePage;
        return this;
    }

    /**
     * 是否查询上一页
     * @return reversePage
     */
    public Boolean getReversePage() {
        return reversePage;
    }

    public void setReversePage(Boolean reversePage) {
        this.reversePage = reversePage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDatabasesRequest listDatabasesRequest = (ListDatabasesRequest) o;
        return Objects.equals(this.instanceId, listDatabasesRequest.instanceId)
            && Objects.equals(this.catalogName, listDatabasesRequest.catalogName)
            && Objects.equals(this.databaseNamePattern, listDatabasesRequest.databaseNamePattern)
            && Objects.equals(this.limit, listDatabasesRequest.limit)
            && Objects.equals(this.marker, listDatabasesRequest.marker)
            && Objects.equals(this.reversePage, listDatabasesRequest.reversePage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, catalogName, databaseNamePattern, limit, marker, reversePage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabasesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseNamePattern: ").append(toIndentedString(databaseNamePattern)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    reversePage: ").append(toIndentedString(reversePage)).append("\n");
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
