package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDetailOfEventRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    public ShowDetailOfEventRequest withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * 追踪事件的uniqueId
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public ShowDetailOfEventRequest withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 指定查询的事件通道ID
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDetailOfEventRequest that = (ShowDetailOfEventRequest) obj;
        return Objects.equals(this.traceId, that.traceId) && Objects.equals(this.channelId, that.channelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(traceId, channelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailOfEventRequest {\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
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
