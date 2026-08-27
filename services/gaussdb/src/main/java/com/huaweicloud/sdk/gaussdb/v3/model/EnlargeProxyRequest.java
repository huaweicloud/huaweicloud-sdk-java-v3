package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * proxy节点扩容信息
 */
public class EnlargeProxyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_id")

    private String proxyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_nodes_az_list")

    private List<String> proxyNodesAzList = null;

    public EnlargeProxyRequest withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * proxy节点扩容操作需要扩容的节点数。  扩容的节点数的取值范围：1~30之间的整数。  限制条件：该实例的proxy节点的总数量小于等于32。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public EnlargeProxyRequest withProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }

    /**
     * 数据库代理ID。  如果实例只开启了一个代理，可不传该参数；如果实例开启了多个代理，则必须指定一个数据库代理，扩容新的代理节点。
     * @return proxyId
     */
    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public EnlargeProxyRequest withProxyNodesAzList(List<String> proxyNodesAzList) {
        this.proxyNodesAzList = proxyNodesAzList;
        return this;
    }

    public EnlargeProxyRequest addProxyNodesAzListItem(String proxyNodesAzListItem) {
        if (this.proxyNodesAzList == null) {
            this.proxyNodesAzList = new ArrayList<>();
        }
        this.proxyNodesAzList.add(proxyNodesAzListItem);
        return this;
    }

    public EnlargeProxyRequest withProxyNodesAzList(Consumer<List<String>> proxyNodesAzListSetter) {
        if (this.proxyNodesAzList == null) {
            this.proxyNodesAzList = new ArrayList<>();
        }
        proxyNodesAzListSetter.accept(this.proxyNodesAzList);
        return this;
    }

    /**
     * **参数解释**：  数据库代理节点的可用区设置。  **约束限制**：  不传该字段，代理节点可用区将随机设置，优先与数据库节点可用区保持一致；传入该字段，代理节点将设置在指定可用区。
     * @return proxyNodesAzList
     */
    public List<String> getProxyNodesAzList() {
        return proxyNodesAzList;
    }

    public void setProxyNodesAzList(List<String> proxyNodesAzList) {
        this.proxyNodesAzList = proxyNodesAzList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnlargeProxyRequest that = (EnlargeProxyRequest) obj;
        return Objects.equals(this.nodeNum, that.nodeNum) && Objects.equals(this.proxyId, that.proxyId)
            && Objects.equals(this.proxyNodesAzList, that.proxyNodesAzList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeNum, proxyId, proxyNodesAzList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnlargeProxyRequest {\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    proxyId: ").append(toIndentedString(proxyId)).append("\n");
        sb.append("    proxyNodesAzList: ").append(toIndentedString(proxyNodesAzList)).append("\n");
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
