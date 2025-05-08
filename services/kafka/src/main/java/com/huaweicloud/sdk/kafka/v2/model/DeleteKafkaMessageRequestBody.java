package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * kafka删除消息请求体
 */
public class DeleteKafkaMessageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    private List<PartitionOffsetEntity> partitions = null;

    public DeleteKafkaMessageRequestBody withPartitions(List<PartitionOffsetEntity> partitions) {
        this.partitions = partitions;
        return this;
    }

    public DeleteKafkaMessageRequestBody addPartitionsItem(PartitionOffsetEntity partitionsItem) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        this.partitions.add(partitionsItem);
        return this;
    }

    public DeleteKafkaMessageRequestBody withPartitions(Consumer<List<PartitionOffsetEntity>> partitionsSetter) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        partitionsSetter.accept(this.partitions);
        return this;
    }

    /**
     * 分区消费位点详情
     * @return partitions
     */
    public List<PartitionOffsetEntity> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<PartitionOffsetEntity> partitions) {
        this.partitions = partitions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteKafkaMessageRequestBody that = (DeleteKafkaMessageRequestBody) obj;
        return Objects.equals(this.partitions, that.partitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partitions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteKafkaMessageRequestBody {\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
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
