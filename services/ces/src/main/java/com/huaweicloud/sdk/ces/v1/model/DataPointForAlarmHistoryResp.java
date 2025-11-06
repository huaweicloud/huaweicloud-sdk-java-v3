package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释** 计算出该条告警历史的资源监控数据上报时间和监控数值。 
 */
public class DataPointForAlarmHistoryResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Double value;

    public DataPointForAlarmHistoryResp withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释** 计算出该条告警历史的资源监控数据上报时间，UNIX时间戳，单位毫秒，如：1603131028000。 **取值范围**： 不涉及 
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public DataPointForAlarmHistoryResp withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释** 计算出该条告警历史的资源监控数据在该时间点的监控数值，如：7.019。 **取值范围**： 具体阈值取值请参见附录中各服务监控指标中取值范围，如“[支持监控的服务列表](ces_03_0059.xml)”中ECS的CPU使用率cpu_util取值范围可配置80。最小值为0，最大值为1.7976931348623157e+108。 
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataPointForAlarmHistoryResp that = (DataPointForAlarmHistoryResp) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataPointForAlarmHistoryResp {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
