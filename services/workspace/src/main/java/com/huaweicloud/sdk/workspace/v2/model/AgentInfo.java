package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AgentInfo
 */
public class AgentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_name")

    private String agentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_installed")

    private Boolean isInstalled;

    public AgentInfo withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * 插件名称
     * @return agentName
     */
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public AgentInfo withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * 插件版本
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public AgentInfo withIsInstalled(Boolean isInstalled) {
        this.isInstalled = isInstalled;
        return this;
    }

    /**
     * 是否安装插件（是否）
     * @return isInstalled
     */
    public Boolean getIsInstalled() {
        return isInstalled;
    }

    public void setIsInstalled(Boolean isInstalled) {
        this.isInstalled = isInstalled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentInfo that = (AgentInfo) obj;
        return Objects.equals(this.agentName, that.agentName) && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.isInstalled, that.isInstalled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentName, agentVersion, isInstalled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentInfo {\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    isInstalled: ").append(toIndentedString(isInstalled)).append("\n");
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
