package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChInstancesInfoRsponseInstanceGroups
 */
public class ChInstancesInfoRsponseInstanceGroups {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type_name")

    private String groupTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<ClickHouseNodeInfo> nodes = null;

    public ChInstancesInfoRsponseInstanceGroups withId(String id) {
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

    public ChInstancesInfoRsponseInstanceGroups withName(String name) {
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

    public ChInstancesInfoRsponseInstanceGroups withGroupTypeName(String groupTypeName) {
        this.groupTypeName = groupTypeName;
        return this;
    }

    /**
     * 实例分组类型名，现在只支持clickhouse。
     * @return groupTypeName
     */
    public String getGroupTypeName() {
        return groupTypeName;
    }

    public void setGroupTypeName(String groupTypeName) {
        this.groupTypeName = groupTypeName;
    }

    public ChInstancesInfoRsponseInstanceGroups withNodes(List<ClickHouseNodeInfo> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ChInstancesInfoRsponseInstanceGroups addNodesItem(ClickHouseNodeInfo nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ChInstancesInfoRsponseInstanceGroups withNodes(Consumer<List<ClickHouseNodeInfo>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 实例节点信息。
     * @return nodes
     */
    public List<ClickHouseNodeInfo> getNodes() {
        return nodes;
    }

    public void setNodes(List<ClickHouseNodeInfo> nodes) {
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
        ChInstancesInfoRsponseInstanceGroups that = (ChInstancesInfoRsponseInstanceGroups) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.groupTypeName, that.groupTypeName) && Objects.equals(this.nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, groupTypeName, nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChInstancesInfoRsponseInstanceGroups {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    groupTypeName: ").append(toIndentedString(groupTypeName)).append("\n");
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
