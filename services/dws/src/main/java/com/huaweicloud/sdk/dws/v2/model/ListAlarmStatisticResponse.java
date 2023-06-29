package com.huaweicloud.sdk.dws.v2.model;

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
public class ListAlarmStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_statistics")

    private List<AlarmStatisticResponse> alarmStatistics = null;

    public ListAlarmStatisticResponse withAlarmStatistics(List<AlarmStatisticResponse> alarmStatistics) {
        this.alarmStatistics = alarmStatistics;
        return this;
    }

    public ListAlarmStatisticResponse addAlarmStatisticsItem(AlarmStatisticResponse alarmStatisticsItem) {
        if (this.alarmStatistics == null) {
            this.alarmStatistics = new ArrayList<>();
        }
        this.alarmStatistics.add(alarmStatisticsItem);
        return this;
    }

    public ListAlarmStatisticResponse withAlarmStatistics(
        Consumer<List<AlarmStatisticResponse>> alarmStatisticsSetter) {
        if (this.alarmStatistics == null) {
            this.alarmStatistics = new ArrayList<>();
        }
        alarmStatisticsSetter.accept(this.alarmStatistics);
        return this;
    }

    /**
     * 告警统计列表
     * @return alarmStatistics
     */
    public List<AlarmStatisticResponse> getAlarmStatistics() {
        return alarmStatistics;
    }

    public void setAlarmStatistics(List<AlarmStatisticResponse> alarmStatistics) {
        this.alarmStatistics = alarmStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmStatisticResponse that = (ListAlarmStatisticResponse) obj;
        return Objects.equals(this.alarmStatistics, that.alarmStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmStatisticResponse {\n");
        sb.append("    alarmStatistics: ").append(toIndentedString(alarmStatistics)).append("\n");
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
