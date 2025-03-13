package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模拟数据
 */
public class DataClassificationCombineRuleCheckDTOCombineInputData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_content")

    private String columnContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_comment")

    private String columnComment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_comment")

    private String tableComment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    public DataClassificationCombineRuleCheckDTOCombineInputData withColumnContent(String columnContent) {
        this.columnContent = columnContent;
        return this;
    }

    /**
     * 字段内容模拟数据
     * @return columnContent
     */
    public String getColumnContent() {
        return columnContent;
    }

    public void setColumnContent(String columnContent) {
        this.columnContent = columnContent;
    }

    public DataClassificationCombineRuleCheckDTOCombineInputData withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 列名模拟数据
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public DataClassificationCombineRuleCheckDTOCombineInputData withColumnComment(String columnComment) {
        this.columnComment = columnComment;
        return this;
    }

    /**
     * 列注释模拟数据
     * @return columnComment
     */
    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    public DataClassificationCombineRuleCheckDTOCombineInputData withTableComment(String tableComment) {
        this.tableComment = tableComment;
        return this;
    }

    /**
     * 表注释模拟数据
     * @return tableComment
     */
    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public DataClassificationCombineRuleCheckDTOCombineInputData withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名模拟数据
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DataClassificationCombineRuleCheckDTOCombineInputData withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 库名模拟数据
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
        DataClassificationCombineRuleCheckDTOCombineInputData that =
            (DataClassificationCombineRuleCheckDTOCombineInputData) obj;
        return Objects.equals(this.columnContent, that.columnContent)
            && Objects.equals(this.columnName, that.columnName)
            && Objects.equals(this.columnComment, that.columnComment)
            && Objects.equals(this.tableComment, that.tableComment) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.databaseName, that.databaseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnContent, columnName, columnComment, tableComment, tableName, databaseName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataClassificationCombineRuleCheckDTOCombineInputData {\n");
        sb.append("    columnContent: ").append(toIndentedString(columnContent)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnComment: ").append(toIndentedString(columnComment)).append("\n");
        sb.append("    tableComment: ").append(toIndentedString(tableComment)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
