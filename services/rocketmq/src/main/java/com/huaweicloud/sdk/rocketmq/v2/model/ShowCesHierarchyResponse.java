package com.huaweicloud.sdk.rocketmq.v2.model;

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

    private List<ShowCesHierarchyRespInstanceIds> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<ShowCesHierarchyRespNodes> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<ShowCeshierarchyRespTopics> topics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dlq")

    private List<ShowCeshierarchyRespDlq> dlq = null;

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
     * **参数解释**： 监控维度。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return dimensions
     */
    public List<ShowCeshierarchyRespDimensions> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<ShowCeshierarchyRespDimensions> dimensions) {
        this.dimensions = dimensions;
    }

    public ShowCesHierarchyResponse withInstanceIds(List<ShowCesHierarchyRespInstanceIds> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public ShowCesHierarchyResponse addInstanceIdsItem(ShowCesHierarchyRespInstanceIds instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public ShowCesHierarchyResponse withInstanceIds(Consumer<List<ShowCesHierarchyRespInstanceIds>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * **参数解释**： 实例信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return instanceIds
     */
    public List<ShowCesHierarchyRespInstanceIds> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<ShowCesHierarchyRespInstanceIds> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public ShowCesHierarchyResponse withNodes(List<ShowCesHierarchyRespNodes> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ShowCesHierarchyResponse addNodesItem(ShowCesHierarchyRespNodes nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ShowCesHierarchyResponse withNodes(Consumer<List<ShowCesHierarchyRespNodes>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**： 节点信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return nodes
     */
    public List<ShowCesHierarchyRespNodes> getNodes() {
        return nodes;
    }

    public void setNodes(List<ShowCesHierarchyRespNodes> nodes) {
        this.nodes = nodes;
    }

    public ShowCesHierarchyResponse withTopics(List<ShowCeshierarchyRespTopics> topics) {
        this.topics = topics;
        return this;
    }

    public ShowCesHierarchyResponse addTopicsItem(ShowCeshierarchyRespTopics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public ShowCesHierarchyResponse withTopics(Consumer<List<ShowCeshierarchyRespTopics>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * **参数解释**： 队列信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return topics
     */
    public List<ShowCeshierarchyRespTopics> getTopics() {
        return topics;
    }

    public void setTopics(List<ShowCeshierarchyRespTopics> topics) {
        this.topics = topics;
    }

    public ShowCesHierarchyResponse withDlq(List<ShowCeshierarchyRespDlq> dlq) {
        this.dlq = dlq;
        return this;
    }

    public ShowCesHierarchyResponse addDlqItem(ShowCeshierarchyRespDlq dlqItem) {
        if (this.dlq == null) {
            this.dlq = new ArrayList<>();
        }
        this.dlq.add(dlqItem);
        return this;
    }

    public ShowCesHierarchyResponse withDlq(Consumer<List<ShowCeshierarchyRespDlq>> dlqSetter) {
        if (this.dlq == null) {
            this.dlq = new ArrayList<>();
        }
        dlqSetter.accept(this.dlq);
        return this;
    }

    /**
     * **参数解释**： 死信队列。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return dlq
     */
    public List<ShowCeshierarchyRespDlq> getDlq() {
        return dlq;
    }

    public void setDlq(List<ShowCeshierarchyRespDlq> dlq) {
        this.dlq = dlq;
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
     * **参数解释**： 消费组信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
            && Objects.equals(this.nodes, that.nodes) && Objects.equals(this.topics, that.topics)
            && Objects.equals(this.dlq, that.dlq) && Objects.equals(this.groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, instanceIds, nodes, topics, dlq, groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCesHierarchyResponse {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    dlq: ").append(toIndentedString(dlq)).append("\n");
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
