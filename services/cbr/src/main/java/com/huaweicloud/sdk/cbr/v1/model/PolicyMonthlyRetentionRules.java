package com.huaweicloud.sdk.cbr.v1.model;

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
 * PolicyMonthlyRetentionRules
 */
public class PolicyMonthlyRetentionRules {

    /**
     * 月备规则的类型
     */
    public static final class RetentionTypeEnum {

        /**
         * Enum WEEKLY for value: "WEEKLY"
         */
        public static final RetentionTypeEnum WEEKLY = new RetentionTypeEnum("WEEKLY");

        /**
         * Enum MONTHLY for value: "MONTHLY"
         */
        public static final RetentionTypeEnum MONTHLY = new RetentionTypeEnum("MONTHLY");

        private static final Map<String, RetentionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RetentionTypeEnum> createStaticFields() {
            Map<String, RetentionTypeEnum> map = new HashMap<>();
            map.put("WEEKLY", WEEKLY);
            map.put("MONTHLY", MONTHLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RetentionTypeEnum(String value) {
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
        public static RetentionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RetentionTypeEnum(value));
        }

        public static RetentionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RetentionTypeEnum) {
                return this.value.equals(((RetentionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_type")

    private RetentionTypeEnum retentionType;

    /**
     * Gets or Sets retentionWeeks
     */
    public static final class RetentionWeeksEnum {

        /**
         * Enum FIRST for value: "FIRST"
         */
        public static final RetentionWeeksEnum FIRST = new RetentionWeeksEnum("FIRST");

        /**
         * Enum SECOND for value: "SECOND"
         */
        public static final RetentionWeeksEnum SECOND = new RetentionWeeksEnum("SECOND");

        /**
         * Enum THIRD for value: "THIRD"
         */
        public static final RetentionWeeksEnum THIRD = new RetentionWeeksEnum("THIRD");

        /**
         * Enum FOURTH for value: "FOURTH"
         */
        public static final RetentionWeeksEnum FOURTH = new RetentionWeeksEnum("FOURTH");

        /**
         * Enum LAST for value: "LAST"
         */
        public static final RetentionWeeksEnum LAST = new RetentionWeeksEnum("LAST");

        private static final Map<String, RetentionWeeksEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RetentionWeeksEnum> createStaticFields() {
            Map<String, RetentionWeeksEnum> map = new HashMap<>();
            map.put("FIRST", FIRST);
            map.put("SECOND", SECOND);
            map.put("THIRD", THIRD);
            map.put("FOURTH", FOURTH);
            map.put("LAST", LAST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RetentionWeeksEnum(String value) {
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
        public static RetentionWeeksEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RetentionWeeksEnum(value));
        }

        public static RetentionWeeksEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RetentionWeeksEnum) {
                return this.value.equals(((RetentionWeeksEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_weeks")

    private List<RetentionWeeksEnum> retentionWeeks = null;

    /**
     * Gets or Sets daysOfWeek
     */
    public static final class DaysOfWeekEnum {

        /**
         * Enum MO for value: "MO"
         */
        public static final DaysOfWeekEnum MO = new DaysOfWeekEnum("MO");

        /**
         * Enum TU for value: "TU"
         */
        public static final DaysOfWeekEnum TU = new DaysOfWeekEnum("TU");

        /**
         * Enum WE for value: "WE"
         */
        public static final DaysOfWeekEnum WE = new DaysOfWeekEnum("WE");

        /**
         * Enum TH for value: "TH"
         */
        public static final DaysOfWeekEnum TH = new DaysOfWeekEnum("TH");

        /**
         * Enum FR for value: "FR"
         */
        public static final DaysOfWeekEnum FR = new DaysOfWeekEnum("FR");

        /**
         * Enum SA for value: "SA"
         */
        public static final DaysOfWeekEnum SA = new DaysOfWeekEnum("SA");

        /**
         * Enum SU for value: "SU"
         */
        public static final DaysOfWeekEnum SU = new DaysOfWeekEnum("SU");

        private static final Map<String, DaysOfWeekEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DaysOfWeekEnum> createStaticFields() {
            Map<String, DaysOfWeekEnum> map = new HashMap<>();
            map.put("MO", MO);
            map.put("TU", TU);
            map.put("WE", WE);
            map.put("TH", TH);
            map.put("FR", FR);
            map.put("SA", SA);
            map.put("SU", SU);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DaysOfWeekEnum(String value) {
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
        public static DaysOfWeekEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DaysOfWeekEnum(value));
        }

        public static DaysOfWeekEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DaysOfWeekEnum) {
                return this.value.equals(((DaysOfWeekEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "days_of_week")

    private List<DaysOfWeekEnum> daysOfWeek = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "days_of_month")

    private List<Integer> daysOfMonth = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_duration_periods")

    private Integer retentionDurationPeriods;

    public PolicyMonthlyRetentionRules withRetentionType(RetentionTypeEnum retentionType) {
        this.retentionType = retentionType;
        return this;
    }

    /**
     * 月备规则的类型
     * @return retentionType
     */
    public RetentionTypeEnum getRetentionType() {
        return retentionType;
    }

    public void setRetentionType(RetentionTypeEnum retentionType) {
        this.retentionType = retentionType;
    }

    public PolicyMonthlyRetentionRules withRetentionWeeks(List<RetentionWeeksEnum> retentionWeeks) {
        this.retentionWeeks = retentionWeeks;
        return this;
    }

    public PolicyMonthlyRetentionRules addRetentionWeeksItem(RetentionWeeksEnum retentionWeeksItem) {
        if (this.retentionWeeks == null) {
            this.retentionWeeks = new ArrayList<>();
        }
        this.retentionWeeks.add(retentionWeeksItem);
        return this;
    }

    public PolicyMonthlyRetentionRules withRetentionWeeks(Consumer<List<RetentionWeeksEnum>> retentionWeeksSetter) {
        if (this.retentionWeeks == null) {
            this.retentionWeeks = new ArrayList<>();
        }
        retentionWeeksSetter.accept(this.retentionWeeks);
        return this;
    }

    /**
     * 将每月第几个星期的备份设置为月备备份，当retention_type为Weekly时才能设置，设置时需要与days_of_week共同设置
     * @return retentionWeeks
     */
    public List<RetentionWeeksEnum> getRetentionWeeks() {
        return retentionWeeks;
    }

    public void setRetentionWeeks(List<RetentionWeeksEnum> retentionWeeks) {
        this.retentionWeeks = retentionWeeks;
    }

    public PolicyMonthlyRetentionRules withDaysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    public PolicyMonthlyRetentionRules addDaysOfWeekItem(DaysOfWeekEnum daysOfWeekItem) {
        if (this.daysOfWeek == null) {
            this.daysOfWeek = new ArrayList<>();
        }
        this.daysOfWeek.add(daysOfWeekItem);
        return this;
    }

    public PolicyMonthlyRetentionRules withDaysOfWeek(Consumer<List<DaysOfWeekEnum>> daysOfWeekSetter) {
        if (this.daysOfWeek == null) {
            this.daysOfWeek = new ArrayList<>();
        }
        daysOfWeekSetter.accept(this.daysOfWeek);
        return this;
    }

    /**
     * 设置选中的星期中的指定天的备份为月备备份，当retention_type为Weekly时才能设置，设置时需要与retention_weeks共同设置
     * @return daysOfWeek
     */
    public List<DaysOfWeekEnum> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public PolicyMonthlyRetentionRules withDaysOfMonth(List<Integer> daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
        return this;
    }

    public PolicyMonthlyRetentionRules addDaysOfMonthItem(Integer daysOfMonthItem) {
        if (this.daysOfMonth == null) {
            this.daysOfMonth = new ArrayList<>();
        }
        this.daysOfMonth.add(daysOfMonthItem);
        return this;
    }

    public PolicyMonthlyRetentionRules withDaysOfMonth(Consumer<List<Integer>> daysOfMonthSetter) {
        if (this.daysOfMonth == null) {
            this.daysOfMonth = new ArrayList<>();
        }
        daysOfMonthSetter.accept(this.daysOfMonth);
        return this;
    }

    /**
     * 表示将每个月中的指定天设置为月备备份，当retention_type为Monthly时才能设置，取值范围为1-28和-1，-1代表每个月的最后一天
     * @return daysOfMonth
     */
    public List<Integer> getDaysOfMonth() {
        return daysOfMonth;
    }

    public void setDaysOfMonth(List<Integer> daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
    }

    public PolicyMonthlyRetentionRules withRetentionDurationPeriods(Integer retentionDurationPeriods) {
        this.retentionDurationPeriods = retentionDurationPeriods;
        return this;
    }

    /**
     * 月备备份的保留时间，取值范围为1-1200，以及-1，单位为月，-1代表月备策略不启用
     * minimum: -1
     * maximum: 1200
     * @return retentionDurationPeriods
     */
    public Integer getRetentionDurationPeriods() {
        return retentionDurationPeriods;
    }

    public void setRetentionDurationPeriods(Integer retentionDurationPeriods) {
        this.retentionDurationPeriods = retentionDurationPeriods;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyMonthlyRetentionRules that = (PolicyMonthlyRetentionRules) obj;
        return Objects.equals(this.retentionType, that.retentionType)
            && Objects.equals(this.retentionWeeks, that.retentionWeeks)
            && Objects.equals(this.daysOfWeek, that.daysOfWeek) && Objects.equals(this.daysOfMonth, that.daysOfMonth)
            && Objects.equals(this.retentionDurationPeriods, that.retentionDurationPeriods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retentionType, retentionWeeks, daysOfWeek, daysOfMonth, retentionDurationPeriods);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyMonthlyRetentionRules {\n");
        sb.append("    retentionType: ").append(toIndentedString(retentionType)).append("\n");
        sb.append("    retentionWeeks: ").append(toIndentedString(retentionWeeks)).append("\n");
        sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
        sb.append("    daysOfMonth: ").append(toIndentedString(daysOfMonth)).append("\n");
        sb.append("    retentionDurationPeriods: ").append(toIndentedString(retentionDurationPeriods)).append("\n");
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
