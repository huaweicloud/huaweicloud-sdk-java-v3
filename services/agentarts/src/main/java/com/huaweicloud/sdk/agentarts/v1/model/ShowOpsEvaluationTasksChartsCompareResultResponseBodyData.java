package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 包含任务指标统计的核心数据
 */
public class ShowOpsEvaluationTasksChartsCompareResultResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_metrics_stats")

    private List<CompareTaskMetricsStat> taskMetricsStats = null;

    public ShowOpsEvaluationTasksChartsCompareResultResponseBodyData withTaskMetricsStats(
        List<CompareTaskMetricsStat> taskMetricsStats) {
        this.taskMetricsStats = taskMetricsStats;
        return this;
    }

    public ShowOpsEvaluationTasksChartsCompareResultResponseBodyData addTaskMetricsStatsItem(
        CompareTaskMetricsStat taskMetricsStatsItem) {
        if (this.taskMetricsStats == null) {
            this.taskMetricsStats = new ArrayList<>();
        }
        this.taskMetricsStats.add(taskMetricsStatsItem);
        return this;
    }

    public ShowOpsEvaluationTasksChartsCompareResultResponseBodyData withTaskMetricsStats(
        Consumer<List<CompareTaskMetricsStat>> taskMetricsStatsSetter) {
        if (this.taskMetricsStats == null) {
            this.taskMetricsStats = new ArrayList<>();
        }
        taskMetricsStatsSetter.accept(this.taskMetricsStats);
        return this;
    }

    /**
     * 各任务的指标统计列表
     * @return taskMetricsStats
     */
    public List<CompareTaskMetricsStat> getTaskMetricsStats() {
        return taskMetricsStats;
    }

    public void setTaskMetricsStats(List<CompareTaskMetricsStat> taskMetricsStats) {
        this.taskMetricsStats = taskMetricsStats;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluationTasksChartsCompareResultResponseBodyData that =
            (ShowOpsEvaluationTasksChartsCompareResultResponseBodyData) obj;
        return Objects.equals(this.taskMetricsStats, that.taskMetricsStats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskMetricsStats);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluationTasksChartsCompareResultResponseBodyData {\n");
        sb.append("    taskMetricsStats: ").append(toIndentedString(taskMetricsStats)).append("\n");
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
