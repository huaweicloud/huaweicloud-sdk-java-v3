package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListMessageTraceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace")

    private List<ListMessageTraceRespTrace> trace = null;

    public ListMessageTraceResponse withTrace(List<ListMessageTraceRespTrace> trace) {
        this.trace = trace;
        return this;
    }

    public ListMessageTraceResponse addTraceItem(ListMessageTraceRespTrace traceItem) {
        if (this.trace == null) {
            this.trace = new ArrayList<>();
        }
        this.trace.add(traceItem);
        return this;
    }

    public ListMessageTraceResponse withTrace(Consumer<List<ListMessageTraceRespTrace>> traceSetter) {
        if (this.trace == null) {
            this.trace = new ArrayList<>();
        }
        traceSetter.accept(this.trace);
        return this;
    }

    /**
     * 消息轨迹列表。
     * @return trace
     */
    public List<ListMessageTraceRespTrace> getTrace() {
        return trace;
    }

    public void setTrace(List<ListMessageTraceRespTrace> trace) {
        this.trace = trace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMessageTraceResponse that = (ListMessageTraceResponse) obj;
        return Objects.equals(this.trace, that.trace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMessageTraceResponse {\n");
        sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
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
