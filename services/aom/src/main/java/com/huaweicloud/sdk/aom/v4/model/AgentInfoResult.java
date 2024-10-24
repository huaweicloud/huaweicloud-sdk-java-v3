package com.huaweicloud.sdk.aom.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AgentInfoResult
 */
public class AgentInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_ip")

    private String innerIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_ip")

    private String importIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_state")

    private String agentState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_hw_cloud_host")

    private String isHwCloudHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmdb_id")

    private String cmdbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_id")

    private String ecsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    public AgentInfoResult withInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }

    /**
     * 机器 IP。
     * @return innerIp
     */
    public String getInnerIp() {
        return innerIp;
    }

    public void setInnerIp(String innerIp) {
        this.innerIp = innerIp;
    }

    public AgentInfoResult withImportIp(String importIp) {
        this.importIp = importIp;
        return this;
    }

    /**
     * 机器导入IP。
     * @return importIp
     */
    public String getImportIp() {
        return importIp;
    }

    public void setImportIp(String importIp) {
        this.importIp = importIp;
    }

    public AgentInfoResult withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * agent id。
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public AgentInfoResult withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名。
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public AgentInfoResult withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public AgentInfoResult withAgentState(String agentState) {
        this.agentState = agentState;
        return this;
    }

    /**
     * UniAgent状态。
     * @return agentState
     */
    public String getAgentState() {
        return agentState;
    }

    public void setAgentState(String agentState) {
        this.agentState = agentState;
    }

    public AgentInfoResult withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 所属project ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AgentInfoResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * UniAgent版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AgentInfoResult withIsHwCloudHost(String isHwCloudHost) {
        this.isHwCloudHost = isHwCloudHost;
        return this;
    }

    /**
     * 是否华为云机器。
     * @return isHwCloudHost
     */
    public String getIsHwCloudHost() {
        return isHwCloudHost;
    }

    public void setIsHwCloudHost(String isHwCloudHost) {
        this.isHwCloudHost = isHwCloudHost;
    }

    public AgentInfoResult withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public AgentInfoResult withCmdbId(String cmdbId) {
        this.cmdbId = cmdbId;
        return this;
    }

    /**
     * CMDB ID.
     * @return cmdbId
     */
    public String getCmdbId() {
        return cmdbId;
    }

    public void setCmdbId(String cmdbId) {
        this.cmdbId = cmdbId;
    }

    public AgentInfoResult withEcsId(String ecsId) {
        this.ecsId = ecsId;
        return this;
    }

    /**
     * ECS ID。唯一值.
     * @return ecsId
     */
    public String getEcsId() {
        return ecsId;
    }

    public void setEcsId(String ecsId) {
        this.ecsId = ecsId;
    }

    public AgentInfoResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 机器所属domain ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentInfoResult that = (AgentInfoResult) obj;
        return Objects.equals(this.innerIp, that.innerIp) && Objects.equals(this.importIp, that.importIp)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.agentState, that.agentState)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.version, that.version)
            && Objects.equals(this.isHwCloudHost, that.isHwCloudHost) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.cmdbId, that.cmdbId) && Objects.equals(this.ecsId, that.ecsId)
            && Objects.equals(this.domainId, that.domainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(innerIp,
            importIp,
            agentId,
            hostName,
            osType,
            agentState,
            projectId,
            version,
            isHwCloudHost,
            vpcId,
            cmdbId,
            ecsId,
            domainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentInfoResult {\n");
        sb.append("    innerIp: ").append(toIndentedString(innerIp)).append("\n");
        sb.append("    importIp: ").append(toIndentedString(importIp)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    isHwCloudHost: ").append(toIndentedString(isHwCloudHost)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    cmdbId: ").append(toIndentedString(cmdbId)).append("\n");
        sb.append("    ecsId: ").append(toIndentedString(ecsId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
