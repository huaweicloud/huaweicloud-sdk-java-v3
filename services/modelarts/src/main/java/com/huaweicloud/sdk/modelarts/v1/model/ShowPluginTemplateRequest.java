package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPluginTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugintemplate_name")

    private String plugintemplateName;

    public ShowPluginTemplateRequest withPlugintemplateName(String plugintemplateName) {
        this.plugintemplateName = plugintemplateName;
        return this;
    }

    /**
     * **参数解释**：插件模板的名称。 **约束限制**：不涉及。 **取值范围**：可选值如下： - gpu-driver：GPU驱动插件模板信息 - npu-driver：NPU驱动插件模板信息 **默认取值**：不涉及。
     * @return plugintemplateName
     */
    public String getPlugintemplateName() {
        return plugintemplateName;
    }

    public void setPlugintemplateName(String plugintemplateName) {
        this.plugintemplateName = plugintemplateName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPluginTemplateRequest that = (ShowPluginTemplateRequest) obj;
        return Objects.equals(this.plugintemplateName, that.plugintemplateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plugintemplateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPluginTemplateRequest {\n");
        sb.append("    plugintemplateName: ").append(toIndentedString(plugintemplateName)).append("\n");
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
