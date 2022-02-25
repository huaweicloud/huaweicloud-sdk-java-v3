package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ShrinkNodeReq */
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

    /** 下线节点个数。 没有Master节点的集群，缩容后剩余的数据节点个数(包含冷数据节点和其他类型节点)须大于之前的一半。 有Master节点的集群，缩容后Master节点的总数须为大于等于3的奇数。
     * 跨AZ的集群，缩容后须确保剩余的节点个数大等于AZ个数。
     * 
     * @return reducedNodeNum */
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

    /** 下线节点类型。（ess、ess-master、ess-client、ess-cold、lgs）
     * 
     * @return type */
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
