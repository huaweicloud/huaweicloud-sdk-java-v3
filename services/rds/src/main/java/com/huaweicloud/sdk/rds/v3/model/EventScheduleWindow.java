package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EventScheduleWindow
 */
public class EventScheduleWindow {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "planned_day")

    private String plannedDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public EventScheduleWindow withPlannedDay(String plannedDay) {
        this.plannedDay = plannedDay;
        return this;
    }

    /**
     * **参数解释**：  计划执行日期 yyyy-MM-dd  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return plannedDay
     */
    public String getPlannedDay() {
        return plannedDay;
    }

    public void setPlannedDay(String plannedDay) {
        this.plannedDay = plannedDay;
    }

    public EventScheduleWindow withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：  计划执行窗口开始时间  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public EventScheduleWindow withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：  计划执行窗口结束时间  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventScheduleWindow that = (EventScheduleWindow) obj;
        return Objects.equals(this.plannedDay, that.plannedDay) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plannedDay, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventScheduleWindow {\n");
        sb.append("    plannedDay: ").append(toIndentedString(plannedDay)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
