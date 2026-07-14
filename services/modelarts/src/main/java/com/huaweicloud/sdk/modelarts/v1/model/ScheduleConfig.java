package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 创建服务请求体。 **取值范围：** 不涉及。
 */
public class ScheduleConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_unit")

    private String timeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ScheduleConfig withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释：** 对应的时间单位的数值。 **约束限制：** 与time_unit共同确认时间设置的范围是1分钟~7天之间。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ScheduleConfig withTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * **参数解释：** 时间的单位。 **约束限制：** 与duration共同确认时间设置的范围是1分钟~7天之间。 **取值范围：** - MINUTES：分钟。 - HOURS：小时。 - DAYS：天。 **默认取值：** 不涉及。
     * @return timeUnit
     */
    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public ScheduleConfig withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 调度类型，当前仅支持取值为STOP。 **约束限制：** 不涉及。 **取值范围：** - STOP：停止。 **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleConfig that = (ScheduleConfig) obj;
        return Objects.equals(this.duration, that.duration) && Objects.equals(this.timeUnit, that.timeUnit)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, timeUnit, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleConfig {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
