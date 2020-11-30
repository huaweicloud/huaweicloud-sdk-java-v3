package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.Node;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Org
 */
public class Org  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="msp_id")
    
    private String mspId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="peers")
    
    private Map<String, Node> peers = null;
    
    public Org withMspId(String mspId) {
        this.mspId = mspId;
        return this;
    }

    


    /**
     * 组织MSP标识
     * @return mspId
     */
    public String getMspId() {
        return mspId;
    }

    public void setMspId(String mspId) {
        this.mspId = mspId;
    }

    public Org withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 组织域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Org withPeers(Map<String, Node> peers) {
        this.peers = peers;
        return this;
    }

    

    public Org putPeersItem(String key, Node peersItem) {
         if (this.peers == null) {
            this.peers = new HashMap<>();
         }
        this.peers.put(key, peersItem);
        return this;
    }

    public Org withPeers(Consumer<Map<String, Node>> peersSetter) {
        if(this.peers == null ){
            this.peers = new HashMap<>();
        }
        peersSetter.accept(this.peers);
        return this;
    }
    /**
     * key:节点名称，value：节点详细信息
     * @return peers
     */
    public Map<String, Node> getPeers() {
        return peers;
    }

    public void setPeers(Map<String, Node> peers) {
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
        Org org = (Org) o;
        return Objects.equals(this.mspId, org.mspId) &&
            Objects.equals(this.domain, org.domain) &&
            Objects.equals(this.peers, org.peers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(mspId, domain, peers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Org {\n");
        sb.append("    mspId: ").append(toIndentedString(mspId)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

