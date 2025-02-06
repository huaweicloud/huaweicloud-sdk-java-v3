package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 集群运维参数配置。 **约束限制：** 不涉及
 */
public class ClusterOps {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm")

    private AlarmInfo alarm;

    public ClusterOps withAlarm(AlarmInfo alarm) {
        this.alarm = alarm;
        return this;
    }

    public ClusterOps withAlarm(Consumer<AlarmInfo> alarmSetter) {
        if (this.alarm == null) {
            this.alarm = new AlarmInfo();
            alarmSetter.accept(this.alarm);
        }

        return this;
    }

    /**
     * Get alarm
     * @return alarm
     */
    public AlarmInfo getAlarm() {
        return alarm;
    }

    public void setAlarm(AlarmInfo alarm) {
        this.alarm = alarm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterOps that = (ClusterOps) obj;
        return Objects.equals(this.alarm, that.alarm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterOps {\n");
        sb.append("    alarm: ").append(toIndentedString(alarm)).append("\n");
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
