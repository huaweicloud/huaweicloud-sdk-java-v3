package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListInstanceTopicsRespTopics
 */
public class ListInstanceTopicsRespTopics  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication")
    
    private Integer replication;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync_message_flush")
    
    private Boolean syncMessageFlush;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="partition")
    
    private Integer partition;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync_replication")
    
    private Boolean syncReplication;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retention_time")
    
    private Integer retentionTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;

    public ListInstanceTopicsRespTopics withReplication(Integer replication) {
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

    public ListInstanceTopicsRespTopics withSyncMessageFlush(Boolean syncMessageFlush) {
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

    public ListInstanceTopicsRespTopics withPartition(Integer partition) {
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

    public ListInstanceTopicsRespTopics withSyncReplication(Boolean syncReplication) {
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

    public ListInstanceTopicsRespTopics withRetentionTime(Integer retentionTime) {
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

    public ListInstanceTopicsRespTopics withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * topic名称。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstanceTopicsRespTopics listInstanceTopicsRespTopics = (ListInstanceTopicsRespTopics) o;
        return Objects.equals(this.replication, listInstanceTopicsRespTopics.replication) &&
            Objects.equals(this.syncMessageFlush, listInstanceTopicsRespTopics.syncMessageFlush) &&
            Objects.equals(this.partition, listInstanceTopicsRespTopics.partition) &&
            Objects.equals(this.syncReplication, listInstanceTopicsRespTopics.syncReplication) &&
            Objects.equals(this.retentionTime, listInstanceTopicsRespTopics.retentionTime) &&
            Objects.equals(this.id, listInstanceTopicsRespTopics.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(replication, syncMessageFlush, partition, syncReplication, retentionTime, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceTopicsRespTopics {\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
        sb.append("    syncMessageFlush: ").append(toIndentedString(syncMessageFlush)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    syncReplication: ").append(toIndentedString(syncReplication)).append("\n");
        sb.append("    retentionTime: ").append(toIndentedString(retentionTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

