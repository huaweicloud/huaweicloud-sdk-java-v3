package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业算法。目前支持三种形式： - id：只取算法的id； - subscription_id+item_version_id：取算法的订阅id和版本id； - code_dir+boot_file：取训练作业的代码目录和启动文件。
 */
public class JobAlgorithmResponse {

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

    private List<Parameter> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private JobAlgorithmResponsePolicies policies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<InputResp> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<OutputResp> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private JobEngineResp engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_code_dir")

    private String localCodeDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "working_dir")

    private String workingDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environments")

    private List<Map<String, String>> environments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private SummaryResp summary;

    public JobAlgorithmResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 训练作业算法。目前支持三种形式：   - id：只取算法的id；   - subscription_id+item_version_id：取算法的订阅id和版本id；   - code_dir+boot_file：取训练作业的代码目录和启动文件。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JobAlgorithmResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 算法名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobAlgorithmResponse withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * 订阅算法的订阅ID。应与item_version_id一同出现。
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public JobAlgorithmResponse withItemVersionId(String itemVersionId) {
        this.itemVersionId = itemVersionId;
        return this;
    }

    /**
     * 订阅算法的版本。应与subscription_id一同出现。
     * @return itemVersionId
     */
    public String getItemVersionId() {
        return itemVersionId;
    }

    public void setItemVersionId(String itemVersionId) {
        this.itemVersionId = itemVersionId;
    }

    public JobAlgorithmResponse withCodeDir(String codeDir) {
        this.codeDir = codeDir;
        return this;
    }

    /**
     * 训练作业的代码目录。如：“/usr/app/”。应与boot_file一同出现，如果boot_file已经填入id或subscription_id+item_version_id，则无需填写此参数。
     * @return codeDir
     */
    public String getCodeDir() {
        return codeDir;
    }

    public void setCodeDir(String codeDir) {
        this.codeDir = codeDir;
    }

    public JobAlgorithmResponse withBootFile(String bootFile) {
        this.bootFile = bootFile;
        return this;
    }

    /**
     * 训练作业的代码启动文件，需要在代码目录下。如：“/usr/app/boot.py”。应与code_dir一同出现，如果code_dir已经填入id或subscription_id+item_version_id，则无需填写此参数。
     * @return bootFile
     */
    public String getBootFile() {
        return bootFile;
    }

    public void setBootFile(String bootFile) {
        this.bootFile = bootFile;
    }

    public JobAlgorithmResponse withAutosearchConfigPath(String autosearchConfigPath) {
        this.autosearchConfigPath = autosearchConfigPath;
        return this;
    }

    /**
     * 自动化搜索作业的yaml配置路径，需要提供一个OBS路径。如：“obs://bucket/file.yaml”。
     * @return autosearchConfigPath
     */
    public String getAutosearchConfigPath() {
        return autosearchConfigPath;
    }

    public void setAutosearchConfigPath(String autosearchConfigPath) {
        this.autosearchConfigPath = autosearchConfigPath;
    }

    public JobAlgorithmResponse withAutosearchFrameworkPath(String autosearchFrameworkPath) {
        this.autosearchFrameworkPath = autosearchFrameworkPath;
        return this;
    }

    /**
     * 自动化搜索作业的框架代码目录，需要提供一个OBS路径。如：“obs://bucket/files/”。
     * @return autosearchFrameworkPath
     */
    public String getAutosearchFrameworkPath() {
        return autosearchFrameworkPath;
    }

    public void setAutosearchFrameworkPath(String autosearchFrameworkPath) {
        this.autosearchFrameworkPath = autosearchFrameworkPath;
    }

    public JobAlgorithmResponse withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 自定义镜像训练作业的自定义镜像的容器的启动命令。例如python train.py。
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public JobAlgorithmResponse withParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    public JobAlgorithmResponse addParametersItem(Parameter parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public JobAlgorithmResponse withParameters(Consumer<List<Parameter>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 训练作业的运行参数。
     * @return parameters
     */
    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public JobAlgorithmResponse withPolicies(JobAlgorithmResponsePolicies policies) {
        this.policies = policies;
        return this;
    }

    public JobAlgorithmResponse withPolicies(Consumer<JobAlgorithmResponsePolicies> policiesSetter) {
        if (this.policies == null) {
            this.policies = new JobAlgorithmResponsePolicies();
            policiesSetter.accept(this.policies);
        }

        return this;
    }

    /**
     * Get policies
     * @return policies
     */
    public JobAlgorithmResponsePolicies getPolicies() {
        return policies;
    }

    public void setPolicies(JobAlgorithmResponsePolicies policies) {
        this.policies = policies;
    }

    public JobAlgorithmResponse withInputs(List<InputResp> inputs) {
        this.inputs = inputs;
        return this;
    }

    public JobAlgorithmResponse addInputsItem(InputResp inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public JobAlgorithmResponse withInputs(Consumer<List<InputResp>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * **参数解释**：训练作业的数据输入。
     * @return inputs
     */
    public List<InputResp> getInputs() {
        return inputs;
    }

    public void setInputs(List<InputResp> inputs) {
        this.inputs = inputs;
    }

    public JobAlgorithmResponse withOutputs(List<OutputResp> outputs) {
        this.outputs = outputs;
        return this;
    }

    public JobAlgorithmResponse addOutputsItem(OutputResp outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public JobAlgorithmResponse withOutputs(Consumer<List<OutputResp>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * **参数解释**：训练作业的结果输出。
     * @return outputs
     */
    public List<OutputResp> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<OutputResp> outputs) {
        this.outputs = outputs;
    }

    public JobAlgorithmResponse withEngine(JobEngineResp engine) {
        this.engine = engine;
        return this;
    }

    public JobAlgorithmResponse withEngine(Consumer<JobEngineResp> engineSetter) {
        if (this.engine == null) {
            this.engine = new JobEngineResp();
            engineSetter.accept(this.engine);
        }

        return this;
    }

    /**
     * Get engine
     * @return engine
     */
    public JobEngineResp getEngine() {
        return engine;
    }

    public void setEngine(JobEngineResp engine) {
        this.engine = engine;
    }

    public JobAlgorithmResponse withLocalCodeDir(String localCodeDir) {
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

    public JobAlgorithmResponse withWorkingDir(String workingDir) {
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

    public JobAlgorithmResponse withEnvironments(List<Map<String, String>> environments) {
        this.environments = environments;
        return this;
    }

    public JobAlgorithmResponse addEnvironmentsItem(Map<String, String> environmentsItem) {
        if (this.environments == null) {
            this.environments = new ArrayList<>();
        }
        this.environments.add(environmentsItem);
        return this;
    }

    public JobAlgorithmResponse withEnvironments(Consumer<List<Map<String, String>>> environmentsSetter) {
        if (this.environments == null) {
            this.environments = new ArrayList<>();
        }
        environmentsSetter.accept(this.environments);
        return this;
    }

    /**
     * 训练作业的环境变量。格式：\"key\":\"value\"，无需填写。
     * @return environments
     */
    public List<Map<String, String>> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<Map<String, String>> environments) {
        this.environments = environments;
    }

    public JobAlgorithmResponse withSummary(SummaryResp summary) {
        this.summary = summary;
        return this;
    }

    public JobAlgorithmResponse withSummary(Consumer<SummaryResp> summarySetter) {
        if (this.summary == null) {
            this.summary = new SummaryResp();
            summarySetter.accept(this.summary);
        }

        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public SummaryResp getSummary() {
        return summary;
    }

    public void setSummary(SummaryResp summary) {
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
        JobAlgorithmResponse that = (JobAlgorithmResponse) obj;
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
        sb.append("class JobAlgorithmResponse {\n");
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
