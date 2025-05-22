package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 更新节点的网卡信息。 **约束限制**： 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class NodeSpecUpdateNodeNicSpecUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primaryNic")

    private NodeSpecUpdateNodeNicSpecUpdatePrimaryNic primaryNic;

    public NodeSpecUpdateNodeNicSpecUpdate withPrimaryNic(NodeSpecUpdateNodeNicSpecUpdatePrimaryNic primaryNic) {
        this.primaryNic = primaryNic;
        return this;
    }

    public NodeSpecUpdateNodeNicSpecUpdate withPrimaryNic(
        Consumer<NodeSpecUpdateNodeNicSpecUpdatePrimaryNic> primaryNicSetter) {
        if (this.primaryNic == null) {
            this.primaryNic = new NodeSpecUpdateNodeNicSpecUpdatePrimaryNic();
            primaryNicSetter.accept(this.primaryNic);
        }

        return this;
    }

    /**
     * Get primaryNic
     * @return primaryNic
     */
    public NodeSpecUpdateNodeNicSpecUpdatePrimaryNic getPrimaryNic() {
        return primaryNic;
    }

    public void setPrimaryNic(NodeSpecUpdateNodeNicSpecUpdatePrimaryNic primaryNic) {
        this.primaryNic = primaryNic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeSpecUpdateNodeNicSpecUpdate that = (NodeSpecUpdateNodeNicSpecUpdate) obj;
        return Objects.equals(this.primaryNic, that.primaryNic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryNic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSpecUpdateNodeNicSpecUpdate {\n");
        sb.append("    primaryNic: ").append(toIndentedString(primaryNic)).append("\n");
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
