package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 子任务信息。
 */
public class SubTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_name")

    private String subTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percent")

    private String percent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_time")

    private String remainingTime;

    public SubTaskInfo withSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
        return this;
    }

    /**
     * **参数解释**：  子任务名。  **取值范围**：  不涉及。
     * @return subTaskName
     */
    public String getSubTaskName() {
        return subTaskName;
    }

    public void setSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
    }

    public SubTaskInfo withPercent(String percent) {
        this.percent = percent;
        return this;
    }

    /**
     * **参数解释**：  子任务进度百分比。  **取值范围**：  0-100。
     * @return percent
     */
    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public SubTaskInfo withRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
        return this;
    }

    /**
     * **参数解释**：  剩余时间，单位为秒。  **取值范围**：  不涉及。
     * @return remainingTime
     */
    public String getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubTaskInfo that = (SubTaskInfo) obj;
        return Objects.equals(this.subTaskName, that.subTaskName) && Objects.equals(this.percent, that.percent)
            && Objects.equals(this.remainingTime, that.remainingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subTaskName, percent, remainingTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTaskInfo {\n");
        sb.append("    subTaskName: ").append(toIndentedString(subTaskName)).append("\n");
        sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
        sb.append("    remainingTime: ").append(toIndentedString(remainingTime)).append("\n");
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
