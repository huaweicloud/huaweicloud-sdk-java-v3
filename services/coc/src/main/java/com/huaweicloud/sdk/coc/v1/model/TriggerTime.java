package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 定时任务触发时间
 */
public class TriggerTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    /**
     * 策略
     */
    public static final class PolicyEnum {

        /**
         * Enum PERIODIC for value: "PERIODIC"
         */
        public static final PolicyEnum PERIODIC = new PolicyEnum("PERIODIC");

        /**
         * Enum ONCE for value: "ONCE"
         */
        public static final PolicyEnum ONCE = new PolicyEnum("ONCE");

        /**
         * Enum CRON for value: "CRON"
         */
        public static final PolicyEnum CRON = new PolicyEnum("CRON");

        private static final Map<String, PolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyEnum> createStaticFields() {
            Map<String, PolicyEnum> map = new HashMap<>();
            map.put("PERIODIC", PERIODIC);
            map.put("ONCE", ONCE);
            map.put("CRON", CRON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyEnum(String value) {
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
        public static PolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyEnum(value));
        }

        public static PolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyEnum) {
                return this.value.equals(((PolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private PolicyEnum policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_scheduled_time")

    private Long singleScheduledTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodic_scheduled_time")

    private String periodicScheduledTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cron")

    private String cron;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_close_time")

    private Long scheduledCloseTime;

    public TriggerTime withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public TriggerTime withPolicy(PolicyEnum policy) {
        this.policy = policy;
        return this;
    }

    /**
     * 策略
     * @return policy
     */
    public PolicyEnum getPolicy() {
        return policy;
    }

    public void setPolicy(PolicyEnum policy) {
        this.policy = policy;
    }

    public TriggerTime withSingleScheduledTime(Long singleScheduledTime) {
        this.singleScheduledTime = singleScheduledTime;
        return this;
    }

    /**
     * 单次执行的执行时间戳
     * minimum: 0
     * maximum: 9000000000000000
     * @return singleScheduledTime
     */
    public Long getSingleScheduledTime() {
        return singleScheduledTime;
    }

    public void setSingleScheduledTime(Long singleScheduledTime) {
        this.singleScheduledTime = singleScheduledTime;
    }

    public TriggerTime withPeriodicScheduledTime(String periodicScheduledTime) {
        this.periodicScheduledTime = periodicScheduledTime;
        return this;
    }

    /**
     * 周期执行的执行当天的时间 \"00:00:00\"
     * @return periodicScheduledTime
     */
    public String getPeriodicScheduledTime() {
        return periodicScheduledTime;
    }

    public void setPeriodicScheduledTime(String periodicScheduledTime) {
        this.periodicScheduledTime = periodicScheduledTime;
    }

    public TriggerTime withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 周期执行时的具体星期列表按逗号分割, 如星期日为\"1\",星期一为\"2\"
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public TriggerTime withCron(String cron) {
        this.cron = cron;
        return this;
    }

    /**
     * cron表达式
     * @return cron
     */
    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public TriggerTime withScheduledCloseTime(Long scheduledCloseTime) {
        this.scheduledCloseTime = scheduledCloseTime;
        return this;
    }

    /**
     * 定时任务规则截止日期时间戳
     * minimum: 0
     * maximum: 9000000000000000
     * @return scheduledCloseTime
     */
    public Long getScheduledCloseTime() {
        return scheduledCloseTime;
    }

    public void setScheduledCloseTime(Long scheduledCloseTime) {
        this.scheduledCloseTime = scheduledCloseTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggerTime that = (TriggerTime) obj;
        return Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.policy, that.policy)
            && Objects.equals(this.singleScheduledTime, that.singleScheduledTime)
            && Objects.equals(this.periodicScheduledTime, that.periodicScheduledTime)
            && Objects.equals(this.period, that.period) && Objects.equals(this.cron, that.cron)
            && Objects.equals(this.scheduledCloseTime, that.scheduledCloseTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(timeZone, policy, singleScheduledTime, periodicScheduledTime, period, cron, scheduledCloseTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerTime {\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    singleScheduledTime: ").append(toIndentedString(singleScheduledTime)).append("\n");
        sb.append("    periodicScheduledTime: ").append(toIndentedString(periodicScheduledTime)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
        sb.append("    scheduledCloseTime: ").append(toIndentedString(scheduledCloseTime)).append("\n");
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
