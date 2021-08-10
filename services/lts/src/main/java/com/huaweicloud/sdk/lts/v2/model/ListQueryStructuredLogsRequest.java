package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ListQueryStructuredLogsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private QueryLTSStructLogParams body;

    public ListQueryStructuredLogsRequest withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /** 日志组id。
     * 
     * @return logGroupId */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public ListQueryStructuredLogsRequest withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /** 日志流id。
     * 
     * @return logStreamId */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public ListQueryStructuredLogsRequest withBody(QueryLTSStructLogParams body) {
        this.body = body;
        return this;
    }

    public ListQueryStructuredLogsRequest withBody(Consumer<QueryLTSStructLogParams> bodySetter) {
        if (this.body == null) {
            this.body = new QueryLTSStructLogParams();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public QueryLTSStructLogParams getBody() {
        return body;
    }

    public void setBody(QueryLTSStructLogParams body) {
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
        ListQueryStructuredLogsRequest listQueryStructuredLogsRequest = (ListQueryStructuredLogsRequest) o;
        return Objects.equals(this.logGroupId, listQueryStructuredLogsRequest.logGroupId)
            && Objects.equals(this.logStreamId, listQueryStructuredLogsRequest.logStreamId)
            && Objects.equals(this.body, listQueryStructuredLogsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupId, logStreamId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueryStructuredLogsRequest {\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
