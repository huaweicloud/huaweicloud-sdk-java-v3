package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Result */
public class Result {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rowCount")

    private Integer rowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private String rows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    public Result withMessage(String message) {
        this.message = message;
        return this;
    }

    /** Get message
     * 
     * @return message */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result withRowCount(Integer rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    /** Get rowCount
     * 
     * @return rowCount */
    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public Result withRows(String rows) {
        this.rows = rows;
        return this;
    }

    /** Get rows
     * 
     * @return rows */
    public String getRows() {
        return rows;
    }

    public void setRows(String rows) {
        this.rows = rows;
    }

    public Result withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /** Get schema
     * 
     * @return schema */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Result result = (Result) o;
        return Objects.equals(this.message, result.message) && Objects.equals(this.rowCount, result.rowCount)
            && Objects.equals(this.rows, result.rows) && Objects.equals(this.schema, result.schema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, rowCount, rows, schema);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Result {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
