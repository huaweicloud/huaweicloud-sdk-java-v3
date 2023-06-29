package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CountMetaObjResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "functions_count")

    private Long functionsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogs_count")

    private Long catalogsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases_count")

    private Long databasesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables_count")

    private Long tablesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions_count")

    private Long partitionsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indexes_count")

    private Long indexesCount;

    public CountMetaObjResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数量
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public CountMetaObjResponse withFunctionsCount(Long functionsCount) {
        this.functionsCount = functionsCount;
        return this;
    }

    /**
     * 函数数量
     * @return functionsCount
     */
    public Long getFunctionsCount() {
        return functionsCount;
    }

    public void setFunctionsCount(Long functionsCount) {
        this.functionsCount = functionsCount;
    }

    public CountMetaObjResponse withCatalogsCount(Long catalogsCount) {
        this.catalogsCount = catalogsCount;
        return this;
    }

    /**
     * 目录数量
     * @return catalogsCount
     */
    public Long getCatalogsCount() {
        return catalogsCount;
    }

    public void setCatalogsCount(Long catalogsCount) {
        this.catalogsCount = catalogsCount;
    }

    public CountMetaObjResponse withDatabasesCount(Long databasesCount) {
        this.databasesCount = databasesCount;
        return this;
    }

    /**
     * 数据库数量
     * @return databasesCount
     */
    public Long getDatabasesCount() {
        return databasesCount;
    }

    public void setDatabasesCount(Long databasesCount) {
        this.databasesCount = databasesCount;
    }

    public CountMetaObjResponse withTablesCount(Long tablesCount) {
        this.tablesCount = tablesCount;
        return this;
    }

    /**
     * 表数量
     * @return tablesCount
     */
    public Long getTablesCount() {
        return tablesCount;
    }

    public void setTablesCount(Long tablesCount) {
        this.tablesCount = tablesCount;
    }

    public CountMetaObjResponse withPartitionsCount(Long partitionsCount) {
        this.partitionsCount = partitionsCount;
        return this;
    }

    /**
     * 分区数量
     * @return partitionsCount
     */
    public Long getPartitionsCount() {
        return partitionsCount;
    }

    public void setPartitionsCount(Long partitionsCount) {
        this.partitionsCount = partitionsCount;
    }

    public CountMetaObjResponse withIndexesCount(Long indexesCount) {
        this.indexesCount = indexesCount;
        return this;
    }

    /**
     * 索引数量
     * @return indexesCount
     */
    public Long getIndexesCount() {
        return indexesCount;
    }

    public void setIndexesCount(Long indexesCount) {
        this.indexesCount = indexesCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountMetaObjResponse that = (CountMetaObjResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.functionsCount, that.functionsCount)
            && Objects.equals(this.catalogsCount, that.catalogsCount)
            && Objects.equals(this.databasesCount, that.databasesCount)
            && Objects.equals(this.tablesCount, that.tablesCount)
            && Objects.equals(this.partitionsCount, that.partitionsCount)
            && Objects.equals(this.indexesCount, that.indexesCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount,
            functionsCount,
            catalogsCount,
            databasesCount,
            tablesCount,
            partitionsCount,
            indexesCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountMetaObjResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    functionsCount: ").append(toIndentedString(functionsCount)).append("\n");
        sb.append("    catalogsCount: ").append(toIndentedString(catalogsCount)).append("\n");
        sb.append("    databasesCount: ").append(toIndentedString(databasesCount)).append("\n");
        sb.append("    tablesCount: ").append(toIndentedString(tablesCount)).append("\n");
        sb.append("    partitionsCount: ").append(toIndentedString(partitionsCount)).append("\n");
        sb.append("    indexesCount: ").append(toIndentedString(indexesCount)).append("\n");
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
