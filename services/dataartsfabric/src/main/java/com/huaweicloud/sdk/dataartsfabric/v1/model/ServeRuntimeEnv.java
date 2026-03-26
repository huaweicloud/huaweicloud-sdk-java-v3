package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Serve的运行时环境配置。 **约束限制**：不涉及。 **取值范围**：可选参数有：working_dir：代码将在其中运行的工作目录。必须是远程URI，如s3或本地路径;env_vars：要设置的环境变量。 **默认取值**：不涉及。 
 */
public class ServeRuntimeEnv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "working_dir")

    private String workingDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_vars")

    private Map<String, String> envVars = null;

    public ServeRuntimeEnv withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * **参数解释**：代码将在其中运行的工作目录。 **约束限制**：必须是远程URI，如s3或本地路径。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return workingDir
     */
    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public ServeRuntimeEnv withEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
        return this;
    }

    public ServeRuntimeEnv putEnvVarsItem(String key, String envVarsItem) {
        if (this.envVars == null) {
            this.envVars = new HashMap<>();
        }
        this.envVars.put(key, envVarsItem);
        return this;
    }

    public ServeRuntimeEnv withEnvVars(Consumer<Map<String, String>> envVarsSetter) {
        if (this.envVars == null) {
            this.envVars = new HashMap<>();
        }
        envVarsSetter.accept(this.envVars);
        return this;
    }

    /**
     * **参数解释**：要设置的环境变量。 **约束限制**：不涉及。
     * @return envVars
     */
    public Map<String, String> getEnvVars() {
        return envVars;
    }

    public void setEnvVars(Map<String, String> envVars) {
        this.envVars = envVars;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServeRuntimeEnv that = (ServeRuntimeEnv) obj;
        return Objects.equals(this.workingDir, that.workingDir) && Objects.equals(this.envVars, that.envVars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workingDir, envVars);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServeRuntimeEnv {\n");
        sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
        sb.append("    envVars: ").append(toIndentedString(envVars)).append("\n");
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
