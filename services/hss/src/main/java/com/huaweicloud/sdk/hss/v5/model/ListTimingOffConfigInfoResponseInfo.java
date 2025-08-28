package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 定时关闭防护功能配置详情
 */
public class ListTimingOffConfigInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "week_off_list")

    private List<Integer> weekOffList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timing_range_list")

    private List<TimingRangeConfigInfo> timingRangeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    public ListTimingOffConfigInfoResponseInfo withWeekOffList(List<Integer> weekOffList) {
        this.weekOffList = weekOffList;
        return this;
    }

    public ListTimingOffConfigInfoResponseInfo addWeekOffListItem(Integer weekOffListItem) {
        if (this.weekOffList == null) {
            this.weekOffList = new ArrayList<>();
        }
        this.weekOffList.add(weekOffListItem);
        return this;
    }

    public ListTimingOffConfigInfoResponseInfo withWeekOffList(Consumer<List<Integer>> weekOffListSetter) {
        if (this.weekOffList == null) {
            this.weekOffList = new ArrayList<>();
        }
        weekOffListSetter.accept(this.weekOffList);
        return this;
    }

    /**
     * **参数解释**: 自动关闭防护周期列表 **取值范围**: 最少0条，最多7条 
     * @return weekOffList
     */
    public List<Integer> getWeekOffList() {
        return weekOffList;
    }

    public void setWeekOffList(List<Integer> weekOffList) {
        this.weekOffList = weekOffList;
    }

    public ListTimingOffConfigInfoResponseInfo withTimingRangeList(List<TimingRangeConfigInfo> timingRangeList) {
        this.timingRangeList = timingRangeList;
        return this;
    }

    public ListTimingOffConfigInfoResponseInfo addTimingRangeListItem(TimingRangeConfigInfo timingRangeListItem) {
        if (this.timingRangeList == null) {
            this.timingRangeList = new ArrayList<>();
        }
        this.timingRangeList.add(timingRangeListItem);
        return this;
    }

    public ListTimingOffConfigInfoResponseInfo withTimingRangeList(
        Consumer<List<TimingRangeConfigInfo>> timingRangeListSetter) {
        if (this.timingRangeList == null) {
            this.timingRangeList = new ArrayList<>();
        }
        timingRangeListSetter.accept(this.timingRangeList);
        return this;
    }

    /**
     * **参数解释**: 自动关闭防护时间段 **取值范围**: 最少0条，最多5条 
     * @return timingRangeList
     */
    public List<TimingRangeConfigInfo> getTimingRangeList() {
        return timingRangeList;
    }

    public void setTimingRangeList(List<TimingRangeConfigInfo> timingRangeList) {
        this.timingRangeList = timingRangeList;
    }

    public ListTimingOffConfigInfoResponseInfo withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTimingOffConfigInfoResponseInfo that = (ListTimingOffConfigInfoResponseInfo) obj;
        return Objects.equals(this.weekOffList, that.weekOffList)
            && Objects.equals(this.timingRangeList, that.timingRangeList)
            && Objects.equals(this.totalNum, that.totalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weekOffList, timingRangeList, totalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTimingOffConfigInfoResponseInfo {\n");
        sb.append("    weekOffList: ").append(toIndentedString(weekOffList)).append("\n");
        sb.append("    timingRangeList: ").append(toIndentedString(timingRangeList)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
