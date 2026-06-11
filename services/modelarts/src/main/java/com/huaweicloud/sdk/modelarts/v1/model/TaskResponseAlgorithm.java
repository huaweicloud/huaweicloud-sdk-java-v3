package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 算法管理算法配置。
 */
public class TaskResponseAlgorithm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_dir")

    private String codeDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boot_file")

    private String bootFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private AlgorithmInput inputs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private AlgorithmOutput outputs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private AlgorithmEngine engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_code_dir")

    private String localCodeDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "working_dir")

    private String workingDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environments")

    private Map<String, String> environments = null;

    public TaskResponseAlgorithm withCodeDir(String codeDir) {
        this.codeDir = codeDir;
        return this;
    }

    /**
     * 算法启动文件所在目录绝对路径。
     * @return codeDir
     */
    public String getCodeDir() {
        return codeDir;
    }

    public void setCodeDir(String codeDir) {
        this.codeDir = codeDir;
    }

    public TaskResponseAlgorithm withBootFile(String bootFile) {
        this.bootFile = bootFile;
        return this;
    }

    /**
     * 算法启动文件绝对路径。
     * @return bootFile
     */
    public String getBootFile() {
        return bootFile;
    }

    public void setBootFile(String bootFile) {
        this.bootFile = bootFile;
    }

    public TaskResponseAlgorithm withInputs(AlgorithmInput inputs) {
        this.inputs = inputs;
        return this;
    }

    public TaskResponseAlgorithm withInputs(Consumer<AlgorithmInput> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new AlgorithmInput();
            inputsSetter.accept(this.inputs);
        }

        return this;
    }

    /**
     * Get inputs
     * @return inputs
     */
    public AlgorithmInput getInputs() {
        return inputs;
    }

    public void setInputs(AlgorithmInput inputs) {
        this.inputs = inputs;
    }

    public TaskResponseAlgorithm withOutputs(AlgorithmOutput outputs) {
        this.outputs = outputs;
        return this;
    }

    public TaskResponseAlgorithm withOutputs(Consumer<AlgorithmOutput> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new AlgorithmOutput();
            outputsSetter.accept(this.outputs);
        }

        return this;
    }

    /**
     * Get outputs
     * @return outputs
     */
    public AlgorithmOutput getOutputs() {
        return outputs;
    }

    public void setOutputs(AlgorithmOutput outputs) {
        this.outputs = outputs;
    }

    public TaskResponseAlgorithm withEngine(AlgorithmEngine engine) {
        this.engine = engine;
        return this;
    }

    public TaskResponseAlgorithm withEngine(Consumer<AlgorithmEngine> engineSetter) {
        if (this.engine == null) {
            this.engine = new AlgorithmEngine();
            engineSetter.accept(this.engine);
        }

        return this;
    }

    /**
     * Get engine
     * @return engine
     */
    public AlgorithmEngine getEngine() {
        return engine;
    }

    public void setEngine(AlgorithmEngine engine) {
        this.engine = engine;
    }

    public TaskResponseAlgorithm withLocalCodeDir(String localCodeDir) {
        this.localCodeDir = localCodeDir;
        return this;
    }

    /**
     * 算法的代码目录下载到训练容器内的本地路径。规则如下： - 必须为/home下的目录； - v1兼容模式下，当前字段不生效； - 当code_dir以file://为前缀时，当前字段不生效。
     * @return localCodeDir
     */
    public String getLocalCodeDir() {
        return localCodeDir;
    }

    public void setLocalCodeDir(String localCodeDir) {
        this.localCodeDir = localCodeDir;
    }

    public TaskResponseAlgorithm withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * 运行算法时所在的工作目录。规则：v1兼容模式下，当前字段不生效。
     * @return workingDir
     */
    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public TaskResponseAlgorithm withEnvironments(Map<String, String> environments) {
        this.environments = environments;
        return this;
    }

    public TaskResponseAlgorithm putEnvironmentsItem(String key, String environmentsItem) {
        if (this.environments == null) {
            this.environments = new HashMap<>();
        }
        this.environments.put(key, environmentsItem);
        return this;
    }

    public TaskResponseAlgorithm withEnvironments(Consumer<Map<String, String>> environmentsSetter) {
        if (this.environments == null) {
            this.environments = new HashMap<>();
        }
        environmentsSetter.accept(this.environments);
        return this;
    }

    /**
     * **参数解释**：训练作业相关的环境变量。 **取值范围**：不涉及。
     * @return environments
     */
    public Map<String, String> getEnvironments() {
        return environments;
    }

    public void setEnvironments(Map<String, String> environments) {
        this.environments = environments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskResponseAlgorithm that = (TaskResponseAlgorithm) obj;
        return Objects.equals(this.codeDir, that.codeDir) && Objects.equals(this.bootFile, that.bootFile)
            && Objects.equals(this.inputs, that.inputs) && Objects.equals(this.outputs, that.outputs)
            && Objects.equals(this.engine, that.engine) && Objects.equals(this.localCodeDir, that.localCodeDir)
            && Objects.equals(this.workingDir, that.workingDir) && Objects.equals(this.environments, that.environments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeDir, bootFile, inputs, outputs, engine, localCodeDir, workingDir, environments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskResponseAlgorithm {\n");
        sb.append("    codeDir: ").append(toIndentedString(codeDir)).append("\n");
        sb.append("    bootFile: ").append(toIndentedString(bootFile)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    localCodeDir: ").append(toIndentedString(localCodeDir)).append("\n");
        sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
        sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
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
