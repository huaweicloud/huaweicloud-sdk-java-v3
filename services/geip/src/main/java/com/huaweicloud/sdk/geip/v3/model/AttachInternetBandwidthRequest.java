package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AttachInternetBandwidthRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_id")

    private String globalEipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AttachInternetBandwidthGlobalEipRequestBody body;

    public AttachInternetBandwidthRequest withGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
        return this;
    }

    /**
     * global_eip_id
     * @return globalEipId
     */
    public String getGlobalEipId() {
        return globalEipId;
    }

    public void setGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
    }

    public AttachInternetBandwidthRequest withBody(AttachInternetBandwidthGlobalEipRequestBody body) {
        this.body = body;
        return this;
    }

    public AttachInternetBandwidthRequest withBody(Consumer<AttachInternetBandwidthGlobalEipRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AttachInternetBandwidthGlobalEipRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AttachInternetBandwidthGlobalEipRequestBody getBody() {
        return body;
    }

    public void setBody(AttachInternetBandwidthGlobalEipRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachInternetBandwidthRequest that = (AttachInternetBandwidthRequest) obj;
        return Objects.equals(this.globalEipId, that.globalEipId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEipId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachInternetBandwidthRequest {\n");
        sb.append("    globalEipId: ").append(toIndentedString(globalEipId)).append("\n");
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
