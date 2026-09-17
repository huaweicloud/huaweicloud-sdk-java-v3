package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点趋势点
 */
public class SlowLogPoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trend_data")

    private List<SlowLogTrendPoint> trendData = null;

    public SlowLogPoint withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，实例节点的唯一标识
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public SlowLogPoint withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public SlowLogPoint withTrendData(List<SlowLogTrendPoint> trendData) {
        this.trendData = trendData;
        return this;
    }

    public SlowLogPoint addTrendDataItem(SlowLogTrendPoint trendDataItem) {
        if (this.trendData == null) {
            this.trendData = new ArrayList<>();
        }
        this.trendData.add(trendDataItem);
        return this;
    }

    public SlowLogPoint withTrendData(Consumer<List<SlowLogTrendPoint>> trendDataSetter) {
        if (this.trendData == null) {
            this.trendData = new ArrayList<>();
        }
        trendDataSetter.accept(this.trendData);
        return this;
    }

    /**
     * 趋势数量列表
     * @return trendData
     */
    public List<SlowLogTrendPoint> getTrendData() {
        return trendData;
    }

    public void setTrendData(List<SlowLogTrendPoint> trendData) {
        this.trendData = trendData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlowLogPoint that = (SlowLogPoint) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.trendData, that.trendData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, nodeName, trendData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowLogPoint {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    trendData: ").append(toIndentedString(trendData)).append("\n");
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
