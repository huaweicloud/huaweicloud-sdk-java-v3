package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 更新公网NAT网关实例的请求体 */
public class UpdateNatGatewayRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_gateway")

    private UpdateNatGatewayOption natGateway;

    public UpdateNatGatewayRequestBody withNatGateway(UpdateNatGatewayOption natGateway) {
        this.natGateway = natGateway;
        return this;
    }

    public UpdateNatGatewayRequestBody withNatGateway(Consumer<UpdateNatGatewayOption> natGatewaySetter) {
        if (this.natGateway == null) {
            this.natGateway = new UpdateNatGatewayOption();
            natGatewaySetter.accept(this.natGateway);
        }

        return this;
    }

    /** Get natGateway
     * 
     * @return natGateway */
    public UpdateNatGatewayOption getNatGateway() {
        return natGateway;
    }

    public void setNatGateway(UpdateNatGatewayOption natGateway) {
        this.natGateway = natGateway;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNatGatewayRequestBody updateNatGatewayRequestBody = (UpdateNatGatewayRequestBody) o;
        return Objects.equals(this.natGateway, updateNatGatewayRequestBody.natGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatGatewayRequestBody {\n");
        sb.append("    natGateway: ").append(toIndentedString(natGateway)).append("\n");
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
