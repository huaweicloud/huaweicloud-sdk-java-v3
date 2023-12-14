package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 逻辑集群节点操作请求
 */
public class DeleteClusterNodesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_list")

    private List<String> nodeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    public DeleteClusterNodesRequestBody withNodeList(List<String> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public DeleteClusterNodesRequestBody addNodeListItem(String nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public DeleteClusterNodesRequestBody withNodeList(Consumer<List<String>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * 逻辑集群节点ID列表
     * @return nodeList
     */
    public List<String> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<String> nodeList) {
        this.nodeList = nodeList;
    }

    public DeleteClusterNodesRequestBody withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 操作类型，clear|delete
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteClusterNodesRequestBody that = (DeleteClusterNodesRequestBody) obj;
        return Objects.equals(this.nodeList, that.nodeList) && Objects.equals(this.operateType, that.operateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeList, operateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteClusterNodesRequestBody {\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
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
