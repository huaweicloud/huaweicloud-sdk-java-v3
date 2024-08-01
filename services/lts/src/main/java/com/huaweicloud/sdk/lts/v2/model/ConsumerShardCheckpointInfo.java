package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConsumerShardCheckpointInfo
 */
public class ConsumerShardCheckpointInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_id")

    private String shardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint")

    private Long checkpoint;

    public ConsumerShardCheckpointInfo withShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * 日志Shard ID
     * @return shardId
     */
    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public ConsumerShardCheckpointInfo withCheckpoint(Long checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }

    /**
     * 游标值
     * @return checkpoint
     */
    public Long getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(Long checkpoint) {
        this.checkpoint = checkpoint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsumerShardCheckpointInfo that = (ConsumerShardCheckpointInfo) obj;
        return Objects.equals(this.shardId, that.shardId) && Objects.equals(this.checkpoint, that.checkpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shardId, checkpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumerShardCheckpointInfo {\n");
        sb.append("    shardId: ").append(toIndentedString(shardId)).append("\n");
        sb.append("    checkpoint: ").append(toIndentedString(checkpoint)).append("\n");
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
