package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Result
 */
public class Result {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private Object message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private Object schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private Object rows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rowCount")

    private Long rowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputRowCount")

    private Long inputRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resultCount")

    private Long resultCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Float duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rawResult")

    private Object rawResult;

    public Result withMessage(Object message) {
        this.message = message;
        return this;
    }

    /**
     * 结果返回信息
     * @return message
     */
    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Result withSchema(Object schema) {
        this.schema = schema;
        return this;
    }

    /**
     * 元数据信息
     * @return schema
     */
    public Object getSchema() {
        return schema;
    }

    public void setSchema(Object schema) {
        this.schema = schema;
    }

    public Result withRows(Object rows) {
        this.rows = rows;
        return this;
    }

    /**
     * 每条结果的信息
     * @return rows
     */
    public Object getRows() {
        return rows;
    }

    public void setRows(Object rows) {
        this.rows = rows;
    }

    public Result withRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    /**
     * 结果行数
     * @return rowCount
     */
    public Long getRowCount() {
        return rowCount;
    }

    public void setRowCount(Long rowCount) {
        this.rowCount = rowCount;
    }

    public Result withInputRowCount(Long inputRowCount) {
        this.inputRowCount = inputRowCount;
        return this;
    }

    /**
     * 输入结果的行数。（dli等脚本执行会执行此结果）
     * @return inputRowCount
     */
    public Long getInputRowCount() {
        return inputRowCount;
    }

    public void setInputRowCount(Long inputRowCount) {
        this.inputRowCount = inputRowCount;
    }

    public Result withResultCount(Long resultCount) {
        this.resultCount = resultCount;
        return this;
    }

    /**
     * 结果行数。（dli等脚本执行会执行此结果）
     * @return resultCount
     */
    public Long getResultCount() {
        return resultCount;
    }

    public void setResultCount(Long resultCount) {
        this.resultCount = resultCount;
    }

    public Result withDuration(Float duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 脚本运行时间
     * @return duration
     */
    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public Result withRawResult(Object rawResult) {
        this.rawResult = rawResult;
        return this;
    }

    /**
     * 脚本结果信息
     * @return rawResult
     */
    public Object getRawResult() {
        return rawResult;
    }

    public void setRawResult(Object rawResult) {
        this.rawResult = rawResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Result that = (Result) obj;
        return Objects.equals(this.message, that.message) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.rows, that.rows) && Objects.equals(this.rowCount, that.rowCount)
            && Objects.equals(this.inputRowCount, that.inputRowCount)
            && Objects.equals(this.resultCount, that.resultCount) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.rawResult, that.rawResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, schema, rows, rowCount, inputRowCount, resultCount, duration, rawResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Result {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
        sb.append("    inputRowCount: ").append(toIndentedString(inputRowCount)).append("\n");
        sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    rawResult: ").append(toIndentedString(rawResult)).append("\n");
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
