package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowGlobalConnectionBandwidthResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "globalconnection_bandwidth")

    private GlobalConnectionBandwidth globalconnectionBandwidth;

    public ShowGlobalConnectionBandwidthResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowGlobalConnectionBandwidthResponse withGlobalconnectionBandwidth(
        GlobalConnectionBandwidth globalconnectionBandwidth) {
        this.globalconnectionBandwidth = globalconnectionBandwidth;
        return this;
    }

    public ShowGlobalConnectionBandwidthResponse withGlobalconnectionBandwidth(
        Consumer<GlobalConnectionBandwidth> globalconnectionBandwidthSetter) {
        if (this.globalconnectionBandwidth == null) {
            this.globalconnectionBandwidth = new GlobalConnectionBandwidth();
            globalconnectionBandwidthSetter.accept(this.globalconnectionBandwidth);
        }

        return this;
    }

    /**
     * Get globalconnectionBandwidth
     * @return globalconnectionBandwidth
     */
    public GlobalConnectionBandwidth getGlobalconnectionBandwidth() {
        return globalconnectionBandwidth;
    }

    public void setGlobalconnectionBandwidth(GlobalConnectionBandwidth globalconnectionBandwidth) {
        this.globalconnectionBandwidth = globalconnectionBandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGlobalConnectionBandwidthResponse that = (ShowGlobalConnectionBandwidthResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.globalconnectionBandwidth, that.globalconnectionBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, globalconnectionBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGlobalConnectionBandwidthResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    globalconnectionBandwidth: ").append(toIndentedString(globalconnectionBandwidth)).append("\n");
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
