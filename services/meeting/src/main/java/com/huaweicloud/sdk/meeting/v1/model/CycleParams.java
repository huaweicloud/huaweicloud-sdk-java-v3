package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 周期参数 */
public class CycleParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startDate")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endDate")

    private String endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    private String cycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "point")

    private List<Integer> point = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preRemindDays")

    private Integer preRemindDays;

    public CycleParams withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /** 周期会议的开始日期，格式：YYYY-MM-DD。 开始日期不能早于当前日期。
     * 
     * @return startDate */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public CycleParams withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /** 周期会议的结束日期，格式：YYYY-MM-DD。 开始日期和结束日期间的时间间隔最长不能超过1年。 开始日期和结束日期之间最多允许50个子会议，若超过50个子会议，会自动调整结束日期。
     * 
     * @return endDate */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public CycleParams withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    /** 周期类型。 - Day: 天。 - Week: 星期。 - Month: 月。
     * 
     * @return cycle */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public CycleParams withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /** - cycle选择了Day，表示每几天召开一次，取值范围[1,60] - cycle选择了Week，表示每几周召开一次，取值范围[1,5] - cycle选择了Month，Interval表示隔几月，取值范围[1,12]
     * 
     * @return interval */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public CycleParams withPoint(List<Integer> point) {
        this.point = point;
        return this;
    }

    public CycleParams addPointItem(Integer pointItem) {
        if (this.point == null) {
            this.point = new ArrayList<>();
        }
        this.point.add(pointItem);
        return this;
    }

    public CycleParams withPoint(Consumer<List<Integer>> pointSetter) {
        if (this.point == null) {
            this.point = new ArrayList<>();
        }
        pointSetter.accept(this.point);
        return this;
    }

    /** 周期内的会议召开点。仅当按周和月时有效。 - cycle选择了Week，poInt中填入了两个元素1和3，则表示每个周一和周三召开会议，0表示周日。 -
     * cycle选择了Month，poInt中填入了12和20则表示每个月的12号和20号召开会议，取值范围为[1,31]，若当月没有该值，则为月末。
     * 
     * @return point */
    public List<Integer> getPoint() {
        return point;
    }

    public void setPoint(List<Integer> point) {
        this.point = point;
    }

    public CycleParams withPreRemindDays(Integer preRemindDays) {
        this.preRemindDays = preRemindDays;
        return this;
    }

    /** 支持用户指定提前会议通知的天数N，预订人收到整个周期会议的通知，所有与会人在每个子会议召开时间的前N天收到会议通知（包括日历）。
     * 天数N的输入根据间隔期进行自动调整，如果按日每隔2天召开，则N自动变为2，如果为按周每2周的周一、周二，则N自动变为14。 约束：暂不考虑夏令时处理。 取值范围[1,30]。 default: 1 minimum: 1
     * maximum: 30
     * 
     * @return preRemindDays */
    public Integer getPreRemindDays() {
        return preRemindDays;
    }

    public void setPreRemindDays(Integer preRemindDays) {
        this.preRemindDays = preRemindDays;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CycleParams cycleParams = (CycleParams) o;
        return Objects.equals(this.startDate, cycleParams.startDate)
            && Objects.equals(this.endDate, cycleParams.endDate) && Objects.equals(this.cycle, cycleParams.cycle)
            && Objects.equals(this.interval, cycleParams.interval) && Objects.equals(this.point, cycleParams.point)
            && Objects.equals(this.preRemindDays, cycleParams.preRemindDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, endDate, cycle, interval, point, preRemindDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CycleParams {\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    point: ").append(toIndentedString(point)).append("\n");
        sb.append("    preRemindDays: ").append(toIndentedString(preRemindDays)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
