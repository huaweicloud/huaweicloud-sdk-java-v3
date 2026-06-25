package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件模板描述信息。
 */
public class PluginTemplateSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private Map<String, PluginTemplateVersionV2> versions = null;

    public PluginTemplateSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：插件模板类型。 **取值范围**：可选值如下： - npu-river：NPU驱动 - gpu-driver：GPU驱动
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PluginTemplateSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：插件模板描述。 **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PluginTemplateSpec withVersions(Map<String, PluginTemplateVersionV2> versions) {
        this.versions = versions;
        return this;
    }

    public PluginTemplateSpec putVersionsItem(String key, PluginTemplateVersionV2 versionsItem) {
        if (this.versions == null) {
            this.versions = new HashMap<>();
        }
        this.versions.put(key, versionsItem);
        return this;
    }

    public PluginTemplateSpec withVersions(Consumer<Map<String, PluginTemplateVersionV2>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new HashMap<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * **参数解释**：插件模板版本描述信息。
     * @return versions
     */
    public Map<String, PluginTemplateVersionV2> getVersions() {
        return versions;
    }

    public void setVersions(Map<String, PluginTemplateVersionV2> versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginTemplateSpec that = (PluginTemplateSpec) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.description, that.description)
            && Objects.equals(this.versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, description, versions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginTemplateSpec {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
