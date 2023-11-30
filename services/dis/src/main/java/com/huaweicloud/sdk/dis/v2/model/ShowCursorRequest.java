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
public class ShowCursorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream-name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition-id")

    private String partitionId;

    /**
     * 游标类型。  - AT_SEQUENCE_NUMBER：从特定序列号（即starting-sequence-number定义的序列号）所在的记录开始读取数据。此类型为默认游标类型。  - AFTER_SEQUENCE_NUMBER：从特定序列号（即starting-sequence-number定义的序列号）后的记录开始读取数据。  - TRIM_HORIZON：从最早被存储至分区的有效记录开始读取。例如，某租户使用DIS的通道，分别上传了三条数据A1，A2，A3。N天后（设定A1已过期，A2和A3仍在有效期范围内），该租户需要下载此三条数据，并选择了TRIM_HORIZON这种下载方式。那么用户可下载的数据将从A2开始读取。  - LATEST：从分区中的最新记录开始读取，此设置可以保证你总是读到分区中最新记录。  - AT_TIMESTAMP：从特定时间戳（即timestamp定义的时间戳）开始读取。
     */
    public static final class CursorTypeEnum {

        /**
         * Enum AT_SEQUENCE_NUMBER for value: "AT_SEQUENCE_NUMBER"
         */
        public static final CursorTypeEnum AT_SEQUENCE_NUMBER = new CursorTypeEnum("AT_SEQUENCE_NUMBER");

        /**
         * Enum AFTER_SEQUENCE_NUMBER for value: "AFTER_SEQUENCE_NUMBER"
         */
        public static final CursorTypeEnum AFTER_SEQUENCE_NUMBER = new CursorTypeEnum("AFTER_SEQUENCE_NUMBER");

        /**
         * Enum TRIM_HORIZON for value: "TRIM_HORIZON"
         */
        public static final CursorTypeEnum TRIM_HORIZON = new CursorTypeEnum("TRIM_HORIZON");

        /**
         * Enum LATEST for value: "LATEST"
         */
        public static final CursorTypeEnum LATEST = new CursorTypeEnum("LATEST");

        /**
         * Enum AT_TIMESTAMP for value: "AT_TIMESTAMP"
         */
        public static final CursorTypeEnum AT_TIMESTAMP = new CursorTypeEnum("AT_TIMESTAMP");

        private static final Map<String, CursorTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CursorTypeEnum> createStaticFields() {
            Map<String, CursorTypeEnum> map = new HashMap<>();
            map.put("AT_SEQUENCE_NUMBER", AT_SEQUENCE_NUMBER);
            map.put("AFTER_SEQUENCE_NUMBER", AFTER_SEQUENCE_NUMBER);
            map.put("TRIM_HORIZON", TRIM_HORIZON);
            map.put("LATEST", LATEST);
            map.put("AT_TIMESTAMP", AT_TIMESTAMP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CursorTypeEnum(String value) {
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
        public static CursorTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CursorTypeEnum(value));
        }

        public static CursorTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CursorTypeEnum) {
                return this.value.equals(((CursorTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cursor-type")

    private CursorTypeEnum cursorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starting-sequence-number")

    private String startingSequenceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    public ShowCursorRequest withStreamName(String streamName) {
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

    public ShowCursorRequest withPartitionId(String partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * 通道的分区标识符。  可定义为如下两种样式：  - shardId-0000000000 - 0  比如一个通道有三个分区，那么分区标识符分别为0, 1, 2，或者shardId-0000000000, shardId-0000000001, shardId-0000000002
     * @return partitionId
     */
    public String getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(String partitionId) {
        this.partitionId = partitionId;
    }

    public ShowCursorRequest withCursorType(CursorTypeEnum cursorType) {
        this.cursorType = cursorType;
        return this;
    }

    /**
     * 游标类型。  - AT_SEQUENCE_NUMBER：从特定序列号（即starting-sequence-number定义的序列号）所在的记录开始读取数据。此类型为默认游标类型。  - AFTER_SEQUENCE_NUMBER：从特定序列号（即starting-sequence-number定义的序列号）后的记录开始读取数据。  - TRIM_HORIZON：从最早被存储至分区的有效记录开始读取。例如，某租户使用DIS的通道，分别上传了三条数据A1，A2，A3。N天后（设定A1已过期，A2和A3仍在有效期范围内），该租户需要下载此三条数据，并选择了TRIM_HORIZON这种下载方式。那么用户可下载的数据将从A2开始读取。  - LATEST：从分区中的最新记录开始读取，此设置可以保证你总是读到分区中最新记录。  - AT_TIMESTAMP：从特定时间戳（即timestamp定义的时间戳）开始读取。
     * @return cursorType
     */
    public CursorTypeEnum getCursorType() {
        return cursorType;
    }

    public void setCursorType(CursorTypeEnum cursorType) {
        this.cursorType = cursorType;
    }

    public ShowCursorRequest withStartingSequenceNumber(String startingSequenceNumber) {
        this.startingSequenceNumber = startingSequenceNumber;
        return this;
    }

    /**
     * 序列号。序列号是每个记录的唯一标识符。序列号由DIS在数据生产者调用PutRecords操作以添加数据到DIS数据通道时DIS服务自动分配的。同一分区键的序列号通常会随时间变化增加。PutRecords请求之间的时间段越长，序列号越大。  序列号与游标类型AT_SEQUENCE_NUMBER和AFTER_SEQUENCE_NUMBER强相关，二者共同确定读取数据的位置。  取值范围：0~9223372036854775807。
     * @return startingSequenceNumber
     */
    public String getStartingSequenceNumber() {
        return startingSequenceNumber;
    }

    public void setStartingSequenceNumber(String startingSequenceNumber) {
        this.startingSequenceNumber = startingSequenceNumber;
    }

    public ShowCursorRequest withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 开始读取数据记录的时间戳，与游标类型AT_TIMESTAMP强相关，二者共同确定读取数据的位置。  说明：  此时间戳精确到毫秒。
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCursorRequest that = (ShowCursorRequest) obj;
        return Objects.equals(this.streamName, that.streamName) && Objects.equals(this.partitionId, that.partitionId)
            && Objects.equals(this.cursorType, that.cursorType)
            && Objects.equals(this.startingSequenceNumber, that.startingSequenceNumber)
            && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, partitionId, cursorType, startingSequenceNumber, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCursorRequest {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    partitionId: ").append(toIndentedString(partitionId)).append("\n");
        sb.append("    cursorType: ").append(toIndentedString(cursorType)).append("\n");
        sb.append("    startingSequenceNumber: ").append(toIndentedString(startingSequenceNumber)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
