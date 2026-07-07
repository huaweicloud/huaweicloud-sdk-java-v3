package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：自定义训练作业产物发布成模型的信息。
 */
public class AssetModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "series")

    private String series;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_desc")

    private String modelDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_asset_id")

    private String parentAssetId;

    public AssetModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：模型名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AssetModel withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**：模型名称。 **取值范围**：不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AssetModel withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**：模型发布版本。 **取值范围**：不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AssetModel withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * **参数解释**：模型描述。 **取值范围**：不涉及。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AssetModel withSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * **参数解释**：模型品牌。 **取值范围**：不涉及。
     * @return series
     */
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public AssetModel withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：模型类型。 **取值范围**：不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AssetModel withModelDesc(String modelDesc) {
        this.modelDesc = modelDesc;
        return this;
    }

    /**
     * **参数解释**：模型资产描述。\\n**取值范围**：不涉及。
     * @return modelDesc
     */
    public String getModelDesc() {
        return modelDesc;
    }

    public void setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc;
    }

    public AssetModel withParentAssetId(String parentAssetId) {
        this.parentAssetId = parentAssetId;
        return this;
    }

    /**
     * **参数解释**：父资产ID（可选），选择已有模型时传递。\\n**取值范围**：不涉及。
     * @return parentAssetId
     */
    public String getParentAssetId() {
        return parentAssetId;
    }

    public void setParentAssetId(String parentAssetId) {
        this.parentAssetId = parentAssetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssetModel that = (AssetModel) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.code, that.code)
            && Objects.equals(this.version, that.version) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.series, that.series) && Objects.equals(this.type, that.type)
            && Objects.equals(this.modelDesc, that.modelDesc) && Objects.equals(this.parentAssetId, that.parentAssetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, version, desc, series, type, modelDesc, parentAssetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetModel {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    modelDesc: ").append(toIndentedString(modelDesc)).append("\n");
        sb.append("    parentAssetId: ").append(toIndentedString(parentAssetId)).append("\n");
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
