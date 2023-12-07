package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 流水线日志查询请求体 startOffset 和 endOffset 均设置为 0，则代表查询全量日志。
 */
public class LogQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_offset")

    private Long startOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_offset")

    private Long endOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    public LogQuery withStartOffset(Long startOffset) {
        this.startOffset = startOffset;
        return this;
    }

    /**
     * 日志起始偏移
     * @return startOffset
     */
    public Long getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(Long startOffset) {
        this.startOffset = startOffset;
    }

    public LogQuery withEndOffset(Long endOffset) {
        this.endOffset = endOffset;
        return this;
    }

    /**
     * 日志结束偏移
     * @return endOffset
     */
    public Long getEndOffset() {
        return endOffset;
    }

    public void setEndOffset(Long endOffset) {
        this.endOffset = endOffset;
    }

    public LogQuery withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 最大日志行数
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public LogQuery withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序规则[\"asc\",\"desc\"]
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogQuery that = (LogQuery) obj;
        return Objects.equals(this.startOffset, that.startOffset) && Objects.equals(this.endOffset, that.endOffset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.sort, that.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startOffset, endOffset, limit, sort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogQuery {\n");
        sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
        sb.append("    endOffset: ").append(toIndentedString(endOffset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
