package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BgpPeer
 */
public class BgpPeer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_ip_address")

    private String peerIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_asn")

    private Long peerAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_duration")

    private String stateDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_received_routes")

    private Integer numReceivedRoutes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_message_received")

    private Integer numMessageReceived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_message_sent")

    private Integer numMessageSent;

    public BgpPeer withPeerIpAddress(String peerIpAddress) {
        this.peerIpAddress = peerIpAddress;
        return this;
    }

    /**
     * 对端IP地址
     * @return peerIpAddress
     */
    public String getPeerIpAddress() {
        return peerIpAddress;
    }

    public void setPeerIpAddress(String peerIpAddress) {
        this.peerIpAddress = peerIpAddress;
    }

    public BgpPeer withPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }

    /**
     * 对端AS号
     * @return peerAsn
     */
    public Long getPeerAsn() {
        return peerAsn;
    }

    public void setPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
    }

    public BgpPeer withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BgpPeer withStateDuration(String stateDuration) {
        this.stateDuration = stateDuration;
        return this;
    }

    /**
     * 状态周期
     * @return stateDuration
     */
    public String getStateDuration() {
        return stateDuration;
    }

    public void setStateDuration(String stateDuration) {
        this.stateDuration = stateDuration;
    }

    public BgpPeer withNumReceivedRoutes(Integer numReceivedRoutes) {
        this.numReceivedRoutes = numReceivedRoutes;
        return this;
    }

    /**
     * 接收到的路由数量
     * @return numReceivedRoutes
     */
    public Integer getNumReceivedRoutes() {
        return numReceivedRoutes;
    }

    public void setNumReceivedRoutes(Integer numReceivedRoutes) {
        this.numReceivedRoutes = numReceivedRoutes;
    }

    public BgpPeer withNumMessageReceived(Integer numMessageReceived) {
        this.numMessageReceived = numMessageReceived;
        return this;
    }

    /**
     * 接收到的消息数量
     * @return numMessageReceived
     */
    public Integer getNumMessageReceived() {
        return numMessageReceived;
    }

    public void setNumMessageReceived(Integer numMessageReceived) {
        this.numMessageReceived = numMessageReceived;
    }

    public BgpPeer withNumMessageSent(Integer numMessageSent) {
        this.numMessageSent = numMessageSent;
        return this;
    }

    /**
     * 已发送的消息数量
     * @return numMessageSent
     */
    public Integer getNumMessageSent() {
        return numMessageSent;
    }

    public void setNumMessageSent(Integer numMessageSent) {
        this.numMessageSent = numMessageSent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BgpPeer that = (BgpPeer) obj;
        return Objects.equals(this.peerIpAddress, that.peerIpAddress) && Objects.equals(this.peerAsn, that.peerAsn)
            && Objects.equals(this.state, that.state) && Objects.equals(this.stateDuration, that.stateDuration)
            && Objects.equals(this.numReceivedRoutes, that.numReceivedRoutes)
            && Objects.equals(this.numMessageReceived, that.numMessageReceived)
            && Objects.equals(this.numMessageSent, that.numMessageSent);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(peerIpAddress, peerAsn, state, stateDuration, numReceivedRoutes, numMessageReceived, numMessageSent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BgpPeer {\n");
        sb.append("    peerIpAddress: ").append(toIndentedString(peerIpAddress)).append("\n");
        sb.append("    peerAsn: ").append(toIndentedString(peerAsn)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateDuration: ").append(toIndentedString(stateDuration)).append("\n");
        sb.append("    numReceivedRoutes: ").append(toIndentedString(numReceivedRoutes)).append("\n");
        sb.append("    numMessageReceived: ").append(toIndentedString(numMessageReceived)).append("\n");
        sb.append("    numMessageSent: ").append(toIndentedString(numMessageSent)).append("\n");
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
