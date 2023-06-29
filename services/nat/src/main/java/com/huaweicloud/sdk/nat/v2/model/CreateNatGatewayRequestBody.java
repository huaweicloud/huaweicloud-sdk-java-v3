package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建公网NAT网关实例的请求体。
 */
public class CreateNatGatewayRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_gateway")

    private CreateNatGatewayOption natGateway;

    public CreateNatGatewayRequestBody withNatGateway(CreateNatGatewayOption natGateway) {
        this.natGateway = natGateway;
        return this;
    }

    public CreateNatGatewayRequestBody withNatGateway(Consumer<CreateNatGatewayOption> natGatewaySetter) {
        if (this.natGateway == null) {
            this.natGateway = new CreateNatGatewayOption();
            natGatewaySetter.accept(this.natGateway);
        }

        return this;
    }

    /**
     * Get natGateway
     * @return natGateway
     */
    public CreateNatGatewayOption getNatGateway() {
        return natGateway;
    }

    public void setNatGateway(CreateNatGatewayOption natGateway) {
        this.natGateway = natGateway;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNatGatewayRequestBody that = (CreateNatGatewayRequestBody) obj;
        return Objects.equals(this.natGateway, that.natGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNatGatewayRequestBody {\n");
        sb.append("    natGateway: ").append(toIndentedString(natGateway)).append("\n");
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
