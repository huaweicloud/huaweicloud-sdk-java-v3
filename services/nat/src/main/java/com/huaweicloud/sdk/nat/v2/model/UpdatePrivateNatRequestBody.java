package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新私网NAT网关实例的请求体。
 */
public class UpdatePrivateNatRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway")

    private UpdatePrivateNatOption gateway;

    public UpdatePrivateNatRequestBody withGateway(UpdatePrivateNatOption gateway) {
        this.gateway = gateway;
        return this;
    }

    public UpdatePrivateNatRequestBody withGateway(Consumer<UpdatePrivateNatOption> gatewaySetter) {
        if (this.gateway == null) {
            this.gateway = new UpdatePrivateNatOption();
            gatewaySetter.accept(this.gateway);
        }

        return this;
    }

    /**
     * Get gateway
     * @return gateway
     */
    public UpdatePrivateNatOption getGateway() {
        return gateway;
    }

    public void setGateway(UpdatePrivateNatOption gateway) {
        this.gateway = gateway;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePrivateNatRequestBody updatePrivateNatRequestBody = (UpdatePrivateNatRequestBody) o;
        return Objects.equals(this.gateway, updatePrivateNatRequestBody.gateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateNatRequestBody {\n");
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
