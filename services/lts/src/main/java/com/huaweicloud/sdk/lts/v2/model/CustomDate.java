package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警规则配置的自定义查询区间。
 */
public class CustomDate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Integer start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_unit")

    private String startUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private Integer end;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_unit")

    private String endUnit;

    public CustomDate withStart(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * **参数解释：** 查询起始时间相对于告警计划执行时间的偏移量数值。 **约束限制：** 根据start_unit字段的单位将有不同的取值范围，根据单位将start换算为时间不超过1天。 **取值范围：** start_unit取值为second，start取值范围为 1-86400； start_unit取值为minute，start取值范围为 1-1440； start_unit取值为hour，start取值范围为 1-24。 **默认取值：** -无。
     * @return start
     */
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public CustomDate withStartUnit(String startUnit) {
        this.startUnit = startUnit;
        return this;
    }

    /**
     * **参数解释：** 查询起始时间相对于告警计划执行时间的偏移量单位。 **约束限制：** 整点时间即is_time_range_relative为false时start_unit不支持second。 **取值范围：** - hour - minute - second **默认取值：** minute
     * @return startUnit
     */
    public String getStartUnit() {
        return startUnit;
    }

    public void setStartUnit(String startUnit) {
        this.startUnit = startUnit;
    }

    public CustomDate withEnd(Integer end) {
        this.end = end;
        return this;
    }

    /**
     * **参数解释：** 查询结束时间相对于告警计划执行时间的偏移量数值。 **约束限制：** 根据end_unit字段的单位将有不同的取值范围，根据单位将end换算为时间不超过1天； **取值范围：** end_unit取值为second，endt取值范围为 0-86399； end_unit取值为minute，end取值范围为 0-1439； end_unit取值为hour，end取值范围为 0-23。 **默认取值：** -无。
     * @return end
     */
    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public CustomDate withEndUnit(String endUnit) {
        this.endUnit = endUnit;
        return this;
    }

    /**
     * **参数解释：** 查询结束时间相对于告警计划执行时间的偏移量单位。 **约束限制：** 整点时间即is_time_range_relative为false时end_unit不支持second。 **取值范围：** - hour - minute - second **默认取值：** minute
     * @return endUnit
     */
    public String getEndUnit() {
        return endUnit;
    }

    public void setEndUnit(String endUnit) {
        this.endUnit = endUnit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomDate that = (CustomDate) obj;
        return Objects.equals(this.start, that.start) && Objects.equals(this.startUnit, that.startUnit)
            && Objects.equals(this.end, that.end) && Objects.equals(this.endUnit, that.endUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, startUnit, end, endUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomDate {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    startUnit: ").append(toIndentedString(startUnit)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    endUnit: ").append(toIndentedString(endUnit)).append("\n");
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
