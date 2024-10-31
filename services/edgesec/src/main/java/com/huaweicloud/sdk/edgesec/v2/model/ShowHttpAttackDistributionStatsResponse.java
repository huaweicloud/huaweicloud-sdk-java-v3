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
public class ShowHttpAttackDistributionStatsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private String statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private String groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_num")

    private Long statNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private List<CommonStatItem> values = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public ShowHttpAttackDistributionStatsResponse withStatType(String statType) {
        this.statType = statType;
        return this;
    }

    /**
     * 安全统计指标类型。
     * @return statType
     */
    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public ShowHttpAttackDistributionStatsResponse withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 分组统计维度
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public ShowHttpAttackDistributionStatsResponse withStatNum(Long statNum) {
        this.statNum = statNum;
        return this;
    }

    /**
     * 统计数量
     * @return statNum
     */
    public Long getStatNum() {
        return statNum;
    }

    public void setStatNum(Long statNum) {
        this.statNum = statNum;
    }

    public ShowHttpAttackDistributionStatsResponse withValues(List<CommonStatItem> values) {
        this.values = values;
        return this;
    }

    public ShowHttpAttackDistributionStatsResponse addValuesItem(CommonStatItem valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    public ShowHttpAttackDistributionStatsResponse withValues(Consumer<List<CommonStatItem>> valuesSetter) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /**
     * 统计数组
     * @return values
     */
    public List<CommonStatItem> getValues() {
        return values;
    }

    public void setValues(List<CommonStatItem> values) {
        this.values = values;
    }

    public ShowHttpAttackDistributionStatsResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowHttpAttackDistributionStatsResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHttpAttackDistributionStatsResponse that = (ShowHttpAttackDistributionStatsResponse) obj;
        return Objects.equals(this.statType, that.statType) && Objects.equals(this.groupBy, that.groupBy)
            && Objects.equals(this.statNum, that.statNum) && Objects.equals(this.values, that.values)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statType, groupBy, statNum, values, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHttpAttackDistributionStatsResponse {\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    statNum: ").append(toIndentedString(statNum)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
