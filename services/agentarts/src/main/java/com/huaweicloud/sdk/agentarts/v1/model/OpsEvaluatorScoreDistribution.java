package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 单个评估器的得分分布信息。 **取值范围：** 不涉及。 
 */
public class OpsEvaluatorScoreDistribution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_name")

    private String evaluatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distrution")

    private List<OpsScoreCountItem> distrution = null;

    public OpsEvaluatorScoreDistribution withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * **参数解释：** 评估器的唯一标识符ID。 **取值范围：** UUID格式的字符串。 
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public OpsEvaluatorScoreDistribution withEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName;
        return this;
    }

    /**
     * **参数解释：** 评估器的显示名称。 **取值范围：** 1-100字符。 
     * @return evaluatorName
     */
    public String getEvaluatorName() {
        return evaluatorName;
    }

    public void setEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName;
    }

    public OpsEvaluatorScoreDistribution withDistrution(List<OpsScoreCountItem> distrution) {
        this.distrution = distrution;
        return this;
    }

    public OpsEvaluatorScoreDistribution addDistrutionItem(OpsScoreCountItem distrutionItem) {
        if (this.distrution == null) {
            this.distrution = new ArrayList<>();
        }
        this.distrution.add(distrutionItem);
        return this;
    }

    public OpsEvaluatorScoreDistribution withDistrution(Consumer<List<OpsScoreCountItem>> distrutionSetter) {
        if (this.distrution == null) {
            this.distrution = new ArrayList<>();
        }
        distrutionSetter.accept(this.distrution);
        return this;
    }

    /**
     * **参数解释：** 该评估器的得分分布列表，包含各分数及其对应的样本数量。 **取值范围：** 不涉及。 
     * @return distrution
     */
    public List<OpsScoreCountItem> getDistrution() {
        return distrution;
    }

    public void setDistrution(List<OpsScoreCountItem> distrution) {
        this.distrution = distrution;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsEvaluatorScoreDistribution that = (OpsEvaluatorScoreDistribution) obj;
        return Objects.equals(this.evaluatorId, that.evaluatorId)
            && Objects.equals(this.evaluatorName, that.evaluatorName)
            && Objects.equals(this.distrution, that.distrution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorId, evaluatorName, distrution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsEvaluatorScoreDistribution {\n");
        sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
        sb.append("    evaluatorName: ").append(toIndentedString(evaluatorName)).append("\n");
        sb.append("    distrution: ").append(toIndentedString(distrution)).append("\n");
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
