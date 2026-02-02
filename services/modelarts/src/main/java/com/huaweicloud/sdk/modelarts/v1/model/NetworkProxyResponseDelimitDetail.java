package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：网络诊断作业超时代答信息。
 */
public class NetworkProxyResponseDelimitDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_list")

    private List<ProxyResponseDelimitNodeList> nodeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plane_list")

    private List<ProxyResponseDelimitPlaneList> planeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate")

    private String rate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xpod_id")

    private String xpodId;

    public NetworkProxyResponseDelimitDetail withNodeList(List<ProxyResponseDelimitNodeList> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public NetworkProxyResponseDelimitDetail addNodeListItem(ProxyResponseDelimitNodeList nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public NetworkProxyResponseDelimitDetail withNodeList(Consumer<List<ProxyResponseDelimitNodeList>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * 超时代答节点信息
     * @return nodeList
     */
    public List<ProxyResponseDelimitNodeList> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<ProxyResponseDelimitNodeList> nodeList) {
        this.nodeList = nodeList;
    }

    public NetworkProxyResponseDelimitDetail withPlaneList(List<ProxyResponseDelimitPlaneList> planeList) {
        this.planeList = planeList;
        return this;
    }

    public NetworkProxyResponseDelimitDetail addPlaneListItem(ProxyResponseDelimitPlaneList planeListItem) {
        if (this.planeList == null) {
            this.planeList = new ArrayList<>();
        }
        this.planeList.add(planeListItem);
        return this;
    }

    public NetworkProxyResponseDelimitDetail withPlaneList(
        Consumer<List<ProxyResponseDelimitPlaneList>> planeListSetter) {
        if (this.planeList == null) {
            this.planeList = new ArrayList<>();
        }
        planeListSetter.accept(this.planeList);
        return this;
    }

    /**
     * 超时代答超平面信息
     * @return planeList
     */
    public List<ProxyResponseDelimitPlaneList> getPlaneList() {
        return planeList;
    }

    public void setPlaneList(List<ProxyResponseDelimitPlaneList> planeList) {
        this.planeList = planeList;
    }

    public NetworkProxyResponseDelimitDetail withRate(String rate) {
        this.rate = rate;
        return this;
    }

    /**
     * **参数解释**：根因概率。 **取值范围**：不涉及。
     * @return rate
     */
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public NetworkProxyResponseDelimitDetail withXpodId(String xpodId) {
        this.xpodId = xpodId;
        return this;
    }

    /**
     * **参数解释**：超节点id。 **取值范围**：不涉及。
     * @return xpodId
     */
    public String getXpodId() {
        return xpodId;
    }

    public void setXpodId(String xpodId) {
        this.xpodId = xpodId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkProxyResponseDelimitDetail that = (NetworkProxyResponseDelimitDetail) obj;
        return Objects.equals(this.nodeList, that.nodeList) && Objects.equals(this.planeList, that.planeList)
            && Objects.equals(this.rate, that.rate) && Objects.equals(this.xpodId, that.xpodId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeList, planeList, rate, xpodId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkProxyResponseDelimitDetail {\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
        sb.append("    planeList: ").append(toIndentedString(planeList)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    xpodId: ").append(toIndentedString(xpodId)).append("\n");
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
