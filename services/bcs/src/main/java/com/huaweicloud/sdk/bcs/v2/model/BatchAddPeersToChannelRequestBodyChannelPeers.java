package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BatchAddPeersToChannelRequestBodyChannelPeers
 */
public class BatchAddPeersToChannelRequestBodyChannelPeers  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="channel_name")
    
    private String channelName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="peers")
    
    private Map<String, Integer> peers = null;
    
    public BatchAddPeersToChannelRequestBodyChannelPeers withChannelName(String channelName) {
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

    

    public BatchAddPeersToChannelRequestBodyChannelPeers withPeers(Map<String, Integer> peers) {
        this.peers = peers;
        return this;
    }

    

    public BatchAddPeersToChannelRequestBodyChannelPeers putPeersItem(String key, Integer peersItem) {
        this.peers.put(key, peersItem);
        return this;
    }

    public BatchAddPeersToChannelRequestBodyChannelPeers withPeers(Consumer<Map<String, Integer>> peersSetter) {
        if(this.peers == null ){
            this.peers = new HashMap<>();
        }
        peersSetter.accept(this.peers);
        return this;
    }
    /**
     * 加入通道peer名称和数量，key为组织名称，value为peer数量
     * @return peers
     */
    public Map<String, Integer> getPeers() {
        return peers;
    }

    public void setPeers(Map<String, Integer> peers) {
        this.peers = peers;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchAddPeersToChannelRequestBodyChannelPeers batchAddPeersToChannelRequestBodyChannelPeers = (BatchAddPeersToChannelRequestBodyChannelPeers) o;
        return Objects.equals(this.channelName, batchAddPeersToChannelRequestBodyChannelPeers.channelName) &&
            Objects.equals(this.peers, batchAddPeersToChannelRequestBodyChannelPeers.peers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(channelName, peers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddPeersToChannelRequestBodyChannelPeers {\n");
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

