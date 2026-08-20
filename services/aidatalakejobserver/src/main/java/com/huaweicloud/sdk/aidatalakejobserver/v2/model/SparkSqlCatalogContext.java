package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SparkSqlCatalogContext
 */
public class SparkSqlCatalogContext {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    public SparkSqlCatalogContext withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * **参数解释**：Catalog名称，用于指定作业使用的数据目录。可在控制台的Catalog管理页面查看，或通过查询Catalog列表接口获取。 **约束限制**：不涉及。 **取值范围**：不超过128个字符。 **默认取值**：不涉及。 
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public SparkSqlCatalogContext withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释**：默认数据库名称，用于指定作业默认操作的数据库。如果未指定，则使用Catalog的默认数据库。 **约束限制**：不涉及。 **取值范围**：不超过128个字符。 **默认取值**：不涉及。 
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkSqlCatalogContext that = (SparkSqlCatalogContext) obj;
        return Objects.equals(this.catalogName, that.catalogName)
            && Objects.equals(this.databaseName, that.databaseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogName, databaseName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkSqlCatalogContext {\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
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
