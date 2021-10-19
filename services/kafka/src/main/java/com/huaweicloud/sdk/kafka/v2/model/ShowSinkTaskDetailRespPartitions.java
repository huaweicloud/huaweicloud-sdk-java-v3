package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ShowSinkTaskDetailRespPartitions */
public class ShowSinkTaskDetailRespPartitions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_id")

    private String partitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_transfer_offset")

    private String lastTransferOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_end_offset")

    private String logEndOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lag")

    private String lag;

    public ShowSinkTaskDetailRespPartitions withPartitionId(String partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /** 分区ID。
     * 
     * @return partitionId */
    public String getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(String partitionId) {
        this.partitionId = partitionId;
    }

    public ShowSinkTaskDetailRespPartitions withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 运行状态。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowSinkTaskDetailRespPartitions withLastTransferOffset(String lastTransferOffset) {
        this.lastTransferOffset = lastTransferOffset;
        return this;
    }

    /** 已转储的消息偏移量。
     * 
     * @return lastTransferOffset */
    public String getLastTransferOffset() {
        return lastTransferOffset;
    }

    public void setLastTransferOffset(String lastTransferOffset) {
        this.lastTransferOffset = lastTransferOffset;
    }

    public ShowSinkTaskDetailRespPartitions withLogEndOffset(String logEndOffset) {
        this.logEndOffset = logEndOffset;
        return this;
    }

    /** 消息偏移量。
     * 
     * @return logEndOffset */
    public String getLogEndOffset() {
        return logEndOffset;
    }

    public void setLogEndOffset(String logEndOffset) {
        this.logEndOffset = logEndOffset;
    }

    public ShowSinkTaskDetailRespPartitions withLag(String lag) {
        this.lag = lag;
        return this;
    }

    /** 积压的消息数。
     * 
     * @return lag */
    public String getLag() {
        return lag;
    }

    public void setLag(String lag) {
        this.lag = lag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSinkTaskDetailRespPartitions showSinkTaskDetailRespPartitions = (ShowSinkTaskDetailRespPartitions) o;
        return Objects.equals(this.partitionId, showSinkTaskDetailRespPartitions.partitionId)
            && Objects.equals(this.status, showSinkTaskDetailRespPartitions.status)
            && Objects.equals(this.lastTransferOffset, showSinkTaskDetailRespPartitions.lastTransferOffset)
            && Objects.equals(this.logEndOffset, showSinkTaskDetailRespPartitions.logEndOffset)
            && Objects.equals(this.lag, showSinkTaskDetailRespPartitions.lag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partitionId, status, lastTransferOffset, logEndOffset, lag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSinkTaskDetailRespPartitions {\n");
        sb.append("    partitionId: ").append(toIndentedString(partitionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastTransferOffset: ").append(toIndentedString(lastTransferOffset)).append("\n");
        sb.append("    logEndOffset: ").append(toIndentedString(logEndOffset)).append("\n");
        sb.append("    lag: ").append(toIndentedString(lag)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
