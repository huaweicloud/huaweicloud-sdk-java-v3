package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * broker检查结果
 */
public class ShowShrinkCheckResponseBodyCheckDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_id")

    private Integer brokerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_delete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_zk_node")

    private Boolean isZkNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_controller")

    private Boolean isController;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_topics")

    private Boolean hasTopics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<String> topics = null;

    public ShowShrinkCheckResponseBodyCheckDetail withBrokerId(Integer brokerId) {
        this.brokerId = brokerId;
        return this;
    }

    /**
     * broker序号
     * @return brokerId
     */
    public Integer getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Integer brokerId) {
        this.brokerId = brokerId;
    }

    public ShowShrinkCheckResponseBodyCheckDetail withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * 节点是否可删除。
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public ShowShrinkCheckResponseBodyCheckDetail withIsZkNode(Boolean isZkNode) {
        this.isZkNode = isZkNode;
        return this;
    }

    /**
     * 节点是否为zk部署节点。
     * @return isZkNode
     */
    public Boolean getIsZkNode() {
        return isZkNode;
    }

    public void setIsZkNode(Boolean isZkNode) {
        this.isZkNode = isZkNode;
    }

    public ShowShrinkCheckResponseBodyCheckDetail withIsController(Boolean isController) {
        this.isController = isController;
        return this;
    }

    /**
     * broker是否为controller。
     * @return isController
     */
    public Boolean getIsController() {
        return isController;
    }

    public void setIsController(Boolean isController) {
        this.isController = isController;
    }

    public ShowShrinkCheckResponseBodyCheckDetail withHasTopics(Boolean hasTopics) {
        this.hasTopics = hasTopics;
        return this;
    }

    /**
     * broker上是否存在topic数据。
     * @return hasTopics
     */
    public Boolean getHasTopics() {
        return hasTopics;
    }

    public void setHasTopics(Boolean hasTopics) {
        this.hasTopics = hasTopics;
    }

    public ShowShrinkCheckResponseBodyCheckDetail withTopics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public ShowShrinkCheckResponseBodyCheckDetail addTopicsItem(String topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public ShowShrinkCheckResponseBodyCheckDetail withTopics(Consumer<List<String>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * broker上存在的topic列表。
     * @return topics
     */
    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowShrinkCheckResponseBodyCheckDetail that = (ShowShrinkCheckResponseBodyCheckDetail) obj;
        return Objects.equals(this.brokerId, that.brokerId) && Objects.equals(this.canDelete, that.canDelete)
            && Objects.equals(this.isZkNode, that.isZkNode) && Objects.equals(this.isController, that.isController)
            && Objects.equals(this.hasTopics, that.hasTopics) && Objects.equals(this.topics, that.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brokerId, canDelete, isZkNode, isController, hasTopics, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowShrinkCheckResponseBodyCheckDetail {\n");
        sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    isZkNode: ").append(toIndentedString(isZkNode)).append("\n");
        sb.append("    isController: ").append(toIndentedString(isController)).append("\n");
        sb.append("    hasTopics: ").append(toIndentedString(hasTopics)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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
