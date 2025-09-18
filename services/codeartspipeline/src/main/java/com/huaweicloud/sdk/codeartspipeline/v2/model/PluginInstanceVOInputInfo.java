package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PluginInstanceVOInputInfo
 */
public class PluginInstanceVOInputInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_id")

    private String uniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation")

    private ExtensionValidation validation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_content")

    private String layoutContent;

    public PluginInstanceVOInputInfo withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * **参数解释**： 插件输入项唯一ID。 **取值范围**： 不涉及。 
     * @return uniqueId
     */
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public PluginInstanceVOInputInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 插件输入项名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PluginInstanceVOInputInfo withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * **参数解释**： 插件输入项默认值。 **取值范围**： 不涉及。 
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public PluginInstanceVOInputInfo withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * **参数解释**： 扩展插件名称。 **取值范围**： 不涉及。 
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public PluginInstanceVOInputInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 扩展插件版本号。 **取值范围**： 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PluginInstanceVOInputInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 插件输入项类型。 **取值范围**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PluginInstanceVOInputInfo withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**： 租户id。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public PluginInstanceVOInputInfo withValidation(ExtensionValidation validation) {
        this.validation = validation;
        return this;
    }

    public PluginInstanceVOInputInfo withValidation(Consumer<ExtensionValidation> validationSetter) {
        if (this.validation == null) {
            this.validation = new ExtensionValidation();
            validationSetter.accept(this.validation);
        }

        return this;
    }

    /**
     * Get validation
     * @return validation
     */
    public ExtensionValidation getValidation() {
        return validation;
    }

    public void setValidation(ExtensionValidation validation) {
        this.validation = validation;
    }

    public PluginInstanceVOInputInfo withLayoutContent(String layoutContent) {
        this.layoutContent = layoutContent;
        return this;
    }

    /**
     * **参数解释**： 插件输入项样式信息。 **取值范围**： 不涉及。 
     * @return layoutContent
     */
    public String getLayoutContent() {
        return layoutContent;
    }

    public void setLayoutContent(String layoutContent) {
        this.layoutContent = layoutContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginInstanceVOInputInfo that = (PluginInstanceVOInputInfo) obj;
        return Objects.equals(this.uniqueId, that.uniqueId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.defaultValue, that.defaultValue) && Objects.equals(this.pluginName, that.pluginName)
            && Objects.equals(this.version, that.version) && Objects.equals(this.type, that.type)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.validation, that.validation)
            && Objects.equals(this.layoutContent, that.layoutContent);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(uniqueId, name, defaultValue, pluginName, version, type, workspaceId, validation, layoutContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginInstanceVOInputInfo {\n");
        sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
        sb.append("    layoutContent: ").append(toIndentedString(layoutContent)).append("\n");
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
