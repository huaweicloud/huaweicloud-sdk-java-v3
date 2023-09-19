package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 缩容参数
 */
public class ShrinkParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_group_name")

    private String nodeGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    public ShrinkParam withNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }

    /**
     * 节点组名称
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return nodeGroupName;
    }

    public void setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
    }

    public ShrinkParam withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 缩容节点数量，如果是指定节点缩容，则该参数可以不填。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShrinkParam withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public ShrinkParam addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public ShrinkParam withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 缩容节点时指定待删除节点的资源ID列表。 resource_ids为空时，按照系统规则自动选择删除节点。 仅支持删除状态异常的ecs节点。 会针对指定节点进行强制删除。 可通过查询主机接口获取resource_id。
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShrinkParam that = (ShrinkParam) obj;
        return Objects.equals(this.nodeGroupName, that.nodeGroupName) && Objects.equals(this.count, that.count)
            && Objects.equals(this.resourceIds, that.resourceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeGroupName, count, resourceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShrinkParam {\n");
        sb.append("    nodeGroupName: ").append(toIndentedString(nodeGroupName)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
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
