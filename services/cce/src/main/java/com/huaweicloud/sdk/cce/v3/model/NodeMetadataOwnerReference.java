package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 属主对象。 **约束限制**： - 创建成功后自动生成，填写无效。 - 创建节点接口返回内容中无该参数  **取值范围**： 不涉及 **默认取值**： 不涉及
 */
public class NodeMetadataOwnerReference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepoolName")

    private String nodepoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepoolID")

    private String nodepoolID;

    public NodeMetadataOwnerReference withNodepoolName(String nodepoolName) {
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

    public NodeMetadataOwnerReference withNodepoolID(String nodepoolID) {
        this.nodepoolID = nodepoolID;
        return this;
    }

    /**
     * **参数解释**： 节点池UID **约束限制**： 创建成功后自动生成，填写无效。 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return nodepoolID
     */
    public String getNodepoolID() {
        return nodepoolID;
    }

    public void setNodepoolID(String nodepoolID) {
        this.nodepoolID = nodepoolID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeMetadataOwnerReference that = (NodeMetadataOwnerReference) obj;
        return Objects.equals(this.nodepoolName, that.nodepoolName) && Objects.equals(this.nodepoolID, that.nodepoolID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodepoolName, nodepoolID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeMetadataOwnerReference {\n");
        sb.append("    nodepoolName: ").append(toIndentedString(nodepoolName)).append("\n");
        sb.append("    nodepoolID: ").append(toIndentedString(nodepoolID)).append("\n");
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
