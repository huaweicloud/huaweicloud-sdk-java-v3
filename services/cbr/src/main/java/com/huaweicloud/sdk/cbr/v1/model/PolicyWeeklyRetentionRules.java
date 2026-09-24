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
 * PolicyWeeklyRetentionRules
 */
public class PolicyWeeklyRetentionRules {

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
    @JsonProperty(value = "retention_duration_periods")

    private Integer retentionDurationPeriods;

    public PolicyWeeklyRetentionRules withDaysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    public PolicyWeeklyRetentionRules addDaysOfWeekItem(DaysOfWeekEnum daysOfWeekItem) {
        if (this.daysOfWeek == null) {
            this.daysOfWeek = new ArrayList<>();
        }
        this.daysOfWeek.add(daysOfWeekItem);
        return this;
    }

    public PolicyWeeklyRetentionRules withDaysOfWeek(Consumer<List<DaysOfWeekEnum>> daysOfWeekSetter) {
        if (this.daysOfWeek == null) {
            this.daysOfWeek = new ArrayList<>();
        }
        daysOfWeekSetter.accept(this.daysOfWeek);
        return this;
    }

    /**
     * 设置每个星期中的指定天为周备备份
     * @return daysOfWeek
     */
    public List<DaysOfWeekEnum> getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public PolicyWeeklyRetentionRules withRetentionDurationPeriods(Integer retentionDurationPeriods) {
        this.retentionDurationPeriods = retentionDurationPeriods;
        return this;
    }

    /**
     * 周备的保留时间，取值范围为1-5200，以及-1，单位为周，-1代表周备策略不启用
     * minimum: -1
     * maximum: 5200
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
        PolicyWeeklyRetentionRules that = (PolicyWeeklyRetentionRules) obj;
        return Objects.equals(this.daysOfWeek, that.daysOfWeek)
            && Objects.equals(this.retentionDurationPeriods, that.retentionDurationPeriods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(daysOfWeek, retentionDurationPeriods);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyWeeklyRetentionRules {\n");
        sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
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
