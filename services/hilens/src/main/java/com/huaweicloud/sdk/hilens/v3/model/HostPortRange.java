package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HostPortRange
 */
public class HostPortRange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_port")

    private Long maxPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_port")

    private Long minPort;

    public HostPortRange withMaxPort(Long maxPort) {
        this.maxPort = maxPort;
        return this;
    }

    /**
     * 主机端口上限值,1到65535之间的整数；max_port需大于min_port
     * @return maxPort
     */
    public Long getMaxPort() {
        return maxPort;
    }

    public void setMaxPort(Long maxPort) {
        this.maxPort = maxPort;
    }

    public HostPortRange withMinPort(Long minPort) {
        this.minPort = minPort;
        return this;
    }

    /**
     * 主机端口下限制,1到65535之间的整数
     * @return minPort
     */
    public Long getMinPort() {
        return minPort;
    }

    public void setMinPort(Long minPort) {
        this.minPort = minPort;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostPortRange hostPortRange = (HostPortRange) o;
        return Objects.equals(this.maxPort, hostPortRange.maxPort)
            && Objects.equals(this.minPort, hostPortRange.minPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxPort, minPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostPortRange {\n");
        sb.append("    maxPort: ").append(toIndentedString(maxPort)).append("\n");
        sb.append("    minPort: ").append(toIndentedString(minPort)).append("\n");
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
