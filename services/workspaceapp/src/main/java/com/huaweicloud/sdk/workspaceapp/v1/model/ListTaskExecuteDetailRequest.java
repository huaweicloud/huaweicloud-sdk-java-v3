package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTaskExecuteDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_history_id")

    private String executeHistoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListTaskExecuteDetailRequest withExecuteHistoryId(String executeHistoryId) {
        this.executeHistoryId = executeHistoryId;
        return this;
    }

    /**
     * 定时任务唯一标识。
     * @return executeHistoryId
     */
    public String getExecuteHistoryId() {
        return executeHistoryId;
    }

    public void setExecuteHistoryId(String executeHistoryId) {
        this.executeHistoryId = executeHistoryId;
    }

    public ListTaskExecuteDetailRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的偏移量。
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

    public ListTaskExecuteDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询的数量，值区间[1-100]。
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTaskExecuteDetailRequest that = (ListTaskExecuteDetailRequest) obj;
        return Objects.equals(this.executeHistoryId, that.executeHistoryId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executeHistoryId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskExecuteDetailRequest {\n");
        sb.append("    executeHistoryId: ").append(toIndentedString(executeHistoryId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
