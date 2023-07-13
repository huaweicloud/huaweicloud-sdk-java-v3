package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * HostContainerPortMapping
 */
public class HostContainerPortMapping {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_port")

    private Long containerPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_port")

    private Long hostPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_port_range")

    private HostPortRange hostPortRange;

    public HostContainerPortMapping withContainerPort(Long containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * 容器端口,1到65535之间的整数
     * @return containerPort
     */
    public Long getContainerPort() {
        return containerPort;
    }

    public void setContainerPort(Long containerPort) {
        this.containerPort = containerPort;
    }

    public HostContainerPortMapping withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 对应主机网卡地址，形如192.168.0.1
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public HostContainerPortMapping withHostPort(Long hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * 主机端口,1到65535之间的整数，与主机端口范围二选一
     * @return hostPort
     */
    public Long getHostPort() {
        return hostPort;
    }

    public void setHostPort(Long hostPort) {
        this.hostPort = hostPort;
    }

    public HostContainerPortMapping withHostPortRange(HostPortRange hostPortRange) {
        this.hostPortRange = hostPortRange;
        return this;
    }

    public HostContainerPortMapping withHostPortRange(Consumer<HostPortRange> hostPortRangeSetter) {
        if (this.hostPortRange == null) {
            this.hostPortRange = new HostPortRange();
            hostPortRangeSetter.accept(this.hostPortRange);
        }

        return this;
    }

    /**
     * Get hostPortRange
     * @return hostPortRange
     */
    public HostPortRange getHostPortRange() {
        return hostPortRange;
    }

    public void setHostPortRange(HostPortRange hostPortRange) {
        this.hostPortRange = hostPortRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostContainerPortMapping that = (HostContainerPortMapping) obj;
        return Objects.equals(this.containerPort, that.containerPort) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.hostPort, that.hostPort) && Objects.equals(this.hostPortRange, that.hostPortRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerPort, hostIp, hostPort, hostPortRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostContainerPortMapping {\n");
        sb.append("    containerPort: ").append(toIndentedString(containerPort)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
        sb.append("    hostPortRange: ").append(toIndentedString(hostPortRange)).append("\n");
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
