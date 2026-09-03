package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：  事件执行窗口。  **约束限制**：  不涉及。
 */
public class ExecuteWindow {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "planned_execution_day")

    private String plannedExecutionDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ExecuteWindow withPlannedExecutionDay(String plannedExecutionDay) {
        this.plannedExecutionDay = plannedExecutionDay;
        return this;
    }

    /**
     * **参数解释**：  计划执行日期，格式为：“yyyy-MM-dd”。  **取值范围**：  不涉及。
     * @return plannedExecutionDay
     */
    public String getPlannedExecutionDay() {
        return plannedExecutionDay;
    }

    public void setPlannedExecutionDay(String plannedExecutionDay) {
        this.plannedExecutionDay = plannedExecutionDay;
    }

    public ExecuteWindow withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：  事件执行窗口开始时间，格式为 \"hh:mm\"。  **取值范围**：  不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ExecuteWindow withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：  事件执行窗口结束时间，格式为 \"hh:mm\"。  **取值范围**：  不涉及。
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
        ExecuteWindow that = (ExecuteWindow) obj;
        return Objects.equals(this.plannedExecutionDay, that.plannedExecutionDay)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plannedExecutionDay, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteWindow {\n");
        sb.append("    plannedExecutionDay: ").append(toIndentedString(plannedExecutionDay)).append("\n");
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
