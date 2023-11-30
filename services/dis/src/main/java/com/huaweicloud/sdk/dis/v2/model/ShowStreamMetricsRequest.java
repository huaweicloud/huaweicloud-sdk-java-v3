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
public class ShowStreamMetricsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    /**
     * 通道监控指标。（label与label_list必须二选一，label_list与label同时存在时，以label_list为准）  - total_put_bytes_per_stream：总输入流量（Byte） - total_get_bytes_per_stream：总输出流量（Byte） - total_put_records_per_stream：总输入记录数（个） - total_get_records_per_stream：总输出记录数（个） - total_put_req_latency：上传请求平均处理时间（毫秒） - total_get_req_latency：下载请求平均处理时间（毫秒） - total_put_req_suc_per_stream：上传请求成功次数（个） - total_get_req_suc_per_stream：下载请求成功次数（个） - traffic_control_put：因流控拒绝的上传请求次数 （个） - traffic_control_get：因流控拒绝的下载请求次数 （个）
     */
    public static final class LabelEnum {

        /**
         * Enum TOTAL_PUT_BYTES_PER_STREAM for value: "total_put_bytes_per_stream"
         */
        public static final LabelEnum TOTAL_PUT_BYTES_PER_STREAM = new LabelEnum("total_put_bytes_per_stream");

        /**
         * Enum TOTAL_GET_BYTES_PER_STREAM for value: "total_get_bytes_per_stream"
         */
        public static final LabelEnum TOTAL_GET_BYTES_PER_STREAM = new LabelEnum("total_get_bytes_per_stream");

        /**
         * Enum TOTAL_PUT_RECORDS_PER_STREAM for value: "total_put_records_per_stream"
         */
        public static final LabelEnum TOTAL_PUT_RECORDS_PER_STREAM = new LabelEnum("total_put_records_per_stream");

        /**
         * Enum TOTAL_GET_RECORDS_PER_STREAM for value: "total_get_records_per_stream"
         */
        public static final LabelEnum TOTAL_GET_RECORDS_PER_STREAM = new LabelEnum("total_get_records_per_stream");

        /**
         * Enum TOTAL_PUT_REQ_LATENCY for value: "total_put_req_latency"
         */
        public static final LabelEnum TOTAL_PUT_REQ_LATENCY = new LabelEnum("total_put_req_latency");

        /**
         * Enum TOTAL_GET_REQ_LATENCY for value: "total_get_req_latency"
         */
        public static final LabelEnum TOTAL_GET_REQ_LATENCY = new LabelEnum("total_get_req_latency");

        /**
         * Enum TOTAL_PUT_REQ_SUC_PER_STREAM for value: "total_put_req_suc_per_stream"
         */
        public static final LabelEnum TOTAL_PUT_REQ_SUC_PER_STREAM = new LabelEnum("total_put_req_suc_per_stream");

        /**
         * Enum TOTAL_GET_REQ_SUC_PER_STREAM for value: "total_get_req_suc_per_stream"
         */
        public static final LabelEnum TOTAL_GET_REQ_SUC_PER_STREAM = new LabelEnum("total_get_req_suc_per_stream");

        /**
         * Enum TRAFFIC_CONTROL_PUT for value: "traffic_control_put"
         */
        public static final LabelEnum TRAFFIC_CONTROL_PUT = new LabelEnum("traffic_control_put");

        /**
         * Enum TRAFFIC_CONTROL_GET for value: "traffic_control_get"
         */
        public static final LabelEnum TRAFFIC_CONTROL_GET = new LabelEnum("traffic_control_get");

        private static final Map<String, LabelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LabelEnum> createStaticFields() {
            Map<String, LabelEnum> map = new HashMap<>();
            map.put("total_put_bytes_per_stream", TOTAL_PUT_BYTES_PER_STREAM);
            map.put("total_get_bytes_per_stream", TOTAL_GET_BYTES_PER_STREAM);
            map.put("total_put_records_per_stream", TOTAL_PUT_RECORDS_PER_STREAM);
            map.put("total_get_records_per_stream", TOTAL_GET_RECORDS_PER_STREAM);
            map.put("total_put_req_latency", TOTAL_PUT_REQ_LATENCY);
            map.put("total_get_req_latency", TOTAL_GET_REQ_LATENCY);
            map.put("total_put_req_suc_per_stream", TOTAL_PUT_REQ_SUC_PER_STREAM);
            map.put("total_get_req_suc_per_stream", TOTAL_GET_REQ_SUC_PER_STREAM);
            map.put("traffic_control_put", TRAFFIC_CONTROL_PUT);
            map.put("traffic_control_get", TRAFFIC_CONTROL_GET);
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

    private Long endTime;

    public ShowStreamMetricsRequest withStreamName(String streamName) {
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

    public ShowStreamMetricsRequest withLabel(LabelEnum label) {
        this.label = label;
        return this;
    }

    /**
     * 通道监控指标。（label与label_list必须二选一，label_list与label同时存在时，以label_list为准）  - total_put_bytes_per_stream：总输入流量（Byte） - total_get_bytes_per_stream：总输出流量（Byte） - total_put_records_per_stream：总输入记录数（个） - total_get_records_per_stream：总输出记录数（个） - total_put_req_latency：上传请求平均处理时间（毫秒） - total_get_req_latency：下载请求平均处理时间（毫秒） - total_put_req_suc_per_stream：上传请求成功次数（个） - total_get_req_suc_per_stream：下载请求成功次数（个） - traffic_control_put：因流控拒绝的上传请求次数 （个） - traffic_control_get：因流控拒绝的下载请求次数 （个）
     * @return label
     */
    public LabelEnum getLabel() {
        return label;
    }

    public void setLabel(LabelEnum label) {
        this.label = label;
    }

    public ShowStreamMetricsRequest withLabelList(String labelList) {
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

    public ShowStreamMetricsRequest withStartTime(Long startTime) {
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

    public ShowStreamMetricsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 监控结束时间点，10位时间戳。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
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
        ShowStreamMetricsRequest that = (ShowStreamMetricsRequest) obj;
        return Objects.equals(this.streamName, that.streamName) && Objects.equals(this.label, that.label)
            && Objects.equals(this.labelList, that.labelList) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, label, labelList, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStreamMetricsRequest {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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
