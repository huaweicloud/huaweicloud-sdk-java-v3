package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 拓扑结构。
 */
public class SiteNetworkTopology {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topology")

    private SiteNetworkTopologyEnum topology;

    public SiteNetworkTopology withTopology(SiteNetworkTopologyEnum topology) {
        this.topology = topology;
        return this;
    }

    /**
     * Get topology
     * @return topology
     */
    public SiteNetworkTopologyEnum getTopology() {
        return topology;
    }

    public void setTopology(SiteNetworkTopologyEnum topology) {
        this.topology = topology;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteNetworkTopology that = (SiteNetworkTopology) obj;
        return Objects.equals(this.topology, that.topology);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topology);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteNetworkTopology {\n");
        sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
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
