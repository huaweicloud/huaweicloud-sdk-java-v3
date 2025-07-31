package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WebTamperTimingOffConfigInfoRequestInfo
 */
public class WebTamperTimingOffConfigInfoRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "week_off_list")

    private List<Integer> weekOffList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timing_range_list")

    private List<TimingRangeConfigInfo> timingRangeList = null;

    public WebTamperTimingOffConfigInfoRequestInfo withWeekOffList(List<Integer> weekOffList) {
        this.weekOffList = weekOffList;
        return this;
    }

    public WebTamperTimingOffConfigInfoRequestInfo addWeekOffListItem(Integer weekOffListItem) {
        if (this.weekOffList == null) {
            this.weekOffList = new ArrayList<>();
        }
        this.weekOffList.add(weekOffListItem);
        return this;
    }

    public WebTamperTimingOffConfigInfoRequestInfo withWeekOffList(Consumer<List<Integer>> weekOffListSetter) {
        if (this.weekOffList == null) {
            this.weekOffList = new ArrayList<>();
        }
        weekOffListSetter.accept(this.weekOffList);
        return this;
    }

    /**
     * 关闭防护周期
     * @return weekOffList
     */
    public List<Integer> getWeekOffList() {
        return weekOffList;
    }

    public void setWeekOffList(List<Integer> weekOffList) {
        this.weekOffList = weekOffList;
    }

    public WebTamperTimingOffConfigInfoRequestInfo withTimingRangeList(List<TimingRangeConfigInfo> timingRangeList) {
        this.timingRangeList = timingRangeList;
        return this;
    }

    public WebTamperTimingOffConfigInfoRequestInfo addTimingRangeListItem(TimingRangeConfigInfo timingRangeListItem) {
        if (this.timingRangeList == null) {
            this.timingRangeList = new ArrayList<>();
        }
        this.timingRangeList.add(timingRangeListItem);
        return this;
    }

    public WebTamperTimingOffConfigInfoRequestInfo withTimingRangeList(
        Consumer<List<TimingRangeConfigInfo>> timingRangeListSetter) {
        if (this.timingRangeList == null) {
            this.timingRangeList = new ArrayList<>();
        }
        timingRangeListSetter.accept(this.timingRangeList);
        return this;
    }

    /**
     * 时间段
     * @return timingRangeList
     */
    public List<TimingRangeConfigInfo> getTimingRangeList() {
        return timingRangeList;
    }

    public void setTimingRangeList(List<TimingRangeConfigInfo> timingRangeList) {
        this.timingRangeList = timingRangeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebTamperTimingOffConfigInfoRequestInfo that = (WebTamperTimingOffConfigInfoRequestInfo) obj;
        return Objects.equals(this.weekOffList, that.weekOffList)
            && Objects.equals(this.timingRangeList, that.timingRangeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weekOffList, timingRangeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebTamperTimingOffConfigInfoRequestInfo {\n");
        sb.append("    weekOffList: ").append(toIndentedString(weekOffList)).append("\n");
        sb.append("    timingRangeList: ").append(toIndentedString(timingRangeList)).append("\n");
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
