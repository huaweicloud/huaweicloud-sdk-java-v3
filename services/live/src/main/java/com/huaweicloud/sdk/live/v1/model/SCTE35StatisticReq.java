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
 * 请求频道scte35信号的字段。
 */
public class SCTE35StatisticReq {

    /**
     * 信号类型：all/splice_insert/time_signal。
     */
    public static final class TypeEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final TypeEnum ALL = new TypeEnum("all");

        /**
         * Enum SPLICE_INSERT for value: "splice_insert"
         */
        public static final TypeEnum SPLICE_INSERT = new TypeEnum("splice_insert");

        /**
         * Enum TIME_SIGNAL for value: "time_signal"
         */
        public static final TypeEnum TIME_SIGNAL = new TypeEnum("time_signal");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("splice_insert", SPLICE_INSERT);
            map.put("time_signal", TIME_SIGNAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public SCTE35StatisticReq withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 信号类型：all/splice_insert/time_signal。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SCTE35StatisticReq withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询信号的起始时间，unix time，单位：秒。
     * minimum: 1
     * maximum: 4294967295
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public SCTE35StatisticReq withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询信号的结束时间，unix time，单位：秒；实际使用使用比start_time大。
     * minimum: 1
     * maximum: 4294967295
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
        SCTE35StatisticReq that = (SCTE35StatisticReq) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SCTE35StatisticReq {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
