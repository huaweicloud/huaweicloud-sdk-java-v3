package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 功能特性的键值对。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
    @JsonProperty(value = "min_broker")

    private String minBroker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_versions")

    private String engineVersions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_storage_per_node")

    private String maxStoragePerNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_storage_per_node")

    private String minStoragePerNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_alias")

    private String productAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private String feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_topic")

    private String maxTopic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_num")

    private String brokerNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core")

    private String core;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_consumer")

    private String maxConsumer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rcu")

    private String rcu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_storage")

    private String maxStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_storage")

    private String minStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tps_per_rcu")

    private String maxTpsPerRcu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_tps")

    private String elasticTps;

    public RocketMQExtendProductPropertiesEntity withMaxBroker(String maxBroker) {
        this.maxBroker = maxBroker;
        return this;
    }

    /**
     * **参数解释**： Broker的最大个数（仅RocketMQ 4.8.0版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 每个节点最多能创建的Topic个数（仅RocketMQ 4.8.0版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 每个节点的最大消费者数（仅RocketMQ 4.8.0版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maxConsumerPerBroker
     */
    public String getMaxConsumerPerBroker() {
        return maxConsumerPerBroker;
    }

    public void setMaxConsumerPerBroker(String maxConsumerPerBroker) {
        this.maxConsumerPerBroker = maxConsumerPerBroker;
    }

    public RocketMQExtendProductPropertiesEntity withMinBroker(String minBroker) {
        this.minBroker = minBroker;
        return this;
    }

    /**
     * **参数解释**： Broker的最小个数（仅RocketMQ 4.8.0版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： 消息引擎版本。 **约束限制**： 不涉及。 **取值范围**： [- 4.8.0](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,cmcc,ax,srg) [- 5.x](tag:hws,hws_eu,hws_hk,ocb,hws_ocb,ctc,g42,hk_g42,tm,sbc,hk_sbc,hk_tm,dt,srg) **默认取值**： 不涉及。
     * @return engineVersions
     */
    public String getEngineVersions() {
        return engineVersions;
    }

    public void setEngineVersions(String engineVersions) {
        this.engineVersions = engineVersions;
    }

    public RocketMQExtendProductPropertiesEntity withMaxStoragePerNode(String maxStoragePerNode) {
        this.maxStoragePerNode = maxStoragePerNode;
        return this;
    }

    /**
     * **参数解释**： 每个节点的最大存储。单位为GB  **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maxStoragePerNode
     */
    public String getMaxStoragePerNode() {
        return maxStoragePerNode;
    }

    public void setMaxStoragePerNode(String maxStoragePerNode) {
        this.maxStoragePerNode = maxStoragePerNode;
    }

    public RocketMQExtendProductPropertiesEntity withMinStoragePerNode(String minStoragePerNode) {
        this.minStoragePerNode = minStoragePerNode;
        return this;
    }

    /**
     * **参数解释**： 每个节点的最小存储。单位为GB。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
     * **参数解释**： product_id的别名。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return productAlias
     */
    public String getProductAlias() {
        return productAlias;
    }

    public void setProductAlias(String productAlias) {
        this.productAlias = productAlias;
    }

    public RocketMQExtendProductPropertiesEntity withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * **参数解释**： 该规格对应特性开关。（仅RocketMQ 5.x版本会显示此字段） **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public RocketMQExtendProductPropertiesEntity withMaxTopic(String maxTopic) {
        this.maxTopic = maxTopic;
        return this;
    }

    /**
     * **参数解释**： 实例Topic的最大数（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maxTopic
     */
    public String getMaxTopic() {
        return maxTopic;
    }

    public void setMaxTopic(String maxTopic) {
        this.maxTopic = maxTopic;
    }

    public RocketMQExtendProductPropertiesEntity withBrokerNum(String brokerNum) {
        this.brokerNum = brokerNum;
        return this;
    }

    /**
     * **参数解释**： broker数量（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return brokerNum
     */
    public String getBrokerNum() {
        return brokerNum;
    }

    public void setBrokerNum(String brokerNum) {
        this.brokerNum = brokerNum;
    }

    public RocketMQExtendProductPropertiesEntity withCore(String core) {
        this.core = core;
        return this;
    }

    /**
     * **参数解释**： 整个实例的计费核数（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return core
     */
    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public RocketMQExtendProductPropertiesEntity withMaxConsumer(String maxConsumer) {
        this.maxConsumer = maxConsumer;
        return this;
    }

    /**
     * **参数解释**： 实例消费者的最大数（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maxConsumer
     */
    public String getMaxConsumer() {
        return maxConsumer;
    }

    public void setMaxConsumer(String maxConsumer) {
        this.maxConsumer = maxConsumer;
    }

    public RocketMQExtendProductPropertiesEntity withRcu(String rcu) {
        this.rcu = rcu;
        return this;
    }

    /**
     * **参数解释**： 流量单元，rcu * max_tpc_per_rcu = 规格最大TPS（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return rcu
     */
    public String getRcu() {
        return rcu;
    }

    public void setRcu(String rcu) {
        this.rcu = rcu;
    }

    public RocketMQExtendProductPropertiesEntity withMaxStorage(String maxStorage) {
        this.maxStorage = maxStorage;
        return this;
    }

    /**
     * **参数解释**： 最大存储空间（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maxStorage
     */
    public String getMaxStorage() {
        return maxStorage;
    }

    public void setMaxStorage(String maxStorage) {
        this.maxStorage = maxStorage;
    }

    public RocketMQExtendProductPropertiesEntity withMinStorage(String minStorage) {
        this.minStorage = minStorage;
        return this;
    }

    /**
     * **参数解释**： 最小存储空间（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return minStorage
     */
    public String getMinStorage() {
        return minStorage;
    }

    public void setMinStorage(String minStorage) {
        this.minStorage = minStorage;
    }

    public RocketMQExtendProductPropertiesEntity withMaxTpsPerRcu(String maxTpsPerRcu) {
        this.maxTpsPerRcu = maxTpsPerRcu;
        return this;
    }

    /**
     * **参数解释**： 单个rcu最大TPS（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return maxTpsPerRcu
     */
    public String getMaxTpsPerRcu() {
        return maxTpsPerRcu;
    }

    public void setMaxTpsPerRcu(String maxTpsPerRcu) {
        this.maxTpsPerRcu = maxTpsPerRcu;
    }

    public RocketMQExtendProductPropertiesEntity withElasticTps(String elasticTps) {
        this.elasticTps = elasticTps;
        return this;
    }

    /**
     * **参数解释**： 弹性TPS（仅RocketMQ 5.x版本会显示此字段）。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return elasticTps
     */
    public String getElasticTps() {
        return elasticTps;
    }

    public void setElasticTps(String elasticTps) {
        this.elasticTps = elasticTps;
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
            && Objects.equals(this.minBroker, that.minBroker)
            && Objects.equals(this.engineVersions, that.engineVersions)
            && Objects.equals(this.maxStoragePerNode, that.maxStoragePerNode)
            && Objects.equals(this.minStoragePerNode, that.minStoragePerNode)
            && Objects.equals(this.productAlias, that.productAlias) && Objects.equals(this.feature, that.feature)
            && Objects.equals(this.maxTopic, that.maxTopic) && Objects.equals(this.brokerNum, that.brokerNum)
            && Objects.equals(this.core, that.core) && Objects.equals(this.maxConsumer, that.maxConsumer)
            && Objects.equals(this.rcu, that.rcu) && Objects.equals(this.maxStorage, that.maxStorage)
            && Objects.equals(this.minStorage, that.minStorage) && Objects.equals(this.maxTpsPerRcu, that.maxTpsPerRcu)
            && Objects.equals(this.elasticTps, that.elasticTps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxBroker,
            maxTopicPerBroker,
            maxConsumerPerBroker,
            minBroker,
            engineVersions,
            maxStoragePerNode,
            minStoragePerNode,
            productAlias,
            feature,
            maxTopic,
            brokerNum,
            core,
            maxConsumer,
            rcu,
            maxStorage,
            minStorage,
            maxTpsPerRcu,
            elasticTps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RocketMQExtendProductPropertiesEntity {\n");
        sb.append("    maxBroker: ").append(toIndentedString(maxBroker)).append("\n");
        sb.append("    maxTopicPerBroker: ").append(toIndentedString(maxTopicPerBroker)).append("\n");
        sb.append("    maxConsumerPerBroker: ").append(toIndentedString(maxConsumerPerBroker)).append("\n");
        sb.append("    minBroker: ").append(toIndentedString(minBroker)).append("\n");
        sb.append("    engineVersions: ").append(toIndentedString(engineVersions)).append("\n");
        sb.append("    maxStoragePerNode: ").append(toIndentedString(maxStoragePerNode)).append("\n");
        sb.append("    minStoragePerNode: ").append(toIndentedString(minStoragePerNode)).append("\n");
        sb.append("    productAlias: ").append(toIndentedString(productAlias)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    maxTopic: ").append(toIndentedString(maxTopic)).append("\n");
        sb.append("    brokerNum: ").append(toIndentedString(brokerNum)).append("\n");
        sb.append("    core: ").append(toIndentedString(core)).append("\n");
        sb.append("    maxConsumer: ").append(toIndentedString(maxConsumer)).append("\n");
        sb.append("    rcu: ").append(toIndentedString(rcu)).append("\n");
        sb.append("    maxStorage: ").append(toIndentedString(maxStorage)).append("\n");
        sb.append("    minStorage: ").append(toIndentedString(minStorage)).append("\n");
        sb.append("    maxTpsPerRcu: ").append(toIndentedString(maxTpsPerRcu)).append("\n");
        sb.append("    elasticTps: ").append(toIndentedString(elasticTps)).append("\n");
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
