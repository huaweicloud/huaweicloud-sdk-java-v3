package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateLogStreamResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_time")

    private Long creationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_topic_name")

    private String logTopicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_topic_id")

    private String logTopicId;

    /**
     * 日志存储时间（天）。
     */
    public static final class TtlInDaysEnum {

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final TtlInDaysEnum NUMBER_7 = new TtlInDaysEnum(7);

        private static final Map<Integer, TtlInDaysEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TtlInDaysEnum> createStaticFields() {
            Map<Integer, TtlInDaysEnum> map = new HashMap<>();
            map.put(7, NUMBER_7);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TtlInDaysEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TtlInDaysEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TtlInDaysEnum(value));
        }

        public static TtlInDaysEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TtlInDaysEnum) {
                return this.value.equals(((TtlInDaysEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_in_days")

    private TtlInDaysEnum ttlInDays;

    public UpdateLogStreamResponse withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 创建该日志流的时间
     * @return creationTime
     */
    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public UpdateLogStreamResponse withLogTopicName(String logTopicName) {
        this.logTopicName = logTopicName;
        return this;
    }

    /**
     * 日志流的名称。
     * @return logTopicName
     */
    public String getLogTopicName() {
        return logTopicName;
    }

    public void setLogTopicName(String logTopicName) {
        this.logTopicName = logTopicName;
    }

    public UpdateLogStreamResponse withLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
        return this;
    }

    /**
     * 日志流ID。
     * @return logTopicId
     */
    public String getLogTopicId() {
        return logTopicId;
    }

    public void setLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
    }

    public UpdateLogStreamResponse withTtlInDays(TtlInDaysEnum ttlInDays) {
        this.ttlInDays = ttlInDays;
        return this;
    }

    /**
     * 日志存储时间（天）。
     * minimum: 1
     * maximum: 365
     * @return ttlInDays
     */
    public TtlInDaysEnum getTtlInDays() {
        return ttlInDays;
    }

    public void setTtlInDays(TtlInDaysEnum ttlInDays) {
        this.ttlInDays = ttlInDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLogStreamResponse that = (UpdateLogStreamResponse) obj;
        return Objects.equals(this.creationTime, that.creationTime)
            && Objects.equals(this.logTopicName, that.logTopicName) && Objects.equals(this.logTopicId, that.logTopicId)
            && Objects.equals(this.ttlInDays, that.ttlInDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creationTime, logTopicName, logTopicId, ttlInDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogStreamResponse {\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    logTopicName: ").append(toIndentedString(logTopicName)).append("\n");
        sb.append("    logTopicId: ").append(toIndentedString(logTopicId)).append("\n");
        sb.append("    ttlInDays: ").append(toIndentedString(ttlInDays)).append("\n");
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
