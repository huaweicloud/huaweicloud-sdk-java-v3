package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateInstanceTopicReq
 */
public class CreateInstanceTopicReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication")

    private Integer replication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_message_flush")

    private Boolean syncMessageFlush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_replication")

    private Boolean syncReplication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_time")

    private Integer retentionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_other_configs")

    private List<CreateInstanceTopicReqTopicOtherConfigs> topicOtherConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_desc")

    private String topicDesc;

    public CreateInstanceTopicReq withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * topic名称，长度为3-200，以字母开头且只支持大小写字母、中横线、下划线、点以及数字。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateInstanceTopicReq withReplication(Integer replication) {
        this.replication = replication;
        return this;
    }

    /**
     * 副本数，配置数据的可靠性。 取值范围：1-3。
     * minimum: 1
     * maximum: 3
     * @return replication
     */
    public Integer getReplication() {
        return replication;
    }

    public void setReplication(Integer replication) {
        this.replication = replication;
    }

    public CreateInstanceTopicReq withSyncMessageFlush(Boolean syncMessageFlush) {
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

    public CreateInstanceTopicReq withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /**
     * topic分区数，设置消费的并发数。 取值范围：[1-100](tag:hws,hws_hk,otc,hws_ocb,ctc,sbc,hk_sbc,g42,tm,hk_g42,hk_tm)[1-20](tag:cmcc)。
     * minimum: 1
     * maximum: 100
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public CreateInstanceTopicReq withSyncReplication(Boolean syncReplication) {
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

    public CreateInstanceTopicReq withRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    /**
     * 消息老化时间。默认值为72。 取值范围[1~168](tag:hws,hws_hk,hws_ocb,ctc,sbc,hk_sbc,hws_eu,g42,tm,hk_g42,hk_tm)[1-720](tag:ocb,otc)，单位小时。
     * @return retentionTime
     */
    public Integer getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
    }

    public CreateInstanceTopicReq withTopicOtherConfigs(
        List<CreateInstanceTopicReqTopicOtherConfigs> topicOtherConfigs) {
        this.topicOtherConfigs = topicOtherConfigs;
        return this;
    }

    public CreateInstanceTopicReq addTopicOtherConfigsItem(
        CreateInstanceTopicReqTopicOtherConfigs topicOtherConfigsItem) {
        if (this.topicOtherConfigs == null) {
            this.topicOtherConfigs = new ArrayList<>();
        }
        this.topicOtherConfigs.add(topicOtherConfigsItem);
        return this;
    }

    public CreateInstanceTopicReq withTopicOtherConfigs(
        Consumer<List<CreateInstanceTopicReqTopicOtherConfigs>> topicOtherConfigsSetter) {
        if (this.topicOtherConfigs == null) {
            this.topicOtherConfigs = new ArrayList<>();
        }
        topicOtherConfigsSetter.accept(this.topicOtherConfigs);
        return this;
    }

    /**
     * topic配置
     * @return topicOtherConfigs
     */
    public List<CreateInstanceTopicReqTopicOtherConfigs> getTopicOtherConfigs() {
        return topicOtherConfigs;
    }

    public void setTopicOtherConfigs(List<CreateInstanceTopicReqTopicOtherConfigs> topicOtherConfigs) {
        this.topicOtherConfigs = topicOtherConfigs;
    }

    public CreateInstanceTopicReq withTopicDesc(String topicDesc) {
        this.topicDesc = topicDesc;
        return this;
    }

    /**
     * topic描述
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
        CreateInstanceTopicReq that = (CreateInstanceTopicReq) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.replication, that.replication)
            && Objects.equals(this.syncMessageFlush, that.syncMessageFlush)
            && Objects.equals(this.partition, that.partition)
            && Objects.equals(this.syncReplication, that.syncReplication)
            && Objects.equals(this.retentionTime, that.retentionTime)
            && Objects.equals(this.topicOtherConfigs, that.topicOtherConfigs)
            && Objects.equals(this.topicDesc, that.topicDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            replication,
            syncMessageFlush,
            partition,
            syncReplication,
            retentionTime,
            topicOtherConfigs,
            topicDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceTopicReq {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
        sb.append("    syncMessageFlush: ").append(toIndentedString(syncMessageFlush)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    syncReplication: ").append(toIndentedString(syncReplication)).append("\n");
        sb.append("    retentionTime: ").append(toIndentedString(retentionTime)).append("\n");
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
