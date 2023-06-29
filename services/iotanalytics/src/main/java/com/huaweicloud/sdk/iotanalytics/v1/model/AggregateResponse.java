package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 聚合计算
 */
public class AggregateResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<InputResponse> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private Expression expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_property")

    private String outputProperty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<OutputResponse> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private DTSchedule schedule;

    public AggregateResponse withInputs(List<InputResponse> inputs) {
        this.inputs = inputs;
        return this;
    }

    public AggregateResponse addInputsItem(InputResponse inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public AggregateResponse withInputs(Consumer<List<InputResponse>> inputsSetter) {
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

    public AggregateResponse withExpression(Expression expression) {
        this.expression = expression;
        return this;
    }

    public AggregateResponse withExpression(Consumer<Expression> expressionSetter) {
        if (this.expression == null) {
            this.expression = new Expression();
            expressionSetter.accept(this.expression);
        }

        return this;
    }

    /**
     * Get expression
     * @return expression
     */
    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public AggregateResponse withOutputProperty(String outputProperty) {
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

    public AggregateResponse withOutputs(List<OutputResponse> outputs) {
        this.outputs = outputs;
        return this;
    }

    public AggregateResponse addOutputsItem(OutputResponse outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public AggregateResponse withOutputs(Consumer<List<OutputResponse>> outputsSetter) {
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

    public AggregateResponse withSchedule(DTSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public AggregateResponse withSchedule(Consumer<DTSchedule> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new DTSchedule();
            scheduleSetter.accept(this.schedule);
        }

        return this;
    }

    /**
     * Get schedule
     * @return schedule
     */
    public DTSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(DTSchedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AggregateResponse that = (AggregateResponse) obj;
        return Objects.equals(this.inputs, that.inputs) && Objects.equals(this.expression, that.expression)
            && Objects.equals(this.outputProperty, that.outputProperty) && Objects.equals(this.outputs, that.outputs)
            && Objects.equals(this.schedule, that.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, expression, outputProperty, outputs, schedule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregateResponse {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    outputProperty: ").append(toIndentedString(outputProperty)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
