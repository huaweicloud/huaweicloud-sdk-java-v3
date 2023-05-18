package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class AgentRegister {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_os")

    private String hostOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_nickname")

    private String hostNickname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private String agentType;

    public AgentRegister withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 客户端ID
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public AgentRegister withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 客户端所在的主机名
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public AgentRegister withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 客户端所在主机的IP
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public AgentRegister withHostOs(String hostOs) {
        this.hostOs = hostOs;
        return this;
    }

    /**
     * 客户端所在主机的操作系统
     * @return hostOs
     */
    public String getHostOs() {
        return hostOs;
    }

    public void setHostOs(String hostOs) {
        this.hostOs = hostOs;
    }

    public AgentRegister withHostNickname(String hostNickname) {
        this.hostNickname = hostNickname;
        return this;
    }

    /**
     * 客户端所在主机的主机别名
     * @return hostNickname
     */
    public String getHostNickname() {
        return hostNickname;
    }

    public void setHostNickname(String hostNickname) {
        this.hostNickname = hostNickname;
    }

    public AgentRegister withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * 客户端版本
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public AgentRegister withAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * 客户端类型，分本地客户端和云上客户端(cloud/native)
     * @return agentType
     */
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgentRegister agentRegister = (AgentRegister) o;
        return Objects.equals(this.agentId, agentRegister.agentId)
            && Objects.equals(this.hostName, agentRegister.hostName)
            && Objects.equals(this.hostIp, agentRegister.hostIp) && Objects.equals(this.hostOs, agentRegister.hostOs)
            && Objects.equals(this.hostNickname, agentRegister.hostNickname)
            && Objects.equals(this.agentVersion, agentRegister.agentVersion)
            && Objects.equals(this.agentType, agentRegister.agentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, hostName, hostIp, hostOs, hostNickname, agentVersion, agentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentRegister {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    hostOs: ").append(toIndentedString(hostOs)).append("\n");
        sb.append("    hostNickname: ").append(toIndentedString(hostNickname)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
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
