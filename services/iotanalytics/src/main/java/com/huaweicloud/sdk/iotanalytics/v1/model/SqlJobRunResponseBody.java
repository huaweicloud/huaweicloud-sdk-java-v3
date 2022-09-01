package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SQL作业运行响应。
 */
public class SqlJobRunResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    @JacksonXmlProperty(localName = "sql_type")

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    @JacksonXmlProperty(localName = "schema")

    private List<Object> schema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    @JacksonXmlProperty(localName = "rows")

    private List<Object> rows = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mode")

    @JacksonXmlProperty(localName = "job_mode")

    private String jobMode;

    public SqlJobRunResponseBody withSqlType(String sqlType) {
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

    public SqlJobRunResponseBody withSchema(List<Object> schema) {
        this.schema = schema;
        return this;
    }

    public SqlJobRunResponseBody addSchemaItem(Object schemaItem) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        this.schema.add(schemaItem);
        return this;
    }

    public SqlJobRunResponseBody withSchema(Consumer<List<Object>> schemaSetter) {
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

    public SqlJobRunResponseBody withRows(List<Object> rows) {
        this.rows = rows;
        return this;
    }

    public SqlJobRunResponseBody addRowsItem(Object rowsItem) {
        if (this.rows == null) {
            this.rows = new ArrayList<>();
        }
        this.rows.add(rowsItem);
        return this;
    }

    public SqlJobRunResponseBody withRows(Consumer<List<Object>> rowsSetter) {
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

    public SqlJobRunResponseBody withJobMode(String jobMode) {
        this.jobMode = jobMode;
        return this;
    }

    /**
     * 作业执行模式：async: 异步; sync: 同步。
     * @return jobMode
     */
    public String getJobMode() {
        return jobMode;
    }

    public void setJobMode(String jobMode) {
        this.jobMode = jobMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlJobRunResponseBody sqlJobRunResponseBody = (SqlJobRunResponseBody) o;
        return Objects.equals(this.sqlType, sqlJobRunResponseBody.sqlType)
            && Objects.equals(this.schema, sqlJobRunResponseBody.schema)
            && Objects.equals(this.rows, sqlJobRunResponseBody.rows)
            && Objects.equals(this.jobMode, sqlJobRunResponseBody.jobMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlType, schema, rows, jobMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlJobRunResponseBody {\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    jobMode: ").append(toIndentedString(jobMode)).append("\n");
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
