package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 功能特性的键值对。
 */
public class RocketMQExtendProductPropertiesEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_broker")

    private String maxBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_topic_per_broker")

    private String maxTopicPerBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_consumer_per_broker")

    private String maxConsumerPerBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_storage_per_node")

    private String maxStoragePerNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_broker")

    private String minBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_versions")

    private String engineVersions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_storage_per_node")

    private String minStoragePerNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_alias")

    private String productAlias;

    public RocketMQExtendProductPropertiesEntity withMaxBroker(String maxBroker) {
        this.maxBroker = maxBroker;
        return this;
    }

    /**
     * Broker的最大个数。
     * @return maxBroker
     */
    public String getMaxBroker() {
        return maxBroker;
    }

    public void setMaxBroker(String maxBroker) {
        this.maxBroker = maxBroker;
    }

    public RocketMQExtendProductPropertiesEntity withMaxTopicPerBroker(String maxTopicPerBroker) {
        this.maxTopicPerBroker = maxTopicPerBroker;
        return this;
    }

    /**
     * 每个节点最多能创建的Topic个数。
     * @return maxTopicPerBroker
     */
    public String getMaxTopicPerBroker() {
        return maxTopicPerBroker;
    }

    public void setMaxTopicPerBroker(String maxTopicPerBroker) {
        this.maxTopicPerBroker = maxTopicPerBroker;
    }

    public RocketMQExtendProductPropertiesEntity withMaxConsumerPerBroker(String maxConsumerPerBroker) {
        this.maxConsumerPerBroker = maxConsumerPerBroker;
        return this;
    }

    /**
     * 每个节点的最大消费者数。
     * @return maxConsumerPerBroker
     */
    public String getMaxConsumerPerBroker() {
        return maxConsumerPerBroker;
    }

    public void setMaxConsumerPerBroker(String maxConsumerPerBroker) {
        this.maxConsumerPerBroker = maxConsumerPerBroker;
    }

    public RocketMQExtendProductPropertiesEntity withMaxStoragePerNode(String maxStoragePerNode) {
        this.maxStoragePerNode = maxStoragePerNode;
        return this;
    }

    /**
     * 每个节点的最大存储。单位为GB
     * @return maxStoragePerNode
     */
    public String getMaxStoragePerNode() {
        return maxStoragePerNode;
    }

    public void setMaxStoragePerNode(String maxStoragePerNode) {
        this.maxStoragePerNode = maxStoragePerNode;
    }

    public RocketMQExtendProductPropertiesEntity withMinBroker(String minBroker) {
        this.minBroker = minBroker;
        return this;
    }

    /**
     * Broker的最小个数。
     * @return minBroker
     */
    public String getMinBroker() {
        return minBroker;
    }

    public void setMinBroker(String minBroker) {
        this.minBroker = minBroker;
    }

    public RocketMQExtendProductPropertiesEntity withEngineVersions(String engineVersions) {
        this.engineVersions = engineVersions;
        return this;
    }

    /**
     * 消息引擎版本。
     * @return engineVersions
     */
    public String getEngineVersions() {
        return engineVersions;
    }

    public void setEngineVersions(String engineVersions) {
        this.engineVersions = engineVersions;
    }

    public RocketMQExtendProductPropertiesEntity withMinStoragePerNode(String minStoragePerNode) {
        this.minStoragePerNode = minStoragePerNode;
        return this;
    }

    /**
     * 每个节点的最小存储。单位为GB
     * @return minStoragePerNode
     */
    public String getMinStoragePerNode() {
        return minStoragePerNode;
    }

    public void setMinStoragePerNode(String minStoragePerNode) {
        this.minStoragePerNode = minStoragePerNode;
    }

    public RocketMQExtendProductPropertiesEntity withProductAlias(String productAlias) {
        this.productAlias = productAlias;
        return this;
    }

    /**
     * product_id的别名
     * @return productAlias
     */
    public String getProductAlias() {
        return productAlias;
    }

    public void setProductAlias(String productAlias) {
        this.productAlias = productAlias;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RocketMQExtendProductPropertiesEntity that = (RocketMQExtendProductPropertiesEntity) obj;
        return Objects.equals(this.maxBroker, that.maxBroker)
            && Objects.equals(this.maxTopicPerBroker, that.maxTopicPerBroker)
            && Objects.equals(this.maxConsumerPerBroker, that.maxConsumerPerBroker)
            && Objects.equals(this.maxStoragePerNode, that.maxStoragePerNode)
            && Objects.equals(this.minBroker, that.minBroker)
            && Objects.equals(this.engineVersions, that.engineVersions)
            && Objects.equals(this.minStoragePerNode, that.minStoragePerNode)
            && Objects.equals(this.productAlias, that.productAlias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxBroker,
            maxTopicPerBroker,
            maxConsumerPerBroker,
            maxStoragePerNode,
            minBroker,
            engineVersions,
            minStoragePerNode,
            productAlias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RocketMQExtendProductPropertiesEntity {\n");
        sb.append("    maxBroker: ").append(toIndentedString(maxBroker)).append("\n");
        sb.append("    maxTopicPerBroker: ").append(toIndentedString(maxTopicPerBroker)).append("\n");
        sb.append("    maxConsumerPerBroker: ").append(toIndentedString(maxConsumerPerBroker)).append("\n");
        sb.append("    maxStoragePerNode: ").append(toIndentedString(maxStoragePerNode)).append("\n");
        sb.append("    minBroker: ").append(toIndentedString(minBroker)).append("\n");
        sb.append("    engineVersions: ").append(toIndentedString(engineVersions)).append("\n");
        sb.append("    minStoragePerNode: ").append(toIndentedString(minStoragePerNode)).append("\n");
        sb.append("    productAlias: ").append(toIndentedString(productAlias)).append("\n");
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
