package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstallationConfig
 */
public class InstallationConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private Selector nodes;

    public InstallationConfig withNodes(Selector nodes) {
        this.nodes = nodes;
        return this;
    }

    public InstallationConfig withNodes(Consumer<Selector> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new Selector();
            nodesSetter.accept(this.nodes);
        }

        return this;
    }

    /**
     * Get nodes
     * @return nodes
     */
    public Selector getNodes() {
        return nodes;
    }

    public void setNodes(Selector nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstallationConfig that = (InstallationConfig) obj;
        return Objects.equals(this.nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstallationConfig {\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
