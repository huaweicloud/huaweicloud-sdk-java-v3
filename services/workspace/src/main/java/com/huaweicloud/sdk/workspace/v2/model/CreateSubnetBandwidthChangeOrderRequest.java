package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateSubnetBandwidthChangeOrderRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_id")

    private String bandwidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateSubnetBandwidthChangeOrderRequestBody body;

    public CreateSubnetBandwidthChangeOrderRequest withBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
        return this;
    }

    /**
     * 云办公带宽id。
     * @return bandwidthId
     */
    public String getBandwidthId() {
        return bandwidthId;
    }

    public void setBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
    }

    public CreateSubnetBandwidthChangeOrderRequest withBody(CreateSubnetBandwidthChangeOrderRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateSubnetBandwidthChangeOrderRequest withBody(
        Consumer<CreateSubnetBandwidthChangeOrderRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateSubnetBandwidthChangeOrderRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateSubnetBandwidthChangeOrderRequestBody getBody() {
        return body;
    }

    public void setBody(CreateSubnetBandwidthChangeOrderRequestBody body) {
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
        CreateSubnetBandwidthChangeOrderRequest that = (CreateSubnetBandwidthChangeOrderRequest) obj;
        return Objects.equals(this.bandwidthId, that.bandwidthId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubnetBandwidthChangeOrderRequest {\n");
        sb.append("    bandwidthId: ").append(toIndentedString(bandwidthId)).append("\n");
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
