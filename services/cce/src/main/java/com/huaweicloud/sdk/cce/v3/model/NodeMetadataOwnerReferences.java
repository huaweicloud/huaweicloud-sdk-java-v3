package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 属主对象。 **约束限制**： - 创建成功后自动生成，填写无效。 - 创建节点接口返回内容中无该参数  **取值范围**： 不涉及 **默认取值**： 不涉及
 */
public class NodeMetadataOwnerReferences {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepoolName")

    private String nodepoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepoolID")

    private String nodepoolID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyperNodeName")

    private String hyperNodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyperNodeID")

    private String hyperNodeID;

    public NodeMetadataOwnerReferences withNodepoolName(String nodepoolName) {
        this.nodepoolName = nodepoolName;
        return this;
    }

    /**
     * **参数解释**： 节点池名称 **约束限制**： 创建成功后自动生成，填写无效。 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return nodepoolName
     */
    public String getNodepoolName() {
        return nodepoolName;
    }

    public void setNodepoolName(String nodepoolName) {
        this.nodepoolName = nodepoolName;
    }

    public NodeMetadataOwnerReferences withNodepoolID(String nodepoolID) {
        this.nodepoolID = nodepoolID;
        return this;
    }

    /**
     * **参数解释**： 节点池ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。 **约束限制**： 创建成功后自动生成，填写无效。 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return nodepoolID
     */
    public String getNodepoolID() {
        return nodepoolID;
    }

    public void setNodepoolID(String nodepoolID) {
        this.nodepoolID = nodepoolID;
    }

    public NodeMetadataOwnerReferences withHyperNodeName(String hyperNodeName) {
        this.hyperNodeName = hyperNodeName;
        return this;
    }

    /**
     * **参数解释**： 超节点名称。如果节点不属于超节点，此字段不展示。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return hyperNodeName
     */
    public String getHyperNodeName() {
        return hyperNodeName;
    }

    public void setHyperNodeName(String hyperNodeName) {
        this.hyperNodeName = hyperNodeName;
    }

    public NodeMetadataOwnerReferences withHyperNodeID(String hyperNodeID) {
        this.hyperNodeID = hyperNodeID;
        return this;
    }

    /**
     * **参数解释**： 超节点ID。如果节点不属于超节点，此字段不展示。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return hyperNodeID
     */
    public String getHyperNodeID() {
        return hyperNodeID;
    }

    public void setHyperNodeID(String hyperNodeID) {
        this.hyperNodeID = hyperNodeID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeMetadataOwnerReferences that = (NodeMetadataOwnerReferences) obj;
        return Objects.equals(this.nodepoolName, that.nodepoolName) && Objects.equals(this.nodepoolID, that.nodepoolID)
            && Objects.equals(this.hyperNodeName, that.hyperNodeName)
            && Objects.equals(this.hyperNodeID, that.hyperNodeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodepoolName, nodepoolID, hyperNodeName, hyperNodeID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeMetadataOwnerReferences {\n");
        sb.append("    nodepoolName: ").append(toIndentedString(nodepoolName)).append("\n");
        sb.append("    nodepoolID: ").append(toIndentedString(nodepoolID)).append("\n");
        sb.append("    hyperNodeName: ").append(toIndentedString(hyperNodeName)).append("\n");
        sb.append("    hyperNodeID: ").append(toIndentedString(hyperNodeID)).append("\n");
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
