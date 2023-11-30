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
 * Request Object
 */
public class DeleteCheckpointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    /**
     * Checkpoint类型。  LAST_READ：在数据库中只记录序列号。
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
    @JsonProperty(value = "partition_id")

    private String partitionId;

    public DeleteCheckpointRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 该Checkpoint所属的通道名称。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public DeleteCheckpointRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 该Checkpoint关联App名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public DeleteCheckpointRequest withCheckpointType(CheckpointTypeEnum checkpointType) {
        this.checkpointType = checkpointType;
        return this;
    }

    /**
     * Checkpoint类型。  LAST_READ：在数据库中只记录序列号。
     * @return checkpointType
     */
    public CheckpointTypeEnum getCheckpointType() {
        return checkpointType;
    }

    public void setCheckpointType(CheckpointTypeEnum checkpointType) {
        this.checkpointType = checkpointType;
    }

    public DeleteCheckpointRequest withPartitionId(String partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * 该Checkpoint所属的通道分区标识符。  可定义为如下两种样式：  - shardId-0000000000 - 0  比如一个通道有三个分区，那么分区标识符分别为0, 1, 2，或者shardId-0000000000, shardId-0000000001, shardId-0000000002
     * @return partitionId
     */
    public String getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(String partitionId) {
        this.partitionId = partitionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCheckpointRequest that = (DeleteCheckpointRequest) obj;
        return Objects.equals(this.streamName, that.streamName) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.checkpointType, that.checkpointType)
            && Objects.equals(this.partitionId, that.partitionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, appName, checkpointType, partitionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCheckpointRequest {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    checkpointType: ").append(toIndentedString(checkpointType)).append("\n");
        sb.append("    partitionId: ").append(toIndentedString(partitionId)).append("\n");
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
