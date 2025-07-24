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
public class ShowAlarmTrendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault_hosts")

    private List<FaultHostInfo> faultHosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_daily_new_trends")

    private List<AlarmDailyTrend> alarmDailyNewTrends = null;

    public ShowAlarmTrendResponse withFaultHosts(List<FaultHostInfo> faultHosts) {
        this.faultHosts = faultHosts;
        return this;
    }

    public ShowAlarmTrendResponse addFaultHostsItem(FaultHostInfo faultHostsItem) {
        if (this.faultHosts == null) {
            this.faultHosts = new ArrayList<>();
        }
        this.faultHosts.add(faultHostsItem);
        return this;
    }

    public ShowAlarmTrendResponse withFaultHosts(Consumer<List<FaultHostInfo>> faultHostsSetter) {
        if (this.faultHosts == null) {
            this.faultHosts = new ArrayList<>();
        }
        faultHostsSetter.accept(this.faultHosts);
        return this;
    }

    /**
     * 故障服务器数趋势
     * @return faultHosts
     */
    public List<FaultHostInfo> getFaultHosts() {
        return faultHosts;
    }

    public void setFaultHosts(List<FaultHostInfo> faultHosts) {
        this.faultHosts = faultHosts;
    }

    public ShowAlarmTrendResponse withAlarmDailyNewTrends(List<AlarmDailyTrend> alarmDailyNewTrends) {
        this.alarmDailyNewTrends = alarmDailyNewTrends;
        return this;
    }

    public ShowAlarmTrendResponse addAlarmDailyNewTrendsItem(AlarmDailyTrend alarmDailyNewTrendsItem) {
        if (this.alarmDailyNewTrends == null) {
            this.alarmDailyNewTrends = new ArrayList<>();
        }
        this.alarmDailyNewTrends.add(alarmDailyNewTrendsItem);
        return this;
    }

    public ShowAlarmTrendResponse withAlarmDailyNewTrends(Consumer<List<AlarmDailyTrend>> alarmDailyNewTrendsSetter) {
        if (this.alarmDailyNewTrends == null) {
            this.alarmDailyNewTrends = new ArrayList<>();
        }
        alarmDailyNewTrendsSetter.accept(this.alarmDailyNewTrends);
        return this;
    }

    /**
     * 告警每日新增趋势
     * @return alarmDailyNewTrends
     */
    public List<AlarmDailyTrend> getAlarmDailyNewTrends() {
        return alarmDailyNewTrends;
    }

    public void setAlarmDailyNewTrends(List<AlarmDailyTrend> alarmDailyNewTrends) {
        this.alarmDailyNewTrends = alarmDailyNewTrends;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAlarmTrendResponse that = (ShowAlarmTrendResponse) obj;
        return Objects.equals(this.faultHosts, that.faultHosts)
            && Objects.equals(this.alarmDailyNewTrends, that.alarmDailyNewTrends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faultHosts, alarmDailyNewTrends);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlarmTrendResponse {\n");
        sb.append("    faultHosts: ").append(toIndentedString(faultHosts)).append("\n");
        sb.append("    alarmDailyNewTrends: ").append(toIndentedString(alarmDailyNewTrends)).append("\n");
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
