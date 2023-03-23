package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePrivateNatRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePrivateNatRequestBody body;

    public UpdatePrivateNatRequest withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * 私网NAT网关实例的ID。
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public UpdatePrivateNatRequest withBody(UpdatePrivateNatRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePrivateNatRequest withBody(Consumer<UpdatePrivateNatRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePrivateNatRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePrivateNatRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePrivateNatRequestBody body) {
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
        UpdatePrivateNatRequest updatePrivateNatRequest = (UpdatePrivateNatRequest) o;
        return Objects.equals(this.gatewayId, updatePrivateNatRequest.gatewayId)
            && Objects.equals(this.body, updatePrivateNatRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gatewayId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateNatRequest {\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
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
