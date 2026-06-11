package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：算法管理算法配置。 **约束限制**：不涉及。
 */
public class TaskAlgorithm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private TaskAlgorithmJobConfig jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_dir")

    private String codeDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boot_file")

    private String bootFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private TaskAlgorithmEngine engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<TaskAlgorithmInputs> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<TaskAlgorithmOutputs> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_code_dir")

    private String localCodeDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "working_dir")

    private String workingDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environments")

    private Map<String, String> environments = null;

    public TaskAlgorithm withJobConfig(TaskAlgorithmJobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public TaskAlgorithm withJobConfig(Consumer<TaskAlgorithmJobConfig> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new TaskAlgorithmJobConfig();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * Get jobConfig
     * @return jobConfig
     */
    public TaskAlgorithmJobConfig getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(TaskAlgorithmJobConfig jobConfig) {
        this.jobConfig = jobConfig;
    }

    public TaskAlgorithm withCodeDir(String codeDir) {
        this.codeDir = codeDir;
        return this;
    }

    /**
     * **参数解释**：算法的代码目录。如：“/usr/app/”。 **约束限制**：应与boot_file一同出现。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return codeDir
     */
    public String getCodeDir() {
        return codeDir;
    }

    public void setCodeDir(String codeDir) {
        this.codeDir = codeDir;
    }

    public TaskAlgorithm withBootFile(String bootFile) {
        this.bootFile = bootFile;
        return this;
    }

    /**
     * **参数解释**：算法的代码启动文件，需要在代码目录下。如：“/usr/app/boot.py”。 **约束限制**：应与code_dir一同出现。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return bootFile
     */
    public String getBootFile() {
        return bootFile;
    }

    public void setBootFile(String bootFile) {
        this.bootFile = bootFile;
    }

    public TaskAlgorithm withEngine(TaskAlgorithmEngine engine) {
        this.engine = engine;
        return this;
    }

    public TaskAlgorithm withEngine(Consumer<TaskAlgorithmEngine> engineSetter) {
        if (this.engine == null) {
            this.engine = new TaskAlgorithmEngine();
            engineSetter.accept(this.engine);
        }

        return this;
    }

    /**
     * Get engine
     * @return engine
     */
    public TaskAlgorithmEngine getEngine() {
        return engine;
    }

    public void setEngine(TaskAlgorithmEngine engine) {
        this.engine = engine;
    }

    public TaskAlgorithm withInputs(List<TaskAlgorithmInputs> inputs) {
        this.inputs = inputs;
        return this;
    }

    public TaskAlgorithm addInputsItem(TaskAlgorithmInputs inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public TaskAlgorithm withInputs(Consumer<List<TaskAlgorithmInputs>> inputsSetter) {
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
    public List<TaskAlgorithmInputs> getInputs() {
        return inputs;
    }

    public void setInputs(List<TaskAlgorithmInputs> inputs) {
        this.inputs = inputs;
    }

    public TaskAlgorithm withOutputs(List<TaskAlgorithmOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }

    public TaskAlgorithm addOutputsItem(TaskAlgorithmOutputs outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public TaskAlgorithm withOutputs(Consumer<List<TaskAlgorithmOutputs>> outputsSetter) {
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
    public List<TaskAlgorithmOutputs> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<TaskAlgorithmOutputs> outputs) {
        this.outputs = outputs;
    }

    public TaskAlgorithm withLocalCodeDir(String localCodeDir) {
        this.localCodeDir = localCodeDir;
        return this;
    }

    /**
     * **参数解释**：算法的代码目录下载到训练容器内的本地路径。 **约束限制**： - 必须为/home下的目录； - v1兼容模式下，当前字段不生效； - 当code_dir以file://为前缀时，当前字段不生效。  **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return localCodeDir
     */
    public String getLocalCodeDir() {
        return localCodeDir;
    }

    public void setLocalCodeDir(String localCodeDir) {
        this.localCodeDir = localCodeDir;
    }

    public TaskAlgorithm withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * **参数解释**：运行算法时所在的工作目录。 **约束限制**：v1兼容模式下，当前字段不生效。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return workingDir
     */
    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public TaskAlgorithm withEnvironments(Map<String, String> environments) {
        this.environments = environments;
        return this;
    }

    public TaskAlgorithm putEnvironmentsItem(String key, String environmentsItem) {
        if (this.environments == null) {
            this.environments = new HashMap<>();
        }
        this.environments.put(key, environmentsItem);
        return this;
    }

    public TaskAlgorithm withEnvironments(Consumer<Map<String, String>> environmentsSetter) {
        if (this.environments == null) {
            this.environments = new HashMap<>();
        }
        environmentsSetter.accept(this.environments);
        return this;
    }

    /**
     * **参数解释**：训练作业环境变量。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
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
        TaskAlgorithm that = (TaskAlgorithm) obj;
        return Objects.equals(this.jobConfig, that.jobConfig) && Objects.equals(this.codeDir, that.codeDir)
            && Objects.equals(this.bootFile, that.bootFile) && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.inputs, that.inputs) && Objects.equals(this.outputs, that.outputs)
            && Objects.equals(this.localCodeDir, that.localCodeDir) && Objects.equals(this.workingDir, that.workingDir)
            && Objects.equals(this.environments, that.environments);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(jobConfig, codeDir, bootFile, engine, inputs, outputs, localCodeDir, workingDir, environments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskAlgorithm {\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    codeDir: ").append(toIndentedString(codeDir)).append("\n");
        sb.append("    bootFile: ").append(toIndentedString(bootFile)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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
