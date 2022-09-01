package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * BatchRemovePeersFromChannelRequestBody
 */
public class BatchRemovePeersFromChannelRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_name")

    @JacksonXmlProperty(localName = "org_name")

    private String orgName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peers")

    @JacksonXmlProperty(localName = "peers")

    private Integer peers;

    public BatchRemovePeersFromChannelRequestBody withOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    /**
     * 组织名称。仅可输入一个组织名称
     * @return orgName
     */
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public BatchRemovePeersFromChannelRequestBody withPeers(Integer peers) {
        this.peers = peers;
        return this;
    }

    /**
     * 要退出的节点个数。取值范围(0, 组织中节点总数)
     * @return peers
     */
    public Integer getPeers() {
        return peers;
    }

    public void setPeers(Integer peers) {
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
        BatchRemovePeersFromChannelRequestBody batchRemovePeersFromChannelRequestBody =
            (BatchRemovePeersFromChannelRequestBody) o;
        return Objects.equals(this.orgName, batchRemovePeersFromChannelRequestBody.orgName)
            && Objects.equals(this.peers, batchRemovePeersFromChannelRequestBody.peers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgName, peers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRemovePeersFromChannelRequestBody {\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
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
