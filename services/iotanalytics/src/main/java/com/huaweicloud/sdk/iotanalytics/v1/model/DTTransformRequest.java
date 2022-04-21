package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 转换计算
 */
public class DTTransformRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<InputRequest> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<OutputRequest> outputs = null;

    public DTTransformRequest withInputs(List<InputRequest> inputs) {
        this.inputs = inputs;
        return this;
    }

    public DTTransformRequest addInputsItem(InputRequest inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public DTTransformRequest withInputs(Consumer<List<InputRequest>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 输入参数，最多支持10个
     * @return inputs
     */
    public List<InputRequest> getInputs() {
        return inputs;
    }

    public void setInputs(List<InputRequest> inputs) {
        this.inputs = inputs;
    }

    public DTTransformRequest withOutputs(List<OutputRequest> outputs) {
        this.outputs = outputs;
        return this;
    }

    public DTTransformRequest addOutputsItem(OutputRequest outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public DTTransformRequest withOutputs(Consumer<List<OutputRequest>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * Get outputs
     * @return outputs
     */
    public List<OutputRequest> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<OutputRequest> outputs) {
        this.outputs = outputs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DTTransformRequest dtTransformRequest = (DTTransformRequest) o;
        return Objects.equals(this.inputs, dtTransformRequest.inputs)
            && Objects.equals(this.outputs, dtTransformRequest.outputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, outputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DTTransformRequest {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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
