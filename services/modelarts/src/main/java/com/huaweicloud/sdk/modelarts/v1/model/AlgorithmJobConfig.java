package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 算法配置信息，如启动文件等。
 */
public class AlgorithmJobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_dir")

    private String codeDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boot_file")

    private String bootFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<Parameters> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<AlgorithmCreateInput> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<AlgorithmCreateOutput> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private AlgorithmCreateEngine engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters_customization")

    private Boolean parametersCustomization;

    public AlgorithmJobConfig withCodeDir(String codeDir) {
        this.codeDir = codeDir;
        return this;
    }

    /**
     * 算法的代码目录。如：“/usr/app/”。应与boot_file一同出现。
     * @return codeDir
     */
    public String getCodeDir() {
        return codeDir;
    }

    public void setCodeDir(String codeDir) {
        this.codeDir = codeDir;
    }

    public AlgorithmJobConfig withBootFile(String bootFile) {
        this.bootFile = bootFile;
        return this;
    }

    /**
     * 算法的代码启动文件，需要在代码目录下。如：“/usr/app/boot.py”。应与code_dir一同出现。
     * @return bootFile
     */
    public String getBootFile() {
        return bootFile;
    }

    public void setBootFile(String bootFile) {
        this.bootFile = bootFile;
    }

    public AlgorithmJobConfig withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 自定义镜像算法的容器启动命令。
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public AlgorithmJobConfig withParameters(List<Parameters> parameters) {
        this.parameters = parameters;
        return this;
    }

    public AlgorithmJobConfig addParametersItem(Parameters parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public AlgorithmJobConfig withParameters(Consumer<List<Parameters>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 算法的运行参数。
     * @return parameters
     */
    public List<Parameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameters> parameters) {
        this.parameters = parameters;
    }

    public AlgorithmJobConfig withInputs(List<AlgorithmCreateInput> inputs) {
        this.inputs = inputs;
        return this;
    }

    public AlgorithmJobConfig addInputsItem(AlgorithmCreateInput inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public AlgorithmJobConfig withInputs(Consumer<List<AlgorithmCreateInput>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 算法的数据输入。
     * @return inputs
     */
    public List<AlgorithmCreateInput> getInputs() {
        return inputs;
    }

    public void setInputs(List<AlgorithmCreateInput> inputs) {
        this.inputs = inputs;
    }

    public AlgorithmJobConfig withOutputs(List<AlgorithmCreateOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    public AlgorithmJobConfig addOutputsItem(AlgorithmCreateOutput outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public AlgorithmJobConfig withOutputs(Consumer<List<AlgorithmCreateOutput>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * 算法的数据输出。
     * @return outputs
     */
    public List<AlgorithmCreateOutput> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<AlgorithmCreateOutput> outputs) {
        this.outputs = outputs;
    }

    public AlgorithmJobConfig withEngine(AlgorithmCreateEngine engine) {
        this.engine = engine;
        return this;
    }

    public AlgorithmJobConfig withEngine(Consumer<AlgorithmCreateEngine> engineSetter) {
        if (this.engine == null) {
            this.engine = new AlgorithmCreateEngine();
            engineSetter.accept(this.engine);
        }

        return this;
    }

    /**
     * Get engine
     * @return engine
     */
    public AlgorithmCreateEngine getEngine() {
        return engine;
    }

    public void setEngine(AlgorithmCreateEngine engine) {
        this.engine = engine;
    }

    public AlgorithmJobConfig withParametersCustomization(Boolean parametersCustomization) {
        this.parametersCustomization = parametersCustomization;
        return this;
    }

    /**
     * 算法是否允许创建训练作业时自定义超参。
     * @return parametersCustomization
     */
    public Boolean getParametersCustomization() {
        return parametersCustomization;
    }

    public void setParametersCustomization(Boolean parametersCustomization) {
        this.parametersCustomization = parametersCustomization;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlgorithmJobConfig that = (AlgorithmJobConfig) obj;
        return Objects.equals(this.codeDir, that.codeDir) && Objects.equals(this.bootFile, that.bootFile)
            && Objects.equals(this.command, that.command) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.inputs, that.inputs) && Objects.equals(this.outputs, that.outputs)
            && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.parametersCustomization, that.parametersCustomization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeDir, bootFile, command, parameters, inputs, outputs, engine, parametersCustomization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmJobConfig {\n");
        sb.append("    codeDir: ").append(toIndentedString(codeDir)).append("\n");
        sb.append("    bootFile: ").append(toIndentedString(bootFile)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    parametersCustomization: ").append(toIndentedString(parametersCustomization)).append("\n");
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
