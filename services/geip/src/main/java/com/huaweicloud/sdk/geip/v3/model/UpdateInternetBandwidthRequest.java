package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateInternetBandwidthRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_bandwidth_id")

    private String internetBandwidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateInternetBandwidthRequestBody body;

    public UpdateInternetBandwidthRequest withInternetBandwidthId(String internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
        return this;
    }

    /**
     * 全域公网带宽的ID
     * @return internetBandwidthId
     */
    public String getInternetBandwidthId() {
        return internetBandwidthId;
    }

    public void setInternetBandwidthId(String internetBandwidthId) {
        this.internetBandwidthId = internetBandwidthId;
    }

    public UpdateInternetBandwidthRequest withBody(UpdateInternetBandwidthRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateInternetBandwidthRequest withBody(Consumer<UpdateInternetBandwidthRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateInternetBandwidthRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateInternetBandwidthRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateInternetBandwidthRequestBody body) {
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
        UpdateInternetBandwidthRequest that = (UpdateInternetBandwidthRequest) obj;
        return Objects.equals(this.internetBandwidthId, that.internetBandwidthId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internetBandwidthId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInternetBandwidthRequest {\n");
        sb.append("    internetBandwidthId: ").append(toIndentedString(internetBandwidthId)).append("\n");
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
