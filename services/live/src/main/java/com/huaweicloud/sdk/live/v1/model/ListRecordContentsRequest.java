package com.huaweicloud.sdk.live.v1.model;

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
public class ListRecordContentsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_domain")

    private String publishDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    /**
     * 录制类型，包括：CONTINUOUS_RECORD，COMMAND_RECORD。默认CONTINUOUS_RECORD。 - CONTINUOUS_RECORD：持续录制，在该规则类型配置后，只要有流到推送到录制系统，就触发录制。 - COMMAND_RECORD：命令录制，在该规则类型配置后，在流推送到录制系统后，租户需要通过命令控制该流的录制开始和结束。 
     */
    public static final class RecordTypeEnum {

        /**
         * Enum CONTINUOUS_RECORD for value: "CONTINUOUS_RECORD"
         */
        public static final RecordTypeEnum CONTINUOUS_RECORD = new RecordTypeEnum("CONTINUOUS_RECORD");

        /**
         * Enum COMMAND_RECORD for value: "COMMAND_RECORD"
         */
        public static final RecordTypeEnum COMMAND_RECORD = new RecordTypeEnum("COMMAND_RECORD");

        private static final Map<String, RecordTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordTypeEnum> createStaticFields() {
            Map<String, RecordTypeEnum> map = new HashMap<>();
            map.put("CONTINUOUS_RECORD", CONTINUOUS_RECORD);
            map.put("COMMAND_RECORD", COMMAND_RECORD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordTypeEnum(String value) {
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
        public static RecordTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecordTypeEnum(value));
        }

        public static RecordTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecordTypeEnum) {
                return this.value.equals(((RecordTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_type")

    private RecordTypeEnum recordType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListRecordContentsRequest withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * 直播推流域名
     * @return publishDomain
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    public ListRecordContentsRequest withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 流应用名称
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public ListRecordContentsRequest withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 流名称
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public ListRecordContentsRequest withRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * 录制类型，包括：CONTINUOUS_RECORD，COMMAND_RECORD。默认CONTINUOUS_RECORD。 - CONTINUOUS_RECORD：持续录制，在该规则类型配置后，只要有流到推送到录制系统，就触发录制。 - COMMAND_RECORD：命令录制，在该规则类型配置后，在流推送到录制系统后，租户需要通过命令控制该流的录制开始和结束。 
     * @return recordType
     */
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    public void setRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
    }

    public ListRecordContentsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间,格式为：yyyy-mm-ddThh:mm:ssZ，UTC时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListRecordContentsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，格式为：yyyy-mm-ddThh:mm:ssZ，UTC时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListRecordContentsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页编号，从0开始算
     * minimum: 0
     * maximum: 4096
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRecordContentsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数，取值范围[1,100]
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRecordContentsRequest that = (ListRecordContentsRequest) obj;
        return Objects.equals(this.publishDomain, that.publishDomain) && Objects.equals(this.app, that.app)
            && Objects.equals(this.stream, that.stream) && Objects.equals(this.recordType, that.recordType)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishDomain, app, stream, recordType, startTime, endTime, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordContentsRequest {\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
