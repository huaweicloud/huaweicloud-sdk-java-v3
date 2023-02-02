package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TopicEntity
 */
public class TopicEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policiesOnly")

    private Boolean policiesOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication")

    private Integer replication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Integer partition;

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
    @JsonProperty(value = "external_configs")

    private Object externalConfigs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_type")

    private Integer topicType;

    public TopicEntity withPoliciesOnly(Boolean policiesOnly) {
        this.policiesOnly = policiesOnly;
        return this;
    }

    /**
     * 是否为默认策略。
     * @return policiesOnly
     */
    public Boolean getPoliciesOnly() {
        return policiesOnly;
    }

    public void setPoliciesOnly(Boolean policiesOnly) {
        this.policiesOnly = policiesOnly;
    }

    public TopicEntity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * topic名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TopicEntity withReplication(Integer replication) {
        this.replication = replication;
        return this;
    }

    /**
     * 副本数，配置数据的可靠性。
     * @return replication
     */
    public Integer getReplication() {
        return replication;
    }

    public void setReplication(Integer replication) {
        this.replication = replication;
    }

    public TopicEntity withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /**
     * topic分区数，设置消费的并发数。
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public TopicEntity withRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    /**
     * 消息老化时间。
     * @return retentionTime
     */
    public Integer getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
    }

    public TopicEntity withSyncReplication(Boolean syncReplication) {
        this.syncReplication = syncReplication;
        return this;
    }

    /**
     * 是否开启同步复制，开启后，客户端生产消息时相应的也要设置acks=-1，否则不生效，默认关闭。
     * @return syncReplication
     */
    public Boolean getSyncReplication() {
        return syncReplication;
    }

    public void setSyncReplication(Boolean syncReplication) {
        this.syncReplication = syncReplication;
    }

    public TopicEntity withSyncMessageFlush(Boolean syncMessageFlush) {
        this.syncMessageFlush = syncMessageFlush;
        return this;
    }

    /**
     * 是否使用同步落盘。默认值为false。同步落盘会导致性能降低。
     * @return syncMessageFlush
     */
    public Boolean getSyncMessageFlush() {
        return syncMessageFlush;
    }

    public void setSyncMessageFlush(Boolean syncMessageFlush) {
        this.syncMessageFlush = syncMessageFlush;
    }

    public TopicEntity withExternalConfigs(Object externalConfigs) {
        this.externalConfigs = externalConfigs;
        return this;
    }

    /**
     * 扩展配置。
     * @return externalConfigs
     */
    public Object getExternalConfigs() {
        return externalConfigs;
    }

    public void setExternalConfigs(Object externalConfigs) {
        this.externalConfigs = externalConfigs;
    }

    public TopicEntity withTopicType(Integer topicType) {
        this.topicType = topicType;
        return this;
    }

    /**
     * topic类型(0:普通Topic 1:系统(内部)Topic)。
     * @return topicType
     */
    public Integer getTopicType() {
        return topicType;
    }

    public void setTopicType(Integer topicType) {
        this.topicType = topicType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopicEntity topicEntity = (TopicEntity) o;
        return Objects.equals(this.policiesOnly, topicEntity.policiesOnly)
            && Objects.equals(this.name, topicEntity.name) && Objects.equals(this.replication, topicEntity.replication)
            && Objects.equals(this.partition, topicEntity.partition)
            && Objects.equals(this.retentionTime, topicEntity.retentionTime)
            && Objects.equals(this.syncReplication, topicEntity.syncReplication)
            && Objects.equals(this.syncMessageFlush, topicEntity.syncMessageFlush)
            && Objects.equals(this.externalConfigs, topicEntity.externalConfigs)
            && Objects.equals(this.topicType, topicEntity.topicType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policiesOnly,
            name,
            replication,
            partition,
            retentionTime,
            syncReplication,
            syncMessageFlush,
            externalConfigs,
            topicType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicEntity {\n");
        sb.append("    policiesOnly: ").append(toIndentedString(policiesOnly)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    retentionTime: ").append(toIndentedString(retentionTime)).append("\n");
        sb.append("    syncReplication: ").append(toIndentedString(syncReplication)).append("\n");
        sb.append("    syncMessageFlush: ").append(toIndentedString(syncMessageFlush)).append("\n");
        sb.append("    externalConfigs: ").append(toIndentedString(externalConfigs)).append("\n");
        sb.append("    topicType: ").append(toIndentedString(topicType)).append("\n");
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
