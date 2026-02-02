package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警详情
 */
public class AlarmDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_occur_time")

    private Long alarmOccurTime;

    public AlarmDetail withAlarmOccurTime(Long alarmOccurTime) {
        this.alarmOccurTime = alarmOccurTime;
        return this;
    }

    /**
     * **参数解释**：告警发生时间。 **取值范围**：不涉及。
     * @return alarmOccurTime
     */
    public Long getAlarmOccurTime() {
        return alarmOccurTime;
    }

    public void setAlarmOccurTime(Long alarmOccurTime) {
        this.alarmOccurTime = alarmOccurTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmDetail that = (AlarmDetail) obj;
        return Objects.equals(this.alarmOccurTime, that.alarmOccurTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmOccurTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmDetail {\n");
        sb.append("    alarmOccurTime: ").append(toIndentedString(alarmOccurTime)).append("\n");
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
