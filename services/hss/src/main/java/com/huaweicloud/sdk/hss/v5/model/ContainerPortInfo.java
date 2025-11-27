package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 容器端口信息
 */
public class ContainerPortInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_port")

    private Integer containerPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_port")

    private Integer hostPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_name")

    private String portName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    public ContainerPortInfo withContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * 容器端口
     * minimum: 0
     * maximum: 65535
     * @return containerPort
     */
    public Integer getContainerPort() {
        return containerPort;
    }

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    public ContainerPortInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 主机IP
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ContainerPortInfo withHostPort(Integer hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * 主机端口
     * minimum: 0
     * maximum: 65535
     * @return hostPort
     */
    public Integer getHostPort() {
        return hostPort;
    }

    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    public ContainerPortInfo withPortName(String portName) {
        this.portName = portName;
        return this;
    }

    /**
     * 端口名称
     * @return portName
     */
    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public ContainerPortInfo withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 端口协议，举例如下 -TCP,默认TCP -UDP
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerPortInfo that = (ContainerPortInfo) obj;
        return Objects.equals(this.containerPort, that.containerPort) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.hostPort, that.hostPort) && Objects.equals(this.portName, that.portName)
            && Objects.equals(this.protocol, that.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerPort, hostIp, hostPort, portName, protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerPortInfo {\n");
        sb.append("    containerPort: ").append(toIndentedString(containerPort)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
        sb.append("    portName: ").append(toIndentedString(portName)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
