package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：模型信息（OBS 输入路径）。RayService 相对 RayCluster 新增的核心配置，仅需指明模型在 OBS 的位置。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class DataInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_path")

    private String inputPath;

    public DataInfo withInputPath(String inputPath) {
        this.inputPath = inputPath;
        return this;
    }

    /**
     * **参数解释**：OBS 模型输入路径（模型在 OBS 的位置）。 **约束限制**：不涉及。 **取值范围**：长度为1~1024的字符。 **默认取值**：不涉及。
     * @return inputPath
     */
    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
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
        return Objects.equals(this.inputPath, that.inputPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataInfo {\n");
        sb.append("    inputPath: ").append(toIndentedString(inputPath)).append("\n");
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
