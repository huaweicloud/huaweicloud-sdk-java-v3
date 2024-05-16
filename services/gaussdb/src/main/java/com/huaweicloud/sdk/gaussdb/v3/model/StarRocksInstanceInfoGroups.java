package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StarRocksInstanceInfoGroups
 */
public class StarRocksInstanceInfoGroups {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<StarRocksInstanceInfoNodes> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type_name")

    private String groupTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_node_type")

    private String groupNodeType;

    public StarRocksInstanceInfoGroups withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 分组ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StarRocksInstanceInfoGroups withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分组名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StarRocksInstanceInfoGroups withNodes(List<StarRocksInstanceInfoNodes> nodes) {
        this.nodes = nodes;
        return this;
    }

    public StarRocksInstanceInfoGroups addNodesItem(StarRocksInstanceInfoNodes nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public StarRocksInstanceInfoGroups withNodes(Consumer<List<StarRocksInstanceInfoNodes>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 实例节点。
     * @return nodes
     */
    public List<StarRocksInstanceInfoNodes> getNodes() {
        return nodes;
    }

    public void setNodes(List<StarRocksInstanceInfoNodes> nodes) {
        this.nodes = nodes;
    }

    public StarRocksInstanceInfoGroups withGroupTypeName(String groupTypeName) {
        this.groupTypeName = groupTypeName;
        return this;
    }

    /**
     * 实例分组类型名。
     * @return groupTypeName
     */
    public String getGroupTypeName() {
        return groupTypeName;
    }

    public void setGroupTypeName(String groupTypeName) {
        this.groupTypeName = groupTypeName;
    }

    public StarRocksInstanceInfoGroups withGroupNodeType(String groupNodeType) {
        this.groupNodeType = groupNodeType;
        return this;
    }

    /**
     * 实例分组节点类型。
     * @return groupNodeType
     */
    public String getGroupNodeType() {
        return groupNodeType;
    }

    public void setGroupNodeType(String groupNodeType) {
        this.groupNodeType = groupNodeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StarRocksInstanceInfoGroups that = (StarRocksInstanceInfoGroups) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.nodes, that.nodes) && Objects.equals(this.groupTypeName, that.groupTypeName)
            && Objects.equals(this.groupNodeType, that.groupNodeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nodes, groupTypeName, groupNodeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StarRocksInstanceInfoGroups {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    groupTypeName: ").append(toIndentedString(groupTypeName)).append("\n");
        sb.append("    groupNodeType: ").append(toIndentedString(groupNodeType)).append("\n");
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
