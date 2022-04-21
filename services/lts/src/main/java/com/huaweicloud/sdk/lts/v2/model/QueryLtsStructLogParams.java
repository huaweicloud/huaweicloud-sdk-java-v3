package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 此参数在请求实体中，采用json字符串格式
 */
public class QueryLtsStructLogParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_expression")

    private String sqlExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_content")

    private Boolean originalContent;

    public QueryLtsStructLogParams withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 搜索起始时间（UTC时间，毫秒级）。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public QueryLtsStructLogParams withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 搜索结束时间（UTC时间，毫秒级）。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public QueryLtsStructLogParams withSqlExpression(String sqlExpression) {
        this.sqlExpression = sqlExpression;
        return this;
    }

    /**
     * 支持SQL语句搜索， 目前支持\"GROUP BY\", \"LIKE\"和\"WHERE\"。
     * @return sqlExpression
     */
    public String getSqlExpression() {
        return sqlExpression;
    }

    public void setSqlExpression(String sqlExpression) {
        this.sqlExpression = sqlExpression;
    }

    public QueryLtsStructLogParams withOriginalContent(Boolean originalContent) {
        this.originalContent = originalContent;
        return this;
    }

    /**
     * 返回内容中是否包含原始日志， 默认为false。
     * @return originalContent
     */
    public Boolean getOriginalContent() {
        return originalContent;
    }

    public void setOriginalContent(Boolean originalContent) {
        this.originalContent = originalContent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryLtsStructLogParams queryLtsStructLogParams = (QueryLtsStructLogParams) o;
        return Objects.equals(this.startTime, queryLtsStructLogParams.startTime)
            && Objects.equals(this.endTime, queryLtsStructLogParams.endTime)
            && Objects.equals(this.sqlExpression, queryLtsStructLogParams.sqlExpression)
            && Objects.equals(this.originalContent, queryLtsStructLogParams.originalContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, sqlExpression, originalContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryLtsStructLogParams {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    sqlExpression: ").append(toIndentedString(sqlExpression)).append("\n");
        sb.append("    originalContent: ").append(toIndentedString(originalContent)).append("\n");
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
