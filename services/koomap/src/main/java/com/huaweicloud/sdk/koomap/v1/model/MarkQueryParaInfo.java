package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询像控点信息所需的参数。
 */
public class MarkQueryParaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private MarkQueryCondInfo condition;

    public MarkQueryParaInfo withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public MarkQueryParaInfo withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public MarkQueryParaInfo withCondition(MarkQueryCondInfo condition) {
        this.condition = condition;
        return this;
    }

    public MarkQueryParaInfo withCondition(Consumer<MarkQueryCondInfo> conditionSetter) {
        if (this.condition == null) {
            this.condition = new MarkQueryCondInfo();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public MarkQueryCondInfo getCondition() {
        return condition;
    }

    public void setCondition(MarkQueryCondInfo condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MarkQueryParaInfo that = (MarkQueryParaInfo) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.condition, that.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, condition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarkQueryParaInfo {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
