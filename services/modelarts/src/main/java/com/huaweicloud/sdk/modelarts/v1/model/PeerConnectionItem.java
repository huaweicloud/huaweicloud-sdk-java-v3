package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Peer方式打通网络参数模型。
 */
public class PeerConnectionItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peerVpcId")

    private String peerVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peerSubnetId")

    private String peerSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultGateWay")

    private Boolean defaultGateWay;

    public PeerConnectionItem withPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
        return this;
    }

    /**
     * **参数解释**：对端的VPC ID。 **取值范围**：不涉及。
     * @return peerVpcId
     */
    public String getPeerVpcId() {
        return peerVpcId;
    }

    public void setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
    }

    public PeerConnectionItem withPeerSubnetId(String peerSubnetId) {
        this.peerSubnetId = peerSubnetId;
        return this;
    }

    /**
     * **参数解释**：对端的子网ID。 **取值范围**：不涉及。
     * @return peerSubnetId
     */
    public String getPeerSubnetId() {
        return peerSubnetId;
    }

    public void setPeerSubnetId(String peerSubnetId) {
        this.peerSubnetId = peerSubnetId;
    }

    public PeerConnectionItem withDefaultGateWay(Boolean defaultGateWay) {
        this.defaultGateWay = defaultGateWay;
        return this;
    }

    /**
     * **参数解释**：创建默认路由的开关，默认为false不创建。 **取值范围**：不涉及。
     * @return defaultGateWay
     */
    public Boolean getDefaultGateWay() {
        return defaultGateWay;
    }

    public void setDefaultGateWay(Boolean defaultGateWay) {
        this.defaultGateWay = defaultGateWay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PeerConnectionItem that = (PeerConnectionItem) obj;
        return Objects.equals(this.peerVpcId, that.peerVpcId) && Objects.equals(this.peerSubnetId, that.peerSubnetId)
            && Objects.equals(this.defaultGateWay, that.defaultGateWay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerVpcId, peerSubnetId, defaultGateWay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeerConnectionItem {\n");
        sb.append("    peerVpcId: ").append(toIndentedString(peerVpcId)).append("\n");
        sb.append("    peerSubnetId: ").append(toIndentedString(peerSubnetId)).append("\n");
        sb.append("    defaultGateWay: ").append(toIndentedString(defaultGateWay)).append("\n");
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
