package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PageInfoBusinessTypeDefinitionVOData
 */
public class PageInfoBusinessTypeDefinitionVOData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private String businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_id")

    private String uniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editable")

    private Boolean editable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removable")

    private Boolean removable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloneable")

    private Boolean cloneable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addables")

    private List<Map<String, Boolean>> addables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<String> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugins_list")

    private List<PageInfoBusinessTypeDefinitionVOPluginsList> pluginsList = null;

    public PageInfoBusinessTypeDefinitionVOData withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * **参数解释**： 业务类型。 **取值范围**： 不涉及。 
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public PageInfoBusinessTypeDefinitionVOData withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**： 展示名。 **取值范围**： 不涉及。 
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public PageInfoBusinessTypeDefinitionVOData withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * **参数解释**： 唯一ID。 **取值范围**： 不涉及。 
     * @return uniqueId
     */
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public PageInfoBusinessTypeDefinitionVOData withEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    /**
     * **参数解释**： 是否可编辑。 **取值范围**： - true：可编辑。 - false：不可编辑。 
     * @return editable
     */
    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public PageInfoBusinessTypeDefinitionVOData withRemovable(Boolean removable) {
        this.removable = removable;
        return this;
    }

    /**
     * **参数解释**： 是否可移除。 **取值范围**： - true：可移除。 - false：不可移除。 
     * @return removable
     */
    public Boolean getRemovable() {
        return removable;
    }

    public void setRemovable(Boolean removable) {
        this.removable = removable;
    }

    public PageInfoBusinessTypeDefinitionVOData withCloneable(Boolean cloneable) {
        this.cloneable = cloneable;
        return this;
    }

    /**
     * **参数解释**： 是否可复制。 **取值范围**： - true：可复制。 - false：不可复制。 
     * @return cloneable
     */
    public Boolean getCloneable() {
        return cloneable;
    }

    public void setCloneable(Boolean cloneable) {
        this.cloneable = cloneable;
    }

    public PageInfoBusinessTypeDefinitionVOData withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * **参数解释**： 是否禁用。 **取值范围**： - true：禁用。 - false：未禁用。 
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public PageInfoBusinessTypeDefinitionVOData withAddables(List<Map<String, Boolean>> addables) {
        this.addables = addables;
        return this;
    }

    public PageInfoBusinessTypeDefinitionVOData addAddablesItem(Map<String, Boolean> addablesItem) {
        if (this.addables == null) {
            this.addables = new ArrayList<>();
        }
        this.addables.add(addablesItem);
        return this;
    }

    public PageInfoBusinessTypeDefinitionVOData withAddables(Consumer<List<Map<String, Boolean>>> addablesSetter) {
        if (this.addables == null) {
            this.addables = new ArrayList<>();
        }
        addablesSetter.accept(this.addables);
        return this;
    }

    /**
     * **参数解释**： 是否可添加。 **取值范围**： 不涉及。 
     * @return addables
     */
    public List<Map<String, Boolean>> getAddables() {
        return addables;
    }

    public void setAddables(List<Map<String, Boolean>> addables) {
        this.addables = addables;
    }

    public PageInfoBusinessTypeDefinitionVOData withConditions(List<String> conditions) {
        this.conditions = conditions;
        return this;
    }

    public PageInfoBusinessTypeDefinitionVOData addConditionsItem(String conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public PageInfoBusinessTypeDefinitionVOData withConditions(Consumer<List<String>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * **参数解释**： 条件。 **取值范围**： 不涉及。 
     * @return conditions
     */
    public List<String> getConditions() {
        return conditions;
    }

    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }

    public PageInfoBusinessTypeDefinitionVOData withPluginsList(
        List<PageInfoBusinessTypeDefinitionVOPluginsList> pluginsList) {
        this.pluginsList = pluginsList;
        return this;
    }

    public PageInfoBusinessTypeDefinitionVOData addPluginsListItem(
        PageInfoBusinessTypeDefinitionVOPluginsList pluginsListItem) {
        if (this.pluginsList == null) {
            this.pluginsList = new ArrayList<>();
        }
        this.pluginsList.add(pluginsListItem);
        return this;
    }

    public PageInfoBusinessTypeDefinitionVOData withPluginsList(
        Consumer<List<PageInfoBusinessTypeDefinitionVOPluginsList>> pluginsListSetter) {
        if (this.pluginsList == null) {
            this.pluginsList = new ArrayList<>();
        }
        pluginsListSetter.accept(this.pluginsList);
        return this;
    }

    /**
     * **参数解释**： 插件列表。 **取值范围**： 不涉及。 
     * @return pluginsList
     */
    public List<PageInfoBusinessTypeDefinitionVOPluginsList> getPluginsList() {
        return pluginsList;
    }

    public void setPluginsList(List<PageInfoBusinessTypeDefinitionVOPluginsList> pluginsList) {
        this.pluginsList = pluginsList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PageInfoBusinessTypeDefinitionVOData that = (PageInfoBusinessTypeDefinitionVOData) obj;
        return Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.uniqueId, that.uniqueId)
            && Objects.equals(this.editable, that.editable) && Objects.equals(this.removable, that.removable)
            && Objects.equals(this.cloneable, that.cloneable) && Objects.equals(this.disabled, that.disabled)
            && Objects.equals(this.addables, that.addables) && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.pluginsList, that.pluginsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessType,
            displayName,
            uniqueId,
            editable,
            removable,
            cloneable,
            disabled,
            addables,
            conditions,
            pluginsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageInfoBusinessTypeDefinitionVOData {\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
        sb.append("    removable: ").append(toIndentedString(removable)).append("\n");
        sb.append("    cloneable: ").append(toIndentedString(cloneable)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    addables: ").append(toIndentedString(addables)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    pluginsList: ").append(toIndentedString(pluginsList)).append("\n");
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
