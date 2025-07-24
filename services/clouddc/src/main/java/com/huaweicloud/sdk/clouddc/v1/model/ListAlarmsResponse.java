package com.huaweicloud.sdk.clouddc.v1.model;

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
public class ListAlarmsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarms")

    private List<AlarmHistory> alarms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAlarmsResponse withAlarms(List<AlarmHistory> alarms) {
        this.alarms = alarms;
        return this;
    }

    public ListAlarmsResponse addAlarmsItem(AlarmHistory alarmsItem) {
        if (this.alarms == null) {
            this.alarms = new ArrayList<>();
        }
        this.alarms.add(alarmsItem);
        return this;
    }

    public ListAlarmsResponse withAlarms(Consumer<List<AlarmHistory>> alarmsSetter) {
        if (this.alarms == null) {
            this.alarms = new ArrayList<>();
        }
        alarmsSetter.accept(this.alarms);
        return this;
    }

    /**
     * 告警列表对象
     * @return alarms
     */
    public List<AlarmHistory> getAlarms() {
        return alarms;
    }

    public void setAlarms(List<AlarmHistory> alarms) {
        this.alarms = alarms;
    }

    public ListAlarmsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 告警总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmsResponse that = (ListAlarmsResponse) obj;
        return Objects.equals(this.alarms, that.alarms) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarms, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmsResponse {\n");
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
