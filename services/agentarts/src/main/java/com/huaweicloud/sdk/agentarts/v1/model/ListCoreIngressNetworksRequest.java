package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * Request Object
 */
public class ListCoreIngressNetworksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_id")

    private UUID ingressId;

    public ListCoreIngressNetworksRequest withIngressId(UUID ingressId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCoreIngressNetworksRequest that = (ListCoreIngressNetworksRequest) obj;
        return Objects.equals(this.ingressId, that.ingressId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingressId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreIngressNetworksRequest {\n");
        sb.append("    ingressId: ").append(toIndentedString(ingressId)).append("\n");
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
