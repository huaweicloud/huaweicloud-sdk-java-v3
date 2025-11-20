package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 扫描时间 
 */
public class VulScanPolicyResponseInfoTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_part")

    private List<Integer> dayPart = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hour_part")

    private Integer hourPart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minute_part")

    private Integer minutePart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_scan_time")

    private Long nextScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone_offset")

    private Integer timezoneOffset;

    public VulScanPolicyResponseInfoTime withDayPart(List<Integer> dayPart) {
        this.dayPart = dayPart;
        return this;
    }

    public VulScanPolicyResponseInfoTime addDayPartItem(Integer dayPartItem) {
        if (this.dayPart == null) {
            this.dayPart = new ArrayList<>();
        }
        this.dayPart.add(dayPartItem);
        return this;
    }

    public VulScanPolicyResponseInfoTime withDayPart(Consumer<List<Integer>> dayPartSetter) {
        if (this.dayPart == null) {
            this.dayPart = new ArrayList<>();
        }
        dayPartSetter.accept(this.dayPart);
        return this;
    }

    /**
     * **参数解释**: 扫描日期或者星期列表 **取值范围**: 最小值0，最大值31 
     * @return dayPart
     */
    public List<Integer> getDayPart() {
        return dayPart;
    }

    public void setDayPart(List<Integer> dayPart) {
        this.dayPart = dayPart;
    }

    public VulScanPolicyResponseInfoTime withHourPart(Integer hourPart) {
        this.hourPart = hourPart;
        return this;
    }

    /**
     * **参数解释**: 扫描时间的小时部分 **取值范围**: 最小值0，最大值11 
     * @return hourPart
     */
    public Integer getHourPart() {
        return hourPart;
    }

    public void setHourPart(Integer hourPart) {
        this.hourPart = hourPart;
    }

    public VulScanPolicyResponseInfoTime withMinutePart(Integer minutePart) {
        this.minutePart = minutePart;
        return this;
    }

    /**
     * **参数解释**: 扫描时间的分钟部分 **取值范围**: 最小值0，最大值59 
     * @return minutePart
     */
    public Integer getMinutePart() {
        return minutePart;
    }

    public void setMinutePart(Integer minutePart) {
        this.minutePart = minutePart;
    }

    public VulScanPolicyResponseInfoTime withNextScanTime(Long nextScanTime) {
        this.nextScanTime = nextScanTime;
        return this;
    }

    /**
     * **参数解释**: 下一次扫描时间 **取值范围**: 最小值0，最大值2^63-1 
     * @return nextScanTime
     */
    public Long getNextScanTime() {
        return nextScanTime;
    }

    public void setNextScanTime(Long nextScanTime) {
        this.nextScanTime = nextScanTime;
    }

    public VulScanPolicyResponseInfoTime withTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    /**
     * **参数解释**: 距离标准时区的差值，如东八区（GMT+8）为-480 **取值范围**: 最小值-840，最大值720 
     * @return timezoneOffset
     */
    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulScanPolicyResponseInfoTime that = (VulScanPolicyResponseInfoTime) obj;
        return Objects.equals(this.dayPart, that.dayPart) && Objects.equals(this.hourPart, that.hourPart)
            && Objects.equals(this.minutePart, that.minutePart) && Objects.equals(this.nextScanTime, that.nextScanTime)
            && Objects.equals(this.timezoneOffset, that.timezoneOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayPart, hourPart, minutePart, nextScanTime, timezoneOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulScanPolicyResponseInfoTime {\n");
        sb.append("    dayPart: ").append(toIndentedString(dayPart)).append("\n");
        sb.append("    hourPart: ").append(toIndentedString(hourPart)).append("\n");
        sb.append("    minutePart: ").append(toIndentedString(minutePart)).append("\n");
        sb.append("    nextScanTime: ").append(toIndentedString(nextScanTime)).append("\n");
        sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
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
