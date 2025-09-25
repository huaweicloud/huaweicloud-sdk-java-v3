package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ShowAlarmStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_alarm_count")

    private Integer totalAlarmCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ring_percentage")

    private Double ringPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_alarm_level_statistics")

    private List<InstanceAlarmLevelStatisticResult> instanceAlarmLevelStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_alarm_level_statistics")

    private List<AlarmLevelStatisticsResult> totalAlarmLevelStatistics = null;

    public ShowAlarmStatisticsResponse withTotalAlarmCount(Integer totalAlarmCount) {
        this.totalAlarmCount = totalAlarmCount;
        return this;
    }

    /**
     * **参数解释**: 告警总数。 **取值范围**: 不涉及。
     * @return totalAlarmCount
     */
    public Integer getTotalAlarmCount() {
        return totalAlarmCount;
    }

    public void setTotalAlarmCount(Integer totalAlarmCount) {
        this.totalAlarmCount = totalAlarmCount;
    }

    public ShowAlarmStatisticsResponse withRingPercentage(Double ringPercentage) {
        this.ringPercentage = ringPercentage;
        return this;
    }

    /**
     * **参数解释**: 环比比率。 **取值范围**: 值为0表示环比没有变化，值为空表示上一周期没有告警。
     * @return ringPercentage
     */
    public Double getRingPercentage() {
        return ringPercentage;
    }

    public void setRingPercentage(Double ringPercentage) {
        this.ringPercentage = ringPercentage;
    }

    public ShowAlarmStatisticsResponse withInstanceAlarmLevelStatistics(
        List<InstanceAlarmLevelStatisticResult> instanceAlarmLevelStatistics) {
        this.instanceAlarmLevelStatistics = instanceAlarmLevelStatistics;
        return this;
    }

    public ShowAlarmStatisticsResponse addInstanceAlarmLevelStatisticsItem(
        InstanceAlarmLevelStatisticResult instanceAlarmLevelStatisticsItem) {
        if (this.instanceAlarmLevelStatistics == null) {
            this.instanceAlarmLevelStatistics = new ArrayList<>();
        }
        this.instanceAlarmLevelStatistics.add(instanceAlarmLevelStatisticsItem);
        return this;
    }

    public ShowAlarmStatisticsResponse withInstanceAlarmLevelStatistics(
        Consumer<List<InstanceAlarmLevelStatisticResult>> instanceAlarmLevelStatisticsSetter) {
        if (this.instanceAlarmLevelStatistics == null) {
            this.instanceAlarmLevelStatistics = new ArrayList<>();
        }
        instanceAlarmLevelStatisticsSetter.accept(this.instanceAlarmLevelStatistics);
        return this;
    }

    /**
     * **参数解释**: 实例级别的告警统计。
     * @return instanceAlarmLevelStatistics
     */
    public List<InstanceAlarmLevelStatisticResult> getInstanceAlarmLevelStatistics() {
        return instanceAlarmLevelStatistics;
    }

    public void setInstanceAlarmLevelStatistics(List<InstanceAlarmLevelStatisticResult> instanceAlarmLevelStatistics) {
        this.instanceAlarmLevelStatistics = instanceAlarmLevelStatistics;
    }

    public ShowAlarmStatisticsResponse withTotalAlarmLevelStatistics(
        List<AlarmLevelStatisticsResult> totalAlarmLevelStatistics) {
        this.totalAlarmLevelStatistics = totalAlarmLevelStatistics;
        return this;
    }

    public ShowAlarmStatisticsResponse addTotalAlarmLevelStatisticsItem(
        AlarmLevelStatisticsResult totalAlarmLevelStatisticsItem) {
        if (this.totalAlarmLevelStatistics == null) {
            this.totalAlarmLevelStatistics = new ArrayList<>();
        }
        this.totalAlarmLevelStatistics.add(totalAlarmLevelStatisticsItem);
        return this;
    }

    public ShowAlarmStatisticsResponse withTotalAlarmLevelStatistics(
        Consumer<List<AlarmLevelStatisticsResult>> totalAlarmLevelStatisticsSetter) {
        if (this.totalAlarmLevelStatistics == null) {
            this.totalAlarmLevelStatistics = new ArrayList<>();
        }
        totalAlarmLevelStatisticsSetter.accept(this.totalAlarmLevelStatistics);
        return this;
    }

    /**
     * **参数解释**: 全量告警统计。
     * @return totalAlarmLevelStatistics
     */
    public List<AlarmLevelStatisticsResult> getTotalAlarmLevelStatistics() {
        return totalAlarmLevelStatistics;
    }

    public void setTotalAlarmLevelStatistics(List<AlarmLevelStatisticsResult> totalAlarmLevelStatistics) {
        this.totalAlarmLevelStatistics = totalAlarmLevelStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAlarmStatisticsResponse that = (ShowAlarmStatisticsResponse) obj;
        return Objects.equals(this.totalAlarmCount, that.totalAlarmCount)
            && Objects.equals(this.ringPercentage, that.ringPercentage)
            && Objects.equals(this.instanceAlarmLevelStatistics, that.instanceAlarmLevelStatistics)
            && Objects.equals(this.totalAlarmLevelStatistics, that.totalAlarmLevelStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalAlarmCount, ringPercentage, instanceAlarmLevelStatistics, totalAlarmLevelStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlarmStatisticsResponse {\n");
        sb.append("    totalAlarmCount: ").append(toIndentedString(totalAlarmCount)).append("\n");
        sb.append("    ringPercentage: ").append(toIndentedString(ringPercentage)).append("\n");
        sb.append("    instanceAlarmLevelStatistics: ")
            .append(toIndentedString(instanceAlarmLevelStatistics))
            .append("\n");
        sb.append("    totalAlarmLevelStatistics: ").append(toIndentedString(totalAlarmLevelStatistics)).append("\n");
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
