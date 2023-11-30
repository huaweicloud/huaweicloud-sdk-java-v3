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
 * PartitionResult
 */
public class PartitionResult {

    /**
     * 分区的当前状态。  - CREATING：创建中 - ACTIVE：可用 - DELETED：删除中 - EXPIRED：已过期
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_id")

    private String partitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash_range")

    private String hashRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_number_range")

    private String sequenceNumberRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_partitions")

    private String parentPartitions;

    public PartitionResult withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 分区的当前状态。  - CREATING：创建中 - ACTIVE：可用 - DELETED：删除中 - EXPIRED：已过期
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public PartitionResult withPartitionId(String partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * 分区的唯一标识符。
     * @return partitionId
     */
    public String getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(String partitionId) {
        this.partitionId = partitionId;
    }

    public PartitionResult withHashRange(String hashRange) {
        this.hashRange = hashRange;
        return this;
    }

    /**
     * 分区的可能哈希键值范围。
     * @return hashRange
     */
    public String getHashRange() {
        return hashRange;
    }

    public void setHashRange(String hashRange) {
        this.hashRange = hashRange;
    }

    public PartitionResult withSequenceNumberRange(String sequenceNumberRange) {
        this.sequenceNumberRange = sequenceNumberRange;
        return this;
    }

    /**
     * 分区的序列号范围。
     * @return sequenceNumberRange
     */
    public String getSequenceNumberRange() {
        return sequenceNumberRange;
    }

    public void setSequenceNumberRange(String sequenceNumberRange) {
        this.sequenceNumberRange = sequenceNumberRange;
    }

    public PartitionResult withParentPartitions(String parentPartitions) {
        this.parentPartitions = parentPartitions;
        return this;
    }

    /**
     * 父分区。
     * @return parentPartitions
     */
    public String getParentPartitions() {
        return parentPartitions;
    }

    public void setParentPartitions(String parentPartitions) {
        this.parentPartitions = parentPartitions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PartitionResult that = (PartitionResult) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.partitionId, that.partitionId)
            && Objects.equals(this.hashRange, that.hashRange)
            && Objects.equals(this.sequenceNumberRange, that.sequenceNumberRange)
            && Objects.equals(this.parentPartitions, that.parentPartitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, partitionId, hashRange, sequenceNumberRange, parentPartitions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartitionResult {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    partitionId: ").append(toIndentedString(partitionId)).append("\n");
        sb.append("    hashRange: ").append(toIndentedString(hashRange)).append("\n");
        sb.append("    sequenceNumberRange: ").append(toIndentedString(sequenceNumberRange)).append("\n");
        sb.append("    parentPartitions: ").append(toIndentedString(parentPartitions)).append("\n");
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
