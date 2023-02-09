package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListFunctionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_name_pattern")

    private String functionNamePattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse_page")

    private Boolean reversePage;

    public ListFunctionsRequest withInstanceId(String instanceId) {
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

    public ListFunctionsRequest withCatalogName(String catalogName) {
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

    public ListFunctionsRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名字
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ListFunctionsRequest withFunctionNamePattern(String functionNamePattern) {
        this.functionNamePattern = functionNamePattern;
        return this;
    }

    /**
     * 函数名通配符
     * @return functionNamePattern
     */
    public String getFunctionNamePattern() {
        return functionNamePattern;
    }

    public void setFunctionNamePattern(String functionNamePattern) {
        this.functionNamePattern = functionNamePattern;
    }

    public ListFunctionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回满足条件的function数量
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListFunctionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 当前查询的起始位置
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListFunctionsRequest withReversePage(Boolean reversePage) {
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
        ListFunctionsRequest listFunctionsRequest = (ListFunctionsRequest) o;
        return Objects.equals(this.instanceId, listFunctionsRequest.instanceId)
            && Objects.equals(this.catalogName, listFunctionsRequest.catalogName)
            && Objects.equals(this.databaseName, listFunctionsRequest.databaseName)
            && Objects.equals(this.functionNamePattern, listFunctionsRequest.functionNamePattern)
            && Objects.equals(this.limit, listFunctionsRequest.limit)
            && Objects.equals(this.marker, listFunctionsRequest.marker)
            && Objects.equals(this.reversePage, listFunctionsRequest.reversePage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, catalogName, databaseName, functionNamePattern, limit, marker, reversePage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    functionNamePattern: ").append(toIndentedString(functionNamePattern)).append("\n");
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
