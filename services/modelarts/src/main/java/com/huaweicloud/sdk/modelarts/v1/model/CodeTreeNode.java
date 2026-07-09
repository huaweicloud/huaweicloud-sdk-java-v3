package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 算法目录树节点。
 */
public class CodeTreeNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<CodeTreeNode> children = null;

    public CodeTreeNode withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：算法目录树当前层级目录名。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CodeTreeNode withChildren(List<CodeTreeNode> children) {
        this.children = children;
        return this;
    }

    public CodeTreeNode addChildrenItem(CodeTreeNode childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public CodeTreeNode withChildren(Consumer<List<CodeTreeNode>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * **参数解释**：算法目录树当前层级目录下子文件和子目录。
     * @return children
     */
    public List<CodeTreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<CodeTreeNode> children) {
        this.children = children;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CodeTreeNode that = (CodeTreeNode) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeTreeNode {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
