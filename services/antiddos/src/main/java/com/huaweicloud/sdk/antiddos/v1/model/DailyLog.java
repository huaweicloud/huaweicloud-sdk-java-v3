package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EIP异常事件响应体
 */
public class DailyLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    /**
     * 防护状态，可选范围： - 1：表示清洗 - 2：表示黑洞
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final StatusEnum NUMBER_2 = new StatusEnum(2);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
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
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(Integer value) {
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
    @JsonProperty(value = "trigger_bps")

    private Integer triggerBps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_pps")

    private Integer triggerPps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_http_pps")

    private Integer triggerHttpPps;

    public DailyLog withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * minimum: 1
     * maximum: 9999999999999
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public DailyLog withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * minimum: 1
     * maximum: 9999999999999
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public DailyLog withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 防护状态，可选范围： - 1：表示清洗 - 2：表示黑洞
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public DailyLog withTriggerBps(Integer triggerBps) {
        this.triggerBps = triggerBps;
        return this;
    }

    /**
     * 触发时流量
     * minimum: 0
     * maximum: 2147483647
     * @return triggerBps
     */
    public Integer getTriggerBps() {
        return triggerBps;
    }

    public void setTriggerBps(Integer triggerBps) {
        this.triggerBps = triggerBps;
    }

    public DailyLog withTriggerPps(Integer triggerPps) {
        this.triggerPps = triggerPps;
        return this;
    }

    /**
     * 触发时报文速率
     * minimum: 0
     * maximum: 2147483647
     * @return triggerPps
     */
    public Integer getTriggerPps() {
        return triggerPps;
    }

    public void setTriggerPps(Integer triggerPps) {
        this.triggerPps = triggerPps;
    }

    public DailyLog withTriggerHttpPps(Integer triggerHttpPps) {
        this.triggerHttpPps = triggerHttpPps;
        return this;
    }

    /**
     * 触发时HTTP请求速率
     * minimum: 0
     * maximum: 2147483647
     * @return triggerHttpPps
     */
    public Integer getTriggerHttpPps() {
        return triggerHttpPps;
    }

    public void setTriggerHttpPps(Integer triggerHttpPps) {
        this.triggerHttpPps = triggerHttpPps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DailyLog that = (DailyLog) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.triggerBps, that.triggerBps)
            && Objects.equals(this.triggerPps, that.triggerPps)
            && Objects.equals(this.triggerHttpPps, that.triggerHttpPps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, status, triggerBps, triggerPps, triggerHttpPps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DailyLog {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    triggerBps: ").append(toIndentedString(triggerBps)).append("\n");
        sb.append("    triggerPps: ").append(toIndentedString(triggerPps)).append("\n");
        sb.append("    triggerHttpPps: ").append(toIndentedString(triggerHttpPps)).append("\n");
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
