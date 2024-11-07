package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分支网络两端接入对象。
 */
public class DirectedEdgePair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_pair")

    private List<DirectedEdge> edgePair = null;

    public DirectedEdgePair withEdgePair(List<DirectedEdge> edgePair) {
        this.edgePair = edgePair;
        return this;
    }

    public DirectedEdgePair addEdgePairItem(DirectedEdge edgePairItem) {
        if (this.edgePair == null) {
            this.edgePair = new ArrayList<>();
        }
        this.edgePair.add(edgePairItem);
        return this;
    }

    public DirectedEdgePair withEdgePair(Consumer<List<DirectedEdge>> edgePairSetter) {
        if (this.edgePair == null) {
            this.edgePair = new ArrayList<>();
        }
        edgePairSetter.accept(this.edgePair);
        return this;
    }

    /**
     * 分支网络连接的两个端点定义，可能为两个点，也可能为两个单向边，长度固定为2的数组。
     * @return edgePair
     */
    public List<DirectedEdge> getEdgePair() {
        return edgePair;
    }

    public void setEdgePair(List<DirectedEdge> edgePair) {
        this.edgePair = edgePair;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirectedEdgePair that = (DirectedEdgePair) obj;
        return Objects.equals(this.edgePair, that.edgePair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgePair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectedEdgePair {\n");
        sb.append("    edgePair: ").append(toIndentedString(edgePair)).append("\n");
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
