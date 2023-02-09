package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置分区的列统计信息body体
 */
public class SetPartitionColumnStatisticsInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_merge")

    private Boolean needMerge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private List<PartitionColumnStatistics> statistics = null;

    public SetPartitionColumnStatisticsInput withNeedMerge(Boolean needMerge) {
        this.needMerge = needMerge;
        return this;
    }

    /**
     * 是否合入原有统计信息
     * @return needMerge
     */
    public Boolean getNeedMerge() {
        return needMerge;
    }

    public void setNeedMerge(Boolean needMerge) {
        this.needMerge = needMerge;
    }

    public SetPartitionColumnStatisticsInput withStatistics(List<PartitionColumnStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }

    public SetPartitionColumnStatisticsInput addStatisticsItem(PartitionColumnStatistics statisticsItem) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public SetPartitionColumnStatisticsInput withStatistics(
        Consumer<List<PartitionColumnStatistics>> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * 分区统计信息的统计列表
     * @return statistics
     */
    public List<PartitionColumnStatistics> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<PartitionColumnStatistics> statistics) {
        this.statistics = statistics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetPartitionColumnStatisticsInput setPartitionColumnStatisticsInput = (SetPartitionColumnStatisticsInput) o;
        return Objects.equals(this.needMerge, setPartitionColumnStatisticsInput.needMerge)
            && Objects.equals(this.statistics, setPartitionColumnStatisticsInput.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(needMerge, statistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetPartitionColumnStatisticsInput {\n");
        sb.append("    needMerge: ").append(toIndentedString(needMerge)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
