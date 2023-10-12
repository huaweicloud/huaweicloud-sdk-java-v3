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
public class ListOneClickAlarmsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "one_click_alarms")

    private List<ListOneClickAlarmsRespOneClickAlarms> oneClickAlarms = null;

    public ListOneClickAlarmsResponse withOneClickAlarms(List<ListOneClickAlarmsRespOneClickAlarms> oneClickAlarms) {
        this.oneClickAlarms = oneClickAlarms;
        return this;
    }

    public ListOneClickAlarmsResponse addOneClickAlarmsItem(ListOneClickAlarmsRespOneClickAlarms oneClickAlarmsItem) {
        if (this.oneClickAlarms == null) {
            this.oneClickAlarms = new ArrayList<>();
        }
        this.oneClickAlarms.add(oneClickAlarmsItem);
        return this;
    }

    public ListOneClickAlarmsResponse withOneClickAlarms(
        Consumer<List<ListOneClickAlarmsRespOneClickAlarms>> oneClickAlarmsSetter) {
        if (this.oneClickAlarms == null) {
            this.oneClickAlarms = new ArrayList<>();
        }
        oneClickAlarmsSetter.accept(this.oneClickAlarms);
        return this;
    }

    /**
     * 一键告警列表
     * @return oneClickAlarms
     */
    public List<ListOneClickAlarmsRespOneClickAlarms> getOneClickAlarms() {
        return oneClickAlarms;
    }

    public void setOneClickAlarms(List<ListOneClickAlarmsRespOneClickAlarms> oneClickAlarms) {
        this.oneClickAlarms = oneClickAlarms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOneClickAlarmsResponse that = (ListOneClickAlarmsResponse) obj;
        return Objects.equals(this.oneClickAlarms, that.oneClickAlarms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oneClickAlarms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOneClickAlarmsResponse {\n");
        sb.append("    oneClickAlarms: ").append(toIndentedString(oneClickAlarms)).append("\n");
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
