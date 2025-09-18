package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PluginExecutionVO
 */
public class PluginExecutionVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    public PluginExecutionVO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 插件执行脚本类型。 **取值范围**： - Shell：Shell类型脚本。 - Nodejs：Nodejs类型脚本。 - Java：Java类型脚本。 - Python：Python类型脚本。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PluginExecutionVO withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * **参数解释**： 插件执行脚本入口文件。 **取值范围**： 不涉及。 
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public PluginExecutionVO withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释**： 插件的OBS存放路径。 **取值范围**： 不涉及。 
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginExecutionVO that = (PluginExecutionVO) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.target, that.target)
            && Objects.equals(this.filePath, that.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, target, filePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginExecutionVO {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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
