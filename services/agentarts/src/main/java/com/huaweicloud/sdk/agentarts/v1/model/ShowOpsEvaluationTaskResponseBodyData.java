package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 响应数据。
 */
public class ShowOpsEvaluationTaskResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private OpsEvaluationTaskSummary task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_score")

    private Map<String, String> avgScore = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuzz_name")

    private List<String> fuzzName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private ShowOpsEvaluationTaskResponseBodyDataUsage usage;

    public ShowOpsEvaluationTaskResponseBodyData withTask(OpsEvaluationTaskSummary task) {
        this.task = task;
        return this;
    }

    public ShowOpsEvaluationTaskResponseBodyData withTask(Consumer<OpsEvaluationTaskSummary> taskSetter) {
        if (this.task == null) {
            this.task = new OpsEvaluationTaskSummary();
            taskSetter.accept(this.task);
        }

        return this;
    }

    /**
     * Get task
     * @return task
     */
    public OpsEvaluationTaskSummary getTask() {
        return task;
    }

    public void setTask(OpsEvaluationTaskSummary task) {
        this.task = task;
    }

    public ShowOpsEvaluationTaskResponseBodyData withAvgScore(Map<String, String> avgScore) {
        this.avgScore = avgScore;
        return this;
    }

    public ShowOpsEvaluationTaskResponseBodyData putAvgScoreItem(String key, String avgScoreItem) {
        if (this.avgScore == null) {
            this.avgScore = new HashMap<>();
        }
        this.avgScore.put(key, avgScoreItem);
        return this;
    }

    public ShowOpsEvaluationTaskResponseBodyData withAvgScore(Consumer<Map<String, String>> avgScoreSetter) {
        if (this.avgScore == null) {
            this.avgScore = new HashMap<>();
        }
        avgScoreSetter.accept(this.avgScore);
        return this;
    }

    /**
     * 各评估器的平均得分（键为评估器ID，值为平均得分字符串）。
     * @return avgScore
     */
    public Map<String, String> getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Map<String, String> avgScore) {
        this.avgScore = avgScore;
    }

    public ShowOpsEvaluationTaskResponseBodyData withFuzzName(List<String> fuzzName) {
        this.fuzzName = fuzzName;
        return this;
    }

    public ShowOpsEvaluationTaskResponseBodyData addFuzzNameItem(String fuzzNameItem) {
        if (this.fuzzName == null) {
            this.fuzzName = new ArrayList<>();
        }
        this.fuzzName.add(fuzzNameItem);
        return this;
    }

    public ShowOpsEvaluationTaskResponseBodyData withFuzzName(Consumer<List<String>> fuzzNameSetter) {
        if (this.fuzzName == null) {
            this.fuzzName = new ArrayList<>();
        }
        fuzzNameSetter.accept(this.fuzzName);
        return this;
    }

    /**
     * 同名任务列表（通过 name 参数模糊查询时的同名任务名称）。
     * @return fuzzName
     */
    public List<String> getFuzzName() {
        return fuzzName;
    }

    public void setFuzzName(List<String> fuzzName) {
        this.fuzzName = fuzzName;
    }

    public ShowOpsEvaluationTaskResponseBodyData withUsage(ShowOpsEvaluationTaskResponseBodyDataUsage usage) {
        this.usage = usage;
        return this;
    }

    public ShowOpsEvaluationTaskResponseBodyData withUsage(
        Consumer<ShowOpsEvaluationTaskResponseBodyDataUsage> usageSetter) {
        if (this.usage == null) {
            this.usage = new ShowOpsEvaluationTaskResponseBodyDataUsage();
            usageSetter.accept(this.usage);
        }

        return this;
    }

    /**
     * Get usage
     * @return usage
     */
    public ShowOpsEvaluationTaskResponseBodyDataUsage getUsage() {
        return usage;
    }

    public void setUsage(ShowOpsEvaluationTaskResponseBodyDataUsage usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluationTaskResponseBodyData that = (ShowOpsEvaluationTaskResponseBodyData) obj;
        return Objects.equals(this.task, that.task) && Objects.equals(this.avgScore, that.avgScore)
            && Objects.equals(this.fuzzName, that.fuzzName) && Objects.equals(this.usage, that.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, avgScore, fuzzName, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluationTaskResponseBodyData {\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    avgScore: ").append(toIndentedString(avgScore)).append("\n");
        sb.append("    fuzzName: ").append(toIndentedString(fuzzName)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
