package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConsumerCheckpointInfo
 */
public class ConsumerCheckpointInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint")

    private Long checkpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_group_name")

    private String consumerGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_name")

    private String consumerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_id")

    private String shardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public ConsumerCheckpointInfo withCheckpoint(Long checkpoint) {
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

    public ConsumerCheckpointInfo withConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }

    /**
     * 消费组名
     * @return consumerGroupName
     */
    public String getConsumerGroupName() {
        return consumerGroupName;
    }

    public void setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
    }

    public ConsumerCheckpointInfo withConsumerName(String consumerName) {
        this.consumerName = consumerName;
        return this;
    }

    /**
     * 消费者名
     * @return consumerName
     */
    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public ConsumerCheckpointInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ConsumerCheckpointInfo withShardId(String shardId) {
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

    public ConsumerCheckpointInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsumerCheckpointInfo that = (ConsumerCheckpointInfo) obj;
        return Objects.equals(this.checkpoint, that.checkpoint)
            && Objects.equals(this.consumerGroupName, that.consumerGroupName)
            && Objects.equals(this.consumerName, that.consumerName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.shardId, that.shardId) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkpoint, consumerGroupName, consumerName, projectId, shardId, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumerCheckpointInfo {\n");
        sb.append("    checkpoint: ").append(toIndentedString(checkpoint)).append("\n");
        sb.append("    consumerGroupName: ").append(toIndentedString(consumerGroupName)).append("\n");
        sb.append("    consumerName: ").append(toIndentedString(consumerName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    shardId: ").append(toIndentedString(shardId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
