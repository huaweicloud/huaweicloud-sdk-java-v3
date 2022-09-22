package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 含阈值告警的QoS数据元素，包括时间，QoS取值，告警状态，产生告警时的阈值。
 */
public class QosDataElement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Integer value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm")

    private Boolean alarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Integer threshold;

    public QosDataElement withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * QoS时间点, UTC时间，格式：yyyy-MM-ddTHH:mm:ss.SSSZ。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public QosDataElement withValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * QoS值。
     * @return value
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public QosDataElement withAlarm(Boolean alarm) {
        this.alarm = alarm;
        return this;
    }

    /**
     * 该时间点是否有阈值告警。 * true: 阈值告警 * false: 无阈值告警 
     * @return alarm
     */
    public Boolean getAlarm() {
        return alarm;
    }

    public void setAlarm(Boolean alarm) {
        this.alarm = alarm;
    }

    public QosDataElement withThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 该时间点的阈值。
     * @return threshold
     */
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QosDataElement qosDataElement = (QosDataElement) o;
        return Objects.equals(this.time, qosDataElement.time) && Objects.equals(this.value, qosDataElement.value)
            && Objects.equals(this.alarm, qosDataElement.alarm)
            && Objects.equals(this.threshold, qosDataElement.threshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, value, alarm, threshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QosDataElement {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    alarm: ").append(toIndentedString(alarm)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
