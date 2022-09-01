package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListRecordRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_domain")

    @JacksonXmlProperty(localName = "publish_domain")

    private String publishDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    @JacksonXmlProperty(localName = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    @JacksonXmlProperty(localName = "stream")

    private String stream;

    /**
     * 录制类型，如果不填写则查询所有录制类型，包括：CONTINUOUS_RECORD，COMMAND_RECORD，PLAN_RECORD，ON_DEMAND_RECORD。默认CONTINUOUS_RECORD。 - CONTINUOUS_RECORD：持续录制，在该规则类型配置后，只要有流到推送到录制系统，就触发录制。 - COMMAND_RECORD：命令录制，在该规则类型配置后，在流推送到录制系统后，租户需要通过命令控制该流的录制开始和结束。 - PLAN_RECORD：计划录制，在该规则类型配置后，推的流如果在计划录制的时间区间则触发录制。 - ON_DEMAND_RECORD：按需录制，在该规则类型配置后，录制系统收到推流后，需要调用租户提供的接口查询录制规则，并根据规则录制。 
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

        /**
         * Enum PLAN_RECORD for value: "PLAN_RECORD"
         */
        public static final RecordTypeEnum PLAN_RECORD = new RecordTypeEnum("PLAN_RECORD");

        /**
         * Enum ON_DEMAND_RECORD for value: "ON_DEMAND_RECORD"
         */
        public static final RecordTypeEnum ON_DEMAND_RECORD = new RecordTypeEnum("ON_DEMAND_RECORD");

        private static final Map<String, RecordTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordTypeEnum> createStaticFields() {
            Map<String, RecordTypeEnum> map = new HashMap<>();
            map.put("CONTINUOUS_RECORD", CONTINUOUS_RECORD);
            map.put("COMMAND_RECORD", COMMAND_RECORD);
            map.put("PLAN_RECORD", PLAN_RECORD);
            map.put("ON_DEMAND_RECORD", ON_DEMAND_RECORD);
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
            RecordTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RecordTypeEnum(value);
            }
            return result;
        }

        public static RecordTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RecordTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "record_type")

    private RecordTypeEnum recordType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    public ListRecordRulesRequest withPublishDomain(String publishDomain) {
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

    public ListRecordRulesRequest withApp(String app) {
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

    public ListRecordRulesRequest withStream(String stream) {
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

    public ListRecordRulesRequest withRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * 录制类型，如果不填写则查询所有录制类型，包括：CONTINUOUS_RECORD，COMMAND_RECORD，PLAN_RECORD，ON_DEMAND_RECORD。默认CONTINUOUS_RECORD。 - CONTINUOUS_RECORD：持续录制，在该规则类型配置后，只要有流到推送到录制系统，就触发录制。 - COMMAND_RECORD：命令录制，在该规则类型配置后，在流推送到录制系统后，租户需要通过命令控制该流的录制开始和结束。 - PLAN_RECORD：计划录制，在该规则类型配置后，推的流如果在计划录制的时间区间则触发录制。 - ON_DEMAND_RECORD：按需录制，在该规则类型配置后，录制系统收到推流后，需要调用租户提供的接口查询录制规则，并根据规则录制。 
     * @return recordType
     */
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    public void setRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
    }

    public ListRecordRulesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，offset大于等于0
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

    public ListRecordRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数，取值范围[1,100]，默认值10
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRecordRulesRequest listRecordRulesRequest = (ListRecordRulesRequest) o;
        return Objects.equals(this.publishDomain, listRecordRulesRequest.publishDomain)
            && Objects.equals(this.app, listRecordRulesRequest.app)
            && Objects.equals(this.stream, listRecordRulesRequest.stream)
            && Objects.equals(this.recordType, listRecordRulesRequest.recordType)
            && Objects.equals(this.offset, listRecordRulesRequest.offset)
            && Objects.equals(this.limit, listRecordRulesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishDomain, app, stream, recordType, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordRulesRequest {\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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
