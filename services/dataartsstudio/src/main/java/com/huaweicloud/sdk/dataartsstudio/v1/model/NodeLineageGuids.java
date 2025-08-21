package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入血缘响应体。
 */
public class NodeLineageGuids {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node")

    private String node;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_lineages")

    private List<String> columnLineages = null;

    public NodeLineageGuids withNode(String node) {
        this.node = node;
        return this;
    }

    /**
     * 节点guid。
     * @return node
     */
    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public NodeLineageGuids withColumnLineages(List<String> columnLineages) {
        this.columnLineages = columnLineages;
        return this;
    }

    public NodeLineageGuids addColumnLineagesItem(String columnLineagesItem) {
        if (this.columnLineages == null) {
            this.columnLineages = new ArrayList<>();
        }
        this.columnLineages.add(columnLineagesItem);
        return this;
    }

    public NodeLineageGuids withColumnLineages(Consumer<List<String>> columnLineagesSetter) {
        if (this.columnLineages == null) {
            this.columnLineages = new ArrayList<>();
        }
        columnLineagesSetter.accept(this.columnLineages);
        return this;
    }

    /**
     * schema名称。
     * @return columnLineages
     */
    public List<String> getColumnLineages() {
        return columnLineages;
    }

    public void setColumnLineages(List<String> columnLineages) {
        this.columnLineages = columnLineages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeLineageGuids that = (NodeLineageGuids) obj;
        return Objects.equals(this.node, that.node) && Objects.equals(this.columnLineages, that.columnLineages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, columnLineages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeLineageGuids {\n");
        sb.append("    node: ").append(toIndentedString(node)).append("\n");
        sb.append("    columnLineages: ").append(toIndentedString(columnLineages)).append("\n");
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
