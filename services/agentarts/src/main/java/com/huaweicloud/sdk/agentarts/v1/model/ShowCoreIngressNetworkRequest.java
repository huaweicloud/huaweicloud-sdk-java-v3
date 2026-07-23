package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * Request Object
 */
public class ShowCoreIngressNetworkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_id")

    private UUID ingressId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_ingress_network_id")

    private UUID vpcIngressNetworkId;

    public ShowCoreIngressNetworkRequest withIngressId(UUID ingressId) {
        this.ingressId = ingressId;
        return this;
    }

    /**
     * Ingress ID，用于唯一标识一个Ingress实例。
     * @return ingressId
     */
    public UUID getIngressId() {
        return ingressId;
    }

    public void setIngressId(UUID ingressId) {
        this.ingressId = ingressId;
    }

    public ShowCoreIngressNetworkRequest withVpcIngressNetworkId(UUID vpcIngressNetworkId) {
        this.vpcIngressNetworkId = vpcIngressNetworkId;
        return this;
    }

    /**
     * **参数解释**： 入站网络ID，用于唯一标识一个VPC入站网络实例。 **取值范围**： 匹配标准的UUID格式。
     * @return vpcIngressNetworkId
     */
    public UUID getVpcIngressNetworkId() {
        return vpcIngressNetworkId;
    }

    public void setVpcIngressNetworkId(UUID vpcIngressNetworkId) {
        this.vpcIngressNetworkId = vpcIngressNetworkId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCoreIngressNetworkRequest that = (ShowCoreIngressNetworkRequest) obj;
        return Objects.equals(this.ingressId, that.ingressId)
            && Objects.equals(this.vpcIngressNetworkId, that.vpcIngressNetworkId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingressId, vpcIngressNetworkId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCoreIngressNetworkRequest {\n");
        sb.append("    ingressId: ").append(toIndentedString(ingressId)).append("\n");
        sb.append("    vpcIngressNetworkId: ").append(toIndentedString(vpcIngressNetworkId)).append("\n");
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
