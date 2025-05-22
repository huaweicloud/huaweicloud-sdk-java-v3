package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListClusterNodesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_list")

    private List<ClusterNodeInfo> nodeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Integer failedCount;

    public ListClusterNodesResponse withNodeList(List<ClusterNodeInfo> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public ListClusterNodesResponse addNodeListItem(ClusterNodeInfo nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public ListClusterNodesResponse withNodeList(Consumer<List<ClusterNodeInfo>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * **参数解释**： 集群节点列表。 **取值范围**： 不涉及。
     * @return nodeList
     */
    public List<ClusterNodeInfo> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<ClusterNodeInfo> nodeList) {
        this.nodeList = nodeList;
    }

    public ListClusterNodesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 集群节点总数。 **取值范围**： 大于0的整数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListClusterNodesResponse withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群节点失败总数。一般为0。 **取值范围**： 大于等于0的整数。
     * @return failedCount
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterNodesResponse that = (ListClusterNodesResponse) obj;
        return Objects.equals(this.nodeList, that.nodeList) && Objects.equals(this.count, that.count)
            && Objects.equals(this.failedCount, that.failedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeList, count, failedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterNodesResponse {\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
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
