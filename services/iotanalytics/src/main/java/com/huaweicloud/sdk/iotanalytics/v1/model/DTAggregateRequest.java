package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 聚合计算
 */
public class DTAggregateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    @JacksonXmlProperty(localName = "inputs")

    private List<InputRequest> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    @JacksonXmlProperty(localName = "outputs")

    private List<OutputRequest> outputs = null;

    public DTAggregateRequest withInputs(List<InputRequest> inputs) {
        this.inputs = inputs;
        return this;
    }

    public DTAggregateRequest addInputsItem(InputRequest inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public DTAggregateRequest withInputs(Consumer<List<InputRequest>> inputsSetter) {
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

    public DTAggregateRequest withOutputs(List<OutputRequest> outputs) {
        this.outputs = outputs;
        return this;
    }

    public DTAggregateRequest addOutputsItem(OutputRequest outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public DTAggregateRequest withOutputs(Consumer<List<OutputRequest>> outputsSetter) {
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
        DTAggregateRequest dtAggregateRequest = (DTAggregateRequest) o;
        return Objects.equals(this.inputs, dtAggregateRequest.inputs)
            && Objects.equals(this.outputs, dtAggregateRequest.outputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, outputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DTAggregateRequest {\n");
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
