package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Peer方式打通网络状态参数模型。
 */
public class PeerConnectionStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peerVpcId")

    private String peerVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peerSubnetId")

    private String peerSubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultGateWay")

    private Boolean defaultGateWay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    public PeerConnectionStatus withPeerVpcId(String peerVpcId) {
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

    public PeerConnectionStatus withPeerSubnetId(String peerSubnetId) {
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

    public PeerConnectionStatus withDefaultGateWay(Boolean defaultGateWay) {
        this.defaultGateWay = defaultGateWay;
        return this;
    }

    /**
     * **参数解释**：创建默认路由的开关。 **取值范围**：默认为false不创建。
     * @return defaultGateWay
     */
    public Boolean getDefaultGateWay() {
        return defaultGateWay;
    }

    public void setDefaultGateWay(Boolean defaultGateWay) {
        this.defaultGateWay = defaultGateWay;
    }

    public PeerConnectionStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * **参数解释**：网络的连接状态。 **取值范围**：可选值如下： - Connecting：网络连接中 - Active：网络连接正常 - Abnormal：网络连接不正常
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PeerConnectionStatus that = (PeerConnectionStatus) obj;
        return Objects.equals(this.peerVpcId, that.peerVpcId) && Objects.equals(this.peerSubnetId, that.peerSubnetId)
            && Objects.equals(this.defaultGateWay, that.defaultGateWay) && Objects.equals(this.phase, that.phase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerVpcId, peerSubnetId, defaultGateWay, phase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeerConnectionStatus {\n");
        sb.append("    peerVpcId: ").append(toIndentedString(peerVpcId)).append("\n");
        sb.append("    peerSubnetId: ").append(toIndentedString(peerSubnetId)).append("\n");
        sb.append("    defaultGateWay: ").append(toIndentedString(defaultGateWay)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
