package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PortRange
 */
public class PortRange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_port")

    private Integer startPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_port")

    private Integer endPort;

    public PortRange withStartPort(Integer startPort) {
        this.startPort = startPort;
        return this;
    }

    /**
     * **参数解释**：起始端口。  **约束限制**：不涉及  **取值范围**：1-65535  **默认取值：不涉及
     * minimum: 1
     * maximum: 65535
     * @return startPort
     */
    public Integer getStartPort() {
        return startPort;
    }

    public void setStartPort(Integer startPort) {
        this.startPort = startPort;
    }

    public PortRange withEndPort(Integer endPort) {
        this.endPort = endPort;
        return this;
    }

    /**
     * **参数解释**：结束端口，需大于等于起始端口  **约束限制**：不涉及  **取值范围**：1-65535  **默认取值：不涉及
     * minimum: 1
     * maximum: 65535
     * @return endPort
     */
    public Integer getEndPort() {
        return endPort;
    }

    public void setEndPort(Integer endPort) {
        this.endPort = endPort;
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
        return Objects.equals(this.startPort, that.startPort) && Objects.equals(this.endPort, that.endPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPort, endPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortRange {\n");
        sb.append("    startPort: ").append(toIndentedString(startPort)).append("\n");
        sb.append("    endPort: ").append(toIndentedString(endPort)).append("\n");
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
