package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeSummary
 */
public class NodeSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalNum")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readyNum")

    private Integer readyNum;

    public NodeSummary withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 集群中所有节点的个数。
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public NodeSummary withReadyNum(Integer readyNum) {
        this.readyNum = readyNum;
        return this;
    }

    /**
     * 集群中已就绪节点的数量。
     * @return readyNum
     */
    public Integer getReadyNum() {
        return readyNum;
    }

    public void setReadyNum(Integer readyNum) {
        this.readyNum = readyNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeSummary that = (NodeSummary) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.readyNum, that.readyNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, readyNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSummary {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    readyNum: ").append(toIndentedString(readyNum)).append("\n");
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
