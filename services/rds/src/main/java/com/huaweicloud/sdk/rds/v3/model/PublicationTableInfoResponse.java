package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 发布表详情。
 */
public class PublicationTableInfoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<String> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key")

    private List<String> primaryKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_statement")

    private String filterStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private PublicationTableFilterInfoResponse filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "article_properties")

    private ArticlePropertiesResponse articleProperties;

    public PublicationTableInfoResponse withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public PublicationTableInfoResponse withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * 命名空间。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public PublicationTableInfoResponse withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    public PublicationTableInfoResponse addColumnsItem(String columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public PublicationTableInfoResponse withColumns(Consumer<List<String>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 发布的字段（未传或为空说明选择所有字段）。
     * @return columns
     */
    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public PublicationTableInfoResponse withPrimaryKey(List<String> primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    public PublicationTableInfoResponse addPrimaryKeyItem(String primaryKeyItem) {
        if (this.primaryKey == null) {
            this.primaryKey = new ArrayList<>();
        }
        this.primaryKey.add(primaryKeyItem);
        return this;
    }

    public PublicationTableInfoResponse withPrimaryKey(Consumer<List<String>> primaryKeySetter) {
        if (this.primaryKey == null) {
            this.primaryKey = new ArrayList<>();
        }
        primaryKeySetter.accept(this.primaryKey);
        return this;
    }

    /**
     * 主键。
     * @return primaryKey
     */
    public List<String> getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(List<String> primaryKey) {
        this.primaryKey = primaryKey;
    }

    public PublicationTableInfoResponse withFilterStatement(String filterStatement) {
        this.filterStatement = filterStatement;
        return this;
    }

    /**
     * 筛选语句。
     * @return filterStatement
     */
    public String getFilterStatement() {
        return filterStatement;
    }

    public void setFilterStatement(String filterStatement) {
        this.filterStatement = filterStatement;
    }

    public PublicationTableInfoResponse withFilter(PublicationTableFilterInfoResponse filter) {
        this.filter = filter;
        return this;
    }

    public PublicationTableInfoResponse withFilter(Consumer<PublicationTableFilterInfoResponse> filterSetter) {
        if (this.filter == null) {
            this.filter = new PublicationTableFilterInfoResponse();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public PublicationTableFilterInfoResponse getFilter() {
        return filter;
    }

    public void setFilter(PublicationTableFilterInfoResponse filter) {
        this.filter = filter;
    }

    public PublicationTableInfoResponse withArticleProperties(ArticlePropertiesResponse articleProperties) {
        this.articleProperties = articleProperties;
        return this;
    }

    public PublicationTableInfoResponse withArticleProperties(
        Consumer<ArticlePropertiesResponse> articlePropertiesSetter) {
        if (this.articleProperties == null) {
            this.articleProperties = new ArticlePropertiesResponse();
            articlePropertiesSetter.accept(this.articleProperties);
        }

        return this;
    }

    /**
     * Get articleProperties
     * @return articleProperties
     */
    public ArticlePropertiesResponse getArticleProperties() {
        return articleProperties;
    }

    public void setArticleProperties(ArticlePropertiesResponse articleProperties) {
        this.articleProperties = articleProperties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicationTableInfoResponse that = (PublicationTableInfoResponse) obj;
        return Objects.equals(this.tableName, that.tableName) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.columns, that.columns) && Objects.equals(this.primaryKey, that.primaryKey)
            && Objects.equals(this.filterStatement, that.filterStatement) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.articleProperties, that.articleProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName, schema, columns, primaryKey, filterStatement, filter, articleProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicationTableInfoResponse {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    filterStatement: ").append(toIndentedString(filterStatement)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    articleProperties: ").append(toIndentedString(articleProperties)).append("\n");
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
