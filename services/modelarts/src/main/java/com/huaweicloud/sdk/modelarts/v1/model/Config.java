package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Config
 */
public class Config {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script")

    private String script;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    public Config withScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * **参数解释**：自定义脚本内容（base64编码）或脚本绝对路径。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return script
     */
    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public Config withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：脚本类型。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - COMMAND：script中需要指定脚本内容（base64编码）。 - SCRIPT：script中需要指定脚本路径。  **默认取值**：SCRIPT。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Config withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**：自定义脚本执行方式，同步或异步执行。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - BLOCK：同步 - ASYNC：异步  **默认取值**：ASYNC
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Config that = (Config) obj;
        return Objects.equals(this.script, that.script) && Objects.equals(this.type, that.type)
            && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(script, type, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Config {\n");
        sb.append("    script: ").append(toIndentedString(script)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
