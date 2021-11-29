package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** OpenProxyRequest */
public class OpenProxyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    public OpenProxyRequest withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /** 规格ID。
     * 
     * @return flavorId */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public OpenProxyRequest withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /** 节点数量。
     * 
     * @return nodeNum */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenProxyRequest openProxyRequest = (OpenProxyRequest) o;
        return Objects.equals(this.flavorId, openProxyRequest.flavorId)
            && Objects.equals(this.nodeNum, openProxyRequest.nodeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorId, nodeNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenProxyRequest {\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
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
