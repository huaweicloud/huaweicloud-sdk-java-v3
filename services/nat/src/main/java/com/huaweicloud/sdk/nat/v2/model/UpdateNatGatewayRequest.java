package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateNatGatewayRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_gateway_id")

    private String natGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateNatGatewayRequestBody body;

    public UpdateNatGatewayRequest withNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    /** 公网NAT网关实例的ID。
     * 
     * @return natGatewayId */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public UpdateNatGatewayRequest withBody(UpdateNatGatewayRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateNatGatewayRequest withBody(Consumer<UpdateNatGatewayRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateNatGatewayRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateNatGatewayRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateNatGatewayRequestBody body) {
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
        UpdateNatGatewayRequest updateNatGatewayRequest = (UpdateNatGatewayRequest) o;
        return Objects.equals(this.natGatewayId, updateNatGatewayRequest.natGatewayId)
            && Objects.equals(this.body, updateNatGatewayRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natGatewayId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatGatewayRequest {\n");
        sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
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
