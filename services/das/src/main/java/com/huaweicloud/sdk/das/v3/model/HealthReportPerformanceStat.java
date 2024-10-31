package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportPerformanceStat
 */
public class HealthReportPerformanceStat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peak_stats")

    private List<HealthReportSingleValueStat> peakStats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio_stats")

    private List<HealthReportRatioStat> ratioStats = null;

    public HealthReportPerformanceStat withPeakStats(List<HealthReportSingleValueStat> peakStats) {
        this.peakStats = peakStats;
        return this;
    }

    public HealthReportPerformanceStat addPeakStatsItem(HealthReportSingleValueStat peakStatsItem) {
        if (this.peakStats == null) {
            this.peakStats = new ArrayList<>();
        }
        this.peakStats.add(peakStatsItem);
        return this;
    }

    public HealthReportPerformanceStat withPeakStats(Consumer<List<HealthReportSingleValueStat>> peakStatsSetter) {
        if (this.peakStats == null) {
            this.peakStats = new ArrayList<>();
        }
        peakStatsSetter.accept(this.peakStats);
        return this;
    }

    /**
     * 峰值统计信息列表。
     * @return peakStats
     */
    public List<HealthReportSingleValueStat> getPeakStats() {
        return peakStats;
    }

    public void setPeakStats(List<HealthReportSingleValueStat> peakStats) {
        this.peakStats = peakStats;
    }

    public HealthReportPerformanceStat withRatioStats(List<HealthReportRatioStat> ratioStats) {
        this.ratioStats = ratioStats;
        return this;
    }

    public HealthReportPerformanceStat addRatioStatsItem(HealthReportRatioStat ratioStatsItem) {
        if (this.ratioStats == null) {
            this.ratioStats = new ArrayList<>();
        }
        this.ratioStats.add(ratioStatsItem);
        return this;
    }

    public HealthReportPerformanceStat withRatioStats(Consumer<List<HealthReportRatioStat>> ratioStatsSetter) {
        if (this.ratioStats == null) {
            this.ratioStats = new ArrayList<>();
        }
        ratioStatsSetter.accept(this.ratioStats);
        return this;
    }

    /**
     * 比率值数据列表。
     * @return ratioStats
     */
    public List<HealthReportRatioStat> getRatioStats() {
        return ratioStats;
    }

    public void setRatioStats(List<HealthReportRatioStat> ratioStats) {
        this.ratioStats = ratioStats;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportPerformanceStat that = (HealthReportPerformanceStat) obj;
        return Objects.equals(this.peakStats, that.peakStats) && Objects.equals(this.ratioStats, that.ratioStats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peakStats, ratioStats);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportPerformanceStat {\n");
        sb.append("    peakStats: ").append(toIndentedString(peakStats)).append("\n");
        sb.append("    ratioStats: ").append(toIndentedString(ratioStats)).append("\n");
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
