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
public class AlgorithmResponseJobConfig {

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

    private List<Parameter> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<AlgorithmResponseJobConfigInputs> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<AlgorithmResponseJobConfigOutputs> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private AlgorithmResponseJobConfigEngine engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_tree")

    private List<AlgorithmResponseJobConfigCodeTree> codeTree = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters_customization")

    private Boolean parametersCustomization;

    public AlgorithmResponseJobConfig withCodeDir(String codeDir) {
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

    public AlgorithmResponseJobConfig withBootFile(String bootFile) {
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

    public AlgorithmResponseJobConfig withCommand(String command) {
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

    public AlgorithmResponseJobConfig withParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public AlgorithmResponseJobConfig addParametersItem(Parameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public AlgorithmResponseJobConfig withParameters(Consumer<List<Parameter>> parametersSetter) {
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
    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public AlgorithmResponseJobConfig withInputs(List<AlgorithmResponseJobConfigInputs> inputs) {
        this.inputs = inputs;
        return this;
    }

    public AlgorithmResponseJobConfig addInputsItem(AlgorithmResponseJobConfigInputs inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public AlgorithmResponseJobConfig withInputs(Consumer<List<AlgorithmResponseJobConfigInputs>> inputsSetter) {
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
    public List<AlgorithmResponseJobConfigInputs> getInputs() {
        return inputs;
    }

    public void setInputs(List<AlgorithmResponseJobConfigInputs> inputs) {
        this.inputs = inputs;
    }

    public AlgorithmResponseJobConfig withOutputs(List<AlgorithmResponseJobConfigOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }

    public AlgorithmResponseJobConfig addOutputsItem(AlgorithmResponseJobConfigOutputs outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public AlgorithmResponseJobConfig withOutputs(Consumer<List<AlgorithmResponseJobConfigOutputs>> outputsSetter) {
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
    public List<AlgorithmResponseJobConfigOutputs> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<AlgorithmResponseJobConfigOutputs> outputs) {
        this.outputs = outputs;
    }

    public AlgorithmResponseJobConfig withEngine(AlgorithmResponseJobConfigEngine engine) {
        this.engine = engine;
        return this;
    }

    public AlgorithmResponseJobConfig withEngine(Consumer<AlgorithmResponseJobConfigEngine> engineSetter) {
        if (this.engine == null) {
            this.engine = new AlgorithmResponseJobConfigEngine();
            engineSetter.accept(this.engine);
        }

        return this;
    }

    /**
     * Get engine
     * @return engine
     */
    public AlgorithmResponseJobConfigEngine getEngine() {
        return engine;
    }

    public void setEngine(AlgorithmResponseJobConfigEngine engine) {
        this.engine = engine;
    }

    public AlgorithmResponseJobConfig withCodeTree(List<AlgorithmResponseJobConfigCodeTree> codeTree) {
        this.codeTree = codeTree;
        return this;
    }

    public AlgorithmResponseJobConfig addCodeTreeItem(AlgorithmResponseJobConfigCodeTree codeTreeItem) {
        if (this.codeTree == null) {
            this.codeTree = new ArrayList<>();
        }
        this.codeTree.add(codeTreeItem);
        return this;
    }

    public AlgorithmResponseJobConfig withCodeTree(Consumer<List<AlgorithmResponseJobConfigCodeTree>> codeTreeSetter) {
        if (this.codeTree == null) {
            this.codeTree = new ArrayList<>();
        }
        codeTreeSetter.accept(this.codeTree);
        return this;
    }

    /**
     * 算法的目录结构树。
     * @return codeTree
     */
    public List<AlgorithmResponseJobConfigCodeTree> getCodeTree() {
        return codeTree;
    }

    public void setCodeTree(List<AlgorithmResponseJobConfigCodeTree> codeTree) {
        this.codeTree = codeTree;
    }

    public AlgorithmResponseJobConfig withParametersCustomization(Boolean parametersCustomization) {
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
        AlgorithmResponseJobConfig that = (AlgorithmResponseJobConfig) obj;
        return Objects.equals(this.codeDir, that.codeDir) && Objects.equals(this.bootFile, that.bootFile)
            && Objects.equals(this.command, that.command) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.inputs, that.inputs) && Objects.equals(this.outputs, that.outputs)
            && Objects.equals(this.engine, that.engine) && Objects.equals(this.codeTree, that.codeTree)
            && Objects.equals(this.parametersCustomization, that.parametersCustomization);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(codeDir, bootFile, command, parameters, inputs, outputs, engine, codeTree, parametersCustomization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmResponseJobConfig {\n");
        sb.append("    codeDir: ").append(toIndentedString(codeDir)).append("\n");
        sb.append("    bootFile: ").append(toIndentedString(bootFile)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    codeTree: ").append(toIndentedString(codeTree)).append("\n");
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
