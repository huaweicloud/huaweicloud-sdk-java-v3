package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 可信节点信息表
 */
public class TicsAgentNodeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_vpcep_eps_id")

    private String agentVpcepEpsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_server_id")

    private String ecsServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_server_ip_security_group_rule")

    private String leagueServerIpSecurityGroupRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_server_snat_ip")

    private String leagueServerSnatIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_eip")

    private String natEip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_eip_id")

    private String natEipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_az")

    private String nodeAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ip")

    private String nodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_to_agent_vpcep_epi_id")

    private String serverToAgentVpcepEpiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_to_agent_vpcep_epi_ip")

    private String serverToAgentVpcepEpiIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rule_id")

    private String snatRuleId;

    public TicsAgentNodeInfo withAgentId(String agentId) {
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

    public TicsAgentNodeInfo withAgentVpcepEpsId(String agentVpcepEpsId) {
        this.agentVpcepEpsId = agentVpcepEpsId;
        return this;
    }

    /**
     * 无eip场景下,agent的eps id
     * @return agentVpcepEpsId
     */
    public String getAgentVpcepEpsId() {
        return agentVpcepEpsId;
    }

    public void setAgentVpcepEpsId(String agentVpcepEpsId) {
        this.agentVpcepEpsId = agentVpcepEpsId;
    }

    public TicsAgentNodeInfo withEcsServerId(String ecsServerId) {
        this.ecsServerId = ecsServerId;
        return this;
    }

    /**
     * 弹性云服务器Id，IEF部署同node_id
     * @return ecsServerId
     */
    public String getEcsServerId() {
        return ecsServerId;
    }

    public void setEcsServerId(String ecsServerId) {
        this.ecsServerId = ecsServerId;
    }

    public TicsAgentNodeInfo withLeagueServerIpSecurityGroupRule(String leagueServerIpSecurityGroupRule) {
        this.leagueServerIpSecurityGroupRule = leagueServerIpSecurityGroupRule;
        return this;
    }

    /**
     * 入方向安全组规则ID
     * @return leagueServerIpSecurityGroupRule
     */
    public String getLeagueServerIpSecurityGroupRule() {
        return leagueServerIpSecurityGroupRule;
    }

    public void setLeagueServerIpSecurityGroupRule(String leagueServerIpSecurityGroupRule) {
        this.leagueServerIpSecurityGroupRule = leagueServerIpSecurityGroupRule;
    }

    public TicsAgentNodeInfo withLeagueServerSnatIp(String leagueServerSnatIp) {
        this.leagueServerSnatIp = leagueServerSnatIp;
        return this;
    }

    /**
     * 联盟server组件的ip，为server的snatip，设置代理节点的入方向安全组规则
     * @return leagueServerSnatIp
     */
    public String getLeagueServerSnatIp() {
        return leagueServerSnatIp;
    }

    public void setLeagueServerSnatIp(String leagueServerSnatIp) {
        this.leagueServerSnatIp = leagueServerSnatIp;
    }

    public TicsAgentNodeInfo withNatEip(String natEip) {
        this.natEip = natEip;
        return this;
    }

    /**
     * 可信节点绑定的网关的ip，CCE部署时会返回该值
     * @return natEip
     */
    public String getNatEip() {
        return natEip;
    }

    public void setNatEip(String natEip) {
        this.natEip = natEip;
    }

    public TicsAgentNodeInfo withNatEipId(String natEipId) {
        this.natEipId = natEipId;
        return this;
    }

    /**
     * 可信节点绑定的网关的ip的Id，CCE部署时会返回该值
     * @return natEipId
     */
    public String getNatEipId() {
        return natEipId;
    }

    public void setNatEipId(String natEipId) {
        this.natEipId = natEipId;
    }

    public TicsAgentNodeInfo withNodeAz(String nodeAz) {
        this.nodeAz = nodeAz;
        return this;
    }

    /**
     * 弹性云服务器所在可用区，CCE部署时会返回该值
     * @return nodeAz
     */
    public String getNodeAz() {
        return nodeAz;
    }

    public void setNodeAz(String nodeAz) {
        this.nodeAz = nodeAz;
    }

    public TicsAgentNodeInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 可信节点部署的虚机id，CCE部署情况返回CCE节点ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public TicsAgentNodeInfo withNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }

    /**
     * 弹性云服务器的私网ip
     * @return nodeIp
     */
    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public TicsAgentNodeInfo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 弹性云服务器的名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public TicsAgentNodeInfo withServerToAgentVpcepEpiId(String serverToAgentVpcepEpiId) {
        this.serverToAgentVpcepEpiId = serverToAgentVpcepEpiId;
        return this;
    }

    /**
     * 无eip场景下,server访问agent的epi id
     * @return serverToAgentVpcepEpiId
     */
    public String getServerToAgentVpcepEpiId() {
        return serverToAgentVpcepEpiId;
    }

    public void setServerToAgentVpcepEpiId(String serverToAgentVpcepEpiId) {
        this.serverToAgentVpcepEpiId = serverToAgentVpcepEpiId;
    }

    public TicsAgentNodeInfo withServerToAgentVpcepEpiIp(String serverToAgentVpcepEpiIp) {
        this.serverToAgentVpcepEpiIp = serverToAgentVpcepEpiIp;
        return this;
    }

    /**
     * 无eip场景下,server访问agent的ip
     * @return serverToAgentVpcepEpiIp
     */
    public String getServerToAgentVpcepEpiIp() {
        return serverToAgentVpcepEpiIp;
    }

    public void setServerToAgentVpcepEpiIp(String serverToAgentVpcepEpiIp) {
        this.serverToAgentVpcepEpiIp = serverToAgentVpcepEpiIp;
    }

    public TicsAgentNodeInfo withSnatRuleId(String snatRuleId) {
        this.snatRuleId = snatRuleId;
        return this;
    }

    /**
     * 节点绑定的snat id
     * @return snatRuleId
     */
    public String getSnatRuleId() {
        return snatRuleId;
    }

    public void setSnatRuleId(String snatRuleId) {
        this.snatRuleId = snatRuleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicsAgentNodeInfo that = (TicsAgentNodeInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.agentVpcepEpsId, that.agentVpcepEpsId)
            && Objects.equals(this.ecsServerId, that.ecsServerId)
            && Objects.equals(this.leagueServerIpSecurityGroupRule, that.leagueServerIpSecurityGroupRule)
            && Objects.equals(this.leagueServerSnatIp, that.leagueServerSnatIp)
            && Objects.equals(this.natEip, that.natEip) && Objects.equals(this.natEipId, that.natEipId)
            && Objects.equals(this.nodeAz, that.nodeAz) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeIp, that.nodeIp) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.serverToAgentVpcepEpiId, that.serverToAgentVpcepEpiId)
            && Objects.equals(this.serverToAgentVpcepEpiIp, that.serverToAgentVpcepEpiIp)
            && Objects.equals(this.snatRuleId, that.snatRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            agentVpcepEpsId,
            ecsServerId,
            leagueServerIpSecurityGroupRule,
            leagueServerSnatIp,
            natEip,
            natEipId,
            nodeAz,
            nodeId,
            nodeIp,
            nodeName,
            serverToAgentVpcepEpiId,
            serverToAgentVpcepEpiIp,
            snatRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicsAgentNodeInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentVpcepEpsId: ").append(toIndentedString(agentVpcepEpsId)).append("\n");
        sb.append("    ecsServerId: ").append(toIndentedString(ecsServerId)).append("\n");
        sb.append("    leagueServerIpSecurityGroupRule: ")
            .append(toIndentedString(leagueServerIpSecurityGroupRule))
            .append("\n");
        sb.append("    leagueServerSnatIp: ").append(toIndentedString(leagueServerSnatIp)).append("\n");
        sb.append("    natEip: ").append(toIndentedString(natEip)).append("\n");
        sb.append("    natEipId: ").append(toIndentedString(natEipId)).append("\n");
        sb.append("    nodeAz: ").append(toIndentedString(nodeAz)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    serverToAgentVpcepEpiId: ").append(toIndentedString(serverToAgentVpcepEpiId)).append("\n");
        sb.append("    serverToAgentVpcepEpiIp: ").append(toIndentedString(serverToAgentVpcepEpiIp)).append("\n");
        sb.append("    snatRuleId: ").append(toIndentedString(snatRuleId)).append("\n");
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
