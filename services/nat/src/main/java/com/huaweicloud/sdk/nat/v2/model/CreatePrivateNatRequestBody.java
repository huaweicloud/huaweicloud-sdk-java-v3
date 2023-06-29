package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建私网NAT网关实例的请求体。
 */
public class CreatePrivateNatRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway")

    private CreatePrivateNatOption gateway;

    public CreatePrivateNatRequestBody withGateway(CreatePrivateNatOption gateway) {
        this.gateway = gateway;
        return this;
    }

    public CreatePrivateNatRequestBody withGateway(Consumer<CreatePrivateNatOption> gatewaySetter) {
        if (this.gateway == null) {
            this.gateway = new CreatePrivateNatOption();
            gatewaySetter.accept(this.gateway);
        }

        return this;
    }

    /**
     * Get gateway
     * @return gateway
     */
    public CreatePrivateNatOption getGateway() {
        return gateway;
    }

    public void setGateway(CreatePrivateNatOption gateway) {
        this.gateway = gateway;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePrivateNatRequestBody that = (CreatePrivateNatRequestBody) obj;
        return Objects.equals(this.gateway, that.gateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateNatRequestBody {\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
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
