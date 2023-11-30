package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowStreamRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_partitionId")

    private String startPartitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_partitions")

    private Integer limitPartitions;

    public ShowStreamRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 需要查询的通道名称。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public ShowStreamRequest withStartPartitionId(String startPartitionId) {
        this.startPartitionId = startPartitionId;
        return this;
    }

    /**
     * 从该分区值开始返回分区列表，返回的分区列表不包括此分区。
     * @return startPartitionId
     */
    public String getStartPartitionId() {
        return startPartitionId;
    }

    public void setStartPartitionId(String startPartitionId) {
        this.startPartitionId = startPartitionId;
    }

    public ShowStreamRequest withLimitPartitions(Integer limitPartitions) {
        this.limitPartitions = limitPartitions;
        return this;
    }

    /**
     * 单次请求返回的最大分区数。
     * minimum: 1
     * maximum: 1000
     * @return limitPartitions
     */
    public Integer getLimitPartitions() {
        return limitPartitions;
    }

    public void setLimitPartitions(Integer limitPartitions) {
        this.limitPartitions = limitPartitions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStreamRequest that = (ShowStreamRequest) obj;
        return Objects.equals(this.streamName, that.streamName)
            && Objects.equals(this.startPartitionId, that.startPartitionId)
            && Objects.equals(this.limitPartitions, that.limitPartitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, startPartitionId, limitPartitions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStreamRequest {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    startPartitionId: ").append(toIndentedString(startPartitionId)).append("\n");
        sb.append("    limitPartitions: ").append(toIndentedString(limitPartitions)).append("\n");
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
