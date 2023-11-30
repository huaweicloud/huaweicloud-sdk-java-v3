package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdatePartitionCountReq
 */
public class UpdatePartitionCountReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_partition_count")

    private Integer targetPartitionCount;

    public UpdatePartitionCountReq withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 需要变更分区数量的通道名称。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public UpdatePartitionCountReq withTargetPartitionCount(Integer targetPartitionCount) {
        this.targetPartitionCount = targetPartitionCount;
        return this;
    }

    /**
     * 变更的目标分区数量。  取值为大于0的整数。  设置的值大于当前分区数量表示扩容，小于当前分区数量表示缩容。  注意：  每个通道在一小时内扩容和缩容总次数最多5次，且一小时内扩容或缩容操作有一次成功则最近一小时内不允许再次进行扩容或缩容操作。
     * minimum: 0
     * @return targetPartitionCount
     */
    public Integer getTargetPartitionCount() {
        return targetPartitionCount;
    }

    public void setTargetPartitionCount(Integer targetPartitionCount) {
        this.targetPartitionCount = targetPartitionCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePartitionCountReq that = (UpdatePartitionCountReq) obj;
        return Objects.equals(this.streamName, that.streamName)
            && Objects.equals(this.targetPartitionCount, that.targetPartitionCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, targetPartitionCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePartitionCountReq {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    targetPartitionCount: ").append(toIndentedString(targetPartitionCount)).append("\n");
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
