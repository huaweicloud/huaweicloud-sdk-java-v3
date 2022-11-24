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
public class ListAlarmTemplateAssociationAlarmsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarms")

    private List<ListAssociationAlarmsResponseAlarms> alarms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAlarmTemplateAssociationAlarmsResponse withAlarms(List<ListAssociationAlarmsResponseAlarms> alarms) {
        this.alarms = alarms;
        return this;
    }

    public ListAlarmTemplateAssociationAlarmsResponse addAlarmsItem(ListAssociationAlarmsResponseAlarms alarmsItem) {
        if (this.alarms == null) {
            this.alarms = new ArrayList<>();
        }
        this.alarms.add(alarmsItem);
        return this;
    }

    public ListAlarmTemplateAssociationAlarmsResponse withAlarms(
        Consumer<List<ListAssociationAlarmsResponseAlarms>> alarmsSetter) {
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
    public List<ListAssociationAlarmsResponseAlarms> getAlarms() {
        return alarms;
    }

    public void setAlarms(List<ListAssociationAlarmsResponseAlarms> alarms) {
        this.alarms = alarms;
    }

    public ListAlarmTemplateAssociationAlarmsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 告警规则列表总数
     * minimum: 0
     * maximum: 1000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlarmTemplateAssociationAlarmsResponse listAlarmTemplateAssociationAlarmsResponse =
            (ListAlarmTemplateAssociationAlarmsResponse) o;
        return Objects.equals(this.alarms, listAlarmTemplateAssociationAlarmsResponse.alarms)
            && Objects.equals(this.count, listAlarmTemplateAssociationAlarmsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarms, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmTemplateAssociationAlarmsResponse {\n");
        sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
