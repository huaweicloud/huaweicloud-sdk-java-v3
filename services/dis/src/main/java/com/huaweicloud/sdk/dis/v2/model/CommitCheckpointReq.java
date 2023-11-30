package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CommitCheckpointReq
 */
public class CommitCheckpointReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    /**
     * Checkpoint类型。  - LAST_READ：在数据库中只记录序列号。
     */
    public static final class CheckpointTypeEnum {

        /**
         * Enum LAST_READ for value: "LAST_READ"
         */
        public static final CheckpointTypeEnum LAST_READ = new CheckpointTypeEnum("LAST_READ");

        private static final Map<String, CheckpointTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CheckpointTypeEnum> createStaticFields() {
            Map<String, CheckpointTypeEnum> map = new HashMap<>();
            map.put("LAST_READ", LAST_READ);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CheckpointTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CheckpointTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CheckpointTypeEnum(value));
        }

        public static CheckpointTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CheckpointTypeEnum) {
                return this.value.equals(((CheckpointTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_type")

    private CheckpointTypeEnum checkpointType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_id")

    private String partitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_number")

    private String sequenceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private String metadata;

    public CommitCheckpointReq withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * APP的名称，用户数据消费程序的唯一标识符，需要先通过创建App接口创建。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public CommitCheckpointReq withCheckpointType(CheckpointTypeEnum checkpointType) {
        this.checkpointType = checkpointType;
        return this;
    }

    /**
     * Checkpoint类型。  - LAST_READ：在数据库中只记录序列号。
     * @return checkpointType
     */
    public CheckpointTypeEnum getCheckpointType() {
        return checkpointType;
    }

    public void setCheckpointType(CheckpointTypeEnum checkpointType) {
        this.checkpointType = checkpointType;
    }

    public CommitCheckpointReq withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 已创建的通道名称。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public CommitCheckpointReq withPartitionId(String partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * 通道的分区标识符。 可定义为如下两种样式： - shardId-0000000000 - 0 比如一个通道有三个分区，那么分区标识符分别为0, 1, 2，或者shardId-0000000000, shardId-0000000001, shardId-0000000002
     * @return partitionId
     */
    public String getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(String partitionId) {
        this.partitionId = partitionId;
    }

    public CommitCheckpointReq withSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * 需要提交的序列号，用来记录该通道的消费检查点，需要保证该序列号处于有效范围内。
     * @return sequenceNumber
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public CommitCheckpointReq withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * 用户消费程序端的元数据信息。  元数据信息的最大长度为1000个字符。
     * @return metadata
     */
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommitCheckpointReq that = (CommitCheckpointReq) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.checkpointType, that.checkpointType)
            && Objects.equals(this.streamName, that.streamName) && Objects.equals(this.partitionId, that.partitionId)
            && Objects.equals(this.sequenceNumber, that.sequenceNumber) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName, checkpointType, streamName, partitionId, sequenceNumber, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitCheckpointReq {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    checkpointType: ").append(toIndentedString(checkpointType)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    partitionId: ").append(toIndentedString(partitionId)).append("\n");
        sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
