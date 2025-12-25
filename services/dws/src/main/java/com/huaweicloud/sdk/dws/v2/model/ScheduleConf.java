package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 调度配置信息。 **取值范围**： 不涉及。
 */
public class ScheduleConf {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_start")

    private String scheduleStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_end")

    private String scheduleEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_type")

    private String scheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_date")

    private List<Integer> scheduleDate = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_time")

    private List<String> scheduleTime = null;

    public ScheduleConf withScheduleStart(String scheduleStart) {
        this.scheduleStart = scheduleStart;
        return this;
    }

    /**
     * **参数解释**： 调度开始时间。 **取值范围**： 不涉及。
     * @return scheduleStart
     */
    public String getScheduleStart() {
        return scheduleStart;
    }

    public void setScheduleStart(String scheduleStart) {
        this.scheduleStart = scheduleStart;
    }

    public ScheduleConf withScheduleEnd(String scheduleEnd) {
        this.scheduleEnd = scheduleEnd;
        return this;
    }

    /**
     * **参数解释**： 调度结束时间。 **取值范围**： 不涉及。
     * @return scheduleEnd
     */
    public String getScheduleEnd() {
        return scheduleEnd;
    }

    public void setScheduleEnd(String scheduleEnd) {
        this.scheduleEnd = scheduleEnd;
    }

    public ScheduleConf withScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    /**
     * **参数解释**： 调度类型。 **取值范围**： - timeRange：时间范围。
     * @return scheduleType
     */
    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public ScheduleConf withScheduleDate(List<Integer> scheduleDate) {
        this.scheduleDate = scheduleDate;
        return this;
    }

    public ScheduleConf addScheduleDateItem(Integer scheduleDateItem) {
        if (this.scheduleDate == null) {
            this.scheduleDate = new ArrayList<>();
        }
        this.scheduleDate.add(scheduleDateItem);
        return this;
    }

    public ScheduleConf withScheduleDate(Consumer<List<Integer>> scheduleDateSetter) {
        if (this.scheduleDate == null) {
            this.scheduleDate = new ArrayList<>();
        }
        scheduleDateSetter.accept(this.scheduleDate);
        return this;
    }

    /**
     * **参数解释**： 调度日期。 **取值范围**： 不涉及。
     * @return scheduleDate
     */
    public List<Integer> getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(List<Integer> scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public ScheduleConf withScheduleTime(List<String> scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }

    public ScheduleConf addScheduleTimeItem(String scheduleTimeItem) {
        if (this.scheduleTime == null) {
            this.scheduleTime = new ArrayList<>();
        }
        this.scheduleTime.add(scheduleTimeItem);
        return this;
    }

    public ScheduleConf withScheduleTime(Consumer<List<String>> scheduleTimeSetter) {
        if (this.scheduleTime == null) {
            this.scheduleTime = new ArrayList<>();
        }
        scheduleTimeSetter.accept(this.scheduleTime);
        return this;
    }

    /**
     * **参数解释**： 调度时间列表。 **取值范围**： 不涉及。
     * @return scheduleTime
     */
    public List<String> getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(List<String> scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleConf that = (ScheduleConf) obj;
        return Objects.equals(this.scheduleStart, that.scheduleStart)
            && Objects.equals(this.scheduleEnd, that.scheduleEnd)
            && Objects.equals(this.scheduleType, that.scheduleType)
            && Objects.equals(this.scheduleDate, that.scheduleDate)
            && Objects.equals(this.scheduleTime, that.scheduleTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleStart, scheduleEnd, scheduleType, scheduleDate, scheduleTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleConf {\n");
        sb.append("    scheduleStart: ").append(toIndentedString(scheduleStart)).append("\n");
        sb.append("    scheduleEnd: ").append(toIndentedString(scheduleEnd)).append("\n");
        sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
        sb.append("    scheduleDate: ").append(toIndentedString(scheduleDate)).append("\n");
        sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
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
