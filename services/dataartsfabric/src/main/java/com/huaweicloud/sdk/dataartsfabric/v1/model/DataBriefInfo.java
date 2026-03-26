package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：数据路径信息。 **约束限制**：不涉及。 
 */
public class DataBriefInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_path")

    private String inputPath;

    public DataBriefInfo withInputPath(String inputPath) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataBriefInfo that = (DataBriefInfo) obj;
        return Objects.equals(this.inputPath, that.inputPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataBriefInfo {\n");
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
