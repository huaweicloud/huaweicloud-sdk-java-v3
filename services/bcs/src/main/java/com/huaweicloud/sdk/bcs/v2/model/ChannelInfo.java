package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ChannelInfo
 */
public class ChannelInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="org_names")
    
    private List<String> orgNames = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="org_name_hash")
    
    private List<String> orgNameHash = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="peers")
    
    private Map<String, List<String>> peers = null;
    
    public ChannelInfo withName(String name) {
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

    

    public ChannelInfo withOrgNames(List<String> orgNames) {
        this.orgNames = orgNames;
        return this;
    }

    
    public ChannelInfo addOrgNamesItem(String orgNamesItem) {
        if(this.orgNames == null) {
            this.orgNames = new ArrayList<>();
        }
        this.orgNames.add(orgNamesItem);
        return this;
    }

    public ChannelInfo withOrgNames(Consumer<List<String>> orgNamesSetter) {
        if(this.orgNames == null) {
            this.orgNames = new ArrayList<>();
        }
        orgNamesSetter.accept(this.orgNames);
        return this;
    }

    /**
     * 通道中组织名
     * @return orgNames
     */
    public List<String> getOrgNames() {
        return orgNames;
    }

    public void setOrgNames(List<String> orgNames) {
        this.orgNames = orgNames;
    }

    

    public ChannelInfo withOrgNameHash(List<String> orgNameHash) {
        this.orgNameHash = orgNameHash;
        return this;
    }

    
    public ChannelInfo addOrgNameHashItem(String orgNameHashItem) {
        if(this.orgNameHash == null) {
            this.orgNameHash = new ArrayList<>();
        }
        this.orgNameHash.add(orgNameHashItem);
        return this;
    }

    public ChannelInfo withOrgNameHash(Consumer<List<String>> orgNameHashSetter) {
        if(this.orgNameHash == null) {
            this.orgNameHash = new ArrayList<>();
        }
        orgNameHashSetter.accept(this.orgNameHash);
        return this;
    }

    /**
     * 通道中组织名的哈希值
     * @return orgNameHash
     */
    public List<String> getOrgNameHash() {
        return orgNameHash;
    }

    public void setOrgNameHash(List<String> orgNameHash) {
        this.orgNameHash = orgNameHash;
    }

    

    public ChannelInfo withPeers(Map<String, List<String>> peers) {
        this.peers = peers;
        return this;
    }

    

    public ChannelInfo putPeersItem(String key, List<String> peersItem) {
        if(this.peers == null) {
            this.peers = new HashMap<>();
        }
        this.peers.put(key, peersItem);
        return this;
    }

    public ChannelInfo withPeers(Consumer<Map<String, List<String>>> peersSetter) {
        if(this.peers == null) {
            this.peers = new HashMap<>();
        }
        peersSetter.accept(this.peers);
        return this;
    }
    /**
     * key:组织名，value:peer节点数组
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
        ChannelInfo channelInfo = (ChannelInfo) o;
        return Objects.equals(this.name, channelInfo.name) &&
            Objects.equals(this.orgNames, channelInfo.orgNames) &&
            Objects.equals(this.orgNameHash, channelInfo.orgNameHash) &&
            Objects.equals(this.peers, channelInfo.peers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, orgNames, orgNameHash, peers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    orgNames: ").append(toIndentedString(orgNames)).append("\n");
        sb.append("    orgNameHash: ").append(toIndentedString(orgNameHash)).append("\n");
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

