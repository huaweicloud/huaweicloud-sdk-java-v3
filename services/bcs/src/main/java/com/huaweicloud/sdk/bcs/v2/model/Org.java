package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Org
 */
public class Org {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_msp_id")

    private String orgMspId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_domain")

    private String orgDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peers")

    private Map<String, Node> peers = null;

    public Org withOrgMspId(String orgMspId) {
        this.orgMspId = orgMspId;
        return this;
    }

    /**
     * 组织MSP标识
     * @return orgMspId
     */
    public String getOrgMspId() {
        return orgMspId;
    }

    public void setOrgMspId(String orgMspId) {
        this.orgMspId = orgMspId;
    }

    public Org withOrgDomain(String orgDomain) {
        this.orgDomain = orgDomain;
        return this;
    }

    /**
     * 组织域名
     * @return orgDomain
     */
    public String getOrgDomain() {
        return orgDomain;
    }

    public void setOrgDomain(String orgDomain) {
        this.orgDomain = orgDomain;
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
        if (this.peers == null) {
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
        return Objects.equals(this.orgMspId, org.orgMspId) && Objects.equals(this.orgDomain, org.orgDomain)
            && Objects.equals(this.peers, org.peers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgMspId, orgDomain, peers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Org {\n");
        sb.append("    orgMspId: ").append(toIndentedString(orgMspId)).append("\n");
        sb.append("    orgDomain: ").append(toIndentedString(orgDomain)).append("\n");
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
