package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateRocketMqMigrationTaskReq
 */
public class CreateRocketMqMigrationTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topicConfigTable")

    private Map<String, MigrationRocketMqTopicConfig> topicConfigTable = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptionGroupTable")

    private Map<String, MigrationRocketMqSubscriptionGroup> subscriptionGroupTable = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vhosts")

    private List<MigrationRabbitVhostMetadata> vhosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queues")

    private List<MigrationRabbitQueueMetadata> queues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exchanges")

    private List<MigrationRabbitExchangeMetadata> exchanges = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bindings")

    private List<MigrationRabbitBindingMetadata> bindings = null;

    public CreateRocketMqMigrationTaskReq withTopicConfigTable(
        Map<String, MigrationRocketMqTopicConfig> topicConfigTable) {
        this.topicConfigTable = topicConfigTable;
        return this;
    }

    public CreateRocketMqMigrationTaskReq putTopicConfigTableItem(String key,
        MigrationRocketMqTopicConfig topicConfigTableItem) {
        if (this.topicConfigTable == null) {
            this.topicConfigTable = new HashMap<>();
        }
        this.topicConfigTable.put(key, topicConfigTableItem);
        return this;
    }

    public CreateRocketMqMigrationTaskReq withTopicConfigTable(
        Consumer<Map<String, MigrationRocketMqTopicConfig>> topicConfigTableSetter) {
        if (this.topicConfigTable == null) {
            this.topicConfigTable = new HashMap<>();
        }
        topicConfigTableSetter.accept(this.topicConfigTable);
        return this;
    }

    /**
     * RocketMQ topic 元数据，键为topic名，值为topic配置，迁移任务类型为自建RocketMQ上云(rocketmq)时必填。
     * @return topicConfigTable
     */
    public Map<String, MigrationRocketMqTopicConfig> getTopicConfigTable() {
        return topicConfigTable;
    }

    public void setTopicConfigTable(Map<String, MigrationRocketMqTopicConfig> topicConfigTable) {
        this.topicConfigTable = topicConfigTable;
    }

    public CreateRocketMqMigrationTaskReq withSubscriptionGroupTable(
        Map<String, MigrationRocketMqSubscriptionGroup> subscriptionGroupTable) {
        this.subscriptionGroupTable = subscriptionGroupTable;
        return this;
    }

    public CreateRocketMqMigrationTaskReq putSubscriptionGroupTableItem(String key,
        MigrationRocketMqSubscriptionGroup subscriptionGroupTableItem) {
        if (this.subscriptionGroupTable == null) {
            this.subscriptionGroupTable = new HashMap<>();
        }
        this.subscriptionGroupTable.put(key, subscriptionGroupTableItem);
        return this;
    }

    public CreateRocketMqMigrationTaskReq withSubscriptionGroupTable(
        Consumer<Map<String, MigrationRocketMqSubscriptionGroup>> subscriptionGroupTableSetter) {
        if (this.subscriptionGroupTable == null) {
            this.subscriptionGroupTable = new HashMap<>();
        }
        subscriptionGroupTableSetter.accept(this.subscriptionGroupTable);
        return this;
    }

    /**
     * RocketMQ消费组元数据，键为消费组名，值为消费组配置，迁移任务类型为自建RocketMQ上云(rocketmq)时必填。
     * @return subscriptionGroupTable
     */
    public Map<String, MigrationRocketMqSubscriptionGroup> getSubscriptionGroupTable() {
        return subscriptionGroupTable;
    }

    public void setSubscriptionGroupTable(Map<String, MigrationRocketMqSubscriptionGroup> subscriptionGroupTable) {
        this.subscriptionGroupTable = subscriptionGroupTable;
    }

    public CreateRocketMqMigrationTaskReq withVhosts(List<MigrationRabbitVhostMetadata> vhosts) {
        this.vhosts = vhosts;
        return this;
    }

    public CreateRocketMqMigrationTaskReq addVhostsItem(MigrationRabbitVhostMetadata vhostsItem) {
        if (this.vhosts == null) {
            this.vhosts = new ArrayList<>();
        }
        this.vhosts.add(vhostsItem);
        return this;
    }

    public CreateRocketMqMigrationTaskReq withVhosts(Consumer<List<MigrationRabbitVhostMetadata>> vhostsSetter) {
        if (this.vhosts == null) {
            this.vhosts = new ArrayList<>();
        }
        vhostsSetter.accept(this.vhosts);
        return this;
    }

    /**
     * RabbitMQ vhost元数据列表，迁移任务类型为自建RabbitMQ上云(rabbitToRocket)时必填。
     * @return vhosts
     */
    public List<MigrationRabbitVhostMetadata> getVhosts() {
        return vhosts;
    }

    public void setVhosts(List<MigrationRabbitVhostMetadata> vhosts) {
        this.vhosts = vhosts;
    }

    public CreateRocketMqMigrationTaskReq withQueues(List<MigrationRabbitQueueMetadata> queues) {
        this.queues = queues;
        return this;
    }

    public CreateRocketMqMigrationTaskReq addQueuesItem(MigrationRabbitQueueMetadata queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public CreateRocketMqMigrationTaskReq withQueues(Consumer<List<MigrationRabbitQueueMetadata>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * RabbitMQ队列元数据列表，迁移任务类型为自建RabbitMQ上云(rabbitToRocket)时必填。
     * @return queues
     */
    public List<MigrationRabbitQueueMetadata> getQueues() {
        return queues;
    }

    public void setQueues(List<MigrationRabbitQueueMetadata> queues) {
        this.queues = queues;
    }

    public CreateRocketMqMigrationTaskReq withExchanges(List<MigrationRabbitExchangeMetadata> exchanges) {
        this.exchanges = exchanges;
        return this;
    }

    public CreateRocketMqMigrationTaskReq addExchangesItem(MigrationRabbitExchangeMetadata exchangesItem) {
        if (this.exchanges == null) {
            this.exchanges = new ArrayList<>();
        }
        this.exchanges.add(exchangesItem);
        return this;
    }

    public CreateRocketMqMigrationTaskReq withExchanges(
        Consumer<List<MigrationRabbitExchangeMetadata>> exchangesSetter) {
        if (this.exchanges == null) {
            this.exchanges = new ArrayList<>();
        }
        exchangesSetter.accept(this.exchanges);
        return this;
    }

    /**
     * RabbitMQ交换机元数据列表，迁移任务类型为自建RabbitMQ上云(rabbitToRocket)时必填。
     * @return exchanges
     */
    public List<MigrationRabbitExchangeMetadata> getExchanges() {
        return exchanges;
    }

    public void setExchanges(List<MigrationRabbitExchangeMetadata> exchanges) {
        this.exchanges = exchanges;
    }

    public CreateRocketMqMigrationTaskReq withBindings(List<MigrationRabbitBindingMetadata> bindings) {
        this.bindings = bindings;
        return this;
    }

    public CreateRocketMqMigrationTaskReq addBindingsItem(MigrationRabbitBindingMetadata bindingsItem) {
        if (this.bindings == null) {
            this.bindings = new ArrayList<>();
        }
        this.bindings.add(bindingsItem);
        return this;
    }

    public CreateRocketMqMigrationTaskReq withBindings(Consumer<List<MigrationRabbitBindingMetadata>> bindingsSetter) {
        if (this.bindings == null) {
            this.bindings = new ArrayList<>();
        }
        bindingsSetter.accept(this.bindings);
        return this;
    }

    /**
     * RabbitMQ binding元数据列表，迁移任务类型为自建RabbitMQ上云(rabbitToRocket)时必填。
     * @return bindings
     */
    public List<MigrationRabbitBindingMetadata> getBindings() {
        return bindings;
    }

    public void setBindings(List<MigrationRabbitBindingMetadata> bindings) {
        this.bindings = bindings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRocketMqMigrationTaskReq that = (CreateRocketMqMigrationTaskReq) obj;
        return Objects.equals(this.topicConfigTable, that.topicConfigTable)
            && Objects.equals(this.subscriptionGroupTable, that.subscriptionGroupTable)
            && Objects.equals(this.vhosts, that.vhosts) && Objects.equals(this.queues, that.queues)
            && Objects.equals(this.exchanges, that.exchanges) && Objects.equals(this.bindings, that.bindings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicConfigTable, subscriptionGroupTable, vhosts, queues, exchanges, bindings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRocketMqMigrationTaskReq {\n");
        sb.append("    topicConfigTable: ").append(toIndentedString(topicConfigTable)).append("\n");
        sb.append("    subscriptionGroupTable: ").append(toIndentedString(subscriptionGroupTable)).append("\n");
        sb.append("    vhosts: ").append(toIndentedString(vhosts)).append("\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
        sb.append("    exchanges: ").append(toIndentedString(exchanges)).append("\n");
        sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
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
