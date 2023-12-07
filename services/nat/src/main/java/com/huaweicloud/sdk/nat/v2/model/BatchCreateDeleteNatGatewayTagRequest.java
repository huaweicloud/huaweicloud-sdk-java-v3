package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateDeleteNatGatewayTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_gateway_id")

    private String natGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateDeleteNatTagsRequestBody body;

    public BatchCreateDeleteNatGatewayTagRequest withNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    /**
     * 公网NAT网关ID。
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public BatchCreateDeleteNatGatewayTagRequest withBody(BatchCreateDeleteNatTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateDeleteNatGatewayTagRequest withBody(Consumer<BatchCreateDeleteNatTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateDeleteNatTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreateDeleteNatTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateDeleteNatTagsRequestBody body) {
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
        BatchCreateDeleteNatGatewayTagRequest that = (BatchCreateDeleteNatGatewayTagRequest) obj;
        return Objects.equals(this.natGatewayId, that.natGatewayId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natGatewayId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateDeleteNatGatewayTagRequest {\n");
        sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
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
