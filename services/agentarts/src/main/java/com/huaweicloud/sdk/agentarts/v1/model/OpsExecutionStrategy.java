package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OpsExecutionStrategy
 */
public class OpsExecutionStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repeat")

    private Boolean repeat;

    /**
     * **参数解释：** 重复周期类型。  **约束限制：** 无。  **取值范围：** daily：天重复，weekly：周重复。  **默认取值：** 无。
     */
    public static final class RepeatTypeEnum {

        /**
         * Enum DAILY for value: "daily"
         */
        public static final RepeatTypeEnum DAILY = new RepeatTypeEnum("daily");

        /**
         * Enum WEEKLY for value: "weekly"
         */
        public static final RepeatTypeEnum WEEKLY = new RepeatTypeEnum("weekly");

        private static final Map<String, RepeatTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RepeatTypeEnum> createStaticFields() {
            Map<String, RepeatTypeEnum> map = new HashMap<>();
            map.put("daily", DAILY);
            map.put("weekly", WEEKLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RepeatTypeEnum(String value) {
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
        public static RepeatTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RepeatTypeEnum(value));
        }

        public static RepeatTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RepeatTypeEnum) {
                return this.value.equals(((RepeatTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repeat_type")

    private RepeatTypeEnum repeatType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repeat_interval")

    private Integer repeatInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_of_week")

    private Integer dayOfWeek;

    public OpsExecutionStrategy withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释：** 开始时间（单位：毫秒数）  **约束限制：** 不超过当前时间的前31天。  **取值范围：** 13位毫秒级时间戳。  **默认取值：** 无。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public OpsExecutionStrategy withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：** 结束时间（单位：毫秒数）  **约束限制：** 无。  **取值范围：** 13位毫秒级时间戳。  **默认取值：** 无。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public OpsExecutionStrategy withRepeat(Boolean repeat) {
        this.repeat = repeat;
        return this;
    }

    /**
     * **参数解释：** 是否重复执行。  **约束限制：** 无。  **取值范围：** ture或者false。  **默认取值：** false。
     * @return repeat
     */
    public Boolean getRepeat() {
        return repeat;
    }

    public void setRepeat(Boolean repeat) {
        this.repeat = repeat;
    }

    public OpsExecutionStrategy withRepeatType(RepeatTypeEnum repeatType) {
        this.repeatType = repeatType;
        return this;
    }

    /**
     * **参数解释：** 重复周期类型。  **约束限制：** 无。  **取值范围：** daily：天重复，weekly：周重复。  **默认取值：** 无。
     * @return repeatType
     */
    public RepeatTypeEnum getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(RepeatTypeEnum repeatType) {
        this.repeatType = repeatType;
    }

    public OpsExecutionStrategy withRepeatInterval(Integer repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }

    /**
     * **参数解释：** 重复周期。  **约束限制：** 无。  **取值范围：** 1到6之间的数字。  **默认取值：** 无。
     * minimum: 1
     * maximum: 6
     * @return repeatInterval
     */
    public Integer getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(Integer repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public OpsExecutionStrategy withDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    /**
     * **参数解释：** 周重复时，每周几执行。  **约束限制：** 仅 repeat_type=weekly 时必填且非 null；repeat_type=daily 时必须为 null（或不上送）。无语义即 null。  **取值范围：** 1到7之间的数字，分别代表周一到周日；daily 场景为 null。  **默认取值：** 无。
     * minimum: 1
     * maximum: 7
     * @return dayOfWeek
     */
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsExecutionStrategy that = (OpsExecutionStrategy) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.repeat, that.repeat) && Objects.equals(this.repeatType, that.repeatType)
            && Objects.equals(this.repeatInterval, that.repeatInterval)
            && Objects.equals(this.dayOfWeek, that.dayOfWeek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, repeat, repeatType, repeatInterval, dayOfWeek);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsExecutionStrategy {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
        sb.append("    repeatType: ").append(toIndentedString(repeatType)).append("\n");
        sb.append("    repeatInterval: ").append(toIndentedString(repeatInterval)).append("\n");
        sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
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
