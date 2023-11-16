package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FullStagePluginsRelationVOFullStagePluginsItemList
 */
public class FullStagePluginsRelationVOFullStagePluginsItemList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugins_list")

    private List<FullStagePluginsRelationVOPluginsList> pluginsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private String businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_id")

    private String uniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<String> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addables")

    private List<FullStagePluginsRelationVOAddables> addables = null;

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

    public FullStagePluginsRelationVOFullStagePluginsItemList withPluginsList(
        List<FullStagePluginsRelationVOPluginsList> pluginsList) {
        this.pluginsList = pluginsList;
        return this;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList addPluginsListItem(
        FullStagePluginsRelationVOPluginsList pluginsListItem) {
        if (this.pluginsList == null) {
            this.pluginsList = new ArrayList<>();
        }
        this.pluginsList.add(pluginsListItem);
        return this;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList withPluginsList(
        Consumer<List<FullStagePluginsRelationVOPluginsList>> pluginsListSetter) {
        if (this.pluginsList == null) {
            this.pluginsList = new ArrayList<>();
        }
        pluginsListSetter.accept(this.pluginsList);
        return this;
    }

    /**
     * 插件列表
     * @return pluginsList
     */
    public List<FullStagePluginsRelationVOPluginsList> getPluginsList() {
        return pluginsList;
    }

    public void setPluginsList(List<FullStagePluginsRelationVOPluginsList> pluginsList) {
        this.pluginsList = pluginsList;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 展示名
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * 业务类型
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * 唯一ID
     * @return uniqueId
     */
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList withConditions(List<String> conditions) {
        this.conditions = conditions;
        return this;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList addConditionsItem(String conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList withConditions(Consumer<List<String>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 条件
     * @return conditions
     */
    public List<String> getConditions() {
        return conditions;
    }

    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList withAddables(
        List<FullStagePluginsRelationVOAddables> addables) {
        this.addables = addables;
        return this;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList addAddablesItem(
        FullStagePluginsRelationVOAddables addablesItem) {
        if (this.addables == null) {
            this.addables = new ArrayList<>();
        }
        this.addables.add(addablesItem);
        return this;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList withAddables(
        Consumer<List<FullStagePluginsRelationVOAddables>> addablesSetter) {
        if (this.addables == null) {
            this.addables = new ArrayList<>();
        }
        addablesSetter.accept(this.addables);
        return this;
    }

    /**
     * 额外属性
     * @return addables
     */
    public List<FullStagePluginsRelationVOAddables> getAddables() {
        return addables;
    }

    public void setAddables(List<FullStagePluginsRelationVOAddables> addables) {
        this.addables = addables;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList withEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    /**
     * 是否可编辑
     * @return editable
     */
    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList withRemovable(Boolean removable) {
        this.removable = removable;
        return this;
    }

    /**
     * 是否可移除
     * @return removable
     */
    public Boolean getRemovable() {
        return removable;
    }

    public void setRemovable(Boolean removable) {
        this.removable = removable;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList withCloneable(Boolean cloneable) {
        this.cloneable = cloneable;
        return this;
    }

    /**
     * 是否可复制
     * @return cloneable
     */
    public Boolean getCloneable() {
        return cloneable;
    }

    public void setCloneable(Boolean cloneable) {
        this.cloneable = cloneable;
    }

    public FullStagePluginsRelationVOFullStagePluginsItemList withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 禁用
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullStagePluginsRelationVOFullStagePluginsItemList that =
            (FullStagePluginsRelationVOFullStagePluginsItemList) obj;
        return Objects.equals(this.pluginsList, that.pluginsList) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.businessType, that.businessType) && Objects.equals(this.uniqueId, that.uniqueId)
            && Objects.equals(this.conditions, that.conditions) && Objects.equals(this.addables, that.addables)
            && Objects.equals(this.editable, that.editable) && Objects.equals(this.removable, that.removable)
            && Objects.equals(this.cloneable, that.cloneable) && Objects.equals(this.disabled, that.disabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginsList,
            displayName,
            businessType,
            uniqueId,
            conditions,
            addables,
            editable,
            removable,
            cloneable,
            disabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullStagePluginsRelationVOFullStagePluginsItemList {\n");
        sb.append("    pluginsList: ").append(toIndentedString(pluginsList)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    addables: ").append(toIndentedString(addables)).append("\n");
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
        sb.append("    removable: ").append(toIndentedString(removable)).append("\n");
        sb.append("    cloneable: ").append(toIndentedString(cloneable)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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
