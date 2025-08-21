package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Port
 */
public class Port {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_type")

    private Integer portType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private String ports;

    public Port withPortType(Integer portType) {
        this.portType = portType;
        return this;
    }

    /**
     * **参数解释**： 端口类型 **取值范围**： -1 Any，0 包含，1 排除
     * minimum: -1
     * maximum: 1
     * @return portType
     */
    public Integer getPortType() {
        return portType;
    }

    public void setPortType(Integer portType) {
        this.portType = portType;
    }

    public Port withPorts(String ports) {
        this.ports = ports;
        return this;
    }

    /**
     * **参数解释**： 端口 **取值范围**： 不涉及
     * @return ports
     */
    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Port that = (Port) obj;
        return Objects.equals(this.portType, that.portType) && Objects.equals(this.ports, that.ports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portType, ports);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Port {\n");
        sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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
