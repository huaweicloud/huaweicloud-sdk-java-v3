package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 当前规格实例的属性。 */
public class ListEnginePropertiesEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_partition_per_broker")

    private String maxPartitionPerBroker;

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

    public ListEnginePropertiesEntity withMaxPartitionPerBroker(String maxPartitionPerBroker) {
        this.maxPartitionPerBroker = maxPartitionPerBroker;
        return this;
    }

    /** 每个Broker的最大分区数。
     * 
     * @return maxPartitionPerBroker */
    public String getMaxPartitionPerBroker() {
        return maxPartitionPerBroker;
    }

    public void setMaxPartitionPerBroker(String maxPartitionPerBroker) {
        this.maxPartitionPerBroker = maxPartitionPerBroker;
    }

    public ListEnginePropertiesEntity withMaxBroker(String maxBroker) {
        this.maxBroker = maxBroker;
        return this;
    }

    /** Broker的最大个数。
     * 
     * @return maxBroker */
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

    /** 每个节点的最大存储。单位为GB。
     * 
     * @return maxStoragePerNode */
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

    /** 每个Broker的最大消费者数。
     * 
     * @return maxConsumerPerBroker */
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

    /** Broker的最小个数。
     * 
     * @return minBroker */
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

    /** 每个Broker的最大带宽。
     * 
     * @return maxBandwidthPerBroker */
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

    /** 每个节点的最小存储。单位为GB。
     * 
     * @return minStoragePerNode */
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

    /** 每个Broker的最大TPS。
     * 
     * @return maxTpsPerBroker */
    public String getMaxTpsPerBroker() {
        return maxTpsPerBroker;
    }

    public void setMaxTpsPerBroker(String maxTpsPerBroker) {
        this.maxTpsPerBroker = maxTpsPerBroker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnginePropertiesEntity listEnginePropertiesEntity = (ListEnginePropertiesEntity) o;
        return Objects.equals(this.maxPartitionPerBroker, listEnginePropertiesEntity.maxPartitionPerBroker)
            && Objects.equals(this.maxBroker, listEnginePropertiesEntity.maxBroker)
            && Objects.equals(this.maxStoragePerNode, listEnginePropertiesEntity.maxStoragePerNode)
            && Objects.equals(this.maxConsumerPerBroker, listEnginePropertiesEntity.maxConsumerPerBroker)
            && Objects.equals(this.minBroker, listEnginePropertiesEntity.minBroker)
            && Objects.equals(this.maxBandwidthPerBroker, listEnginePropertiesEntity.maxBandwidthPerBroker)
            && Objects.equals(this.minStoragePerNode, listEnginePropertiesEntity.minStoragePerNode)
            && Objects.equals(this.maxTpsPerBroker, listEnginePropertiesEntity.maxTpsPerBroker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxPartitionPerBroker,
            maxBroker,
            maxStoragePerNode,
            maxConsumerPerBroker,
            minBroker,
            maxBandwidthPerBroker,
            minStoragePerNode,
            maxTpsPerBroker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnginePropertiesEntity {\n");
        sb.append("    maxPartitionPerBroker: ").append(toIndentedString(maxPartitionPerBroker)).append("\n");
        sb.append("    maxBroker: ").append(toIndentedString(maxBroker)).append("\n");
        sb.append("    maxStoragePerNode: ").append(toIndentedString(maxStoragePerNode)).append("\n");
        sb.append("    maxConsumerPerBroker: ").append(toIndentedString(maxConsumerPerBroker)).append("\n");
        sb.append("    minBroker: ").append(toIndentedString(minBroker)).append("\n");
        sb.append("    maxBandwidthPerBroker: ").append(toIndentedString(maxBandwidthPerBroker)).append("\n");
        sb.append("    minStoragePerNode: ").append(toIndentedString(minStoragePerNode)).append("\n");
        sb.append("    maxTpsPerBroker: ").append(toIndentedString(maxTpsPerBroker)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
