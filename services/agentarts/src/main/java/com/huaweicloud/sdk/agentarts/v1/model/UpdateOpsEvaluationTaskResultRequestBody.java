package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 用于校正已生成的评估结果的请求体。 **约束限制：** 必须提供任务、评估器及具体条目的标识符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class UpdateOpsEvaluationTaskResultRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_version")

    private String evaluatorVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "correction")

    private UpdateOpsEvaluationTaskResultRequestBodyCorrection correction;

    public UpdateOpsEvaluationTaskResultRequestBody withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 评估任务的唯一标识符（ID）。 **约束限制：** 长度为0到100个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public UpdateOpsEvaluationTaskResultRequestBody withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * **参数解释：** 执行评估的评估器唯一标识符。 **约束限制：** 长度为0到100个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public UpdateOpsEvaluationTaskResultRequestBody withEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
        return this;
    }

    /**
     * **参数解释：** 评估器的版本号，用于精确锁定特定的评估算法版本。 **约束限制：** 长度为0到100个字符。 **取值范围：** 符合版本号格式的字符串，如\"v1.0.0\" **默认取值：** 不涉及。 
     * @return evaluatorVersion
     */
    public String getEvaluatorVersion() {
        return evaluatorVersion;
    }

    public void setEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
    }

    public UpdateOpsEvaluationTaskResultRequestBody withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * **参数解释：** 具体需要校正的评估条目（Item）唯一标识符。 **约束限制：** 长度为0到100个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public UpdateOpsEvaluationTaskResultRequestBody withCorrection(
        UpdateOpsEvaluationTaskResultRequestBodyCorrection correction) {
        this.correction = correction;
        return this;
    }

    public UpdateOpsEvaluationTaskResultRequestBody withCorrection(
        Consumer<UpdateOpsEvaluationTaskResultRequestBodyCorrection> correctionSetter) {
        if (this.correction == null) {
            this.correction = new UpdateOpsEvaluationTaskResultRequestBodyCorrection();
            correctionSetter.accept(this.correction);
        }

        return this;
    }

    /**
     * Get correction
     * @return correction
     */
    public UpdateOpsEvaluationTaskResultRequestBodyCorrection getCorrection() {
        return correction;
    }

    public void setCorrection(UpdateOpsEvaluationTaskResultRequestBodyCorrection correction) {
        this.correction = correction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOpsEvaluationTaskResultRequestBody that = (UpdateOpsEvaluationTaskResultRequestBody) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.evaluatorId, that.evaluatorId)
            && Objects.equals(this.evaluatorVersion, that.evaluatorVersion) && Objects.equals(this.itemId, that.itemId)
            && Objects.equals(this.correction, that.correction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, evaluatorId, evaluatorVersion, itemId, correction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsEvaluationTaskResultRequestBody {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
        sb.append("    evaluatorVersion: ").append(toIndentedString(evaluatorVersion)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    correction: ").append(toIndentedString(correction)).append("\n");
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
