package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网关的类型。
 */
public class GatewayType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_type")

    private GatewayTypeEnum gatewayType;

    public GatewayType withGatewayType(GatewayTypeEnum gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * Get gatewayType
     * @return gatewayType
     */
    public GatewayTypeEnum getGatewayType() {
        return gatewayType;
    }

    public void setGatewayType(GatewayTypeEnum gatewayType) {
        this.gatewayType = gatewayType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GatewayType that = (GatewayType) obj;
        return Objects.equals(this.gatewayType, that.gatewayType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gatewayType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GatewayType {\n");
        sb.append("    gatewayType: ").append(toIndentedString(gatewayType)).append("\n");
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
