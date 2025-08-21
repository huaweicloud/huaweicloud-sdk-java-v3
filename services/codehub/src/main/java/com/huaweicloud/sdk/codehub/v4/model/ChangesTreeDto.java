package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合并请求文件变更列表详情
 */
public class ChangesTreeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_show_my_approval_files")

    private Boolean canShowMyApprovalFiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tree")

    private List<ChangesTreeObjectDto> tree = null;

    public ChangesTreeDto withCanShowMyApprovalFiles(Boolean canShowMyApprovalFiles) {
        this.canShowMyApprovalFiles = canShowMyApprovalFiles;
        return this;
    }

    /**
     * **参数解释：** 展示审核文件。
     * @return canShowMyApprovalFiles
     */
    public Boolean getCanShowMyApprovalFiles() {
        return canShowMyApprovalFiles;
    }

    public void setCanShowMyApprovalFiles(Boolean canShowMyApprovalFiles) {
        this.canShowMyApprovalFiles = canShowMyApprovalFiles;
    }

    public ChangesTreeDto withTree(List<ChangesTreeObjectDto> tree) {
        this.tree = tree;
        return this;
    }

    public ChangesTreeDto addTreeItem(ChangesTreeObjectDto treeItem) {
        if (this.tree == null) {
            this.tree = new ArrayList<>();
        }
        this.tree.add(treeItem);
        return this;
    }

    public ChangesTreeDto withTree(Consumer<List<ChangesTreeObjectDto>> treeSetter) {
        if (this.tree == null) {
            this.tree = new ArrayList<>();
        }
        treeSetter.accept(this.tree);
        return this;
    }

    /**
     * **参数解释：** 变更树。
     * @return tree
     */
    public List<ChangesTreeObjectDto> getTree() {
        return tree;
    }

    public void setTree(List<ChangesTreeObjectDto> tree) {
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
        ChangesTreeDto that = (ChangesTreeDto) obj;
        return Objects.equals(this.canShowMyApprovalFiles, that.canShowMyApprovalFiles)
            && Objects.equals(this.tree, that.tree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canShowMyApprovalFiles, tree);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangesTreeDto {\n");
        sb.append("    canShowMyApprovalFiles: ").append(toIndentedString(canShowMyApprovalFiles)).append("\n");
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
