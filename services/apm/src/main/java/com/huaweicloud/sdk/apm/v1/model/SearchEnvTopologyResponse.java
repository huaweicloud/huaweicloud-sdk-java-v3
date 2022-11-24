package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SearchEnvTopologyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_list")

    private List<TopoNode> nodeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_list")

    private List<TopoLine> lineList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collector_config")

    private Map<String, CollectorConfigModel> collectorConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_start_time")

    private Long realStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_end_time")

    private Long realEndTime;

    public SearchEnvTopologyResponse withNodeList(List<TopoNode> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public SearchEnvTopologyResponse addNodeListItem(TopoNode nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public SearchEnvTopologyResponse withNodeList(Consumer<List<TopoNode>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * 组件节点列表。
     * @return nodeList
     */
    public List<TopoNode> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<TopoNode> nodeList) {
        this.nodeList = nodeList;
    }

    public SearchEnvTopologyResponse withLineList(List<TopoLine> lineList) {
        this.lineList = lineList;
        return this;
    }

    public SearchEnvTopologyResponse addLineListItem(TopoLine lineListItem) {
        if (this.lineList == null) {
            this.lineList = new ArrayList<>();
        }
        this.lineList.add(lineListItem);
        return this;
    }

    public SearchEnvTopologyResponse withLineList(Consumer<List<TopoLine>> lineListSetter) {
        if (this.lineList == null) {
            this.lineList = new ArrayList<>();
        }
        lineListSetter.accept(this.lineList);
        return this;
    }

    /**
     * 组件之间调用指向线列表。
     * @return lineList
     */
    public List<TopoLine> getLineList() {
        return lineList;
    }

    public void setLineList(List<TopoLine> lineList) {
        this.lineList = lineList;
    }

    public SearchEnvTopologyResponse withCollectorConfig(Map<String, CollectorConfigModel> collectorConfig) {
        this.collectorConfig = collectorConfig;
        return this;
    }

    public SearchEnvTopologyResponse putCollectorConfigItem(String key, CollectorConfigModel collectorConfigItem) {
        if (this.collectorConfig == null) {
            this.collectorConfig = new HashMap<>();
        }
        this.collectorConfig.put(key, collectorConfigItem);
        return this;
    }

    public SearchEnvTopologyResponse withCollectorConfig(
        Consumer<Map<String, CollectorConfigModel>> collectorConfigSetter) {
        if (this.collectorConfig == null) {
            this.collectorConfig = new HashMap<>();
        }
        collectorConfigSetter.accept(this.collectorConfig);
        return this;
    }

    /**
     * 采集器配置。
     * @return collectorConfig
     */
    public Map<String, CollectorConfigModel> getCollectorConfig() {
        return collectorConfig;
    }

    public void setCollectorConfig(Map<String, CollectorConfigModel> collectorConfig) {
        this.collectorConfig = collectorConfig;
    }

    public SearchEnvTopologyResponse withRealStartTime(Long realStartTime) {
        this.realStartTime = realStartTime;
        return this;
    }

    /**
     * 开始时间。
     * @return realStartTime
     */
    public Long getRealStartTime() {
        return realStartTime;
    }

    public void setRealStartTime(Long realStartTime) {
        this.realStartTime = realStartTime;
    }

    public SearchEnvTopologyResponse withRealEndTime(Long realEndTime) {
        this.realEndTime = realEndTime;
        return this;
    }

    /**
     * 结束时间。
     * @return realEndTime
     */
    public Long getRealEndTime() {
        return realEndTime;
    }

    public void setRealEndTime(Long realEndTime) {
        this.realEndTime = realEndTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchEnvTopologyResponse searchEnvTopologyResponse = (SearchEnvTopologyResponse) o;
        return Objects.equals(this.nodeList, searchEnvTopologyResponse.nodeList)
            && Objects.equals(this.lineList, searchEnvTopologyResponse.lineList)
            && Objects.equals(this.collectorConfig, searchEnvTopologyResponse.collectorConfig)
            && Objects.equals(this.realStartTime, searchEnvTopologyResponse.realStartTime)
            && Objects.equals(this.realEndTime, searchEnvTopologyResponse.realEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeList, lineList, collectorConfig, realStartTime, realEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchEnvTopologyResponse {\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
        sb.append("    lineList: ").append(toIndentedString(lineList)).append("\n");
        sb.append("    collectorConfig: ").append(toIndentedString(collectorConfig)).append("\n");
        sb.append("    realStartTime: ").append(toIndentedString(realStartTime)).append("\n");
        sb.append("    realEndTime: ").append(toIndentedString(realEndTime)).append("\n");
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
