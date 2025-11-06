package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAverageEvaluationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_id")

    private Integer mergeRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_evaluation_level")

    private Double averageEvaluationLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluations")

    private List<MergeRequestBaseEvaluationDto> evaluations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_evaluations")

    private List<MergeRequestCustomAverageEvaluationDto> customEvaluations = null;

    public ShowAverageEvaluationResponse withMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }

    /**
     * **参数解释：** 合并请求id。
     * minimum: 1
     * maximum: 2147483647
     * @return mergeRequestId
     */
    public Integer getMergeRequestId() {
        return mergeRequestId;
    }

    public void setMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
    }

    public ShowAverageEvaluationResponse withAverageEvaluationLevel(Double averageEvaluationLevel) {
        this.averageEvaluationLevel = averageEvaluationLevel;
        return this;
    }

    /**
     * **参数解释：** 评价平均分。
     * @return averageEvaluationLevel
     */
    public Double getAverageEvaluationLevel() {
        return averageEvaluationLevel;
    }

    public void setAverageEvaluationLevel(Double averageEvaluationLevel) {
        this.averageEvaluationLevel = averageEvaluationLevel;
    }

    public ShowAverageEvaluationResponse withEvaluations(List<MergeRequestBaseEvaluationDto> evaluations) {
        this.evaluations = evaluations;
        return this;
    }

    public ShowAverageEvaluationResponse addEvaluationsItem(MergeRequestBaseEvaluationDto evaluationsItem) {
        if (this.evaluations == null) {
            this.evaluations = new ArrayList<>();
        }
        this.evaluations.add(evaluationsItem);
        return this;
    }

    public ShowAverageEvaluationResponse withEvaluations(
        Consumer<List<MergeRequestBaseEvaluationDto>> evaluationsSetter) {
        if (this.evaluations == null) {
            this.evaluations = new ArrayList<>();
        }
        evaluationsSetter.accept(this.evaluations);
        return this;
    }

    /**
     * **参数解释：** 单人评价详情。
     * @return evaluations
     */
    public List<MergeRequestBaseEvaluationDto> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<MergeRequestBaseEvaluationDto> evaluations) {
        this.evaluations = evaluations;
    }

    public ShowAverageEvaluationResponse withCustomEvaluations(
        List<MergeRequestCustomAverageEvaluationDto> customEvaluations) {
        this.customEvaluations = customEvaluations;
        return this;
    }

    public ShowAverageEvaluationResponse addCustomEvaluationsItem(
        MergeRequestCustomAverageEvaluationDto customEvaluationsItem) {
        if (this.customEvaluations == null) {
            this.customEvaluations = new ArrayList<>();
        }
        this.customEvaluations.add(customEvaluationsItem);
        return this;
    }

    public ShowAverageEvaluationResponse withCustomEvaluations(
        Consumer<List<MergeRequestCustomAverageEvaluationDto>> customEvaluationsSetter) {
        if (this.customEvaluations == null) {
            this.customEvaluations = new ArrayList<>();
        }
        customEvaluationsSetter.accept(this.customEvaluations);
        return this;
    }

    /**
     * **参数解释：** 自定义评价维度详情。
     * @return customEvaluations
     */
    public List<MergeRequestCustomAverageEvaluationDto> getCustomEvaluations() {
        return customEvaluations;
    }

    public void setCustomEvaluations(List<MergeRequestCustomAverageEvaluationDto> customEvaluations) {
        this.customEvaluations = customEvaluations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAverageEvaluationResponse that = (ShowAverageEvaluationResponse) obj;
        return Objects.equals(this.mergeRequestId, that.mergeRequestId)
            && Objects.equals(this.averageEvaluationLevel, that.averageEvaluationLevel)
            && Objects.equals(this.evaluations, that.evaluations)
            && Objects.equals(this.customEvaluations, that.customEvaluations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mergeRequestId, averageEvaluationLevel, evaluations, customEvaluations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAverageEvaluationResponse {\n");
        sb.append("    mergeRequestId: ").append(toIndentedString(mergeRequestId)).append("\n");
        sb.append("    averageEvaluationLevel: ").append(toIndentedString(averageEvaluationLevel)).append("\n");
        sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
        sb.append("    customEvaluations: ").append(toIndentedString(customEvaluations)).append("\n");
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
