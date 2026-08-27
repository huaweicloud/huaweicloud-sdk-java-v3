package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库代理节点缩容信息
 */
public class ShrinkGaussMySqlProxyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    public ShrinkGaussMySqlProxyRequestBody withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 数据库代理节点缩容操作需要减少的节点数。  缩容的节点数的取值范围：1~30之间的整数。  限制条件：该实例的数据库代理节点的总数量小于等于32，大于等于2。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public ShrinkGaussMySqlProxyRequestBody withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public ShrinkGaussMySqlProxyRequestBody addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public ShrinkGaussMySqlProxyRequestBody withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * **参数解释**：  数据库代理节点的节点ID。  获取方式请参见[查询数据库代理信息列表](https://support.huaweicloud.com/api-taurusdb/ShowGaussMySqlProxyList.html)。  **约束限制**：  不传该字段，将随机删除代理节点；传入该字段，将删除指定ID的代理节点。
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShrinkGaussMySqlProxyRequestBody that = (ShrinkGaussMySqlProxyRequestBody) obj;
        return Objects.equals(this.nodeNum, that.nodeNum) && Objects.equals(this.nodeIds, that.nodeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeNum, nodeIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShrinkGaussMySqlProxyRequestBody {\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
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
