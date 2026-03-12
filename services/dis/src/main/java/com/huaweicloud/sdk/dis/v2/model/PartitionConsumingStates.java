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
 * PartitionConsumingStates
 */
public class PartitionConsumingStates {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_id")

    private String partitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_number")

    private String sequenceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_offset")

    private Long latestOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "earliest_offset")

    private Long earliestOffset;

    /**
     * Checkpoint类型。 - LAST_READ：在数据库中只记录序列号。
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

    /**
     * 分区的当前状态。 - CREATING：创建中 - ACTIVE：可用 - DELETED：删除中 - EXPIRED：已过期
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum EXPIRED for value: "EXPIRED"
         */
        public static final StatusEnum EXPIRED = new StatusEnum("EXPIRED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("ACTIVE", ACTIVE);
            map.put("DELETED", DELETED);
            map.put("EXPIRED", EXPIRED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    public PartitionConsumingStates withPartitionId(String partitionId) {
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

    public PartitionConsumingStates withSequenceNumber(String sequenceNumber) {
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

    public PartitionConsumingStates withLatestOffset(Long latestOffset) {
        this.latestOffset = latestOffset;
        return this;
    }

    /**
     * 索引位置, 最新的一条索引位置。
     * @return latestOffset
     */
    public Long getLatestOffset() {
        return latestOffset;
    }

    public void setLatestOffset(Long latestOffset) {
        this.latestOffset = latestOffset;
    }

    public PartitionConsumingStates withEarliestOffset(Long earliestOffset) {
        this.earliestOffset = earliestOffset;
        return this;
    }

    /**
     * 索引位置, 最早的一条索引位置。
     * @return earliestOffset
     */
    public Long getEarliestOffset() {
        return earliestOffset;
    }

    public void setEarliestOffset(Long earliestOffset) {
        this.earliestOffset = earliestOffset;
    }

    public PartitionConsumingStates withCheckpointType(CheckpointTypeEnum checkpointType) {
        this.checkpointType = checkpointType;
        return this;
    }

    /**
     * Checkpoint类型。 - LAST_READ：在数据库中只记录序列号。
     * @return checkpointType
     */
    public CheckpointTypeEnum getCheckpointType() {
        return checkpointType;
    }

    public void setCheckpointType(CheckpointTypeEnum checkpointType) {
        this.checkpointType = checkpointType;
    }

    public PartitionConsumingStates withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 分区的当前状态。 - CREATING：创建中 - ACTIVE：可用 - DELETED：删除中 - EXPIRED：已过期
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PartitionConsumingStates that = (PartitionConsumingStates) obj;
        return Objects.equals(this.partitionId, that.partitionId)
            && Objects.equals(this.sequenceNumber, that.sequenceNumber)
            && Objects.equals(this.latestOffset, that.latestOffset)
            && Objects.equals(this.earliestOffset, that.earliestOffset)
            && Objects.equals(this.checkpointType, that.checkpointType) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partitionId, sequenceNumber, latestOffset, earliestOffset, checkpointType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartitionConsumingStates {\n");
        sb.append("    partitionId: ").append(toIndentedString(partitionId)).append("\n");
        sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
        sb.append("    latestOffset: ").append(toIndentedString(latestOffset)).append("\n");
        sb.append("    earliestOffset: ").append(toIndentedString(earliestOffset)).append("\n");
        sb.append("    checkpointType: ").append(toIndentedString(checkpointType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
