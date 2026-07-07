package com.huaweicloud.sdk.modelarts.v1.model;

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
public class GetScaleEvaluationsDevServerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluations")

    private List<ServerScaleEvaluation> evaluations = null;

    public GetScaleEvaluationsDevServerResponse withEvaluations(List<ServerScaleEvaluation> evaluations) {
        this.evaluations = evaluations;
        return this;
    }

    public GetScaleEvaluationsDevServerResponse addEvaluationsItem(ServerScaleEvaluation evaluationsItem) {
        if (this.evaluations == null) {
            this.evaluations = new ArrayList<>();
        }
        this.evaluations.add(evaluationsItem);
        return this;
    }

    public GetScaleEvaluationsDevServerResponse withEvaluations(
        Consumer<List<ServerScaleEvaluation>> evaluationsSetter) {
        if (this.evaluations == null) {
            this.evaluations = new ArrayList<>();
        }
        evaluationsSetter.accept(this.evaluations);
        return this;
    }

    /**
     * **参数解释**：规格容量保有情况 **约束限制**：不涉及 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return evaluations
     */
    public List<ServerScaleEvaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<ServerScaleEvaluation> evaluations) {
        this.evaluations = evaluations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetScaleEvaluationsDevServerResponse that = (GetScaleEvaluationsDevServerResponse) obj;
        return Objects.equals(this.evaluations, that.evaluations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetScaleEvaluationsDevServerResponse {\n");
        sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
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
