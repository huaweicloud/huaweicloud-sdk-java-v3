package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：算法配置信息，如启动文件等。 **约束限制**：不涉及。
 */
public class TaskAlgorithmJobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<Parameter> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<Input> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<Output> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private TaskAlgorithmJobConfigEngine engine;

    public TaskAlgorithmJobConfig withParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public TaskAlgorithmJobConfig addParametersItem(Parameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public TaskAlgorithmJobConfig withParameters(Consumer<List<Parameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * **参数解释**：算法的运行参数。 **约束限制**：不涉及。
     * @return parameters
     */
    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public TaskAlgorithmJobConfig withInputs(List<Input> inputs) {
        this.inputs = inputs;
        return this;
    }

    public TaskAlgorithmJobConfig addInputsItem(Input inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public TaskAlgorithmJobConfig withInputs(Consumer<List<Input>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * **参数解释**：算法的数据输入。 **约束限制**：不涉及。
     * @return inputs
     */
    public List<Input> getInputs() {
        return inputs;
    }

    public void setInputs(List<Input> inputs) {
        this.inputs = inputs;
    }

    public TaskAlgorithmJobConfig withOutputs(List<Output> outputs) {
        this.outputs = outputs;
        return this;
    }

    public TaskAlgorithmJobConfig addOutputsItem(Output outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public TaskAlgorithmJobConfig withOutputs(Consumer<List<Output>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * **参数解释**：算法的数据输出。 **约束限制**：不涉及。
     * @return outputs
     */
    public List<Output> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<Output> outputs) {
        this.outputs = outputs;
    }

    public TaskAlgorithmJobConfig withEngine(TaskAlgorithmJobConfigEngine engine) {
        this.engine = engine;
        return this;
    }

    public TaskAlgorithmJobConfig withEngine(Consumer<TaskAlgorithmJobConfigEngine> engineSetter) {
        if (this.engine == null) {
            this.engine = new TaskAlgorithmJobConfigEngine();
            engineSetter.accept(this.engine);
        }

        return this;
    }

    /**
     * Get engine
     * @return engine
     */
    public TaskAlgorithmJobConfigEngine getEngine() {
        return engine;
    }

    public void setEngine(TaskAlgorithmJobConfigEngine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskAlgorithmJobConfig that = (TaskAlgorithmJobConfig) obj;
        return Objects.equals(this.parameters, that.parameters) && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.outputs, that.outputs) && Objects.equals(this.engine, that.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters, inputs, outputs, engine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskAlgorithmJobConfig {\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
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
