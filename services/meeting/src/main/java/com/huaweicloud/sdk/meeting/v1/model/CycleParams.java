package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 周期会议的参数。
 */
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

    /**
     * 周期会议的开始日期，格式：YYYY-MM-DD。 开始日期不能早于当前日期。 > 日期是timeZoneID指定的时区的日期，非UTC时间的日期。
     * @return startDate
     */
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

    /**
     * 周期会议的结束日期，格式：YYYY-MM-DD。 开始日期和结束日期间的时间间隔最长不能超过1年。开始日期和结束日期之间最多允许50个子会议，若超过50个子会议，会自动调整结束日期。 > 日期是timeZoneID指定的时区的日期，非UTC时间的日期。
     * @return endDate
     */
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

    /**
     * 周期类型。 - Day: 天 - Week: 星期 - Month: 月
     * @return cycle
     */
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

    /**
     * 子会议间隔。 - cycle选择了Day，表示每几天召开一次，取值范围[1,15] - cycle选择了Week，表示每几周召开一次，取值范围[1,5] - cycle选择了Month，Interval表示隔几月，取值范围[1,3]
     * @return interval
     */
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

    /**
     * 周期内的会议召开点。仅当按周和月时有效。 - cycle选择了Week，point中填入了两个元素1和3，则表示每个周一和周三召开会议，0表示周日 - cycle选择了Month，point中填入了12和20则表示每个月的12号和20号召开会议，取值范围为[1,31]，若当月没有该值，则为月末
     * @return point
     */
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

    /**
     * 提前通知天数。所有与会者在每个子会议开始前N天收到会议通知。取值范围[0,30]。 默认值是1。
     * minimum: 0
     * maximum: 30
     * @return preRemindDays
     */
    public Integer getPreRemindDays() {
        return preRemindDays;
    }

    public void setPreRemindDays(Integer preRemindDays) {
        this.preRemindDays = preRemindDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CycleParams that = (CycleParams) obj;
        return Objects.equals(this.startDate, that.startDate) && Objects.equals(this.endDate, that.endDate)
            && Objects.equals(this.cycle, that.cycle) && Objects.equals(this.interval, that.interval)
            && Objects.equals(this.point, that.point) && Objects.equals(this.preRemindDays, that.preRemindDays);
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
