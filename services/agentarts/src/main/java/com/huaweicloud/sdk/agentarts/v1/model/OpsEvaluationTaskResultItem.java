package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评估结果条目对象，包含数据条目信息、各评估器的评估详情及人工标注。 **约束限制：** 不涉及。 
 */
public class OpsEvaluationTaskResultItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_id")

    private String datasetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_version")

    private String datasetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_name")

    private String datasetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_data")

    private List<Object> itemData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_output")

    private List<String> agentOutput = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_ids")

    private List<String> traceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluations")

    private List<OpsEvaluationItemEvaluation> evaluations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private List<Object> annotations = null;

    public OpsEvaluationTaskResultItem withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * 数据条目ID。
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public OpsEvaluationTaskResultItem withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话ID。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public OpsEvaluationTaskResultItem withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * 数据集ID。
     * @return datasetId
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public OpsEvaluationTaskResultItem withDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }

    /**
     * 数据集版本。
     * @return datasetVersion
     */
    public String getDatasetVersion() {
        return datasetVersion;
    }

    public void setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
    }

    public OpsEvaluationTaskResultItem withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * 数据集名称。
     * @return datasetName
     */
    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public OpsEvaluationTaskResultItem withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public OpsEvaluationTaskResultItem withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public OpsEvaluationTaskResultItem withItemData(List<Object> itemData) {
        this.itemData = itemData;
        return this;
    }

    public OpsEvaluationTaskResultItem addItemDataItem(Object itemDataItem) {
        if (this.itemData == null) {
            this.itemData = new ArrayList<>();
        }
        this.itemData.add(itemDataItem);
        return this;
    }

    public OpsEvaluationTaskResultItem withItemData(Consumer<List<Object>> itemDataSetter) {
        if (this.itemData == null) {
            this.itemData = new ArrayList<>();
        }
        itemDataSetter.accept(this.itemData);
        return this;
    }

    /**
     * 数据条目原始数据。
     * @return itemData
     */
    public List<Object> getItemData() {
        return itemData;
    }

    public void setItemData(List<Object> itemData) {
        this.itemData = itemData;
    }

    public OpsEvaluationTaskResultItem withAgentOutput(List<String> agentOutput) {
        this.agentOutput = agentOutput;
        return this;
    }

    public OpsEvaluationTaskResultItem addAgentOutputItem(String agentOutputItem) {
        if (this.agentOutput == null) {
            this.agentOutput = new ArrayList<>();
        }
        this.agentOutput.add(agentOutputItem);
        return this;
    }

    public OpsEvaluationTaskResultItem withAgentOutput(Consumer<List<String>> agentOutputSetter) {
        if (this.agentOutput == null) {
            this.agentOutput = new ArrayList<>();
        }
        agentOutputSetter.accept(this.agentOutput);
        return this;
    }

    /**
     * 智能体输出列表。
     * @return agentOutput
     */
    public List<String> getAgentOutput() {
        return agentOutput;
    }

    public void setAgentOutput(List<String> agentOutput) {
        this.agentOutput = agentOutput;
    }

    public OpsEvaluationTaskResultItem withTraceIds(List<String> traceIds) {
        this.traceIds = traceIds;
        return this;
    }

    public OpsEvaluationTaskResultItem addTraceIdsItem(String traceIdsItem) {
        if (this.traceIds == null) {
            this.traceIds = new ArrayList<>();
        }
        this.traceIds.add(traceIdsItem);
        return this;
    }

    public OpsEvaluationTaskResultItem withTraceIds(Consumer<List<String>> traceIdsSetter) {
        if (this.traceIds == null) {
            this.traceIds = new ArrayList<>();
        }
        traceIdsSetter.accept(this.traceIds);
        return this;
    }

    /**
     * 轨迹ID列表。
     * @return traceIds
     */
    public List<String> getTraceIds() {
        return traceIds;
    }

    public void setTraceIds(List<String> traceIds) {
        this.traceIds = traceIds;
    }

    public OpsEvaluationTaskResultItem withEvaluations(List<OpsEvaluationItemEvaluation> evaluations) {
        this.evaluations = evaluations;
        return this;
    }

    public OpsEvaluationTaskResultItem addEvaluationsItem(OpsEvaluationItemEvaluation evaluationsItem) {
        if (this.evaluations == null) {
            this.evaluations = new ArrayList<>();
        }
        this.evaluations.add(evaluationsItem);
        return this;
    }

    public OpsEvaluationTaskResultItem withEvaluations(Consumer<List<OpsEvaluationItemEvaluation>> evaluationsSetter) {
        if (this.evaluations == null) {
            this.evaluations = new ArrayList<>();
        }
        evaluationsSetter.accept(this.evaluations);
        return this;
    }

    /**
     * 各评估器的评估结果列表。
     * @return evaluations
     */
    public List<OpsEvaluationItemEvaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<OpsEvaluationItemEvaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public OpsEvaluationTaskResultItem withAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

    public OpsEvaluationTaskResultItem addAnnotationsItem(Object annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new ArrayList<>();
        }
        this.annotations.add(annotationsItem);
        return this;
    }

    public OpsEvaluationTaskResultItem withAnnotations(Consumer<List<Object>> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new ArrayList<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }

    /**
     * 人工标注列表。
     * @return annotations
     */
    public List<Object> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<Object> annotations) {
        this.annotations = annotations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsEvaluationTaskResultItem that = (OpsEvaluationTaskResultItem) obj;
        return Objects.equals(this.itemId, that.itemId) && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.datasetId, that.datasetId)
            && Objects.equals(this.datasetVersion, that.datasetVersion)
            && Objects.equals(this.datasetName, that.datasetName) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.itemData, that.itemData)
            && Objects.equals(this.agentOutput, that.agentOutput) && Objects.equals(this.traceIds, that.traceIds)
            && Objects.equals(this.evaluations, that.evaluations) && Objects.equals(this.annotations, that.annotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId,
            sessionId,
            datasetId,
            datasetVersion,
            datasetName,
            taskId,
            taskName,
            itemData,
            agentOutput,
            traceIds,
            evaluations,
            annotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsEvaluationTaskResultItem {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
        sb.append("    datasetVersion: ").append(toIndentedString(datasetVersion)).append("\n");
        sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    itemData: ").append(toIndentedString(itemData)).append("\n");
        sb.append("    agentOutput: ").append(toIndentedString(agentOutput)).append("\n");
        sb.append("    traceIds: ").append(toIndentedString(traceIds)).append("\n");
        sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
