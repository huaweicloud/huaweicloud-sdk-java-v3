package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * trigger元数据。
 */
public class ScalingTriggerMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    /**
     * 生效周期。  type为\"cron\"时，配置此参数。 
     */
    public static final class PeriodTypeEnum {

        /**
         * Enum DAY for value: "day"
         */
        public static final PeriodTypeEnum DAY = new PeriodTypeEnum("day");

        /**
         * Enum WEEK for value: "week"
         */
        public static final PeriodTypeEnum WEEK = new PeriodTypeEnum("week");

        /**
         * Enum MONTH for value: "month"
         */
        public static final PeriodTypeEnum MONTH = new PeriodTypeEnum("month");

        private static final Map<String, PeriodTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodTypeEnum> createStaticFields() {
            Map<String, PeriodTypeEnum> map = new HashMap<>();
            map.put("day", DAY);
            map.put("week", WEEK);
            map.put("month", MONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PeriodTypeEnum(String value) {
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
        public static PeriodTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodTypeEnum(value));
        }

        public static PeriodTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodTypeEnum) {
                return this.value.equals(((PeriodTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private PeriodTypeEnum periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedulers")

    private List<CronTriggerScheduler> schedulers = null;

    public ScalingTriggerMeta withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据类型，当前只支持利用率，默认值为Utilization。  type为\"cpu、memory\"时，配置此参数。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ScalingTriggerMeta withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 触发指标的阈值。  type为\"cpu、memory\"时，配置此参数。 
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ScalingTriggerMeta withPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 生效周期。  type为\"cron\"时，配置此参数。 
     * @return periodType
     */
    public PeriodTypeEnum getPeriodType() {
        return periodType;
    }

    public void setPeriodType(PeriodTypeEnum periodType) {
        this.periodType = periodType;
    }

    public ScalingTriggerMeta withSchedulers(List<CronTriggerScheduler> schedulers) {
        this.schedulers = schedulers;
        return this;
    }

    public ScalingTriggerMeta addSchedulersItem(CronTriggerScheduler schedulersItem) {
        if (this.schedulers == null) {
            this.schedulers = new ArrayList<>();
        }
        this.schedulers.add(schedulersItem);
        return this;
    }

    public ScalingTriggerMeta withSchedulers(Consumer<List<CronTriggerScheduler>> schedulersSetter) {
        if (this.schedulers == null) {
            this.schedulers = new ArrayList<>();
        }
        schedulersSetter.accept(this.schedulers);
        return this;
    }

    /**
     * 每个周期内触发的时间点和实例数。  type为\"cron\"时，配置此参数。 
     * @return schedulers
     */
    public List<CronTriggerScheduler> getSchedulers() {
        return schedulers;
    }

    public void setSchedulers(List<CronTriggerScheduler> schedulers) {
        this.schedulers = schedulers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScalingTriggerMeta that = (ScalingTriggerMeta) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.value, that.value)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.schedulers, that.schedulers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, periodType, schedulers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingTriggerMeta {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    schedulers: ").append(toIndentedString(schedulers)).append("\n");
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
