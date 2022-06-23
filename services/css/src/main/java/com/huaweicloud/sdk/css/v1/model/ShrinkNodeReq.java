package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShrinkNodeReq
 */
public class ShrinkNodeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reducedNodeNum")

    private Integer reducedNodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ShrinkNodeReq withReducedNodeNum(Integer reducedNodeNum) {
        this.reducedNodeNum = reducedNodeNum;
        return this;
    }

    /**
     * 需要缩容的节点数量。  - 请确保缩容后的集群在每个节点类型中每个AZ的节点数至少为1。  - 关于跨AZ的集群，在不同AZ中同类型节点个数的差值要小于等于1。  - 关于没有Master节点的集群，每次缩容的数据节点个数(包含冷数据节点和其他类型节点)要小于当前数据节点总数的一半，缩容后的数据节点个数要大于索引的最大副本个数。  - 关于有Master节点的集群，每次缩容的Master节点个数要小于当前Master节点总数的一半，缩容后的Master节点个数必须是奇数且不小于3。
     * @return reducedNodeNum
     */
    public Integer getReducedNodeNum() {
        return reducedNodeNum;
    }

    public void setReducedNodeNum(Integer reducedNodeNum) {
        this.reducedNodeNum = reducedNodeNum;
    }

    public ShrinkNodeReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 指定节点类型。 - ess：数据节点。 - ess-cold：冷数据节点。 - ess-client：Client节点。 - ess-master：Master节点。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShrinkNodeReq shrinkNodeReq = (ShrinkNodeReq) o;
        return Objects.equals(this.reducedNodeNum, shrinkNodeReq.reducedNodeNum)
            && Objects.equals(this.type, shrinkNodeReq.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reducedNodeNum, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShrinkNodeReq {\n");
        sb.append("    reducedNodeNum: ").append(toIndentedString(reducedNodeNum)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
