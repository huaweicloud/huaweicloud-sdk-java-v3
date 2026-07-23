package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评估器得分分布数据。 **取值范围：** 不涉及。 
 */
public class OpsScoreDistributionData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_distrution_info")

    private List<OpsEvaluatorScoreDistribution> evaluatorDistrutionInfo = null;

    public OpsScoreDistributionData withEvaluatorDistrutionInfo(
        List<OpsEvaluatorScoreDistribution> evaluatorDistrutionInfo) {
        this.evaluatorDistrutionInfo = evaluatorDistrutionInfo;
        return this;
    }

    public OpsScoreDistributionData addEvaluatorDistrutionInfoItem(
        OpsEvaluatorScoreDistribution evaluatorDistrutionInfoItem) {
        if (this.evaluatorDistrutionInfo == null) {
            this.evaluatorDistrutionInfo = new ArrayList<>();
        }
        this.evaluatorDistrutionInfo.add(evaluatorDistrutionInfoItem);
        return this;
    }

    public OpsScoreDistributionData withEvaluatorDistrutionInfo(
        Consumer<List<OpsEvaluatorScoreDistribution>> evaluatorDistrutionInfoSetter) {
        if (this.evaluatorDistrutionInfo == null) {
            this.evaluatorDistrutionInfo = new ArrayList<>();
        }
        evaluatorDistrutionInfoSetter.accept(this.evaluatorDistrutionInfo);
        return this;
    }

    /**
     * **参数解释：** 各评估器的得分分布信息列表。 **取值范围：** 不涉及。 
     * @return evaluatorDistrutionInfo
     */
    public List<OpsEvaluatorScoreDistribution> getEvaluatorDistrutionInfo() {
        return evaluatorDistrutionInfo;
    }

    public void setEvaluatorDistrutionInfo(List<OpsEvaluatorScoreDistribution> evaluatorDistrutionInfo) {
        this.evaluatorDistrutionInfo = evaluatorDistrutionInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsScoreDistributionData that = (OpsScoreDistributionData) obj;
        return Objects.equals(this.evaluatorDistrutionInfo, that.evaluatorDistrutionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorDistrutionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsScoreDistributionData {\n");
        sb.append("    evaluatorDistrutionInfo: ").append(toIndentedString(evaluatorDistrutionInfo)).append("\n");
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
