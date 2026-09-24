package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：作业的运行时环境配置。 **约束限制**：不涉及。 **默认取值**：不涉及。
 */
public class RuntimeEnv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "working_dir")

    private String workingDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pip")

    private List<String> pip = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_vars")

    private Map<String, String> envVars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private Map<String, Object> config = null;

    public RuntimeEnv withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * **参数解释**：代码将在其中运行的工作目录。 **约束限制**：必须是远程URI，如OBS路径。 **取值范围**：最小长度1，最大长度2048。 **默认取值**：不涉及。
     * @return workingDir
     */
    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
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
     * **参数解释**：要安装的pip软件包列表。 **约束限制**：最小个数0，最大个数1023。
     * @return pip
     */
    public List<String> getPip() {
        return pip;
    }

    public void setPip(List<String> pip) {
        this.pip = pip;
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
     * **参数解释**：要设置的环境变量。key为环境变量名称，value为环境变量值，均为String类型。 **约束限制**：不涉及。
     * @return envVars
     */
    public Map<String, String> getEnvVars() {
        return envVars;
    }

    public void setEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
    }

    public RuntimeEnv withConfig(Map<String, Object> config) {
        this.config = config;
        return this;
    }

    public RuntimeEnv putConfigItem(String key, Object configItem) {
        if (this.config == null) {
            this.config = new HashMap<>();
        }
        this.config.put(key, configItem);
        return this;
    }

    public RuntimeEnv withConfig(Consumer<Map<String, Object>> configSetter) {
        if (this.config == null) {
            this.config = new HashMap<>();
        }
        configSetter.accept(this.config);
        return this;
    }

    /**
     * **参数解释**：运行环境的配置。key为配置项名称，value为配置项值。 **约束限制**：不涉及。
     * @return config
     */
    public Map<String, Object> getConfig() {
        return config;
    }

    public void setConfig(Map<String, Object> config) {
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
        return Objects.equals(this.workingDir, that.workingDir) && Objects.equals(this.pip, that.pip)
            && Objects.equals(this.envVars, that.envVars) && Objects.equals(this.config, that.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workingDir, pip, envVars, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeEnv {\n");
        sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
        sb.append("    pip: ").append(toIndentedString(pip)).append("\n");
        sb.append("    envVars: ").append(toIndentedString(envVars)).append("\n");
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
