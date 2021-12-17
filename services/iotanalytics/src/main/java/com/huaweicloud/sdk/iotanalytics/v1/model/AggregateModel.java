package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 聚合计算 */
public class AggregateModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<InputModel> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private Expression expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private DTSchedule schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_property")

    private String outputProperty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<OutputWithModel> outputs = null;

    public AggregateModel withInputs(List<InputModel> inputs) {
        this.inputs = inputs;
        return this;
    }

    public AggregateModel addInputsItem(InputModel inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public AggregateModel withInputs(Consumer<List<InputModel>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /** 输入参数，最多支持10个
     * 
     * @return inputs */
    public List<InputModel> getInputs() {
        return inputs;
    }

    public void setInputs(List<InputModel> inputs) {
        this.inputs = inputs;
    }

    public AggregateModel withExpression(Expression expression) {
        this.expression = expression;
        return this;
    }

    public AggregateModel withExpression(Consumer<Expression> expressionSetter) {
        if (this.expression == null) {
            this.expression = new Expression();
            expressionSetter.accept(this.expression);
        }

        return this;
    }

    /** Get expression
     * 
     * @return expression */
    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public AggregateModel withSchedule(DTSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public AggregateModel withSchedule(Consumer<DTSchedule> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new DTSchedule();
            scheduleSetter.accept(this.schedule);
        }

        return this;
    }

    /** Get schedule
     * 
     * @return schedule */
    public DTSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(DTSchedule schedule) {
        this.schedule = schedule;
    }

    public AggregateModel withOutputProperty(String outputProperty) {
        this.outputProperty = outputProperty;
        return this;
    }

    /** 输出属性名(分析任务单输出场景，配合expression的formula使用)
     * 
     * @return outputProperty */
    public String getOutputProperty() {
        return outputProperty;
    }

    public void setOutputProperty(String outputProperty) {
        this.outputProperty = outputProperty;
    }

    public AggregateModel withOutputs(List<OutputWithModel> outputs) {
        this.outputs = outputs;
        return this;
    }

    public AggregateModel addOutputsItem(OutputWithModel outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public AggregateModel withOutputs(Consumer<List<OutputWithModel>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /** 输出属性，最多支持10个
     * 
     * @return outputs */
    public List<OutputWithModel> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<OutputWithModel> outputs) {
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
        AggregateModel aggregateModel = (AggregateModel) o;
        return Objects.equals(this.inputs, aggregateModel.inputs)
            && Objects.equals(this.expression, aggregateModel.expression)
            && Objects.equals(this.schedule, aggregateModel.schedule)
            && Objects.equals(this.outputProperty, aggregateModel.outputProperty)
            && Objects.equals(this.outputs, aggregateModel.outputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs, expression, schedule, outputProperty, outputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregateModel {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    outputProperty: ").append(toIndentedString(outputProperty)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
