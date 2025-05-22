package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListClusterNodesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_by")

    private String filterBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private String deleted;

    public ListClusterNodesRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。获取方式方法请参见[获取集群ID](dws_02_00068.xml)。 **约束限制**： 必须是有效的dws集群ID。 **取值范围**： 36位UUID。 **默认取值**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListClusterNodesRequest withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public ListClusterNodesRequest addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public ListClusterNodesRequest withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * **参数解释**： 节点ID列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public ListClusterNodesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 分页查询，偏移量。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListClusterNodesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 分页查询，每页显示的条目数量。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListClusterNodesRequest withFilterBy(String filterBy) {
        this.filterBy = filterBy;
        return this;
    }

    /**
     * **参数解释**： 过滤字段。 **约束限制**： 不涉及。 **取值范围**： instCreateType：根据资源状态过滤 status：根据节点状态过滤 **默认取值**： null
     * @return filterBy
     */
    public String getFilterBy() {
        return filterBy;
    }

    public void setFilterBy(String filterBy) {
        this.filterBy = filterBy;
    }

    public ListClusterNodesRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * **参数解释**： 过滤字段内容。 **约束限制**： 不涉及。 **取值范围**： 当根据资源状态过滤时，可选如下值： - ALL：全部 - INST：已使用 - NODE：空虚 当根据节点状态过滤时，可选如下值： - ALL：全部 - CREATING：创建中 - FREE：空闲 - ACTIVE：可用 - FAILED：不可用 - UNKNOWN：未知 - CREATE_FAILED：创建失败 - DELETING：删除中 - DELETE_FAILED：删除失败 **默认取值**： null
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public ListClusterNodesRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * **参数解释**： 排序字段。默认无序返回。 **约束限制**： 不涉及。 **取值范围**： name：根据名称过滤 **默认取值**： null
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListClusterNodesRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释**： 排序：升序/降序。 **约束限制**： 不涉及。 **取值范围**： asc：升序 desc：降序 **默认取值**： null
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListClusterNodesRequest withDeleted(String deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * **参数解释**： 是否被删除，字段已废弃。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： null
     * @return deleted
     */
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterNodesRequest that = (ListClusterNodesRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.nodeIds, that.nodeIds)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.filterBy, that.filterBy) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.order, that.order)
            && Objects.equals(this.deleted, that.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, nodeIds, offset, limit, filterBy, filter, orderBy, order, deleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterNodesRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    filterBy: ").append(toIndentedString(filterBy)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
