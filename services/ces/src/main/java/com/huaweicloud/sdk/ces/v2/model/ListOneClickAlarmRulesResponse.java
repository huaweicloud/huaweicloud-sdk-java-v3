package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOneClickAlarmRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarms")

    private List<ListAlarmsRespAlarms> alarms = null;

    public ListOneClickAlarmRulesResponse withAlarms(List<ListAlarmsRespAlarms> alarms) {
        this.alarms = alarms;
        return this;
    }

    public ListOneClickAlarmRulesResponse addAlarmsItem(ListAlarmsRespAlarms alarmsItem) {
        if (this.alarms == null) {
            this.alarms = new ArrayList<>();
        }
        this.alarms.add(alarmsItem);
        return this;
    }

    public ListOneClickAlarmRulesResponse withAlarms(Consumer<List<ListAlarmsRespAlarms>> alarmsSetter) {
        if (this.alarms == null) {
            this.alarms = new ArrayList<>();
        }
        alarmsSetter.accept(this.alarms);
        return this;
    }

    /**
     * 告警规则列表
     * @return alarms
     */
    public List<ListAlarmsRespAlarms> getAlarms() {
        return alarms;
    }

    public void setAlarms(List<ListAlarmsRespAlarms> alarms) {
        this.alarms = alarms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOneClickAlarmRulesResponse that = (ListOneClickAlarmRulesResponse) obj;
        return Objects.equals(this.alarms, that.alarms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOneClickAlarmRulesResponse {\n");
        sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
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
