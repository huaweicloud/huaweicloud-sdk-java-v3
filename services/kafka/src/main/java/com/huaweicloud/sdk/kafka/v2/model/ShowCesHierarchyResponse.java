package com.huaweicloud.sdk.kafka.v2.model;

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
public class ShowCesHierarchyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<ShowCeshierarchyRespDimensions> dimensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<ShowCeshierarchyRespInstanceIds> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<ShowCeshierarchyRespNodes> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queues")

    private List<ShowCeshierarchyRespQueues> queues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<ShowCeshierarchyRespGroups> groups = null;

    public ShowCesHierarchyResponse withDimensions(List<ShowCeshierarchyRespDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public ShowCesHierarchyResponse addDimensionsItem(ShowCeshierarchyRespDimensions dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public ShowCesHierarchyResponse withDimensions(Consumer<List<ShowCeshierarchyRespDimensions>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * **参数解释**： 监控维度。
     * @return dimensions
     */
    public List<ShowCeshierarchyRespDimensions> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<ShowCeshierarchyRespDimensions> dimensions) {
        this.dimensions = dimensions;
    }

    public ShowCesHierarchyResponse withInstanceIds(List<ShowCeshierarchyRespInstanceIds> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public ShowCesHierarchyResponse addInstanceIdsItem(ShowCeshierarchyRespInstanceIds instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public ShowCesHierarchyResponse withInstanceIds(Consumer<List<ShowCeshierarchyRespInstanceIds>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * **参数解释**： 实例信息。
     * @return instanceIds
     */
    public List<ShowCeshierarchyRespInstanceIds> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<ShowCeshierarchyRespInstanceIds> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public ShowCesHierarchyResponse withNodes(List<ShowCeshierarchyRespNodes> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ShowCesHierarchyResponse addNodesItem(ShowCeshierarchyRespNodes nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ShowCesHierarchyResponse withNodes(Consumer<List<ShowCeshierarchyRespNodes>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**： 节点信息。
     * @return nodes
     */
    public List<ShowCeshierarchyRespNodes> getNodes() {
        return nodes;
    }

    public void setNodes(List<ShowCeshierarchyRespNodes> nodes) {
        this.nodes = nodes;
    }

    public ShowCesHierarchyResponse withQueues(List<ShowCeshierarchyRespQueues> queues) {
        this.queues = queues;
        return this;
    }

    public ShowCesHierarchyResponse addQueuesItem(ShowCeshierarchyRespQueues queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public ShowCesHierarchyResponse withQueues(Consumer<List<ShowCeshierarchyRespQueues>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * **参数解释**： 队列信息。
     * @return queues
     */
    public List<ShowCeshierarchyRespQueues> getQueues() {
        return queues;
    }

    public void setQueues(List<ShowCeshierarchyRespQueues> queues) {
        this.queues = queues;
    }

    public ShowCesHierarchyResponse withGroups(List<ShowCeshierarchyRespGroups> groups) {
        this.groups = groups;
        return this;
    }

    public ShowCesHierarchyResponse addGroupsItem(ShowCeshierarchyRespGroups groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ShowCesHierarchyResponse withGroups(Consumer<List<ShowCeshierarchyRespGroups>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * **参数解释**： 消费组信息。
     * @return groups
     */
    public List<ShowCeshierarchyRespGroups> getGroups() {
        return groups;
    }

    public void setGroups(List<ShowCeshierarchyRespGroups> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCesHierarchyResponse that = (ShowCesHierarchyResponse) obj;
        return Objects.equals(this.dimensions, that.dimensions) && Objects.equals(this.instanceIds, that.instanceIds)
            && Objects.equals(this.nodes, that.nodes) && Objects.equals(this.queues, that.queues)
            && Objects.equals(this.groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, instanceIds, nodes, queues, groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCesHierarchyResponse {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
