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
 * 训练作业算法。目前支持三种形式： - id：只取算法的id； - subscription_id+item_version_id：取算法的订阅id和版本id； - code_dir+boot_file：取训练作业的代码目录和启动文件。
 */
public class JobAlgorithm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_id")

    private String subscriptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_version_id")

    private String itemVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_dir")

    private String codeDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boot_file")

    private String bootFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autosearch_config_path")

    private String autosearchConfigPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autosearch_framework_path")

    private String autosearchFrameworkPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<Parameters> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private JobPolicies policies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<Input> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<Output> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private JobEngine engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_code_dir")

    private String localCodeDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "working_dir")

    private String workingDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environments")

    private Map<String, String> environments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private Summary summary;

    public JobAlgorithm withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：算法管理的算法id。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JobAlgorithm withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：算法名称。无需填写。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobAlgorithm withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * **参数解释**：订阅算法的订阅ID。 **约束限制**：应与item_version_id一同出现。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public JobAlgorithm withItemVersionId(String itemVersionId) {
        this.itemVersionId = itemVersionId;
        return this;
    }

    /**
     * **参数解释**：订阅算法的版本。 **约束限制**：应与subscription_id一同出现。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return itemVersionId
     */
    public String getItemVersionId() {
        return itemVersionId;
    }

    public void setItemVersionId(String itemVersionId) {
        this.itemVersionId = itemVersionId;
    }

    public JobAlgorithm withCodeDir(String codeDir) {
        this.codeDir = codeDir;
        return this;
    }

    /**
     * **参数解释**：训练作业的代码目录。如：“/usr/app/”。 **约束限制**：应与boot_file一同出现，如果boot_file填入id或subscription_id+item_version_id，则此参数无需填写。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return codeDir
     */
    public String getCodeDir() {
        return codeDir;
    }

    public void setCodeDir(String codeDir) {
        this.codeDir = codeDir;
    }

    public JobAlgorithm withBootFile(String bootFile) {
        this.bootFile = bootFile;
        return this;
    }

    /**
     * **参数解释**：训练作业的代码启动文件，需要在代码目录下。如：“/usr/app/boot.py”。 **约束限制**：应与code_dir一同出现，如果code_dir填入id或subscription_id+item_version_id，则此参数无需填写。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return bootFile
     */
    public String getBootFile() {
        return bootFile;
    }

    public void setBootFile(String bootFile) {
        this.bootFile = bootFile;
    }

    public JobAlgorithm withAutosearchConfigPath(String autosearchConfigPath) {
        this.autosearchConfigPath = autosearchConfigPath;
        return this;
    }

    /**
     * **参数解释**：自动化搜索作业的yaml配置路径，需要提供一个OBS路径。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return autosearchConfigPath
     */
    public String getAutosearchConfigPath() {
        return autosearchConfigPath;
    }

    public void setAutosearchConfigPath(String autosearchConfigPath) {
        this.autosearchConfigPath = autosearchConfigPath;
    }

    public JobAlgorithm withAutosearchFrameworkPath(String autosearchFrameworkPath) {
        this.autosearchFrameworkPath = autosearchFrameworkPath;
        return this;
    }

    /**
     * **参数解释**：自动化搜索作业的框架代码目录，需要提供一个OBS路径。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return autosearchFrameworkPath
     */
    public String getAutosearchFrameworkPath() {
        return autosearchFrameworkPath;
    }

    public void setAutosearchFrameworkPath(String autosearchFrameworkPath) {
        this.autosearchFrameworkPath = autosearchFrameworkPath;
    }

    public JobAlgorithm withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * **参数解释**：自定义镜像场景下，训练作业的自定义镜像的容器的启动命令。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public JobAlgorithm withParameters(List<Parameters> parameters) {
        this.parameters = parameters;
        return this;
    }

    public JobAlgorithm addParametersItem(Parameters parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public JobAlgorithm withParameters(Consumer<List<Parameters>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * **参数解释**：训练作业的运行参数。 **约束限制**：不涉及。
     * @return parameters
     */
    public List<Parameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameters> parameters) {
        this.parameters = parameters;
    }

    public JobAlgorithm withPolicies(JobPolicies policies) {
        this.policies = policies;
        return this;
    }

    public JobAlgorithm withPolicies(Consumer<JobPolicies> policiesSetter) {
        if (this.policies == null) {
            this.policies = new JobPolicies();
            policiesSetter.accept(this.policies);
        }

        return this;
    }

    /**
     * Get policies
     * @return policies
     */
    public JobPolicies getPolicies() {
        return policies;
    }

    public void setPolicies(JobPolicies policies) {
        this.policies = policies;
    }

    public JobAlgorithm withInputs(List<Input> inputs) {
        this.inputs = inputs;
        return this;
    }

    public JobAlgorithm addInputsItem(Input inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public JobAlgorithm withInputs(Consumer<List<Input>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * **参数解释**：训练作业的数据输入。 **约束限制**：不涉及。
     * @return inputs
     */
    public List<Input> getInputs() {
        return inputs;
    }

    public void setInputs(List<Input> inputs) {
        this.inputs = inputs;
    }

    public JobAlgorithm withOutputs(List<Output> outputs) {
        this.outputs = outputs;
        return this;
    }

    public JobAlgorithm addOutputsItem(Output outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public JobAlgorithm withOutputs(Consumer<List<Output>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * **参数解释**：训练作业的结果输出。 **约束限制**：不涉及。
     * @return outputs
     */
    public List<Output> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<Output> outputs) {
        this.outputs = outputs;
    }

    public JobAlgorithm withEngine(JobEngine engine) {
        this.engine = engine;
        return this;
    }

    public JobAlgorithm withEngine(Consumer<JobEngine> engineSetter) {
        if (this.engine == null) {
            this.engine = new JobEngine();
            engineSetter.accept(this.engine);
        }

        return this;
    }

    /**
     * Get engine
     * @return engine
     */
    public JobEngine getEngine() {
        return engine;
    }

    public void setEngine(JobEngine engine) {
        this.engine = engine;
    }

    public JobAlgorithm withLocalCodeDir(String localCodeDir) {
        this.localCodeDir = localCodeDir;
        return this;
    }

    /**
     * **参数解释**：算法的代码目录下载到训练容器内的本地路径。 **约束限制**： - 必须为/home下的目录。 - v1兼容模式下，当前字段不生效。 - 当code_dir以file://为前缀时，当前字段不生效。 - 不支持配置成/home/ma-user/modelarts，/home/ma-user/modelarts-dev，/home/ma-user/infer以及它们底下的目录，也不支持配置成/home/ma-user  **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return localCodeDir
     */
    public String getLocalCodeDir() {
        return localCodeDir;
    }

    public void setLocalCodeDir(String localCodeDir) {
        this.localCodeDir = localCodeDir;
    }

    public JobAlgorithm withWorkingDir(String workingDir) {
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

    public JobAlgorithm withEnvironments(Map<String, String> environments) {
        this.environments = environments;
        return this;
    }

    public JobAlgorithm putEnvironmentsItem(String key, String environmentsItem) {
        if (this.environments == null) {
            this.environments = new HashMap<>();
        }
        this.environments.put(key, environmentsItem);
        return this;
    }

    public JobAlgorithm withEnvironments(Consumer<Map<String, String>> environmentsSetter) {
        if (this.environments == null) {
            this.environments = new HashMap<>();
        }
        environmentsSetter.accept(this.environments);
        return this;
    }

    /**
     * **参数解释**：训练作业的环境变量。格式：\"key\":\"value\"。 **约束限制**：其中key最大允许填写8192字符，value最大允许填写4096字符，最多允许100对环境变量。变量名应该仅包含字母、数字、下划线，且以字母或下划线开头。 注：不支持使用符号 $ 引用变量。
     * @return environments
     */
    public Map<String, String> getEnvironments() {
        return environments;
    }

    public void setEnvironments(Map<String, String> environments) {
        this.environments = environments;
    }

    public JobAlgorithm withSummary(Summary summary) {
        this.summary = summary;
        return this;
    }

    public JobAlgorithm withSummary(Consumer<Summary> summarySetter) {
        if (this.summary == null) {
            this.summary = new Summary();
            summarySetter.accept(this.summary);
        }

        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobAlgorithm that = (JobAlgorithm) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.subscriptionId, that.subscriptionId)
            && Objects.equals(this.itemVersionId, that.itemVersionId) && Objects.equals(this.codeDir, that.codeDir)
            && Objects.equals(this.bootFile, that.bootFile)
            && Objects.equals(this.autosearchConfigPath, that.autosearchConfigPath)
            && Objects.equals(this.autosearchFrameworkPath, that.autosearchFrameworkPath)
            && Objects.equals(this.command, that.command) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.policies, that.policies) && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.outputs, that.outputs) && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.localCodeDir, that.localCodeDir) && Objects.equals(this.workingDir, that.workingDir)
            && Objects.equals(this.environments, that.environments) && Objects.equals(this.summary, that.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            subscriptionId,
            itemVersionId,
            codeDir,
            bootFile,
            autosearchConfigPath,
            autosearchFrameworkPath,
            command,
            parameters,
            policies,
            inputs,
            outputs,
            engine,
            localCodeDir,
            workingDir,
            environments,
            summary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobAlgorithm {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    itemVersionId: ").append(toIndentedString(itemVersionId)).append("\n");
        sb.append("    codeDir: ").append(toIndentedString(codeDir)).append("\n");
        sb.append("    bootFile: ").append(toIndentedString(bootFile)).append("\n");
        sb.append("    autosearchConfigPath: ").append(toIndentedString(autosearchConfigPath)).append("\n");
        sb.append("    autosearchFrameworkPath: ").append(toIndentedString(autosearchFrameworkPath)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    localCodeDir: ").append(toIndentedString(localCodeDir)).append("\n");
        sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
        sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
