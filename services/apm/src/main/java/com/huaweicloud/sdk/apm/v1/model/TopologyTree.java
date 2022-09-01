package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TopologyTree
 */
public class TopologyTree {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tree")

    @JacksonXmlProperty(localName = "tree")

    private List<TreeNode> tree = null;

    public TopologyTree withTree(List<TreeNode> tree) {
        this.tree = tree;
        return this;
    }

    public TopologyTree addTreeItem(TreeNode treeItem) {
        if (this.tree == null) {
            this.tree = new ArrayList<>();
        }
        this.tree.add(treeItem);
        return this;
    }

    public TopologyTree withTree(Consumer<List<TreeNode>> treeSetter) {
        if (this.tree == null) {
            this.tree = new ArrayList<>();
        }
        treeSetter.accept(this.tree);
        return this;
    }

    /**
     * 拓扑树节点
     * @return tree
     */
    public List<TreeNode> getTree() {
        return tree;
    }

    public void setTree(List<TreeNode> tree) {
        this.tree = tree;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopologyTree topologyTree = (TopologyTree) o;
        return Objects.equals(this.tree, topologyTree.tree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tree);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopologyTree {\n");
        sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
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
