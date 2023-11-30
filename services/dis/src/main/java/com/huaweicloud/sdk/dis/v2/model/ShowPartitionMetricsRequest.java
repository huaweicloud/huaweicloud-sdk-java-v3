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
public class ShowPartitionMetricsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_id")

    private String partitionId;

    /**
     * 分区监控指标。（label与label_list必须二选一，label_list与label同时存在时，以label_list为准）  - total_put_bytes_per_partition：分区总输入流量（Byte） - total_get_bytes_per_partition：分区总输出流量（Byte） - total_put_records_per_partition：分区总输入记录数（个） - total_get_records_per_partition：分区总输出记录数（个）
     */
    public static final class LabelEnum {

        /**
         * Enum TOTAL_PUT_BYTES_PER_PARTITION for value: "total_put_bytes_per_partition"
         */
        public static final LabelEnum TOTAL_PUT_BYTES_PER_PARTITION = new LabelEnum("total_put_bytes_per_partition");

        /**
         * Enum TOTAL_GET_BYTES_PER_PARTITION for value: "total_get_bytes_per_partition"
         */
        public static final LabelEnum TOTAL_GET_BYTES_PER_PARTITION = new LabelEnum("total_get_bytes_per_partition");

        /**
         * Enum TOTAL_PUT_RECORDS_PER_PARTITION for value: "total_put_records_per_partition"
         */
        public static final LabelEnum TOTAL_PUT_RECORDS_PER_PARTITION =
            new LabelEnum("total_put_records_per_partition");

        /**
         * Enum TOTAL_GET_RECORDS_PER_PARTITION for value: "total_get_records_per_partition"
         */
        public static final LabelEnum TOTAL_GET_RECORDS_PER_PARTITION =
            new LabelEnum("total_get_records_per_partition");

        private static final Map<String, LabelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LabelEnum> createStaticFields() {
            Map<String, LabelEnum> map = new HashMap<>();
            map.put("total_put_bytes_per_partition", TOTAL_PUT_BYTES_PER_PARTITION);
            map.put("total_get_bytes_per_partition", TOTAL_GET_BYTES_PER_PARTITION);
            map.put("total_put_records_per_partition", TOTAL_PUT_RECORDS_PER_PARTITION);
            map.put("total_get_records_per_partition", TOTAL_GET_RECORDS_PER_PARTITION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LabelEnum(String value) {
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
        public static LabelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LabelEnum(value));
        }

        public static LabelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LabelEnum) {
                return this.value.equals(((LabelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private LabelEnum label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_list")

    private String labelList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ShowPartitionMetricsRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 通道名称。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public ShowPartitionMetricsRequest withPartitionId(String partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * 分区编号。 可定义为如下两种样式： - shardId-0000000000 - 0 比如一个通道有三个分区，那么分区标识符分别为0, 1, 2，或者shardId-0000000000, shardId-0000000001, shardId-0000000002
     * @return partitionId
     */
    public String getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(String partitionId) {
        this.partitionId = partitionId;
    }

    public ShowPartitionMetricsRequest withLabel(LabelEnum label) {
        this.label = label;
        return this;
    }

    /**
     * 分区监控指标。（label与label_list必须二选一，label_list与label同时存在时，以label_list为准）  - total_put_bytes_per_partition：分区总输入流量（Byte） - total_get_bytes_per_partition：分区总输出流量（Byte） - total_put_records_per_partition：分区总输入记录数（个） - total_get_records_per_partition：分区总输出记录数（个）
     * @return label
     */
    public LabelEnum getLabel() {
        return label;
    }

    public void setLabel(LabelEnum label) {
        this.label = label;
    }

    public ShowPartitionMetricsRequest withLabelList(String labelList) {
        this.labelList = labelList;
        return this;
    }

    /**
     * 使用label用逗号拼接组成，用于批量查询多个label的指标。（label与label_list必须二选一，label_list与label同时存在时，以label_list为准）
     * @return labelList
     */
    public String getLabelList() {
        return labelList;
    }

    public void setLabelList(String labelList) {
        this.labelList = labelList;
    }

    public ShowPartitionMetricsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 监控开始时间点，10位时间戳。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowPartitionMetricsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 监控结束时间点，10位时间戳。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPartitionMetricsRequest that = (ShowPartitionMetricsRequest) obj;
        return Objects.equals(this.streamName, that.streamName) && Objects.equals(this.partitionId, that.partitionId)
            && Objects.equals(this.label, that.label) && Objects.equals(this.labelList, that.labelList)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, partitionId, label, labelList, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPartitionMetricsRequest {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    partitionId: ").append(toIndentedString(partitionId)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
