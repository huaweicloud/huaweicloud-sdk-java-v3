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
public class ListAlarmConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_configs")

    private List<AlarmConfigResponse> alarmConfigs = null;

    public ListAlarmConfigsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 告警配置总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAlarmConfigsResponse withAlarmConfigs(List<AlarmConfigResponse> alarmConfigs) {
        this.alarmConfigs = alarmConfigs;
        return this;
    }

    public ListAlarmConfigsResponse addAlarmConfigsItem(AlarmConfigResponse alarmConfigsItem) {
        if (this.alarmConfigs == null) {
            this.alarmConfigs = new ArrayList<>();
        }
        this.alarmConfigs.add(alarmConfigsItem);
        return this;
    }

    public ListAlarmConfigsResponse withAlarmConfigs(Consumer<List<AlarmConfigResponse>> alarmConfigsSetter) {
        if (this.alarmConfigs == null) {
            this.alarmConfigs = new ArrayList<>();
        }
        alarmConfigsSetter.accept(this.alarmConfigs);
        return this;
    }

    /**
     * 告警配置列表
     * @return alarmConfigs
     */
    public List<AlarmConfigResponse> getAlarmConfigs() {
        return alarmConfigs;
    }

    public void setAlarmConfigs(List<AlarmConfigResponse> alarmConfigs) {
        this.alarmConfigs = alarmConfigs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlarmConfigsResponse listAlarmConfigsResponse = (ListAlarmConfigsResponse) o;
        return Objects.equals(this.count, listAlarmConfigsResponse.count)
            && Objects.equals(this.alarmConfigs, listAlarmConfigsResponse.alarmConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, alarmConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmConfigsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    alarmConfigs: ").append(toIndentedString(alarmConfigs)).append("\n");
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
