package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 返回结果
 */
public class ShowJobBuildTimeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_build_time")

    private Double avgBuildTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_build_time")

    private Long maxBuildTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_build_time")

    private Long minBuildTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chart")

    private List<ShowJobBuildTimeResultChart> chart = null;

    public ShowJobBuildTimeResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowJobBuildTimeResult withAvgBuildTime(Double avgBuildTime) {
        this.avgBuildTime = avgBuildTime;
        return this;
    }

    /**
     * 平均构建时长
     * @return avgBuildTime
     */
    public Double getAvgBuildTime() {
        return avgBuildTime;
    }

    public void setAvgBuildTime(Double avgBuildTime) {
        this.avgBuildTime = avgBuildTime;
    }

    public ShowJobBuildTimeResult withMaxBuildTime(Long maxBuildTime) {
        this.maxBuildTime = maxBuildTime;
        return this;
    }

    /**
     * 最长时间
     * @return maxBuildTime
     */
    public Long getMaxBuildTime() {
        return maxBuildTime;
    }

    public void setMaxBuildTime(Long maxBuildTime) {
        this.maxBuildTime = maxBuildTime;
    }

    public ShowJobBuildTimeResult withMinBuildTime(Long minBuildTime) {
        this.minBuildTime = minBuildTime;
        return this;
    }

    /**
     * 最短时间
     * @return minBuildTime
     */
    public Long getMinBuildTime() {
        return minBuildTime;
    }

    public void setMinBuildTime(Long minBuildTime) {
        this.minBuildTime = minBuildTime;
    }

    public ShowJobBuildTimeResult withChart(List<ShowJobBuildTimeResultChart> chart) {
        this.chart = chart;
        return this;
    }

    public ShowJobBuildTimeResult addChartItem(ShowJobBuildTimeResultChart chartItem) {
        if (this.chart == null) {
            this.chart = new ArrayList<>();
        }
        this.chart.add(chartItem);
        return this;
    }

    public ShowJobBuildTimeResult withChart(Consumer<List<ShowJobBuildTimeResultChart>> chartSetter) {
        if (this.chart == null) {
            this.chart = new ArrayList<>();
        }
        chartSetter.accept(this.chart);
        return this;
    }

    /**
     * 每日构建数据
     * @return chart
     */
    public List<ShowJobBuildTimeResultChart> getChart() {
        return chart;
    }

    public void setChart(List<ShowJobBuildTimeResultChart> chart) {
        this.chart = chart;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobBuildTimeResult that = (ShowJobBuildTimeResult) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.avgBuildTime, that.avgBuildTime)
            && Objects.equals(this.maxBuildTime, that.maxBuildTime)
            && Objects.equals(this.minBuildTime, that.minBuildTime) && Objects.equals(this.chart, that.chart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, avgBuildTime, maxBuildTime, minBuildTime, chart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobBuildTimeResult {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    avgBuildTime: ").append(toIndentedString(avgBuildTime)).append("\n");
        sb.append("    maxBuildTime: ").append(toIndentedString(maxBuildTime)).append("\n");
        sb.append("    minBuildTime: ").append(toIndentedString(minBuildTime)).append("\n");
        sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
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
