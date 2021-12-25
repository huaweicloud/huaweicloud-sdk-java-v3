package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 要加入的节点详情 */
public class EdgeNodeAdded {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation")

    private String relation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    public EdgeNodeAdded withRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /** 终端设备和节点关系的名称，只允许中文字符、英文字母、数字、下划线、中划线，最大长度64
     * 
     * @return relation */
    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public EdgeNodeAdded withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /** 终端设备和节点关系的描述，最大长度64，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * 
     * @return comment */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public EdgeNodeAdded withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public EdgeNodeAdded addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public EdgeNodeAdded withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /** 节点ID列表，一个设备只可以被绑定于一个边缘节点。
     * 
     * @return nodeIds */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeNodeAdded edgeNodeAdded = (EdgeNodeAdded) o;
        return Objects.equals(this.relation, edgeNodeAdded.relation)
            && Objects.equals(this.comment, edgeNodeAdded.comment)
            && Objects.equals(this.nodeIds, edgeNodeAdded.nodeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relation, comment, nodeIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeNodeAdded {\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
