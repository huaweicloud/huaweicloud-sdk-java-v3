package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 速率参数
 */
public class SpeedLimitlJson {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private String end;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    private Integer speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "over_speed_threshold")

    private Double overSpeedThreshold;

    public SpeedLimitlJson withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * 时间段开始时间，格式：XX:XX。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public SpeedLimitlJson withEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * 时间段结束时间，格式：XX:XX。
     * @return end
     */
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public SpeedLimitlJson withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 时间段的速率，0-1000的整数，单位：Mbit/s。
     * minimum: 0
     * maximum: 10000
     * @return speed
     */
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public SpeedLimitlJson withOverSpeedThreshold(Double overSpeedThreshold) {
        this.overSpeedThreshold = overSpeedThreshold;
        return this;
    }

    /**
     * 停止迁移的超速阈值。 是一个迁移速率的保护机制，超出该阈值会停止任务。它主要用于控制迁移过程中资源（特别是网络带宽）的消耗，确保系统的整体性能不受单一迁移任务影响 单位是百分比
     * minimum: 1E+1
     * maximum: 1E+2
     * @return overSpeedThreshold
     */
    public Double getOverSpeedThreshold() {
        return overSpeedThreshold;
    }

    public void setOverSpeedThreshold(Double overSpeedThreshold) {
        this.overSpeedThreshold = overSpeedThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpeedLimitlJson that = (SpeedLimitlJson) obj;
        return Objects.equals(this.start, that.start) && Objects.equals(this.end, that.end)
            && Objects.equals(this.speed, that.speed)
            && Objects.equals(this.overSpeedThreshold, that.overSpeedThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, speed, overSpeedThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpeedLimitlJson {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    overSpeedThreshold: ").append(toIndentedString(overSpeedThreshold)).append("\n");
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
