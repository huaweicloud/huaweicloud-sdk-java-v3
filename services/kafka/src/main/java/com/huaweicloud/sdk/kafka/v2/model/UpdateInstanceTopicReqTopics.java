package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改的topic。
 */
public class UpdateInstanceTopicReqTopics  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retention_time")
    
    private String retentionTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync_replication")
    
    private Boolean syncReplication;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync_message_flush")
    
    private Boolean syncMessageFlush;

    public UpdateInstanceTopicReqTopics withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * topic名称
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateInstanceTopicReqTopics withRetentionTime(String retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    


    /**
     * 老化时间，单位小时。
     * @return retentionTime
     */
    public String getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(String retentionTime) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceTopicReqTopics updateInstanceTopicReqTopics = (UpdateInstanceTopicReqTopics) o;
        return Objects.equals(this.id, updateInstanceTopicReqTopics.id) &&
            Objects.equals(this.retentionTime, updateInstanceTopicReqTopics.retentionTime) &&
            Objects.equals(this.syncReplication, updateInstanceTopicReqTopics.syncReplication) &&
            Objects.equals(this.syncMessageFlush, updateInstanceTopicReqTopics.syncMessageFlush);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, retentionTime, syncReplication, syncMessageFlush);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceTopicReqTopics {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    retentionTime: ").append(toIndentedString(retentionTime)).append("\n");
        sb.append("    syncReplication: ").append(toIndentedString(syncReplication)).append("\n");
        sb.append("    syncMessageFlush: ").append(toIndentedString(syncMessageFlush)).append("\n");
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

