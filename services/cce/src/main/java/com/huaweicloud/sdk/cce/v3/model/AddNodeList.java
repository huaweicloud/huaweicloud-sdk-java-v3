package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重置节点参数。集群内已有节点，支持通过重置节点方式进行重新安装并接入集群，纳管过程将清理节点上系统盘、数据盘数据，并作为新节点接入Kuberntes集群，请提前备份迁移关键数据。 
 */
public class AddNodeList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeList")

    private List<AddNode> nodeList = null;

    public AddNodeList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**： API版本，固定值“v3”。 **约束限制**： 不涉及 **取值范围**： 只能为固定值“v3”。 **默认取值**： 不涉及
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public AddNodeList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**： API类型，，固定值“List”。 **约束限制**： 不涉及 **取值范围**： 只能为固定值“List”。 **默认取值**： 不涉及
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public AddNodeList withNodeList(List<AddNode> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public AddNodeList addNodeListItem(AddNode nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public AddNodeList withNodeList(Consumer<List<AddNode>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * **参数解释**： 纳管节点列表。 **约束限制**： 当前最多支持同时纳管200个节点。
     * @return nodeList
     */
    public List<AddNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<AddNode> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddNodeList that = (AddNodeList) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.nodeList, that.nodeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, nodeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddNodeList {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
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
