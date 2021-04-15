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
 * Channel
 */
public class Channel  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="peers")
    
    private Map<String, List<String>> peers = null;
    
    public Channel withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 通道名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Channel withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 通道细节描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public Channel withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 通道创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public Channel withPeers(Map<String, List<String>> peers) {
        this.peers = peers;
        return this;
    }

    

    public Channel putPeersItem(String key, List<String> peersItem) {
        if(this.peers == null) {
            this.peers = new HashMap<>();
        }
        this.peers.put(key, peersItem);
        return this;
    }

    public Channel withPeers(Consumer<Map<String, List<String>>> peersSetter) {
        if(this.peers == null) {
            this.peers = new HashMap<>();
        }
        peersSetter.accept(this.peers);
        return this;
    }
    /**
     * key:组织名，value:节点名称列表
     * @return peers
     */
    public Map<String, List<String>> getPeers() {
        return peers;
    }

    public void setPeers(Map<String, List<String>> peers) {
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
        Channel channel = (Channel) o;
        return Objects.equals(this.name, channel.name) &&
            Objects.equals(this.description, channel.description) &&
            Objects.equals(this.createTime, channel.createTime) &&
            Objects.equals(this.peers, channel.peers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, createTime, peers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Channel {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

