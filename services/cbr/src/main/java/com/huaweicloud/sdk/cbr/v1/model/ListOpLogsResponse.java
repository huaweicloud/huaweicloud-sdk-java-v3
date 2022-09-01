package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOpLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_logs")

    @JacksonXmlProperty(localName = "operation_logs")

    private List<OperationLog> operationLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    public ListOpLogsResponse withOperationLogs(List<OperationLog> operationLogs) {
        this.operationLogs = operationLogs;
        return this;
    }

    public ListOpLogsResponse addOperationLogsItem(OperationLog operationLogsItem) {
        if (this.operationLogs == null) {
            this.operationLogs = new ArrayList<>();
        }
        this.operationLogs.add(operationLogsItem);
        return this;
    }

    public ListOpLogsResponse withOperationLogs(Consumer<List<OperationLog>> operationLogsSetter) {
        if (this.operationLogs == null) {
            this.operationLogs = new ArrayList<>();
        }
        operationLogsSetter.accept(this.operationLogs);
        return this;
    }

    /**
     * 任务列表
     * @return operationLogs
     */
    public List<OperationLog> getOperationLogs() {
        return operationLogs;
    }

    public void setOperationLogs(List<OperationLog> operationLogs) {
        this.operationLogs = operationLogs;
    }

    public ListOpLogsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 任务个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListOpLogsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListOpLogsResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOpLogsResponse listOpLogsResponse = (ListOpLogsResponse) o;
        return Objects.equals(this.operationLogs, listOpLogsResponse.operationLogs)
            && Objects.equals(this.count, listOpLogsResponse.count)
            && Objects.equals(this.limit, listOpLogsResponse.limit)
            && Objects.equals(this.offset, listOpLogsResponse.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationLogs, count, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpLogsResponse {\n");
        sb.append("    operationLogs: ").append(toIndentedString(operationLogs)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
