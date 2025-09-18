package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PluginPartQueryVOListAgentPluginInputVOData
 */
public class PluginPartQueryVOListAgentPluginInputVOData {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_prop")

    private ExtensionExtendProp extendProp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "front_data_prop")

    private String frontDataProp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private String required;

    public PluginPartQueryVOListAgentPluginInputVOData withUniqueId(String uniqueId) {
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

    public PluginPartQueryVOListAgentPluginInputVOData withName(String name) {
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

    public PluginPartQueryVOListAgentPluginInputVOData withDefaultValue(String defaultValue) {
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

    public PluginPartQueryVOListAgentPluginInputVOData withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * **参数解释**： 插件名称。 **取值范围**： 不涉及。 
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public PluginPartQueryVOListAgentPluginInputVOData withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 插件版本。 **取值范围**： 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PluginPartQueryVOListAgentPluginInputVOData withType(String type) {
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

    public PluginPartQueryVOListAgentPluginInputVOData withWorkspaceId(String workspaceId) {
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

    public PluginPartQueryVOListAgentPluginInputVOData withValidation(ExtensionValidation validation) {
        this.validation = validation;
        return this;
    }

    public PluginPartQueryVOListAgentPluginInputVOData withValidation(Consumer<ExtensionValidation> validationSetter) {
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

    public PluginPartQueryVOListAgentPluginInputVOData withLayoutContent(String layoutContent) {
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

    public PluginPartQueryVOListAgentPluginInputVOData withExtendProp(ExtensionExtendProp extendProp) {
        this.extendProp = extendProp;
        return this;
    }

    public PluginPartQueryVOListAgentPluginInputVOData withExtendProp(Consumer<ExtensionExtendProp> extendPropSetter) {
        if (this.extendProp == null) {
            this.extendProp = new ExtensionExtendProp();
            extendPropSetter.accept(this.extendProp);
        }

        return this;
    }

    /**
     * Get extendProp
     * @return extendProp
     */
    public ExtensionExtendProp getExtendProp() {
        return extendProp;
    }

    public void setExtendProp(ExtensionExtendProp extendProp) {
        this.extendProp = extendProp;
    }

    public PluginPartQueryVOListAgentPluginInputVOData withFrontDataProp(String frontDataProp) {
        this.frontDataProp = frontDataProp;
        return this;
    }

    /**
     * **参数解释**： 前端渲染使用的数据信息。 **取值范围**： 不涉及。 
     * @return frontDataProp
     */
    public String getFrontDataProp() {
        return frontDataProp;
    }

    public void setFrontDataProp(String frontDataProp) {
        this.frontDataProp = frontDataProp;
    }

    public PluginPartQueryVOListAgentPluginInputVOData withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * **参数解释**： 标签。 **取值范围**： 不涉及。 
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public PluginPartQueryVOListAgentPluginInputVOData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 描述。 **取值范围**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PluginPartQueryVOListAgentPluginInputVOData withRequired(String required) {
        this.required = required;
        return this;
    }

    /**
     * **参数解释**： 是否必须。 **取值范围**： 不涉及。 
     * @return required
     */
    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginPartQueryVOListAgentPluginInputVOData that = (PluginPartQueryVOListAgentPluginInputVOData) obj;
        return Objects.equals(this.uniqueId, that.uniqueId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.defaultValue, that.defaultValue) && Objects.equals(this.pluginName, that.pluginName)
            && Objects.equals(this.version, that.version) && Objects.equals(this.type, that.type)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.validation, that.validation)
            && Objects.equals(this.layoutContent, that.layoutContent)
            && Objects.equals(this.extendProp, that.extendProp)
            && Objects.equals(this.frontDataProp, that.frontDataProp) && Objects.equals(this.label, that.label)
            && Objects.equals(this.description, that.description) && Objects.equals(this.required, that.required);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueId,
            name,
            defaultValue,
            pluginName,
            version,
            type,
            workspaceId,
            validation,
            layoutContent,
            extendProp,
            frontDataProp,
            label,
            description,
            required);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginPartQueryVOListAgentPluginInputVOData {\n");
        sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
        sb.append("    layoutContent: ").append(toIndentedString(layoutContent)).append("\n");
        sb.append("    extendProp: ").append(toIndentedString(extendProp)).append("\n");
        sb.append("    frontDataProp: ").append(toIndentedString(frontDataProp)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
