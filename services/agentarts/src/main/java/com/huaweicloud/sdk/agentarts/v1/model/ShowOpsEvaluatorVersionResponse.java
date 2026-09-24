package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOpsEvaluatorVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator")

    private OpsListEvaluatorsInfo evaluator;

    public ShowOpsEvaluatorVersionResponse withEvaluator(OpsListEvaluatorsInfo evaluator) {
        this.evaluator = evaluator;
        return this;
    }

    public ShowOpsEvaluatorVersionResponse withEvaluator(Consumer<OpsListEvaluatorsInfo> evaluatorSetter) {
        if (this.evaluator == null) {
            this.evaluator = new OpsListEvaluatorsInfo();
            evaluatorSetter.accept(this.evaluator);
        }

        return this;
    }

    /**
     * Get evaluator
     * @return evaluator
     */
    public OpsListEvaluatorsInfo getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(OpsListEvaluatorsInfo evaluator) {
        this.evaluator = evaluator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluatorVersionResponse that = (ShowOpsEvaluatorVersionResponse) obj;
        return Objects.equals(this.evaluator, that.evaluator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorVersionResponse {\n");
        sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
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
