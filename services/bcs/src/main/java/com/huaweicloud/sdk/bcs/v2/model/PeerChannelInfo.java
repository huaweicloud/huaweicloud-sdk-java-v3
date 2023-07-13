package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PeerChannelInfo
 */
public class PeerChannelInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_name")

    private String channelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peers")

    private Map<String, Long> peers = null;

    public PeerChannelInfo withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * peer加入的通道名称
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public PeerChannelInfo withPeers(Map<String, Long> peers) {
        this.peers = peers;
        return this;
    }

    public PeerChannelInfo putPeersItem(String key, Long peersItem) {
        if (this.peers == null) {
            this.peers = new HashMap<>();
        }
        this.peers.put(key, peersItem);
        return this;
    }

    public PeerChannelInfo withPeers(Consumer<Map<String, Long>> peersSetter) {
        if (this.peers == null) {
            this.peers = new HashMap<>();
        }
        peersSetter.accept(this.peers);
        return this;
    }

    /**
     * 加入通道peer名称和数量，key为组织名称，value为peer数量
     * @return peers
     */
    public Map<String, Long> getPeers() {
        return peers;
    }

    public void setPeers(Map<String, Long> peers) {
        this.peers = peers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PeerChannelInfo that = (PeerChannelInfo) obj;
        return Objects.equals(this.channelName, that.channelName) && Objects.equals(this.peers, that.peers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelName, peers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeerChannelInfo {\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    peers: ").append(toIndentedString(peers)).append("\n");
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
