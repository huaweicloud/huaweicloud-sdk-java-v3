package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowHttpAttackTimelineStatsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private String statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private String groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by_value")

    private String groupByValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<TimeStatItem> values = null;

    public ShowHttpAttackTimelineStatsResponse withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /**
     * 指标类型
     * @return statType
     */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public ShowHttpAttackTimelineStatsResponse withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 分组类型
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public ShowHttpAttackTimelineStatsResponse withGroupByValue(String groupByValue) {
        this.groupByValue = groupByValue;
        return this;
    }

    /**
     * 分组类型对应的具体的值
     * @return groupByValue
     */
    public String getGroupByValue() {
        return groupByValue;
    }

    public void setGroupByValue(String groupByValue) {
        this.groupByValue = groupByValue;
    }

    public ShowHttpAttackTimelineStatsResponse withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 时间粒度(单位：秒)
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public ShowHttpAttackTimelineStatsResponse withValues(List<TimeStatItem> values) {
        this.values = values;
        return this;
    }

    public ShowHttpAttackTimelineStatsResponse addValuesItem(TimeStatItem valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ShowHttpAttackTimelineStatsResponse withValues(Consumer<List<TimeStatItem>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 值数组
     * @return values
     */
    public List<TimeStatItem> getValues() {
        return values;
    }

    public void setValues(List<TimeStatItem> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHttpAttackTimelineStatsResponse that = (ShowHttpAttackTimelineStatsResponse) obj;
        return Objects.equals(this.statType, that.statType) && Objects.equals(this.groupBy, that.groupBy)
            && Objects.equals(this.groupByValue, that.groupByValue) && Objects.equals(this.interval, that.interval)
            && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statType, groupBy, groupByValue, interval, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHttpAttackTimelineStatsResponse {\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    groupByValue: ").append(toIndentedString(groupByValue)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
