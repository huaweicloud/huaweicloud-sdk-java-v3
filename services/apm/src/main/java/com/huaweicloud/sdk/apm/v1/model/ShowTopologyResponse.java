package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTopologyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_trace_id")

    @JacksonXmlProperty(localName = "global_trace_id")

    private String globalTraceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_list")

    @JacksonXmlProperty(localName = "line_list")

    private List<TraceTopologyLine> lineList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_list")

    @JacksonXmlProperty(localName = "node_list")

    private List<TraceTopologyNode> nodeList = null;

    public ShowTopologyResponse withGlobalTraceId(String globalTraceId) {
        this.globalTraceId = globalTraceId;
        return this;
    }

    /**
     * 全局traceID
     * @return globalTraceId
     */
    public String getGlobalTraceId() {
        return globalTraceId;
    }

    public void setGlobalTraceId(String globalTraceId) {
        this.globalTraceId = globalTraceId;
    }

    public ShowTopologyResponse withLineList(List<TraceTopologyLine> lineList) {
        this.lineList = lineList;
        return this;
    }

    public ShowTopologyResponse addLineListItem(TraceTopologyLine lineListItem) {
        if (this.lineList == null) {
            this.lineList = new ArrayList<>();
        }
        this.lineList.add(lineListItem);
        return this;
    }

    public ShowTopologyResponse withLineList(Consumer<List<TraceTopologyLine>> lineListSetter) {
        if (this.lineList == null) {
            this.lineList = new ArrayList<>();
        }
        lineListSetter.accept(this.lineList);
        return this;
    }

    /**
     * 组件之间调用指向线列表
     * @return lineList
     */
    public List<TraceTopologyLine> getLineList() {
        return lineList;
    }

    public void setLineList(List<TraceTopologyLine> lineList) {
        this.lineList = lineList;
    }

    public ShowTopologyResponse withNodeList(List<TraceTopologyNode> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public ShowTopologyResponse addNodeListItem(TraceTopologyNode nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public ShowTopologyResponse withNodeList(Consumer<List<TraceTopologyNode>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * 组件节点列表
     * @return nodeList
     */
    public List<TraceTopologyNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<TraceTopologyNode> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTopologyResponse showTopologyResponse = (ShowTopologyResponse) o;
        return Objects.equals(this.globalTraceId, showTopologyResponse.globalTraceId)
            && Objects.equals(this.lineList, showTopologyResponse.lineList)
            && Objects.equals(this.nodeList, showTopologyResponse.nodeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalTraceId, lineList, nodeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopologyResponse {\n");
        sb.append("    globalTraceId: ").append(toIndentedString(globalTraceId)).append("\n");
        sb.append("    lineList: ").append(toIndentedString(lineList)).append("\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
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
