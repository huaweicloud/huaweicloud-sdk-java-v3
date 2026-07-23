package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 评估组中的单项测试任务记录，包含测试数据、评估结果及任务元信息。
 */
public class CompareGroupItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_data")

    private List<CompareItemData> itemData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_id")

    private String datasetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_version")

    private String datasetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluations")

    private List<CompareEvaluation> evaluations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public CompareGroupItem withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * 测试项的唯一标识符（ObjectId格式）。
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public CompareGroupItem withItemData(List<CompareItemData> itemData) {
        this.itemData = itemData;
        return this;
    }

    public CompareGroupItem addItemDataItem(CompareItemData itemDataItem) {
        if (this.itemData == null) {
            this.itemData = new ArrayList<>();
        }
        this.itemData.add(itemDataItem);
        return this;
    }

    public CompareGroupItem withItemData(Consumer<List<CompareItemData>> itemDataSetter) {
        if (this.itemData == null) {
            this.itemData = new ArrayList<>();
        }
        itemDataSetter.accept(this.itemData);
        return this;
    }

    /**
     * 测试数据的原始输入输出对列表，每轮对话或单次测试的明细。
     * @return itemData
     */
    public List<CompareItemData> getItemData() {
        return itemData;
    }

    public void setItemData(List<CompareItemData> itemData) {
        this.itemData = itemData;
    }

    public CompareGroupItem withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * 测试所用数据集的唯一标识符（UUID格式）。
     * @return datasetId
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public CompareGroupItem withDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }

    /**
     * 数据集的版本标识符（UUID格式）。
     * @return datasetVersion
     */
    public String getDatasetVersion() {
        return datasetVersion;
    }

    public void setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
    }

    public CompareGroupItem withEvaluations(List<CompareEvaluation> evaluations) {
        this.evaluations = evaluations;
        return this;
    }

    public CompareGroupItem addEvaluationsItem(CompareEvaluation evaluationsItem) {
        if (this.evaluations == null) {
            this.evaluations = new ArrayList<>();
        }
        this.evaluations.add(evaluationsItem);
        return this;
    }

    public CompareGroupItem withEvaluations(Consumer<List<CompareEvaluation>> evaluationsSetter) {
        if (this.evaluations == null) {
            this.evaluations = new ArrayList<>();
        }
        evaluationsSetter.accept(this.evaluations);
        return this;
    }

    /**
     * 对该测试项执行的所有评估器结果列表。
     * @return evaluations
     */
    public List<CompareEvaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<CompareEvaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public CompareGroupItem withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 测试任务的名称，如“正确性评估-正式测试xxxxx”。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CompareGroupItem withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 测试任务的唯一标识符（UUID 格式）。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareGroupItem that = (CompareGroupItem) obj;
        return Objects.equals(this.itemId, that.itemId) && Objects.equals(this.itemData, that.itemData)
            && Objects.equals(this.datasetId, that.datasetId)
            && Objects.equals(this.datasetVersion, that.datasetVersion)
            && Objects.equals(this.evaluations, that.evaluations) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, itemData, datasetId, datasetVersion, evaluations, taskName, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareGroupItem {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    itemData: ").append(toIndentedString(itemData)).append("\n");
        sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
        sb.append("    datasetVersion: ").append(toIndentedString(datasetVersion)).append("\n");
        sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
