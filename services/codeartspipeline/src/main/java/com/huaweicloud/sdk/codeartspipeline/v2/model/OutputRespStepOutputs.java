package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OutputRespStepOutputs
 */
public class OutputRespStepOutputs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_run_id")

    private String stepRunId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_result")

    private List<OutputRespOutputResult> outputResult = null;

    public OutputRespStepOutputs withStepRunId(String stepRunId) {
        this.stepRunId = stepRunId;
        return this;
    }

    /**
     * Get stepRunId
     * @return stepRunId
     */
    public String getStepRunId() {
        return stepRunId;
    }

    public void setStepRunId(String stepRunId) {
        this.stepRunId = stepRunId;
    }

    public OutputRespStepOutputs withOutputResult(List<OutputRespOutputResult> outputResult) {
        this.outputResult = outputResult;
        return this;
    }

    public OutputRespStepOutputs addOutputResultItem(OutputRespOutputResult outputResultItem) {
        if (this.outputResult == null) {
            this.outputResult = new ArrayList<>();
        }
        this.outputResult.add(outputResultItem);
        return this;
    }

    public OutputRespStepOutputs withOutputResult(Consumer<List<OutputRespOutputResult>> outputResultSetter) {
        if (this.outputResult == null) {
            this.outputResult = new ArrayList<>();
        }
        outputResultSetter.accept(this.outputResult);
        return this;
    }

    /**
     * Get outputResult
     * @return outputResult
     */
    public List<OutputRespOutputResult> getOutputResult() {
        return outputResult;
    }

    public void setOutputResult(List<OutputRespOutputResult> outputResult) {
        this.outputResult = outputResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OutputRespStepOutputs that = (OutputRespStepOutputs) obj;
        return Objects.equals(this.stepRunId, that.stepRunId) && Objects.equals(this.outputResult, that.outputResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepRunId, outputResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputRespStepOutputs {\n");
        sb.append("    stepRunId: ").append(toIndentedString(stepRunId)).append("\n");
        sb.append("    outputResult: ").append(toIndentedString(outputResult)).append("\n");
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
