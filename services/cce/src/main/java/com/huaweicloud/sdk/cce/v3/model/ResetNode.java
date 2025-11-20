package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * 重置节点参数。集群内已有节点通过重置进行重新安装并接入集群。
 */
public class ResetNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeID")

    private UUID nodeID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private ReinstallNodeSpec spec;

    public ResetNode withNodeID(UUID nodeID) {
        this.nodeID = nodeID;
        return this;
    }

    /**
     * **参数解释**： 节点ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return nodeID
     */
    public UUID getNodeID() {
        return nodeID;
    }

    public void setNodeID(UUID nodeID) {
        this.nodeID = nodeID;
    }

    public ResetNode withSpec(ReinstallNodeSpec spec) {
        this.spec = spec;
        return this;
    }

    public ResetNode withSpec(Consumer<ReinstallNodeSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new ReinstallNodeSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public ReinstallNodeSpec getSpec() {
        return spec;
    }

    public void setSpec(ReinstallNodeSpec spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetNode that = (ResetNode) obj;
        return Objects.equals(this.nodeID, that.nodeID) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeID, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetNode {\n");
        sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
