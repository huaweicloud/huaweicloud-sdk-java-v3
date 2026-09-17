package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 超节点的配置详情，超节点只包含基本的资源规格属性，其他配置从所属节点池继承。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
 */
public class HyperNodeSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepoolID")

    private String nodepoolID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeTemplate")

    private NodeTemplateInHyperNode nodeTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargeMode")

    private String chargeMode;

    public HyperNodeSpec withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**： 超节点规格 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public HyperNodeSpec withNodepoolID(String nodepoolID) {
        this.nodepoolID = nodepoolID;
        return this;
    }

    /**
     * **参数解释**： 所属节点池ID **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return nodepoolID
     */
    public String getNodepoolID() {
        return nodepoolID;
    }

    public void setNodepoolID(String nodepoolID) {
        this.nodepoolID = nodepoolID;
    }

    public HyperNodeSpec withNodeTemplate(NodeTemplateInHyperNode nodeTemplate) {
        this.nodeTemplate = nodeTemplate;
        return this;
    }

    public HyperNodeSpec withNodeTemplate(Consumer<NodeTemplateInHyperNode> nodeTemplateSetter) {
        if (this.nodeTemplate == null) {
            this.nodeTemplate = new NodeTemplateInHyperNode();
            nodeTemplateSetter.accept(this.nodeTemplate);
        }

        return this;
    }

    /**
     * Get nodeTemplate
     * @return nodeTemplate
     */
    public NodeTemplateInHyperNode getNodeTemplate() {
        return nodeTemplate;
    }

    public void setNodeTemplate(NodeTemplateInHyperNode nodeTemplate) {
        this.nodeTemplate = nodeTemplate;
    }

    public HyperNodeSpec withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * **参数解释**： 付费方式 **约束限制**： 不涉及 **取值范围**： - prepaid：预付费，即包年包月； - postpaid：后付费，即按需付费；  **默认取值**： 不涉及
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HyperNodeSpec that = (HyperNodeSpec) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.nodepoolID, that.nodepoolID)
            && Objects.equals(this.nodeTemplate, that.nodeTemplate) && Objects.equals(this.chargeMode, that.chargeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, nodepoolID, nodeTemplate, chargeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HyperNodeSpec {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    nodepoolID: ").append(toIndentedString(nodepoolID)).append("\n");
        sb.append("    nodeTemplate: ").append(toIndentedString(nodeTemplate)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
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
