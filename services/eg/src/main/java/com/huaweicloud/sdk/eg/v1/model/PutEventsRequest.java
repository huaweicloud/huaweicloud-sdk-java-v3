package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class PutEventsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PutEventsReq body;

    public PutEventsRequest withChannelId(String channelId) {
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

    public PutEventsRequest withBody(PutEventsReq body) {
        this.body = body;
        return this;
    }

    public PutEventsRequest withBody(Consumer<PutEventsReq> bodySetter) {
        if (this.body == null) {
            this.body = new PutEventsReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PutEventsReq getBody() {
        return body;
    }

    public void setBody(PutEventsReq body) {
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
        PutEventsRequest putEventsRequest = (PutEventsRequest) o;
        return Objects.equals(this.channelId, putEventsRequest.channelId)
            && Objects.equals(this.body, putEventsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutEventsRequest {\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
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
