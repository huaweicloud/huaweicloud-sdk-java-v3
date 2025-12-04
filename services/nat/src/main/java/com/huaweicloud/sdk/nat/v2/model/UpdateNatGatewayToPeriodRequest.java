package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateNatGatewayToPeriodRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_gateway_id")

    private String natGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateNatGatewayToPeriodRequestBody body;

    public UpdateNatGatewayToPeriodRequest withNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    /**
     * 公网NAT网关实例的ID。
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public UpdateNatGatewayToPeriodRequest withBody(UpdateNatGatewayToPeriodRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateNatGatewayToPeriodRequest withBody(Consumer<UpdateNatGatewayToPeriodRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateNatGatewayToPeriodRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateNatGatewayToPeriodRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateNatGatewayToPeriodRequestBody body) {
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
        UpdateNatGatewayToPeriodRequest that = (UpdateNatGatewayToPeriodRequest) obj;
        return Objects.equals(this.natGatewayId, that.natGatewayId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natGatewayId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatGatewayToPeriodRequest {\n");
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
