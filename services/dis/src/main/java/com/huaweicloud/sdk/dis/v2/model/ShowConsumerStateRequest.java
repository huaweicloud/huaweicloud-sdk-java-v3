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
public class ShowConsumerStateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_partition_id")

    private String startPartitionId;

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

    public ShowConsumerStateRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 需要查询的App名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ShowConsumerStateRequest withStreamName(String streamName) {
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

    public ShowConsumerStateRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次请求返回的最大分区数。最小值是1，最大值是1000；默认值是100。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowConsumerStateRequest withStartPartitionId(String startPartitionId) {
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

    public ShowConsumerStateRequest withCheckpointType(CheckpointTypeEnum checkpointType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConsumerStateRequest that = (ShowConsumerStateRequest) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.streamName, that.streamName)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.startPartitionId, that.startPartitionId)
            && Objects.equals(this.checkpointType, that.checkpointType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName, streamName, limit, startPartitionId, checkpointType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConsumerStateRequest {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    startPartitionId: ").append(toIndentedString(startPartitionId)).append("\n");
        sb.append("    checkpointType: ").append(toIndentedString(checkpointType)).append("\n");
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
