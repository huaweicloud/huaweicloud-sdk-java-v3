package com.huaweicloud.sdk.mrs.v2.model;

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
 * ResourcesPlan
 */
public class ResourcesPlan {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_capacity")

    private Integer minCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_capacity")

    private Integer maxCapacity;

    /**
     * 枚举值： - MONDAY: 星期一 - TUESDAY: 星期二 - WEDNESDAY: 星期三 - THURSDAY: 星期四 - FRIDAY: 星期五 - SATURDAY: 星期六 - SUNDAY: 星期日
     */
    public static final class EffectiveDaysEnum {

        /**
         * Enum MONDAY for value: "MONDAY"
         */
        public static final EffectiveDaysEnum MONDAY = new EffectiveDaysEnum("MONDAY");

        /**
         * Enum TUESDAY for value: "TUESDAY"
         */
        public static final EffectiveDaysEnum TUESDAY = new EffectiveDaysEnum("TUESDAY");

        /**
         * Enum WEDNESDAY for value: "WEDNESDAY"
         */
        public static final EffectiveDaysEnum WEDNESDAY = new EffectiveDaysEnum("WEDNESDAY");

        /**
         * Enum THURSDAY for value: "THURSDAY"
         */
        public static final EffectiveDaysEnum THURSDAY = new EffectiveDaysEnum("THURSDAY");

        /**
         * Enum FRIDAY for value: "FRIDAY"
         */
        public static final EffectiveDaysEnum FRIDAY = new EffectiveDaysEnum("FRIDAY");

        /**
         * Enum SATURDAY for value: "SATURDAY"
         */
        public static final EffectiveDaysEnum SATURDAY = new EffectiveDaysEnum("SATURDAY");

        /**
         * Enum SUNDAY for value: "SUNDAY"
         */
        public static final EffectiveDaysEnum SUNDAY = new EffectiveDaysEnum("SUNDAY");

        private static final Map<String, EffectiveDaysEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EffectiveDaysEnum> createStaticFields() {
            Map<String, EffectiveDaysEnum> map = new HashMap<>();
            map.put("MONDAY", MONDAY);
            map.put("TUESDAY", TUESDAY);
            map.put("WEDNESDAY", WEDNESDAY);
            map.put("THURSDAY", THURSDAY);
            map.put("FRIDAY", FRIDAY);
            map.put("SATURDAY", SATURDAY);
            map.put("SUNDAY", SUNDAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EffectiveDaysEnum(String value) {
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
        public static EffectiveDaysEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EffectiveDaysEnum(value));
        }

        public static EffectiveDaysEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EffectiveDaysEnum) {
                return this.value.equals(((EffectiveDaysEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_days")

    private List<EffectiveDaysEnum> effectiveDays = null;

    public ResourcesPlan withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 资源计划的周期类型，当前只允许以下类型：  daily
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public ResourcesPlan withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 资源计划的起始时间，格式为“hour:minute”，表示时间在0:00-23:59之间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ResourcesPlan withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 资源计划的结束时间，格式与“start_time”相同，不早于start_time表示的时间，且与start_time间隔不小于30min。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ResourcesPlan withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * 资源计划内该节点组的最小保留节点数。 取值范围：[0～500]
     * minimum: 0
     * maximum: 500
     * @return minCapacity
     */
    public Integer getMinCapacity() {
        return minCapacity;
    }

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    public ResourcesPlan withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * 资源计划内该节点组的最大保留节点数。 取值范围：[0～500]
     * minimum: 0
     * maximum: 500
     * @return maxCapacity
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public ResourcesPlan withEffectiveDays(List<EffectiveDaysEnum> effectiveDays) {
        this.effectiveDays = effectiveDays;
        return this;
    }

    public ResourcesPlan addEffectiveDaysItem(EffectiveDaysEnum effectiveDaysItem) {
        if (this.effectiveDays == null) {
            this.effectiveDays = new ArrayList<>();
        }
        this.effectiveDays.add(effectiveDaysItem);
        return this;
    }

    public ResourcesPlan withEffectiveDays(Consumer<List<EffectiveDaysEnum>> effectiveDaysSetter) {
        if (this.effectiveDays == null) {
            this.effectiveDays = new ArrayList<>();
        }
        effectiveDaysSetter.accept(this.effectiveDays);
        return this;
    }

    /**
     * 资源计划的生效日期，为空时代表每日，另外也可为以下返回值：  MONDAY（周一）、TUESDAY（周二）、WEDNESDAY（周三）、THURSDAY（周四）、FRIDAY（周五）、SATURDAY（周六）、SUNDAY（周日）
     * @return effectiveDays
     */
    public List<EffectiveDaysEnum> getEffectiveDays() {
        return effectiveDays;
    }

    public void setEffectiveDays(List<EffectiveDaysEnum> effectiveDays) {
        this.effectiveDays = effectiveDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcesPlan that = (ResourcesPlan) obj;
        return Objects.equals(this.periodType, that.periodType) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.minCapacity, that.minCapacity)
            && Objects.equals(this.maxCapacity, that.maxCapacity)
            && Objects.equals(this.effectiveDays, that.effectiveDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodType, startTime, endTime, minCapacity, maxCapacity, effectiveDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcesPlan {\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    minCapacity: ").append(toIndentedString(minCapacity)).append("\n");
        sb.append("    maxCapacity: ").append(toIndentedString(maxCapacity)).append("\n");
        sb.append("    effectiveDays: ").append(toIndentedString(effectiveDays)).append("\n");
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
