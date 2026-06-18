package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlgorithmResponseJobConfigCodeTree
 */
public class AlgorithmResponseJobConfigCodeTree {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private Object children;

    public AlgorithmResponseJobConfigCodeTree withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 算法目录树当前层级目录名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlgorithmResponseJobConfigCodeTree withChildren(Object children) {
        this.children = children;
        return this;
    }

    /**
     * 算法目录树当前层级目录下子文件和子目录。
     * @return children
     */
    public Object getChildren() {
        return children;
    }

    public void setChildren(Object children) {
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
        AlgorithmResponseJobConfigCodeTree that = (AlgorithmResponseJobConfigCodeTree) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmResponseJobConfigCodeTree {\n");
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
