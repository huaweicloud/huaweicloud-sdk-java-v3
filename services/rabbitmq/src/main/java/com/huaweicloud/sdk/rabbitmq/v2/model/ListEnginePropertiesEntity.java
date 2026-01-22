package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 当前规格实例的属性。
 */
public class ListEnginePropertiesEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_length")

    private String stepLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_queue_per_broker")

    private String maxQueuePerBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_connection_per_broker")

    private String maxConnectionPerBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_broker")

    private String maxBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_storage_per_node")

    private String maxStoragePerNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_consumer_per_broker")

    private String maxConsumerPerBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_broker")

    private String minBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_bandwidth_per_broker")

    private String maxBandwidthPerBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_storage_per_node")

    private String minStoragePerNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tps_per_broker")

    private String maxTpsPerBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_alias")

    private String productAlias;

    public ListEnginePropertiesEntity withStepLength(String stepLength) {
        this.stepLength = stepLength;
        return this;
    }

    /**
     * **参数解释**： 节点增长步长。 **取值范围**： 不涉及。
     * @return stepLength
     */
    public String getStepLength() {
        return stepLength;
    }

    public void setStepLength(String stepLength) {
        this.stepLength = stepLength;
    }

    public ListEnginePropertiesEntity withMaxQueuePerBroker(String maxQueuePerBroker) {
        this.maxQueuePerBroker = maxQueuePerBroker;
        return this;
    }

    /**
     * **参数解释**： 每个Broker的最大队列。 **取值范围**： 不涉及。
     * @return maxQueuePerBroker
     */
    public String getMaxQueuePerBroker() {
        return maxQueuePerBroker;
    }

    public void setMaxQueuePerBroker(String maxQueuePerBroker) {
        this.maxQueuePerBroker = maxQueuePerBroker;
    }

    public ListEnginePropertiesEntity withMaxConnectionPerBroker(String maxConnectionPerBroker) {
        this.maxConnectionPerBroker = maxConnectionPerBroker;
        return this;
    }

    /**
     * **参数解释**： 每个Broker的最大连接数。 **取值范围**： 不涉及。
     * @return maxConnectionPerBroker
     */
    public String getMaxConnectionPerBroker() {
        return maxConnectionPerBroker;
    }

    public void setMaxConnectionPerBroker(String maxConnectionPerBroker) {
        this.maxConnectionPerBroker = maxConnectionPerBroker;
    }

    public ListEnginePropertiesEntity withMaxBroker(String maxBroker) {
        this.maxBroker = maxBroker;
        return this;
    }

    /**
     * **参数解释**： Broker的最大个数。 **取值范围**： 不涉及。
     * @return maxBroker
     */
    public String getMaxBroker() {
        return maxBroker;
    }

    public void setMaxBroker(String maxBroker) {
        this.maxBroker = maxBroker;
    }

    public ListEnginePropertiesEntity withMaxStoragePerNode(String maxStoragePerNode) {
        this.maxStoragePerNode = maxStoragePerNode;
        return this;
    }

    /**
     * **参数解释**： 每个节点的最大存储。单位为GB。 **取值范围**： 不涉及。
     * @return maxStoragePerNode
     */
    public String getMaxStoragePerNode() {
        return maxStoragePerNode;
    }

    public void setMaxStoragePerNode(String maxStoragePerNode) {
        this.maxStoragePerNode = maxStoragePerNode;
    }

    public ListEnginePropertiesEntity withMaxConsumerPerBroker(String maxConsumerPerBroker) {
        this.maxConsumerPerBroker = maxConsumerPerBroker;
        return this;
    }

    /**
     * **参数解释**： 每个Broker的最大消费者数。 **取值范围**： 不涉及。
     * @return maxConsumerPerBroker
     */
    public String getMaxConsumerPerBroker() {
        return maxConsumerPerBroker;
    }

    public void setMaxConsumerPerBroker(String maxConsumerPerBroker) {
        this.maxConsumerPerBroker = maxConsumerPerBroker;
    }

    public ListEnginePropertiesEntity withMinBroker(String minBroker) {
        this.minBroker = minBroker;
        return this;
    }

    /**
     * **参数解释**： Broker的最小个数。 **取值范围**： 不涉及。
     * @return minBroker
     */
    public String getMinBroker() {
        return minBroker;
    }

    public void setMinBroker(String minBroker) {
        this.minBroker = minBroker;
    }

    public ListEnginePropertiesEntity withMaxBandwidthPerBroker(String maxBandwidthPerBroker) {
        this.maxBandwidthPerBroker = maxBandwidthPerBroker;
        return this;
    }

    /**
     * **参数解释**： 每个Broker的最大带宽。 **取值范围**： 不涉及。
     * @return maxBandwidthPerBroker
     */
    public String getMaxBandwidthPerBroker() {
        return maxBandwidthPerBroker;
    }

    public void setMaxBandwidthPerBroker(String maxBandwidthPerBroker) {
        this.maxBandwidthPerBroker = maxBandwidthPerBroker;
    }

    public ListEnginePropertiesEntity withMinStoragePerNode(String minStoragePerNode) {
        this.minStoragePerNode = minStoragePerNode;
        return this;
    }

    /**
     * **参数解释**： 每个节点的最小存储。单位为GB。 **取值范围**： 不涉及。
     * @return minStoragePerNode
     */
    public String getMinStoragePerNode() {
        return minStoragePerNode;
    }

    public void setMinStoragePerNode(String minStoragePerNode) {
        this.minStoragePerNode = minStoragePerNode;
    }

    public ListEnginePropertiesEntity withMaxTpsPerBroker(String maxTpsPerBroker) {
        this.maxTpsPerBroker = maxTpsPerBroker;
        return this;
    }

    /**
     * **参数解释**： 每个Broker的最大TPS。 **取值范围**： 不涉及。
     * @return maxTpsPerBroker
     */
    public String getMaxTpsPerBroker() {
        return maxTpsPerBroker;
    }

    public void setMaxTpsPerBroker(String maxTpsPerBroker) {
        this.maxTpsPerBroker = maxTpsPerBroker;
    }

    public ListEnginePropertiesEntity withProductAlias(String productAlias) {
        this.productAlias = productAlias;
        return this;
    }

    /**
     * **参数解释**： product_id的别名。 **取值范围**： 不涉及。
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
        ListEnginePropertiesEntity that = (ListEnginePropertiesEntity) obj;
        return Objects.equals(this.stepLength, that.stepLength)
            && Objects.equals(this.maxQueuePerBroker, that.maxQueuePerBroker)
            && Objects.equals(this.maxConnectionPerBroker, that.maxConnectionPerBroker)
            && Objects.equals(this.maxBroker, that.maxBroker)
            && Objects.equals(this.maxStoragePerNode, that.maxStoragePerNode)
            && Objects.equals(this.maxConsumerPerBroker, that.maxConsumerPerBroker)
            && Objects.equals(this.minBroker, that.minBroker)
            && Objects.equals(this.maxBandwidthPerBroker, that.maxBandwidthPerBroker)
            && Objects.equals(this.minStoragePerNode, that.minStoragePerNode)
            && Objects.equals(this.maxTpsPerBroker, that.maxTpsPerBroker)
            && Objects.equals(this.productAlias, that.productAlias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepLength,
            maxQueuePerBroker,
            maxConnectionPerBroker,
            maxBroker,
            maxStoragePerNode,
            maxConsumerPerBroker,
            minBroker,
            maxBandwidthPerBroker,
            minStoragePerNode,
            maxTpsPerBroker,
            productAlias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnginePropertiesEntity {\n");
        sb.append("    stepLength: ").append(toIndentedString(stepLength)).append("\n");
        sb.append("    maxQueuePerBroker: ").append(toIndentedString(maxQueuePerBroker)).append("\n");
        sb.append("    maxConnectionPerBroker: ").append(toIndentedString(maxConnectionPerBroker)).append("\n");
        sb.append("    maxBroker: ").append(toIndentedString(maxBroker)).append("\n");
        sb.append("    maxStoragePerNode: ").append(toIndentedString(maxStoragePerNode)).append("\n");
        sb.append("    maxConsumerPerBroker: ").append(toIndentedString(maxConsumerPerBroker)).append("\n");
        sb.append("    minBroker: ").append(toIndentedString(minBroker)).append("\n");
        sb.append("    maxBandwidthPerBroker: ").append(toIndentedString(maxBandwidthPerBroker)).append("\n");
        sb.append("    minStoragePerNode: ").append(toIndentedString(minStoragePerNode)).append("\n");
        sb.append("    maxTpsPerBroker: ").append(toIndentedString(maxTpsPerBroker)).append("\n");
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
