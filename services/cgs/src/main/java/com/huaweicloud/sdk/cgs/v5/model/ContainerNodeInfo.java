package com.huaweicloud.sdk.cgs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 节点（服务器）状态列表 */
public class ContainerNodeInfo {

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

    public ContainerNodeInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /** 节点id
     * 
     * @return hostId */
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

    /** 节点（服务器）名称
     * 
     * @return hostName */
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

    /** 服务器状态，包含如下4种。 - ACTIVE ：正在运行。 - SHUTOFF ：关机。 - BUILDING ：创建中。 - ERROR ：故障。
     * 
     * @return hostStatus */
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

    /** Agent状态，包含如下3种。 - not_register ：未注册。 - online ：在线。 - offline ：离线。
     * 
     * @return agentStatus */
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

    /** 防护状态，包含如下2种。 - closed ：关闭。 - opened ：开启。
     * 
     * @return protectStatus */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerNodeInfo containerNodeInfo = (ContainerNodeInfo) o;
        return Objects.equals(this.hostId, containerNodeInfo.hostId)
            && Objects.equals(this.hostName, containerNodeInfo.hostName)
            && Objects.equals(this.hostStatus, containerNodeInfo.hostStatus)
            && Objects.equals(this.agentStatus, containerNodeInfo.agentStatus)
            && Objects.equals(this.protectStatus, containerNodeInfo.protectStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, hostName, hostStatus, agentStatus, protectStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerNodeInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
