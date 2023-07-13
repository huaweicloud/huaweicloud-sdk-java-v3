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
public class ListAlarmSubsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_subscriptions")

    private List<AlarmSubscriptionResponse> alarmSubscriptions = null;

    public ListAlarmSubsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 告警订阅总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAlarmSubsResponse withAlarmSubscriptions(List<AlarmSubscriptionResponse> alarmSubscriptions) {
        this.alarmSubscriptions = alarmSubscriptions;
        return this;
    }

    public ListAlarmSubsResponse addAlarmSubscriptionsItem(AlarmSubscriptionResponse alarmSubscriptionsItem) {
        if (this.alarmSubscriptions == null) {
            this.alarmSubscriptions = new ArrayList<>();
        }
        this.alarmSubscriptions.add(alarmSubscriptionsItem);
        return this;
    }

    public ListAlarmSubsResponse withAlarmSubscriptions(
        Consumer<List<AlarmSubscriptionResponse>> alarmSubscriptionsSetter) {
        if (this.alarmSubscriptions == null) {
            this.alarmSubscriptions = new ArrayList<>();
        }
        alarmSubscriptionsSetter.accept(this.alarmSubscriptions);
        return this;
    }

    /**
     * 告警订阅列表
     * @return alarmSubscriptions
     */
    public List<AlarmSubscriptionResponse> getAlarmSubscriptions() {
        return alarmSubscriptions;
    }

    public void setAlarmSubscriptions(List<AlarmSubscriptionResponse> alarmSubscriptions) {
        this.alarmSubscriptions = alarmSubscriptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmSubsResponse that = (ListAlarmSubsResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.alarmSubscriptions, that.alarmSubscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, alarmSubscriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmSubsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    alarmSubscriptions: ").append(toIndentedString(alarmSubscriptions)).append("\n");
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
