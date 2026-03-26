package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 模型 **取值范围**： 不涉及
 */
public class Model {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version")

    private String datastoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_text_model")

    private String isTextModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_version_id")

    private String modelVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch_type")

    private String archType;

    public Model withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 模型id **取值范围**： 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Model withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 模型名字 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * **参数解释**： 模型类型 **取值范围**： 不涉及
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public Model withDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
        return this;
    }

    /**
     * **参数解释**： 模型版本 **取值范围**： 不涉及
     * @return datastoreVersion
     */
    public String getDatastoreVersion() {
        return datastoreVersion;
    }

    public void setDatastoreVersion(String datastoreVersion) {
        this.datastoreVersion = datastoreVersion;
    }

    public Model withIsTextModel(String isTextModel) {
        this.isTextModel = isTextModel;
        return this;
    }

    /**
     * **参数解释**： 是否是文本模型 **取值范围**： 不涉及
     * @return isTextModel
     */
    public String getIsTextModel() {
        return isTextModel;
    }

    public void setIsTextModel(String isTextModel) {
        this.isTextModel = isTextModel;
    }

    public Model withModelVersionId(String modelVersionId) {
        this.modelVersionId = modelVersionId;
        return this;
    }

    /**
     * **参数解释**： 模型版本id **取值范围**： 不涉及
     * @return modelVersionId
     */
    public String getModelVersionId() {
        return modelVersionId;
    }

    public void setModelVersionId(String modelVersionId) {
        this.modelVersionId = modelVersionId;
    }

    public Model withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * **参数解释**： 模型描述 **取值范围**： 不涉及
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Model withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释**： 模型语言 **取值范围**： 不涉及
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Model withArchType(String archType) {
        this.archType = archType;
        return this;
    }

    /**
     * **参数解释**： 模型规格 **取值范围**： 不涉及
     * @return archType
     */
    public String getArchType() {
        return archType;
    }

    public void setArchType(String archType) {
        this.archType = archType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Model that = (Model) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.datastoreType, that.datastoreType)
            && Objects.equals(this.datastoreVersion, that.datastoreVersion)
            && Objects.equals(this.isTextModel, that.isTextModel)
            && Objects.equals(this.modelVersionId, that.modelVersionId) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.language, that.language) && Objects.equals(this.archType, that.archType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, datastoreType, datastoreVersion, isTextModel, modelVersionId, desc, language, archType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Model {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    datastoreVersion: ").append(toIndentedString(datastoreVersion)).append("\n");
        sb.append("    isTextModel: ").append(toIndentedString(isTextModel)).append("\n");
        sb.append("    modelVersionId: ").append(toIndentedString(modelVersionId)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    archType: ").append(toIndentedString(archType)).append("\n");
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
