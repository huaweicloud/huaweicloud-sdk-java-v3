package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuleInstance
 */
public class RuleInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_id")

    private String pluginId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_version")

    private String pluginVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_valid")

    private Boolean isValid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editable")

    private Boolean editable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private List<RuleInstanceContent> content = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent")

    private RuleSet parent;

    public RuleInstance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 规则实例ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RuleInstance withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 规则类型。 **取值范围**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RuleInstance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 规则名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuleInstance withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 规则版本。 **取值范围**： 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public RuleInstance withPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }

    /**
     * **参数解释**： 插件ID。 **取值范围**： 不涉及。 
     * @return pluginId
     */
    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public RuleInstance withPluginName(String pluginName) {
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

    public RuleInstance withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    /**
     * **参数解释**： 插件版本号。 **取值范围**： 不涉及。 
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public RuleInstance withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * **参数解释**： 规则是否生效。 **取值范围**： - true：规则生效。 - false：规则不生效。 
     * @return isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public RuleInstance withEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    /**
     * **参数解释**： 规则是否可编辑。 **取值范围**： - true：规则可编辑。 - false：规则不可编辑。 
     * @return editable
     */
    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public RuleInstance withContent(List<RuleInstanceContent> content) {
        this.content = content;
        return this;
    }

    public RuleInstance addContentItem(RuleInstanceContent contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    public RuleInstance withContent(Consumer<List<RuleInstanceContent>> contentSetter) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /**
     * **参数解释**： 规则实例集合。 **取值范围**： 不涉及。 
     * @return content
     */
    public List<RuleInstanceContent> getContent() {
        return content;
    }

    public void setContent(List<RuleInstanceContent> content) {
        this.content = content;
    }

    public RuleInstance withParent(RuleSet parent) {
        this.parent = parent;
        return this;
    }

    public RuleInstance withParent(Consumer<RuleSet> parentSetter) {
        if (this.parent == null) {
            this.parent = new RuleSet();
            parentSetter.accept(this.parent);
        }

        return this;
    }

    /**
     * Get parent
     * @return parent
     */
    public RuleSet getParent() {
        return parent;
    }

    public void setParent(RuleSet parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleInstance that = (RuleInstance) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.pluginId, that.pluginId) && Objects.equals(this.pluginName, that.pluginName)
            && Objects.equals(this.pluginVersion, that.pluginVersion) && Objects.equals(this.isValid, that.isValid)
            && Objects.equals(this.editable, that.editable) && Objects.equals(this.content, that.content)
            && Objects.equals(this.parent, that.parent);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, type, name, version, pluginId, pluginName, pluginVersion, isValid, editable, content, parent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleInstance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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
