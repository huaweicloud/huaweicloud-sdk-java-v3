package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * FrequencyRespBody
 */
public class FrequencyRespBody {

    /**
     * 时间类型。
     */
    public static final class TypeEnum {

        /**
         * Enum CRON for value: "CRON"
         */
        public static final TypeEnum CRON = new TypeEnum("CRON");

        /**
         * Enum HOURLY for value: "HOURLY"
         */
        public static final TypeEnum HOURLY = new TypeEnum("HOURLY");

        /**
         * Enum DAILY for value: "DAILY"
         */
        public static final TypeEnum DAILY = new TypeEnum("DAILY");

        /**
         * Enum WEEKLY for value: "WEEKLY"
         */
        public static final TypeEnum WEEKLY = new TypeEnum("WEEKLY");

        /**
         * Enum FIXED_RATE for value: "FIXED_RATE"
         */
        public static final TypeEnum FIXED_RATE = new TypeEnum("FIXED_RATE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("CRON", CRON);
            map.put("HOURLY", HOURLY);
            map.put("DAILY", DAILY);
            map.put("WEEKLY", WEEKLY);
            map.put("FIXED_RATE", FIXED_RATE);
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
    @JsonProperty(value = "cron_expr")

    private String cronExpr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hour_of_day")

    private Integer hourOfDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_of_week")

    private Integer dayOfWeek;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_rate")

    private Integer fixedRate;

    /**
     * 时间单位枚举值：
     */
    public static final class FixedRateUnitEnum {

        /**
         * Enum MINUTE for value: "minute"
         */
        public static final FixedRateUnitEnum MINUTE = new FixedRateUnitEnum("minute");

        /**
         * Enum HOUR for value: "hour"
         */
        public static final FixedRateUnitEnum HOUR = new FixedRateUnitEnum("hour");

        private static final Map<String, FixedRateUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FixedRateUnitEnum> createStaticFields() {
            Map<String, FixedRateUnitEnum> map = new HashMap<>();
            map.put("minute", MINUTE);
            map.put("hour", HOUR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FixedRateUnitEnum(String value) {
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
        public static FixedRateUnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FixedRateUnitEnum(value));
        }

        public static FixedRateUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FixedRateUnitEnum) {
                return this.value.equals(((FixedRateUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_rate_unit")

    private FixedRateUnitEnum fixedRateUnit;

    public FrequencyRespBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 时间类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public FrequencyRespBody withCronExpr(String cronExpr) {
        this.cronExpr = cronExpr;
        return this;
    }

    /**
     * 当字段type为\"CRON\"时取该字段。
     * @return cronExpr
     */
    public String getCronExpr() {
        return cronExpr;
    }

    public void setCronExpr(String cronExpr) {
        this.cronExpr = cronExpr;
    }

    public FrequencyRespBody withHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
        return this;
    }

    /**
     * 当字段type为\"DAILY\"或者\"WEEKLY\"时取该字段。
     * @return hourOfDay
     */
    public Integer getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public FrequencyRespBody withDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * 当字段type为\"WEEKLY\"时取该字段（周日~周六）。
     * @return dayOfWeek
     */
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public FrequencyRespBody withFixedRate(Integer fixedRate) {
        this.fixedRate = fixedRate;
        return this;
    }

    /**
     * 当字段type为\"FIXED_RATE\"时取该字段（当fixed_rate_unit单位为minute，最大值60；当fixed_rate_unit单位为hour，最大值24）。
     * @return fixedRate
     */
    public Integer getFixedRate() {
        return fixedRate;
    }

    public void setFixedRate(Integer fixedRate) {
        this.fixedRate = fixedRate;
    }

    public FrequencyRespBody withFixedRateUnit(FixedRateUnitEnum fixedRateUnit) {
        this.fixedRateUnit = fixedRateUnit;
        return this;
    }

    /**
     * 时间单位枚举值：
     * @return fixedRateUnit
     */
    public FixedRateUnitEnum getFixedRateUnit() {
        return fixedRateUnit;
    }

    public void setFixedRateUnit(FixedRateUnitEnum fixedRateUnit) {
        this.fixedRateUnit = fixedRateUnit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FrequencyRespBody that = (FrequencyRespBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.cronExpr, that.cronExpr)
            && Objects.equals(this.hourOfDay, that.hourOfDay) && Objects.equals(this.dayOfWeek, that.dayOfWeek)
            && Objects.equals(this.fixedRate, that.fixedRate) && Objects.equals(this.fixedRateUnit, that.fixedRateUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cronExpr, hourOfDay, dayOfWeek, fixedRate, fixedRateUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrequencyRespBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cronExpr: ").append(toIndentedString(cronExpr)).append("\n");
        sb.append("    hourOfDay: ").append(toIndentedString(hourOfDay)).append("\n");
        sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
        sb.append("    fixedRate: ").append(toIndentedString(fixedRate)).append("\n");
        sb.append("    fixedRateUnit: ").append(toIndentedString(fixedRateUnit)).append("\n");
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
