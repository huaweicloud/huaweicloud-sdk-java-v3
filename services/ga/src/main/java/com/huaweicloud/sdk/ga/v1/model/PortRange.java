package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * port range
 */
public class PortRange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_port")

    private Integer fromPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_port")

    private Integer toPort;

    public PortRange withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * 起始端口。
     * minimum: 1
     * maximum: 65535
     * @return fromPort
     */
    public Integer getFromPort() {
        return fromPort;
    }

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    public PortRange withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * 结束端口。
     * minimum: 1
     * maximum: 65535
     * @return toPort
     */
    public Integer getToPort() {
        return toPort;
    }

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PortRange that = (PortRange) obj;
        return Objects.equals(this.fromPort, that.fromPort) && Objects.equals(this.toPort, that.toPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromPort, toPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortRange {\n");
        sb.append("    fromPort: ").append(toIndentedString(fromPort)).append("\n");
        sb.append("    toPort: ").append(toIndentedString(toPort)).append("\n");
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
