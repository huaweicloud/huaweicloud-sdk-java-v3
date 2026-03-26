package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：数据信息。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
 */
public class DataInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_path")

    private String inputPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_path")

    private String outputPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_var_name")

    private String envVarName;

    public DataInfo withInputPath(String inputPath) {
        this.inputPath = inputPath;
        return this;
    }

    /**
     * **参数解释**：地址。 **约束限制**：不涉及。 **取值范围**：长度[4,1024]。 **默认取值**：不涉及。 
     * @return inputPath
     */
    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    public DataInfo withOutputPath(String outputPath) {
        this.outputPath = outputPath;
        return this;
    }

    /**
     * **参数解释**：地址。 **约束限制**：不涉及。 **取值范围**：长度[4,1024]。 **默认取值**：不涉及。 
     * @return outputPath
     */
    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    public DataInfo withEnvVarName(String envVarName) {
        this.envVarName = envVarName;
        return this;
    }

    /**
     * **参数解释**：环境变量名称。 **约束限制**：不涉及。 **取值范围**：长度[2,100]。 **默认取值**：不涉及。 
     * @return envVarName
     */
    public String getEnvVarName() {
        return envVarName;
    }

    public void setEnvVarName(String envVarName) {
        this.envVarName = envVarName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataInfo that = (DataInfo) obj;
        return Objects.equals(this.inputPath, that.inputPath) && Objects.equals(this.outputPath, that.outputPath)
            && Objects.equals(this.envVarName, that.envVarName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputPath, outputPath, envVarName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataInfo {\n");
        sb.append("    inputPath: ").append(toIndentedString(inputPath)).append("\n");
        sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
        sb.append("    envVarName: ").append(toIndentedString(envVarName)).append("\n");
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
