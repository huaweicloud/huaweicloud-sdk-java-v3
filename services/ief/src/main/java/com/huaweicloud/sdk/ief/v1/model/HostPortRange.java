package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 主机端口范围，在范围内为应用实例自动分配主机端口；与主机端口参数二选一；仅铂金版可用 */
public class HostPortRange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_port")

    private Integer minPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_port")

    private Integer maxPort;

    public HostPortRange withMinPort(Integer minPort) {
        this.minPort = minPort;
        return this;
    }

    /** 主机端口下限制,1到65535之间的整数
     * 
     * @return minPort */
    public Integer getMinPort() {
        return minPort;
    }

    public void setMinPort(Integer minPort) {
        this.minPort = minPort;
    }

    public HostPortRange withMaxPort(Integer maxPort) {
        this.maxPort = maxPort;
        return this;
    }

    /** 主机端口上限值,1到65535之间的整数；max_port需大于min_port
     * 
     * @return maxPort */
    public Integer getMaxPort() {
        return maxPort;
    }

    public void setMaxPort(Integer maxPort) {
        this.maxPort = maxPort;
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
        return Objects.equals(this.minPort, hostPortRange.minPort)
            && Objects.equals(this.maxPort, hostPortRange.maxPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minPort, maxPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostPortRange {\n");
        sb.append("    minPort: ").append(toIndentedString(minPort)).append("\n");
        sb.append("    maxPort: ").append(toIndentedString(maxPort)).append("\n");
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
