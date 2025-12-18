package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点迁移到自定义节点池参数。
 */
public class MigrateNodesToNodePoolList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeList")

    private List<MigrateNodesToNodePool> nodeList = null;

    public MigrateNodesToNodePoolList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**： API版本 **约束限制**： 固定值，不允许修改。 **取值范围**： 不涉及 **默认取值**： v3 
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public MigrateNodesToNodePoolList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**： API类型 **约束限制**： 固定值，不允许修改。 **取值范围**： 不涉及 **默认取值**： List 
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public MigrateNodesToNodePoolList withNodeList(List<MigrateNodesToNodePool> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public MigrateNodesToNodePoolList addNodeListItem(MigrateNodesToNodePool nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public MigrateNodesToNodePoolList withNodeList(Consumer<List<MigrateNodesToNodePool>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * **参数解释**： 迁移节点列表，当前最多支持同迁移50个节点。 **约束限制**： 不涉及 
     * @return nodeList
     */
    public List<MigrateNodesToNodePool> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<MigrateNodesToNodePool> nodeList) {
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
        MigrateNodesToNodePoolList that = (MigrateNodesToNodePoolList) obj;
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
        sb.append("class MigrateNodesToNodePoolList {\n");
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
