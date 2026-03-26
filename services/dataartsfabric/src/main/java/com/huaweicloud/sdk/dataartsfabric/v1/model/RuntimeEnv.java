package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业的运行时环境配置，可选参数有：working_dir：代码将在其中运行的工作目录。必须是远程URI，如s3或git路径。py_modules：将与运行时环境一起安装的Python模块。这些必须是远程URI。pip：要安装的pip软件包列表。conda：conda YAML配置或本地conda env的名称（例如，“pytorch_p36”），env_vars：要设置的环境变量。
 */
public class RuntimeEnv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "working_dir")

    private String workingDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "py_modules")

    private List<String> pyModules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pip")

    private List<String> pip = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conda")

    private Object conda;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_vars")

    private Map<String, String> envVars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container")

    private Object container;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_process_setup_hook")

    private String workerProcessSetupHook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nsight")

    private String nsight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private String config;

    public RuntimeEnv withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * 代码将在其中运行的工作目录。必须是远程URI，如s3或git路径。
     * @return workingDir
     */
    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public RuntimeEnv withPyModules(List<String> pyModules) {
        this.pyModules = pyModules;
        return this;
    }

    public RuntimeEnv addPyModulesItem(String pyModulesItem) {
        if (this.pyModules == null) {
            this.pyModules = new ArrayList<>();
        }
        this.pyModules.add(pyModulesItem);
        return this;
    }

    public RuntimeEnv withPyModules(Consumer<List<String>> pyModulesSetter) {
        if (this.pyModules == null) {
            this.pyModules = new ArrayList<>();
        }
        pyModulesSetter.accept(this.pyModules);
        return this;
    }

    /**
     * 将与运行时环境一起安装的Python模块。这些必须是远程URI。
     * @return pyModules
     */
    public List<String> getPyModules() {
        return pyModules;
    }

    public void setPyModules(List<String> pyModules) {
        this.pyModules = pyModules;
    }

    public RuntimeEnv withPip(List<String> pip) {
        this.pip = pip;
        return this;
    }

    public RuntimeEnv addPipItem(String pipItem) {
        if (this.pip == null) {
            this.pip = new ArrayList<>();
        }
        this.pip.add(pipItem);
        return this;
    }

    public RuntimeEnv withPip(Consumer<List<String>> pipSetter) {
        if (this.pip == null) {
            this.pip = new ArrayList<>();
        }
        pipSetter.accept(this.pip);
        return this;
    }

    /**
     * 要安装的pip软件包列表。
     * @return pip
     */
    public List<String> getPip() {
        return pip;
    }

    public void setPip(List<String> pip) {
        this.pip = pip;
    }

    public RuntimeEnv withConda(Object conda) {
        this.conda = conda;
        return this;
    }

    /**
     * 【联合【指令【str，任何】，str】：conda YAML配置或本地conda env的名称（例如，“pytorch_p36”），
     * @return conda
     */
    public Object getConda() {
        return conda;
    }

    public void setConda(Object conda) {
        this.conda = conda;
    }

    public RuntimeEnv withEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
        return this;
    }

    public RuntimeEnv putEnvVarsItem(String key, String envVarsItem) {
        if (this.envVars == null) {
            this.envVars = new HashMap<>();
        }
        this.envVars.put(key, envVarsItem);
        return this;
    }

    public RuntimeEnv withEnvVars(Consumer<Map<String, String>> envVarsSetter) {
        if (this.envVars == null) {
            this.envVars = new HashMap<>();
        }
        envVarsSetter.accept(this.envVars);
        return this;
    }

    /**
     * 要设置的环境变量。
     * @return envVars
     */
    public Map<String, String> getEnvVars() {
        return envVars;
    }

    public void setEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
    }

    public RuntimeEnv withContainer(Object container) {
        this.container = container;
        return this;
    }

    /**
     * 容器配置
     * @return container
     */
    public Object getContainer() {
        return container;
    }

    public void setContainer(Object container) {
        this.container = container;
    }

    public RuntimeEnv withWorkerProcessSetupHook(String workerProcessSetupHook) {
        this.workerProcessSetupHook = workerProcessSetupHook;
        return this;
    }

    /**
     * hook配置信息
     * @return workerProcessSetupHook
     */
    public String getWorkerProcessSetupHook() {
        return workerProcessSetupHook;
    }

    public void setWorkerProcessSetupHook(String workerProcessSetupHook) {
        this.workerProcessSetupHook = workerProcessSetupHook;
    }

    public RuntimeEnv withNsight(String nsight) {
        this.nsight = nsight;
        return this;
    }

    /**
     * nsight配置
     * @return nsight
     */
    public String getNsight() {
        return nsight;
    }

    public void setNsight(String nsight) {
        this.nsight = nsight;
    }

    public RuntimeEnv withConfig(String config) {
        this.config = config;
        return this;
    }

    /**
     * 运行环境的配置
     * @return config
     */
    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuntimeEnv that = (RuntimeEnv) obj;
        return Objects.equals(this.workingDir, that.workingDir) && Objects.equals(this.pyModules, that.pyModules)
            && Objects.equals(this.pip, that.pip) && Objects.equals(this.conda, that.conda)
            && Objects.equals(this.envVars, that.envVars) && Objects.equals(this.container, that.container)
            && Objects.equals(this.workerProcessSetupHook, that.workerProcessSetupHook)
            && Objects.equals(this.nsight, that.nsight) && Objects.equals(this.config, that.config);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(workingDir, pyModules, pip, conda, envVars, container, workerProcessSetupHook, nsight, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeEnv {\n");
        sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
        sb.append("    pyModules: ").append(toIndentedString(pyModules)).append("\n");
        sb.append("    pip: ").append(toIndentedString(pip)).append("\n");
        sb.append("    conda: ").append(toIndentedString(conda)).append("\n");
        sb.append("    envVars: ").append(toIndentedString(envVars)).append("\n");
        sb.append("    container: ").append(toIndentedString(container)).append("\n");
        sb.append("    workerProcessSetupHook: ").append(toIndentedString(workerProcessSetupHook)).append("\n");
        sb.append("    nsight: ").append(toIndentedString(nsight)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
