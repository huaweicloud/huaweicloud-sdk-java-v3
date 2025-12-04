package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateInstanceTopicReqTopics
 */
public class UpdateInstanceTopicReqTopics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_time")

    private Integer retentionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_replication")

    private Boolean syncReplication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_message_flush")

    private Boolean syncMessageFlush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_partition_numbers")

    private Integer newPartitionNumbers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_partition_brokers")

    private List<Integer> newPartitionBrokers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_other_configs")

    private List<UpdateInstanceTopicReqTopicOtherConfigs> topicOtherConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_desc")

    private String topicDesc;

    public UpdateInstanceTopicReqTopics withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： Topic名称，不支持修改。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateInstanceTopicReqTopics withRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    /**
     * **参数解释**： 老化时间，单位小时。 **约束限制**： 不涉及。 **取值范围**： 0-720。 **默认取值**： 不涉及。
     * @return retentionTime
     */
    public Integer getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
    }

    public UpdateInstanceTopicReqTopics withSyncReplication(Boolean syncReplication) {
        this.syncReplication = syncReplication;
        return this;
    }

    /**
     * **参数解释**： 是否同步复制。 **约束限制**： 不涉及。 **取值范围**： - true：开启同步复制。 - false：不开启同步复制。 **默认取值**： 不涉及。
     * @return syncReplication
     */
    public Boolean getSyncReplication() {
        return syncReplication;
    }

    public void setSyncReplication(Boolean syncReplication) {
        this.syncReplication = syncReplication;
    }

    public UpdateInstanceTopicReqTopics withSyncMessageFlush(Boolean syncMessageFlush) {
        this.syncMessageFlush = syncMessageFlush;
        return this;
    }

    /**
     * **参数解释**： 是否同步落盘。 **约束限制**： 不涉及。 **取值范围**： - true：开启同步落盘。 - false：不开启同步落盘。 **默认取值**： 不涉及。
     * @return syncMessageFlush
     */
    public Boolean getSyncMessageFlush() {
        return syncMessageFlush;
    }

    public void setSyncMessageFlush(Boolean syncMessageFlush) {
        this.syncMessageFlush = syncMessageFlush;
    }

    public UpdateInstanceTopicReqTopics withNewPartitionNumbers(Integer newPartitionNumbers) {
        this.newPartitionNumbers = newPartitionNumbers;
        return this;
    }

    /**
     * **参数解释**： 分区数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return newPartitionNumbers
     */
    public Integer getNewPartitionNumbers() {
        return newPartitionNumbers;
    }

    public void setNewPartitionNumbers(Integer newPartitionNumbers) {
        this.newPartitionNumbers = newPartitionNumbers;
    }

    public UpdateInstanceTopicReqTopics withNewPartitionBrokers(List<Integer> newPartitionBrokers) {
        this.newPartitionBrokers = newPartitionBrokers;
        return this;
    }

    public UpdateInstanceTopicReqTopics addNewPartitionBrokersItem(Integer newPartitionBrokersItem) {
        if (this.newPartitionBrokers == null) {
            this.newPartitionBrokers = new ArrayList<>();
        }
        this.newPartitionBrokers.add(newPartitionBrokersItem);
        return this;
    }

    public UpdateInstanceTopicReqTopics withNewPartitionBrokers(Consumer<List<Integer>> newPartitionBrokersSetter) {
        if (this.newPartitionBrokers == null) {
            this.newPartitionBrokers = new ArrayList<>();
        }
        newPartitionBrokersSetter.accept(this.newPartitionBrokers);
        return this;
    }

    /**
     * **参数解释**： 增加分区时指定broker列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return newPartitionBrokers
     */
    public List<Integer> getNewPartitionBrokers() {
        return newPartitionBrokers;
    }

    public void setNewPartitionBrokers(List<Integer> newPartitionBrokers) {
        this.newPartitionBrokers = newPartitionBrokers;
    }

    public UpdateInstanceTopicReqTopics withTopicOtherConfigs(
        List<UpdateInstanceTopicReqTopicOtherConfigs> topicOtherConfigs) {
        this.topicOtherConfigs = topicOtherConfigs;
        return this;
    }

    public UpdateInstanceTopicReqTopics addTopicOtherConfigsItem(
        UpdateInstanceTopicReqTopicOtherConfigs topicOtherConfigsItem) {
        if (this.topicOtherConfigs == null) {
            this.topicOtherConfigs = new ArrayList<>();
        }
        this.topicOtherConfigs.add(topicOtherConfigsItem);
        return this;
    }

    public UpdateInstanceTopicReqTopics withTopicOtherConfigs(
        Consumer<List<UpdateInstanceTopicReqTopicOtherConfigs>> topicOtherConfigsSetter) {
        if (this.topicOtherConfigs == null) {
            this.topicOtherConfigs = new ArrayList<>();
        }
        topicOtherConfigsSetter.accept(this.topicOtherConfigs);
        return this;
    }

    /**
     * **参数解释**： Topic配置。 **约束限制**： 不涉及。
     * @return topicOtherConfigs
     */
    public List<UpdateInstanceTopicReqTopicOtherConfigs> getTopicOtherConfigs() {
        return topicOtherConfigs;
    }

    public void setTopicOtherConfigs(List<UpdateInstanceTopicReqTopicOtherConfigs> topicOtherConfigs) {
        this.topicOtherConfigs = topicOtherConfigs;
    }

    public UpdateInstanceTopicReqTopics withTopicDesc(String topicDesc) {
        this.topicDesc = topicDesc;
        return this;
    }

    /**
     * **参数解释**： Topic描述。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return topicDesc
     */
    public String getTopicDesc() {
        return topicDesc;
    }

    public void setTopicDesc(String topicDesc) {
        this.topicDesc = topicDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateInstanceTopicReqTopics that = (UpdateInstanceTopicReqTopics) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.retentionTime, that.retentionTime)
            && Objects.equals(this.syncReplication, that.syncReplication)
            && Objects.equals(this.syncMessageFlush, that.syncMessageFlush)
            && Objects.equals(this.newPartitionNumbers, that.newPartitionNumbers)
            && Objects.equals(this.newPartitionBrokers, that.newPartitionBrokers)
            && Objects.equals(this.topicOtherConfigs, that.topicOtherConfigs)
            && Objects.equals(this.topicDesc, that.topicDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            retentionTime,
            syncReplication,
            syncMessageFlush,
            newPartitionNumbers,
            newPartitionBrokers,
            topicOtherConfigs,
            topicDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceTopicReqTopics {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    retentionTime: ").append(toIndentedString(retentionTime)).append("\n");
        sb.append("    syncReplication: ").append(toIndentedString(syncReplication)).append("\n");
        sb.append("    syncMessageFlush: ").append(toIndentedString(syncMessageFlush)).append("\n");
        sb.append("    newPartitionNumbers: ").append(toIndentedString(newPartitionNumbers)).append("\n");
        sb.append("    newPartitionBrokers: ").append(toIndentedString(newPartitionBrokers)).append("\n");
        sb.append("    topicOtherConfigs: ").append(toIndentedString(topicOtherConfigs)).append("\n");
        sb.append("    topicDesc: ").append(toIndentedString(topicDesc)).append("\n");
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
