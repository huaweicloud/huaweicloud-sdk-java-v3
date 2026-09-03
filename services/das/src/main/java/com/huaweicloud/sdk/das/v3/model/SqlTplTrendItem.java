package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SQL模板趋势项
 */
public class SqlTplTrendItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_at")

    private Long executeAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_time_in500ms")

    private Long queryTimeIn500ms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_time_in100ms")

    private Long queryTimeIn100ms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_time_in1s")

    private Long queryTimeIn1s;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_time_over1s")

    private Long queryTimeOver1s;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_executions")

    private Long queryExecutions;

    public SqlTplTrendItem withExecuteAt(Long executeAt) {
        this.executeAt = executeAt;
        return this;
    }

    /**
     * 执行时间 ms
     * @return executeAt
     */
    public Long getExecuteAt() {
        return executeAt;
    }

    public void setExecuteAt(Long executeAt) {
        this.executeAt = executeAt;
    }

    public SqlTplTrendItem withQueryTimeIn500ms(Long queryTimeIn500ms) {
        this.queryTimeIn500ms = queryTimeIn500ms;
        return this;
    }

    /**
     * 耗时在500ms的个数
     * @return queryTimeIn500ms
     */
    public Long getQueryTimeIn500ms() {
        return queryTimeIn500ms;
    }

    public void setQueryTimeIn500ms(Long queryTimeIn500ms) {
        this.queryTimeIn500ms = queryTimeIn500ms;
    }

    public SqlTplTrendItem withQueryTimeIn100ms(Long queryTimeIn100ms) {
        this.queryTimeIn100ms = queryTimeIn100ms;
        return this;
    }

    /**
     * 耗时在100ms的个数
     * @return queryTimeIn100ms
     */
    public Long getQueryTimeIn100ms() {
        return queryTimeIn100ms;
    }

    public void setQueryTimeIn100ms(Long queryTimeIn100ms) {
        this.queryTimeIn100ms = queryTimeIn100ms;
    }

    public SqlTplTrendItem withQueryTimeIn1s(Long queryTimeIn1s) {
        this.queryTimeIn1s = queryTimeIn1s;
        return this;
    }

    /**
     * 耗时在1s的个数
     * @return queryTimeIn1s
     */
    public Long getQueryTimeIn1s() {
        return queryTimeIn1s;
    }

    public void setQueryTimeIn1s(Long queryTimeIn1s) {
        this.queryTimeIn1s = queryTimeIn1s;
    }

    public SqlTplTrendItem withQueryTimeOver1s(Long queryTimeOver1s) {
        this.queryTimeOver1s = queryTimeOver1s;
        return this;
    }

    /**
     * 耗时超过1s的个数
     * @return queryTimeOver1s
     */
    public Long getQueryTimeOver1s() {
        return queryTimeOver1s;
    }

    public void setQueryTimeOver1s(Long queryTimeOver1s) {
        this.queryTimeOver1s = queryTimeOver1s;
    }

    public SqlTplTrendItem withQueryExecutions(Long queryExecutions) {
        this.queryExecutions = queryExecutions;
        return this;
    }

    /**
     * 总个数
     * @return queryExecutions
     */
    public Long getQueryExecutions() {
        return queryExecutions;
    }

    public void setQueryExecutions(Long queryExecutions) {
        this.queryExecutions = queryExecutions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlTplTrendItem that = (SqlTplTrendItem) obj;
        return Objects.equals(this.executeAt, that.executeAt)
            && Objects.equals(this.queryTimeIn500ms, that.queryTimeIn500ms)
            && Objects.equals(this.queryTimeIn100ms, that.queryTimeIn100ms)
            && Objects.equals(this.queryTimeIn1s, that.queryTimeIn1s)
            && Objects.equals(this.queryTimeOver1s, that.queryTimeOver1s)
            && Objects.equals(this.queryExecutions, that.queryExecutions);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(executeAt, queryTimeIn500ms, queryTimeIn100ms, queryTimeIn1s, queryTimeOver1s, queryExecutions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlTplTrendItem {\n");
        sb.append("    executeAt: ").append(toIndentedString(executeAt)).append("\n");
        sb.append("    queryTimeIn500ms: ").append(toIndentedString(queryTimeIn500ms)).append("\n");
        sb.append("    queryTimeIn100ms: ").append(toIndentedString(queryTimeIn100ms)).append("\n");
        sb.append("    queryTimeIn1s: ").append(toIndentedString(queryTimeIn1s)).append("\n");
        sb.append("    queryTimeOver1s: ").append(toIndentedString(queryTimeOver1s)).append("\n");
        sb.append("    queryExecutions: ").append(toIndentedString(queryExecutions)).append("\n");
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
