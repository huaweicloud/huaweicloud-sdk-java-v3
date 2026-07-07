package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 运维窗口。
 */
public class ExecuteWindowResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "planned_execution_time")

    private String plannedExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ExecuteWindowResult withPlannedExecutionTime(String plannedExecutionTime) {
        this.plannedExecutionTime = plannedExecutionTime;
        return this;
    }

    /**
     * **参数解释**: 计划执行时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。 **取值范围**: 不涉及。
     * @return plannedExecutionTime
     */
    public String getPlannedExecutionTime() {
        return plannedExecutionTime;
    }

    public void setPlannedExecutionTime(String plannedExecutionTime) {
        this.plannedExecutionTime = plannedExecutionTime;
    }

    public ExecuteWindowResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**: 执行时间窗口开始时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。 **取值范围**: 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ExecuteWindowResult withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**: 执行时间窗口结束时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。 **取值范围**: 不涉及。
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
        ExecuteWindowResult that = (ExecuteWindowResult) obj;
        return Objects.equals(this.plannedExecutionTime, that.plannedExecutionTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plannedExecutionTime, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteWindowResult {\n");
        sb.append("    plannedExecutionTime: ").append(toIndentedString(plannedExecutionTime)).append("\n");
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
