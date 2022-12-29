package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务开始运行时间信息
 */
public class StartTimeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private String frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_time_frame")

    private List<TimeFrame> dayTimeFrame = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_time_frame")

    private List<TimeFrame> singleTimeFrame = null;

    public StartTimeInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务启动时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public StartTimeInfo withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * 任务运行频率（定时任务频率，每天运行还是单次运行）
     * @return frequency
     */
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public StartTimeInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 任务运行模式（按时间段运行还是按频率运行）
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public StartTimeInfo withDayTimeFrame(List<TimeFrame> dayTimeFrame) {
        this.dayTimeFrame = dayTimeFrame;
        return this;
    }

    public StartTimeInfo addDayTimeFrameItem(TimeFrame dayTimeFrameItem) {
        if (this.dayTimeFrame == null) {
            this.dayTimeFrame = new ArrayList<>();
        }
        this.dayTimeFrame.add(dayTimeFrameItem);
        return this;
    }

    public StartTimeInfo withDayTimeFrame(Consumer<List<TimeFrame>> dayTimeFrameSetter) {
        if (this.dayTimeFrame == null) {
            this.dayTimeFrame = new ArrayList<>();
        }
        dayTimeFrameSetter.accept(this.dayTimeFrame);
        return this;
    }

    /**
     * 每天运行时间段
     * @return dayTimeFrame
     */
    public List<TimeFrame> getDayTimeFrame() {
        return dayTimeFrame;
    }

    public void setDayTimeFrame(List<TimeFrame> dayTimeFrame) {
        this.dayTimeFrame = dayTimeFrame;
    }

    public StartTimeInfo withSingleTimeFrame(List<TimeFrame> singleTimeFrame) {
        this.singleTimeFrame = singleTimeFrame;
        return this;
    }

    public StartTimeInfo addSingleTimeFrameItem(TimeFrame singleTimeFrameItem) {
        if (this.singleTimeFrame == null) {
            this.singleTimeFrame = new ArrayList<>();
        }
        this.singleTimeFrame.add(singleTimeFrameItem);
        return this;
    }

    public StartTimeInfo withSingleTimeFrame(Consumer<List<TimeFrame>> singleTimeFrameSetter) {
        if (this.singleTimeFrame == null) {
            this.singleTimeFrame = new ArrayList<>();
        }
        singleTimeFrameSetter.accept(this.singleTimeFrame);
        return this;
    }

    /**
     * 每次运行时间段
     * @return singleTimeFrame
     */
    public List<TimeFrame> getSingleTimeFrame() {
        return singleTimeFrame;
    }

    public void setSingleTimeFrame(List<TimeFrame> singleTimeFrame) {
        this.singleTimeFrame = singleTimeFrame;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartTimeInfo startTimeInfo = (StartTimeInfo) o;
        return Objects.equals(this.startTime, startTimeInfo.startTime)
            && Objects.equals(this.frequency, startTimeInfo.frequency) && Objects.equals(this.mode, startTimeInfo.mode)
            && Objects.equals(this.dayTimeFrame, startTimeInfo.dayTimeFrame)
            && Objects.equals(this.singleTimeFrame, startTimeInfo.singleTimeFrame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, frequency, mode, dayTimeFrame, singleTimeFrame);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartTimeInfo {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    dayTimeFrame: ").append(toIndentedString(dayTimeFrame)).append("\n");
        sb.append("    singleTimeFrame: ").append(toIndentedString(singleTimeFrame)).append("\n");
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
