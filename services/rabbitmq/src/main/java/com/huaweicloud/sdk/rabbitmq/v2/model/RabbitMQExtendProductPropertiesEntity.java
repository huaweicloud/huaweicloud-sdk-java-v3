package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 功能特性的键值对。
 */
public class RabbitMQExtendProductPropertiesEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_broker")

    private String maxBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_storage_per_node")

    private String maxStoragePerNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_broker")

    private String minBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_storage_per_node")

    private String minStoragePerNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_connection_per_broker")

    private String maxConnectionPerBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_length")

    private String stepLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_alias")

    private String productAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_queue_per_broker")

    private String maxQueuePerBroker;

    public RabbitMQExtendProductPropertiesEntity withMaxBroker(String maxBroker) {
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

    public RabbitMQExtendProductPropertiesEntity withMaxStoragePerNode(String maxStoragePerNode) {
        this.maxStoragePerNode = maxStoragePerNode;
        return this;
    }

    /**
     * 每个节点的最大存储。单位为GB。
     * @return maxStoragePerNode
     */
    public String getMaxStoragePerNode() {
        return maxStoragePerNode;
    }

    public void setMaxStoragePerNode(String maxStoragePerNode) {
        this.maxStoragePerNode = maxStoragePerNode;
    }

    public RabbitMQExtendProductPropertiesEntity withMinBroker(String minBroker) {
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

    public RabbitMQExtendProductPropertiesEntity withMinStoragePerNode(String minStoragePerNode) {
        this.minStoragePerNode = minStoragePerNode;
        return this;
    }

    /**
     * 每个节点的最小存储。单位为GB。
     * @return minStoragePerNode
     */
    public String getMinStoragePerNode() {
        return minStoragePerNode;
    }

    public void setMinStoragePerNode(String minStoragePerNode) {
        this.minStoragePerNode = minStoragePerNode;
    }

    public RabbitMQExtendProductPropertiesEntity withMaxConnectionPerBroker(String maxConnectionPerBroker) {
        this.maxConnectionPerBroker = maxConnectionPerBroker;
        return this;
    }

    /**
     * 最大连接数
     * @return maxConnectionPerBroker
     */
    public String getMaxConnectionPerBroker() {
        return maxConnectionPerBroker;
    }

    public void setMaxConnectionPerBroker(String maxConnectionPerBroker) {
        this.maxConnectionPerBroker = maxConnectionPerBroker;
    }

    public RabbitMQExtendProductPropertiesEntity withStepLength(String stepLength) {
        this.stepLength = stepLength;
        return this;
    }

    /**
     * 步长
     * @return stepLength
     */
    public String getStepLength() {
        return stepLength;
    }

    public void setStepLength(String stepLength) {
        this.stepLength = stepLength;
    }

    public RabbitMQExtendProductPropertiesEntity withProductAlias(String productAlias) {
        this.productAlias = productAlias;
        return this;
    }

    /**
     * product_id的别名。
     * @return productAlias
     */
    public String getProductAlias() {
        return productAlias;
    }

    public void setProductAlias(String productAlias) {
        this.productAlias = productAlias;
    }

    public RabbitMQExtendProductPropertiesEntity withMaxQueuePerBroker(String maxQueuePerBroker) {
        this.maxQueuePerBroker = maxQueuePerBroker;
        return this;
    }

    /**
     * 最大队列
     * @return maxQueuePerBroker
     */
    public String getMaxQueuePerBroker() {
        return maxQueuePerBroker;
    }

    public void setMaxQueuePerBroker(String maxQueuePerBroker) {
        this.maxQueuePerBroker = maxQueuePerBroker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RabbitMQExtendProductPropertiesEntity rabbitMQExtendProductPropertiesEntity =
            (RabbitMQExtendProductPropertiesEntity) o;
        return Objects.equals(this.maxBroker, rabbitMQExtendProductPropertiesEntity.maxBroker)
            && Objects.equals(this.maxStoragePerNode, rabbitMQExtendProductPropertiesEntity.maxStoragePerNode)
            && Objects.equals(this.minBroker, rabbitMQExtendProductPropertiesEntity.minBroker)
            && Objects.equals(this.minStoragePerNode, rabbitMQExtendProductPropertiesEntity.minStoragePerNode)
            && Objects.equals(this.maxConnectionPerBroker, rabbitMQExtendProductPropertiesEntity.maxConnectionPerBroker)
            && Objects.equals(this.stepLength, rabbitMQExtendProductPropertiesEntity.stepLength)
            && Objects.equals(this.productAlias, rabbitMQExtendProductPropertiesEntity.productAlias)
            && Objects.equals(this.maxQueuePerBroker, rabbitMQExtendProductPropertiesEntity.maxQueuePerBroker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxBroker,
            maxStoragePerNode,
            minBroker,
            minStoragePerNode,
            maxConnectionPerBroker,
            stepLength,
            productAlias,
            maxQueuePerBroker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RabbitMQExtendProductPropertiesEntity {\n");
        sb.append("    maxBroker: ").append(toIndentedString(maxBroker)).append("\n");
        sb.append("    maxStoragePerNode: ").append(toIndentedString(maxStoragePerNode)).append("\n");
        sb.append("    minBroker: ").append(toIndentedString(minBroker)).append("\n");
        sb.append("    minStoragePerNode: ").append(toIndentedString(minStoragePerNode)).append("\n");
        sb.append("    maxConnectionPerBroker: ").append(toIndentedString(maxConnectionPerBroker)).append("\n");
        sb.append("    stepLength: ").append(toIndentedString(stepLength)).append("\n");
        sb.append("    productAlias: ").append(toIndentedString(productAlias)).append("\n");
        sb.append("    maxQueuePerBroker: ").append(toIndentedString(maxQueuePerBroker)).append("\n");
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
