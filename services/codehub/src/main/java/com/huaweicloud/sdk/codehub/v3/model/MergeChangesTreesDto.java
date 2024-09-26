package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MergeChangesTreesDto
 */
public class MergeChangesTreesDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tree")

    private List<MergeChangesTrees> tree = null;

    public MergeChangesTreesDto withTree(List<MergeChangesTrees> tree) {
        this.tree = tree;
        return this;
    }

    public MergeChangesTreesDto addTreeItem(MergeChangesTrees treeItem) {
        if (this.tree == null) {
            this.tree = new ArrayList<>();
        }
        this.tree.add(treeItem);
        return this;
    }

    public MergeChangesTreesDto withTree(Consumer<List<MergeChangesTrees>> treeSetter) {
        if (this.tree == null) {
            this.tree = new ArrayList<>();
        }
        treeSetter.accept(this.tree);
        return this;
    }

    /**
     * Get tree
     * @return tree
     */
    public List<MergeChangesTrees> getTree() {
        return tree;
    }

    public void setTree(List<MergeChangesTrees> tree) {
        this.tree = tree;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeChangesTreesDto that = (MergeChangesTreesDto) obj;
        return Objects.equals(this.tree, that.tree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tree);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeChangesTreesDto {\n");
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
