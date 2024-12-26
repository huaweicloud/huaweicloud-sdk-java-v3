package com.huaweicloud.sdk.cfw.v1.model;

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
public class ShowAlarmConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_configs")

    private List<AlarmConfig> alarmConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    public ShowAlarmConfigResponse withAlarmConfigs(List<AlarmConfig> alarmConfigs) {
        this.alarmConfigs = alarmConfigs;
        return this;
    }

    public ShowAlarmConfigResponse addAlarmConfigsItem(AlarmConfig alarmConfigsItem) {
        if (this.alarmConfigs == null) {
            this.alarmConfigs = new ArrayList<>();
        }
        this.alarmConfigs.add(alarmConfigsItem);
        return this;
    }

    public ShowAlarmConfigResponse withAlarmConfigs(Consumer<List<AlarmConfig>> alarmConfigsSetter) {
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
    public List<AlarmConfig> getAlarmConfigs() {
        return alarmConfigs;
    }

    public void setAlarmConfigs(List<AlarmConfig> alarmConfigs) {
        this.alarmConfigs = alarmConfigs;
    }

    public ShowAlarmConfigResponse withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAlarmConfigResponse that = (ShowAlarmConfigResponse) obj;
        return Objects.equals(this.alarmConfigs, that.alarmConfigs) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmConfigs, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlarmConfigResponse {\n");
        sb.append("    alarmConfigs: ").append(toIndentedString(alarmConfigs)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
