package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PortStatusRequestInfo
 */
public class PortStatusRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_type")

    private String portType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    public PortStatusRequestInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**: agent id **约束限制**: 不涉及 **取值范围**: 字符长度0-64位 **默认取值**: 不涉及 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public PortStatusRequestInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**: 本地端口号 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2147483647 **默认取值**: 不涉及 
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public PortStatusRequestInfo withPortType(String portType) {
        this.portType = portType;
        return this;
    }

    /**
     * **参数解释**: 端口类型 **约束限制**: 不涉及 **取值范围**: - TCP - UDP  **默认取值**: 不涉及 
     * @return portType
     */
    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public PortStatusRequestInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**: 容器id **约束限制**: 不涉及 **取值范围**: 字符长度0-64位 **默认取值**: 不涉及 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public PortStatusRequestInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 主机id **约束限制**: 不涉及 **取值范围**: 字符长度0-64位 **默认取值**: 不涉及 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PortStatusRequestInfo that = (PortStatusRequestInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.port, that.port)
            && Objects.equals(this.portType, that.portType) && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.hostId, that.hostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, port, portType, containerId, hostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortStatusRequestInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
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
