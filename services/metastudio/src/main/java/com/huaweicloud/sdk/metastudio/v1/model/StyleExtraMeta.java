package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

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
            && Objects.equals(this.modelId, that.modelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pictureModelingEnable, editEnable, editEngine, modelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StyleExtraMeta {\n");
        sb.append("    pictureModelingEnable: ").append(toIndentedString(pictureModelingEnable)).append("\n");
        sb.append("    editEnable: ").append(toIndentedString(editEnable)).append("\n");
        sb.append("    editEngine: ").append(toIndentedString(editEngine)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
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
