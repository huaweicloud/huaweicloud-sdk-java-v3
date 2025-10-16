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
public class PublicationTableInfoRequest {

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

    private PublicationTableFilterInfoRequest filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "article_properties")

    private ArticlePropertiesRequest articleProperties;

    public PublicationTableInfoRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名。  表名长度可在1～64个字符之间，由字母、数字或下划线组成，不能包含其他特殊字符
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public PublicationTableInfoRequest withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * 命名空间。默认值dbo。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public PublicationTableInfoRequest withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    public PublicationTableInfoRequest addColumnsItem(String columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public PublicationTableInfoRequest withColumns(Consumer<List<String>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 发布的字段（不传或为空说明选择所有字段）。  字段名称长度可在1～64个字符之间，由字母、数字或下划线组成，不能包含其他特殊字符
     * @return columns
     */
    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public PublicationTableInfoRequest withPrimaryKey(List<String> primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    public PublicationTableInfoRequest addPrimaryKeyItem(String primaryKeyItem) {
        if (this.primaryKey == null) {
            this.primaryKey = new ArrayList<>();
        }
        this.primaryKey.add(primaryKeyItem);
        return this;
    }

    public PublicationTableInfoRequest withPrimaryKey(Consumer<List<String>> primaryKeySetter) {
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

    public PublicationTableInfoRequest withFilterStatement(String filterStatement) {
        this.filterStatement = filterStatement;
        return this;
    }

    /**
     * 筛选语句。不能包含英文单引号'。
     * @return filterStatement
     */
    public String getFilterStatement() {
        return filterStatement;
    }

    public void setFilterStatement(String filterStatement) {
        this.filterStatement = filterStatement;
    }

    public PublicationTableInfoRequest withFilter(PublicationTableFilterInfoRequest filter) {
        this.filter = filter;
        return this;
    }

    public PublicationTableInfoRequest withFilter(Consumer<PublicationTableFilterInfoRequest> filterSetter) {
        if (this.filter == null) {
            this.filter = new PublicationTableFilterInfoRequest();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public PublicationTableFilterInfoRequest getFilter() {
        return filter;
    }

    public void setFilter(PublicationTableFilterInfoRequest filter) {
        this.filter = filter;
    }

    public PublicationTableInfoRequest withArticleProperties(ArticlePropertiesRequest articleProperties) {
        this.articleProperties = articleProperties;
        return this;
    }

    public PublicationTableInfoRequest withArticleProperties(
        Consumer<ArticlePropertiesRequest> articlePropertiesSetter) {
        if (this.articleProperties == null) {
            this.articleProperties = new ArticlePropertiesRequest();
            articlePropertiesSetter.accept(this.articleProperties);
        }

        return this;
    }

    /**
     * Get articleProperties
     * @return articleProperties
     */
    public ArticlePropertiesRequest getArticleProperties() {
        return articleProperties;
    }

    public void setArticleProperties(ArticlePropertiesRequest articleProperties) {
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
        PublicationTableInfoRequest that = (PublicationTableInfoRequest) obj;
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
        sb.append("class PublicationTableInfoRequest {\n");
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
