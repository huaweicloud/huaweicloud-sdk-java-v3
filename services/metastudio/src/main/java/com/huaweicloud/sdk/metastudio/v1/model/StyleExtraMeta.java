package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 风格额外信息
 */
public class StyleExtraMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picture_modeling_enable")

    private Boolean pictureModelingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_enable")

    private Boolean editEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_engine")

    private String editEngine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_value_items")

    private Map<String, StyleExtraMetaEditValueItems> editValueItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_color_items")

    private Map<String, StyleExtraMetaEditColorItems> editColorItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_components")

    private Map<String, StyleExtraMetaEditComponents> editComponents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modelling_algorithm")

    private Map<String, StyleExtraMetaModellingAlgorithm> modellingAlgorithm = null;

    public StyleExtraMeta withPictureModelingEnable(Boolean pictureModelingEnable) {
        this.pictureModelingEnable = pictureModelingEnable;
        return this;
    }

    /**
     * 是否支持照片建模
     * @return pictureModelingEnable
     */
    public Boolean getPictureModelingEnable() {
        return pictureModelingEnable;
    }

    public void setPictureModelingEnable(Boolean pictureModelingEnable) {
        this.pictureModelingEnable = pictureModelingEnable;
    }

    public StyleExtraMeta withEditEnable(Boolean editEnable) {
        this.editEnable = editEnable;
        return this;
    }

    /**
     * 是否支持模型编辑
     * @return editEnable
     */
    public Boolean getEditEnable() {
        return editEnable;
    }

    public void setEditEnable(Boolean editEnable) {
        this.editEnable = editEnable;
    }

    public StyleExtraMeta withEditEngine(String editEngine) {
        this.editEngine = editEngine;
        return this;
    }

    /**
     * 编辑使用引擎
     * @return editEngine
     */
    public String getEditEngine() {
        return editEngine;
    }

    public void setEditEngine(String editEngine) {
        this.editEngine = editEngine;
    }

    public StyleExtraMeta withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 照片建模算法调用的模型类型
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public StyleExtraMeta withEditValueItems(Map<String, StyleExtraMetaEditValueItems> editValueItems) {
        this.editValueItems = editValueItems;
        return this;
    }

    public StyleExtraMeta putEditValueItemsItem(String key, StyleExtraMetaEditValueItems editValueItemsItem) {
        if (this.editValueItems == null) {
            this.editValueItems = new HashMap<>();
        }
        this.editValueItems.put(key, editValueItemsItem);
        return this;
    }

    public StyleExtraMeta withEditValueItems(Consumer<Map<String, StyleExtraMetaEditValueItems>> editValueItemsSetter) {
        if (this.editValueItems == null) {
            this.editValueItems = new HashMap<>();
        }
        editValueItemsSetter.accept(this.editValueItems);
        return this;
    }

    /**
     * 值可设置条目列表
     * @return editValueItems
     */
    public Map<String, StyleExtraMetaEditValueItems> getEditValueItems() {
        return editValueItems;
    }

    public void setEditValueItems(Map<String, StyleExtraMetaEditValueItems> editValueItems) {
        this.editValueItems = editValueItems;
    }

    public StyleExtraMeta withEditColorItems(Map<String, StyleExtraMetaEditColorItems> editColorItems) {
        this.editColorItems = editColorItems;
        return this;
    }

    public StyleExtraMeta putEditColorItemsItem(String key, StyleExtraMetaEditColorItems editColorItemsItem) {
        if (this.editColorItems == null) {
            this.editColorItems = new HashMap<>();
        }
        this.editColorItems.put(key, editColorItemsItem);
        return this;
    }

    public StyleExtraMeta withEditColorItems(Consumer<Map<String, StyleExtraMetaEditColorItems>> editColorItemsSetter) {
        if (this.editColorItems == null) {
            this.editColorItems = new HashMap<>();
        }
        editColorItemsSetter.accept(this.editColorItems);
        return this;
    }

    /**
     * 颜色可设置条目列表
     * @return editColorItems
     */
    public Map<String, StyleExtraMetaEditColorItems> getEditColorItems() {
        return editColorItems;
    }

    public void setEditColorItems(Map<String, StyleExtraMetaEditColorItems> editColorItems) {
        this.editColorItems = editColorItems;
    }

    public StyleExtraMeta withEditComponents(Map<String, StyleExtraMetaEditComponents> editComponents) {
        this.editComponents = editComponents;
        return this;
    }

    public StyleExtraMeta putEditComponentsItem(String key, StyleExtraMetaEditComponents editComponentsItem) {
        if (this.editComponents == null) {
            this.editComponents = new HashMap<>();
        }
        this.editComponents.put(key, editComponentsItem);
        return this;
    }

    public StyleExtraMeta withEditComponents(Consumer<Map<String, StyleExtraMetaEditComponents>> editComponentsSetter) {
        if (this.editComponents == null) {
            this.editComponents = new HashMap<>();
        }
        editComponentsSetter.accept(this.editComponents);
        return this;
    }

    /**
     * 可替换组件列表
     * @return editComponents
     */
    public Map<String, StyleExtraMetaEditComponents> getEditComponents() {
        return editComponents;
    }

    public void setEditComponents(Map<String, StyleExtraMetaEditComponents> editComponents) {
        this.editComponents = editComponents;
    }

    public StyleExtraMeta withModellingAlgorithm(Map<String, StyleExtraMetaModellingAlgorithm> modellingAlgorithm) {
        this.modellingAlgorithm = modellingAlgorithm;
        return this;
    }

    public StyleExtraMeta putModellingAlgorithmItem(String key,
        StyleExtraMetaModellingAlgorithm modellingAlgorithmItem) {
        if (this.modellingAlgorithm == null) {
            this.modellingAlgorithm = new HashMap<>();
        }
        this.modellingAlgorithm.put(key, modellingAlgorithmItem);
        return this;
    }

    public StyleExtraMeta withModellingAlgorithm(
        Consumer<Map<String, StyleExtraMetaModellingAlgorithm>> modellingAlgorithmSetter) {
        if (this.modellingAlgorithm == null) {
            this.modellingAlgorithm = new HashMap<>();
        }
        modellingAlgorithmSetter.accept(this.modellingAlgorithm);
        return this;
    }

    /**
     * 分类算法列表
     * @return modellingAlgorithm
     */
    public Map<String, StyleExtraMetaModellingAlgorithm> getModellingAlgorithm() {
        return modellingAlgorithm;
    }

    public void setModellingAlgorithm(Map<String, StyleExtraMetaModellingAlgorithm> modellingAlgorithm) {
        this.modellingAlgorithm = modellingAlgorithm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StyleExtraMeta that = (StyleExtraMeta) obj;
        return Objects.equals(this.pictureModelingEnable, that.pictureModelingEnable)
            && Objects.equals(this.editEnable, that.editEnable) && Objects.equals(this.editEngine, that.editEngine)
            && Objects.equals(this.modelId, that.modelId) && Objects.equals(this.editValueItems, that.editValueItems)
            && Objects.equals(this.editColorItems, that.editColorItems)
            && Objects.equals(this.editComponents, that.editComponents)
            && Objects.equals(this.modellingAlgorithm, that.modellingAlgorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pictureModelingEnable,
            editEnable,
            editEngine,
            modelId,
            editValueItems,
            editColorItems,
            editComponents,
            modellingAlgorithm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StyleExtraMeta {\n");
        sb.append("    pictureModelingEnable: ").append(toIndentedString(pictureModelingEnable)).append("\n");
        sb.append("    editEnable: ").append(toIndentedString(editEnable)).append("\n");
        sb.append("    editEngine: ").append(toIndentedString(editEngine)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    editValueItems: ").append(toIndentedString(editValueItems)).append("\n");
        sb.append("    editColorItems: ").append(toIndentedString(editColorItems)).append("\n");
        sb.append("    editComponents: ").append(toIndentedString(editComponents)).append("\n");
        sb.append("    modellingAlgorithm: ").append(toIndentedString(modellingAlgorithm)).append("\n");
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
