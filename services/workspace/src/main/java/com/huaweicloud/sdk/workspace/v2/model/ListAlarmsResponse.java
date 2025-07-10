package com.huaweicloud.sdk.workspace.v2.model;

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
    @JsonProperty(value = "alarm_histories")

    private List<AlarmHistoryItem> alarmHistories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAlarmsResponse withAlarmHistories(List<AlarmHistoryItem> alarmHistories) {
        this.alarmHistories = alarmHistories;
        return this;
    }

    public ListAlarmsResponse addAlarmHistoriesItem(AlarmHistoryItem alarmHistoriesItem) {
        if (this.alarmHistories == null) {
            this.alarmHistories = new ArrayList<>();
        }
        this.alarmHistories.add(alarmHistoriesItem);
        return this;
    }

    public ListAlarmsResponse withAlarmHistories(Consumer<List<AlarmHistoryItem>> alarmHistoriesSetter) {
        if (this.alarmHistories == null) {
            this.alarmHistories = new ArrayList<>();
        }
        alarmHistoriesSetter.accept(this.alarmHistories);
        return this;
    }

    /**
     * alarmHistories列表。
     * @return alarmHistories
     */
    public List<AlarmHistoryItem> getAlarmHistories() {
        return alarmHistories;
    }

    public void setAlarmHistories(List<AlarmHistoryItem> alarmHistories) {
        this.alarmHistories = alarmHistories;
    }

    public ListAlarmsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 告警记录列表总数。
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
        return Objects.equals(this.alarmHistories, that.alarmHistories) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmHistories, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmsResponse {\n");
        sb.append("    alarmHistories: ").append(toIndentedString(alarmHistories)).append("\n");
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
