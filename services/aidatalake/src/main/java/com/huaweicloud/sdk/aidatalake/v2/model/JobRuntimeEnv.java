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
 * **参数解释**：作业运行环境配置。  **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class JobRuntimeEnv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "working_dir")

    private String workingDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_dir")

    private List<String> dependencyDir = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "python_version")

    private String pythonVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_vars")

    private Map<String, String> envVars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pip")

    private List<String> pip = null;

    public JobRuntimeEnv withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * **参数解释**：作业运行工作目录。  **约束限制**：不涉及。 **取值范围**：长度为1~1024的任意字符组合。 **默认取值**：不涉及。
     * @return workingDir
     */
    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public JobRuntimeEnv withDependencyDir(List<String> dependencyDir) {
        this.dependencyDir = dependencyDir;
        return this;
    }

    public JobRuntimeEnv addDependencyDirItem(String dependencyDirItem) {
        if (this.dependencyDir == null) {
            this.dependencyDir = new ArrayList<>();
        }
        this.dependencyDir.add(dependencyDirItem);
        return this;
    }

    public JobRuntimeEnv withDependencyDir(Consumer<List<String>> dependencyDirSetter) {
        if (this.dependencyDir == null) {
            this.dependencyDir = new ArrayList<>();
        }
        dependencyDirSetter.accept(this.dependencyDir);
        return this;
    }

    /**
     * **参数解释**：作业依赖的zip包路径。  **约束限制**：不涉及。 **取值范围**：长度为1~1024的任意字符组合。 **默认取值**：不涉及。
     * @return dependencyDir
     */
    public List<String> getDependencyDir() {
        return dependencyDir;
    }

    public void setDependencyDir(List<String> dependencyDir) {
        this.dependencyDir = dependencyDir;
    }

    public JobRuntimeEnv withPythonVersion(String pythonVersion) {
        this.pythonVersion = pythonVersion;
        return this;
    }

    /**
     * **参数解释**：作业运行Dataframe版本号。  **约束限制**：不涉及。 **取值范围**：长度为1~1024的任意字符组合。 **默认取值**：不涉及。
     * @return pythonVersion
     */
    public String getPythonVersion() {
        return pythonVersion;
    }

    public void setPythonVersion(String pythonVersion) {
        this.pythonVersion = pythonVersion;
    }

    public JobRuntimeEnv withEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
        return this;
    }

    public JobRuntimeEnv putEnvVarsItem(String key, String envVarsItem) {
        if (this.envVars == null) {
            this.envVars = new HashMap<>();
        }
        this.envVars.put(key, envVarsItem);
        return this;
    }

    public JobRuntimeEnv withEnvVars(Consumer<Map<String, String>> envVarsSetter) {
        if (this.envVars == null) {
            this.envVars = new HashMap<>();
        }
        envVarsSetter.accept(this.envVars);
        return this;
    }

    /**
     * **参数解释**：作业运行环境变量。  **约束限制**：不涉及。 **取值范围**：长度为0~1024。 **默认取值**：不涉及。
     * @return envVars
     */
    public Map<String, String> getEnvVars() {
        return envVars;
    }

    public void setEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
    }

    public JobRuntimeEnv withPip(List<String> pip) {
        this.pip = pip;
        return this;
    }

    public JobRuntimeEnv addPipItem(String pipItem) {
        if (this.pip == null) {
            this.pip = new ArrayList<>();
        }
        this.pip.add(pipItem);
        return this;
    }

    public JobRuntimeEnv withPip(Consumer<List<String>> pipSetter) {
        if (this.pip == null) {
            this.pip = new ArrayList<>();
        }
        pipSetter.accept(this.pip);
        return this;
    }

    /**
     * **参数解释**：作业运行依赖的软件包列表。  **约束限制**：不涉及。 **取值范围**：长度为0~1024。 **默认取值**：不涉及。
     * @return pip
     */
    public List<String> getPip() {
        return pip;
    }

    public void setPip(List<String> pip) {
        this.pip = pip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobRuntimeEnv that = (JobRuntimeEnv) obj;
        return Objects.equals(this.workingDir, that.workingDir)
            && Objects.equals(this.dependencyDir, that.dependencyDir)
            && Objects.equals(this.pythonVersion, that.pythonVersion) && Objects.equals(this.envVars, that.envVars)
            && Objects.equals(this.pip, that.pip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workingDir, dependencyDir, pythonVersion, envVars, pip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobRuntimeEnv {\n");
        sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
        sb.append("    dependencyDir: ").append(toIndentedString(dependencyDir)).append("\n");
        sb.append("    pythonVersion: ").append(toIndentedString(pythonVersion)).append("\n");
        sb.append("    envVars: ").append(toIndentedString(envVars)).append("\n");
        sb.append("    pip: ").append(toIndentedString(pip)).append("\n");
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
