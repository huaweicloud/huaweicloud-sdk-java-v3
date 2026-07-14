package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 定时停止配置。
 */
public class ScheduleConfigResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "due_time")

    private Long dueTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_unit")

    private String timeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processed")

    private Boolean processed;

    public ScheduleConfigResponse withDueTime(Long dueTime) {
        this.dueTime = dueTime;
        return this;
    }

    /**
     * **参数解释：** 触发时间，UTC毫秒，13位时间戳。 **取值范围：** 不涉及。
     * @return dueTime
     */
    public Long getDueTime() {
        return dueTime;
    }

    public void setDueTime(Long dueTime) {
        this.dueTime = dueTime;
    }

    public ScheduleConfigResponse withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释：** 对应的时间单位的数值。 **取值范围：** 不涉及。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ScheduleConfigResponse withTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * **参数解释：** 调度时间单位。 **取值范围：** - MINUTES：分钟。 - HOURS：小时。 - DAYS：天。
     * @return timeUnit
     */
    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public ScheduleConfigResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 调度类型，当前仅支持取值为STOP。 **取值范围：** - STOP：停止。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ScheduleConfigResponse withProcessed(Boolean processed) {
        this.processed = processed;
        return this;
    }

    /**
     * **参数解释：** 表示是否处理完成。 **取值范围：** - true：该定时任务已经执行过。 - false：该定时任务尚未执行。
     * @return processed
     */
    public Boolean getProcessed() {
        return processed;
    }

    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleConfigResponse that = (ScheduleConfigResponse) obj;
        return Objects.equals(this.dueTime, that.dueTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.timeUnit, that.timeUnit) && Objects.equals(this.type, that.type)
            && Objects.equals(this.processed, that.processed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dueTime, duration, timeUnit, type, processed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleConfigResponse {\n");
        sb.append("    dueTime: ").append(toIndentedString(dueTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
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
