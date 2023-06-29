package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 区块链相关信息
 */
public class TicsAgentDeployBcs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcs_ip")

    private String bcsIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_chain_id")

    private String blockChainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_chain_name")

    private String blockChainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_name")

    private String channelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_name")

    private String orgName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_name_hash")

    private String orgNameHash;

    public TicsAgentDeployBcs withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 可信节点Id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public TicsAgentDeployBcs withBcsIp(String bcsIp) {
        this.bcsIp = bcsIp;
        return this;
    }

    /**
     * 区块链ip
     * @return bcsIp
     */
    public String getBcsIp() {
        return bcsIp;
    }

    public void setBcsIp(String bcsIp) {
        this.bcsIp = bcsIp;
    }

    public TicsAgentDeployBcs withBlockChainId(String blockChainId) {
        this.blockChainId = blockChainId;
        return this;
    }

    /**
     * 区块链Id
     * @return blockChainId
     */
    public String getBlockChainId() {
        return blockChainId;
    }

    public void setBlockChainId(String blockChainId) {
        this.blockChainId = blockChainId;
    }

    public TicsAgentDeployBcs withBlockChainName(String blockChainName) {
        this.blockChainName = blockChainName;
        return this;
    }

    /**
     * 区块链名称
     * @return blockChainName
     */
    public String getBlockChainName() {
        return blockChainName;
    }

    public void setBlockChainName(String blockChainName) {
        this.blockChainName = blockChainName;
    }

    public TicsAgentDeployBcs withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * 通道名称
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public TicsAgentDeployBcs withOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    /**
     * 组织名称
     * @return orgName
     */
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public TicsAgentDeployBcs withOrgNameHash(String orgNameHash) {
        this.orgNameHash = orgNameHash;
        return this;
    }

    /**
     * 组织名称的hash
     * @return orgNameHash
     */
    public String getOrgNameHash() {
        return orgNameHash;
    }

    public void setOrgNameHash(String orgNameHash) {
        this.orgNameHash = orgNameHash;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicsAgentDeployBcs that = (TicsAgentDeployBcs) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.bcsIp, that.bcsIp)
            && Objects.equals(this.blockChainId, that.blockChainId)
            && Objects.equals(this.blockChainName, that.blockChainName)
            && Objects.equals(this.channelName, that.channelName) && Objects.equals(this.orgName, that.orgName)
            && Objects.equals(this.orgNameHash, that.orgNameHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, bcsIp, blockChainId, blockChainName, channelName, orgName, orgNameHash);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicsAgentDeployBcs {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    bcsIp: ").append(toIndentedString(bcsIp)).append("\n");
        sb.append("    blockChainId: ").append(toIndentedString(blockChainId)).append("\n");
        sb.append("    blockChainName: ").append(toIndentedString(blockChainName)).append("\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
        sb.append("    orgNameHash: ").append(toIndentedString(orgNameHash)).append("\n");
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
