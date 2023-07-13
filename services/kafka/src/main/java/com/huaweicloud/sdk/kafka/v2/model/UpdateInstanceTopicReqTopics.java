package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改的topic。
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

    public UpdateInstanceTopicReqTopics withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * topic名称，不支持修改。
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
     * 老化时间，单位小时。
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
     * 是否同步复制。
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
     * 是否同步落盘。
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
     * 分区数。
     * @return newPartitionNumbers
     */
    public Integer getNewPartitionNumbers() {
        return newPartitionNumbers;
    }

    public void setNewPartitionNumbers(Integer newPartitionNumbers) {
        this.newPartitionNumbers = newPartitionNumbers;
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
            && Objects.equals(this.newPartitionNumbers, that.newPartitionNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, retentionTime, syncReplication, syncMessageFlush, newPartitionNumbers);
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
