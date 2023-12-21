package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 容器节点列表
 */
public class ContainerNodeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_status")

    private String hostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_interrupt")

    private Boolean protectInterrupt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_tags")

    private String containerTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_result")

    private String detectResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset")

    private Integer asset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerability")

    private Integer vulnerability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intrusion")

    private Integer intrusion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_id")

    private String policyGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_name")

    private String policyGroupName;

    public ContainerNodeInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * Agent ID
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ContainerNodeInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ContainerNodeInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 节点名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ContainerNodeInfo withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * 服务器状态，包含如下4种。   - ACTIVE ：正在运行。   - SHUTOFF ：关机。   - BUILDING ：创建中。   - ERROR ：故障。
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public ContainerNodeInfo withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * Agent状态，包含如下3种。   - not_installed ：未安装。   - online ：在线。   - offline ：离线。
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public ContainerNodeInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态，包含如下2种。   - closed ：关闭。   - opened ：开启。
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ContainerNodeInfo withProtectInterrupt(Boolean protectInterrupt) {
        this.protectInterrupt = protectInterrupt;
        return this;
    }

    /**
     * 防护是否中断
     * @return protectInterrupt
     */
    public Boolean getProtectInterrupt() {
        return protectInterrupt;
    }

    public void setProtectInterrupt(Boolean protectInterrupt) {
        this.protectInterrupt = protectInterrupt;
    }

    public ContainerNodeInfo withContainerTags(String containerTags) {
        this.containerTags = containerTags;
        return this;
    }

    /**
     * 标签：用来识别cce容器节点和自建  - cce：cce节点  - self：自建节点  - other：其他节点
     * @return containerTags
     */
    public String getContainerTags() {
        return containerTags;
    }

    public void setContainerTags(String containerTags) {
        this.containerTags = containerTags;
    }

    public ContainerNodeInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 私有IP地址
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ContainerNodeInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 弹性公网IP地址
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ContainerNodeInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 主机安全配额ID（UUID）
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ContainerNodeInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 服务器组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ContainerNodeInfo withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 所属企业项目名称
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public ContainerNodeInfo withDetectResult(String detectResult) {
        this.detectResult = detectResult;
        return this;
    }

    /**
     * 云主机安全检测结果，包含如下4种。 - undetected ：未检测。 - clean ：无风险。 - risk ：有风险。 - scanning ：检测中。
     * @return detectResult
     */
    public String getDetectResult() {
        return detectResult;
    }

    public void setDetectResult(String detectResult) {
        this.detectResult = detectResult;
    }

    public ContainerNodeInfo withAsset(Integer asset) {
        this.asset = asset;
        return this;
    }

    /**
     * 资产风险
     * minimum: 0
     * maximum: 2097152
     * @return asset
     */
    public Integer getAsset() {
        return asset;
    }

    public void setAsset(Integer asset) {
        this.asset = asset;
    }

    public ContainerNodeInfo withVulnerability(Integer vulnerability) {
        this.vulnerability = vulnerability;
        return this;
    }

    /**
     * 漏洞风险
     * minimum: 0
     * maximum: 2097152
     * @return vulnerability
     */
    public Integer getVulnerability() {
        return vulnerability;
    }

    public void setVulnerability(Integer vulnerability) {
        this.vulnerability = vulnerability;
    }

    public ContainerNodeInfo withIntrusion(Integer intrusion) {
        this.intrusion = intrusion;
        return this;
    }

    /**
     * 入侵风险
     * minimum: 0
     * maximum: 2097152
     * @return intrusion
     */
    public Integer getIntrusion() {
        return intrusion;
    }

    public void setIntrusion(Integer intrusion) {
        this.intrusion = intrusion;
    }

    public ContainerNodeInfo withPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }

    /**
     * 策略组ID
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return policyGroupId;
    }

    public void setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
    }

    public ContainerNodeInfo withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    /**
     * 策略组名称
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return policyGroupName;
    }

    public void setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerNodeInfo that = (ContainerNodeInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostStatus, that.hostStatus)
            && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.protectInterrupt, that.protectInterrupt)
            && Objects.equals(this.containerTags, that.containerTags) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.detectResult, that.detectResult) && Objects.equals(this.asset, that.asset)
            && Objects.equals(this.vulnerability, that.vulnerability) && Objects.equals(this.intrusion, that.intrusion)
            && Objects.equals(this.policyGroupId, that.policyGroupId)
            && Objects.equals(this.policyGroupName, that.policyGroupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            hostId,
            hostName,
            hostStatus,
            agentStatus,
            protectStatus,
            protectInterrupt,
            containerTags,
            privateIp,
            publicIp,
            resourceId,
            groupName,
            enterpriseProjectName,
            detectResult,
            asset,
            vulnerability,
            intrusion,
            policyGroupId,
            policyGroupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerNodeInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    protectInterrupt: ").append(toIndentedString(protectInterrupt)).append("\n");
        sb.append("    containerTags: ").append(toIndentedString(containerTags)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    detectResult: ").append(toIndentedString(detectResult)).append("\n");
        sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("    vulnerability: ").append(toIndentedString(vulnerability)).append("\n");
        sb.append("    intrusion: ").append(toIndentedString(intrusion)).append("\n");
        sb.append("    policyGroupId: ").append(toIndentedString(policyGroupId)).append("\n");
        sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
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
