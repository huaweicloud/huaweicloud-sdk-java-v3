package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SQL作业运行结果。
 */
public class SqlJobQueryDataset {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private List<Object> schema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private List<Object> rows = null;

    public SqlJobQueryDataset withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * 作业类型。DDL, DCL, IMPORT, EXPORT, QUERY, INSERT.
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public SqlJobQueryDataset withSchema(List<Object> schema) {
        this.schema = schema;
        return this;
    }

    public SqlJobQueryDataset addSchemaItem(Object schemaItem) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        this.schema.add(schemaItem);
        return this;
    }

    public SqlJobQueryDataset withSchema(Consumer<List<Object>> schemaSetter) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        schemaSetter.accept(this.schema);
        return this;
    }

    /**
     * 当语句类型为DDL时，返回其结果的列名称及类型。
     * @return schema
     */
    public List<Object> getSchema() {
        return schema;
    }

    public void setSchema(List<Object> schema) {
        this.schema = schema;
    }

    public SqlJobQueryDataset withRows(List<Object> rows) {
        this.rows = rows;
        return this;
    }

    public SqlJobQueryDataset addRowsItem(Object rowsItem) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(rowsItem);
        return this;
    }

    public SqlJobQueryDataset withRows(Consumer<List<Object>> rowsSetter) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        rowsSetter.accept(this.rows);
        return this;
    }

    /**
     * 当语句类型为DDL时，直接返回其执行结果。
     * @return rows
     */
    public List<Object> getRows() {
        return rows;
    }

    public void setRows(List<Object> rows) {
        this.rows = rows;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlJobQueryDataset sqlJobQueryDataset = (SqlJobQueryDataset) o;
        return Objects.equals(this.sqlType, sqlJobQueryDataset.sqlType)
            && Objects.equals(this.schema, sqlJobQueryDataset.schema)
            && Objects.equals(this.rows, sqlJobQueryDataset.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlType, schema, rows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlJobQueryDataset {\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
