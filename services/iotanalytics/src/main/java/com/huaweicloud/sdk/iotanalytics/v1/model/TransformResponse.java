package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 转换计算
 */
public class TransformResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    @JacksonXmlProperty(localName = "inputs")

    private List<InputResponse> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    @JacksonXmlProperty(localName = "expression")

    private Formula expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_property")

    @JacksonXmlProperty(localName = "output_property")

    private String outputProperty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    @JacksonXmlProperty(localName = "outputs")

    private List<OutputResponse> outputs = null;

    public TransformResponse withInputs(List<InputResponse> inputs) {
        this.inputs = inputs;
        return this;
    }

    public TransformResponse addInputsItem(InputResponse inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public TransformResponse withInputs(Consumer<List<InputResponse>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 输入参数
     * @return inputs
     */
    public List<InputResponse> getInputs() {
        return inputs;
    }

    public void setInputs(List<InputResponse> inputs) {
        this.inputs = inputs;
    }

    public TransformResponse withExpression(Formula expression) {
        this.expression = expression;
        return this;
    }

    public TransformResponse withExpression(Consumer<Formula> expressionSetter) {
        if (this.expression == null) {
            this.expression = new Formula();
            expressionSetter.accept(this.expression);
        }

        return this;
    }

    /**
     * Get expression
     * @return expression
     */
    public Formula getExpression() {
        return expression;
    }

    public void setExpression(Formula expression) {
        this.expression = expression;
    }

    public TransformResponse withOutputProperty(String outputProperty) {
        this.outputProperty = outputProperty;
        return this;
    }

    /**
     * 输出属性名(不推荐使用，待废弃，使用outputs替代)
     * @return outputProperty
     */
    public String getOutputProperty() {
        return outputProperty;
    }

    public void setOutputProperty(String outputProperty) {
        this.outputProperty = outputProperty;
    }

    public TransformResponse withOutputs(List<OutputResponse> outputs) {
        this.outputs = outputs;
        return this;
    }

    public TransformResponse addOutputsItem(OutputResponse outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public TransformResponse withOutputs(Consumer<List<OutputResponse>> outputsSetter) {
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
    public List<OutputResponse> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<OutputResponse> outputs) {
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
        TransformResponse transformResponse = (TransformResponse) o;
        return Objects.equals(this.inputs, transformResponse.inputs)
            && Objects.equals(this.expression, transformResponse.expression)
            && Objects.equals(this.outputProperty, transformResponse.outputProperty)
            && Objects.equals(this.outputs, transformResponse.outputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, expression, outputProperty, outputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransformResponse {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    outputProperty: ").append(toIndentedString(outputProperty)).append("\n");
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
