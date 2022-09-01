package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 活动时间窗设置。
 */
public class BalancerActiveWindow {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_time")

    @JacksonXmlProperty(localName = "stop_time")

    private String stopTime;

    public BalancerActiveWindow withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 活动时间窗开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public BalancerActiveWindow withStopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /**
     * 活动时间窗结束时间。
     * @return stopTime
     */
    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BalancerActiveWindow balancerActiveWindow = (BalancerActiveWindow) o;
        return Objects.equals(this.startTime, balancerActiveWindow.startTime)
            && Objects.equals(this.stopTime, balancerActiveWindow.stopTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, stopTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BalancerActiveWindow {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
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
