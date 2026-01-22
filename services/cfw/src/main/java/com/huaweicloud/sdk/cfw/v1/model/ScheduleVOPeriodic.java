package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ScheduleVOPeriodic
 */
public class ScheduleVOPeriodic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "week_mask")

    private List<Integer> weekMask = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_week")

    private Integer startWeek;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_week")

    private Integer endWeek;

    public ScheduleVOPeriodic withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 周期计划类型 **取值范围**： 0：每天 1：每周的某几天 2：每周的一段时间
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ScheduleVOPeriodic withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 周期计划开始时间 **取值范围**： 不涉及
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ScheduleVOPeriodic withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 周期计划结束时间 **取值范围**： 不涉及
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ScheduleVOPeriodic withWeekMask(List<Integer> weekMask) {
        this.weekMask = weekMask;
        return this;
    }

    public ScheduleVOPeriodic addWeekMaskItem(Integer weekMaskItem) {
        if (this.weekMask == null) {
            this.weekMask = new ArrayList<>();
        }
        this.weekMask.add(weekMaskItem);
        return this;
    }

    public ScheduleVOPeriodic withWeekMask(Consumer<List<Integer>> weekMaskSetter) {
        if (this.weekMask == null) {
            this.weekMask = new ArrayList<>();
        }
        weekMaskSetter.accept(this.weekMask);
        return this;
    }

    /**
     * **参数解释**： 每周的某几天 **取值范围**： 不涉及
     * @return weekMask
     */
    public List<Integer> getWeekMask() {
        return weekMask;
    }

    public void setWeekMask(List<Integer> weekMask) {
        this.weekMask = weekMask;
    }

    public ScheduleVOPeriodic withStartWeek(Integer startWeek) {
        this.startWeek = startWeek;
        return this;
    }

    /**
     * **参数解释**： 每周周期计划开始日 **取值范围**： 不涉及
     * minimum: 1
     * maximum: 7
     * @return startWeek
     */
    public Integer getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(Integer startWeek) {
        this.startWeek = startWeek;
    }

    public ScheduleVOPeriodic withEndWeek(Integer endWeek) {
        this.endWeek = endWeek;
        return this;
    }

    /**
     * **参数解释**： 每周周期计划结束日 **取值范围**： 不涉及
     * minimum: 1
     * maximum: 7
     * @return endWeek
     */
    public Integer getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(Integer endWeek) {
        this.endWeek = endWeek;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleVOPeriodic that = (ScheduleVOPeriodic) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.weekMask, that.weekMask)
            && Objects.equals(this.startWeek, that.startWeek) && Objects.equals(this.endWeek, that.endWeek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, startTime, endTime, weekMask, startWeek, endWeek);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleVOPeriodic {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    weekMask: ").append(toIndentedString(weekMask)).append("\n");
        sb.append("    startWeek: ").append(toIndentedString(startWeek)).append("\n");
        sb.append("    endWeek: ").append(toIndentedString(endWeek)).append("\n");
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
