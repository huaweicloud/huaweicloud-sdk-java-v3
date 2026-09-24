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
public class ListOpsEvaluationTasksResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<OpsEvaluationTaskSummary> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_score")

    private Map<String, String> avgScore = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_task_status")

    private ListOpsEvaluationTasksResponseBodyDataTotalTaskStatus totalTaskStatus;

    public ListOpsEvaluationTasksResponseBodyData withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 符合条件的任务总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOpsEvaluationTasksResponseBodyData withItems(List<OpsEvaluationTaskSummary> items) {
        this.items = items;
        return this;
    }

    public ListOpsEvaluationTasksResponseBodyData addItemsItem(OpsEvaluationTaskSummary itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListOpsEvaluationTasksResponseBodyData withItems(Consumer<List<OpsEvaluationTaskSummary>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 评估任务列表。
     * @return items
     */
    public List<OpsEvaluationTaskSummary> getItems() {
        return items;
    }

    public void setItems(List<OpsEvaluationTaskSummary> items) {
        this.items = items;
    }

    public ListOpsEvaluationTasksResponseBodyData withAvgScore(Map<String, String> avgScore) {
        this.avgScore = avgScore;
        return this;
    }

    public ListOpsEvaluationTasksResponseBodyData putAvgScoreItem(String key, String avgScoreItem) {
        if (this.avgScore == null) {
            this.avgScore = new HashMap<>();
        }
        this.avgScore.put(key, avgScoreItem);
        return this;
    }

    public ListOpsEvaluationTasksResponseBodyData withAvgScore(Consumer<Map<String, String>> avgScoreSetter) {
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

    public ListOpsEvaluationTasksResponseBodyData withTotalTaskStatus(
        ListOpsEvaluationTasksResponseBodyDataTotalTaskStatus totalTaskStatus) {
        this.totalTaskStatus = totalTaskStatus;
        return this;
    }

    public ListOpsEvaluationTasksResponseBodyData withTotalTaskStatus(
        Consumer<ListOpsEvaluationTasksResponseBodyDataTotalTaskStatus> totalTaskStatusSetter) {
        if (this.totalTaskStatus == null) {
            this.totalTaskStatus = new ListOpsEvaluationTasksResponseBodyDataTotalTaskStatus();
            totalTaskStatusSetter.accept(this.totalTaskStatus);
        }

        return this;
    }

    /**
     * Get totalTaskStatus
     * @return totalTaskStatus
     */
    public ListOpsEvaluationTasksResponseBodyDataTotalTaskStatus getTotalTaskStatus() {
        return totalTaskStatus;
    }

    public void setTotalTaskStatus(ListOpsEvaluationTasksResponseBodyDataTotalTaskStatus totalTaskStatus) {
        this.totalTaskStatus = totalTaskStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluationTasksResponseBodyData that = (ListOpsEvaluationTasksResponseBodyData) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.items, that.items)
            && Objects.equals(this.avgScore, that.avgScore)
            && Objects.equals(this.totalTaskStatus, that.totalTaskStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, items, avgScore, totalTaskStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluationTasksResponseBodyData {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    avgScore: ").append(toIndentedString(avgScore)).append("\n");
        sb.append("    totalTaskStatus: ").append(toIndentedString(totalTaskStatus)).append("\n");
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
