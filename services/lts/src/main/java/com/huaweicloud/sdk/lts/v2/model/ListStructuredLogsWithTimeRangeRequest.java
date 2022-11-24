package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListStructuredLogsWithTimeRangeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private QueryLtsStructLogParamsNew body;

    public ListStructuredLogsWithTimeRangeRequest withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流id，获取方式请参见：获取账号ID、项目ID、日志组ID、日志流ID（https://support.huaweicloud.com/api-lts/lts_api_0006.html）。
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public ListStructuredLogsWithTimeRangeRequest withBody(QueryLtsStructLogParamsNew body) {
        this.body = body;
        return this;
    }

    public ListStructuredLogsWithTimeRangeRequest withBody(Consumer<QueryLtsStructLogParamsNew> bodySetter) {
        if (this.body == null) {
            this.body = new QueryLtsStructLogParamsNew();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public QueryLtsStructLogParamsNew getBody() {
        return body;
    }

    public void setBody(QueryLtsStructLogParamsNew body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStructuredLogsWithTimeRangeRequest listStructuredLogsWithTimeRangeRequest =
            (ListStructuredLogsWithTimeRangeRequest) o;
        return Objects.equals(this.logStreamId, listStructuredLogsWithTimeRangeRequest.logStreamId)
            && Objects.equals(this.body, listStructuredLogsWithTimeRangeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logStreamId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStructuredLogsWithTimeRangeRequest {\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
