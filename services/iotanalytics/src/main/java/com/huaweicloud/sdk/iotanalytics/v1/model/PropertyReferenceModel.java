package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 属性引用
 */
public class PropertyReferenceModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_model_id")

    @JacksonXmlProperty(localName = "asset_model_id")

    private String assetModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_model_name")

    @JacksonXmlProperty(localName = "asset_model_name")

    private String assetModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_name")

    @JacksonXmlProperty(localName = "property_name")

    private String propertyName;

    public PropertyReferenceModel withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 属性引用类型，引用本资产属性（this）、引用其他资产属性（single）、引用子资产属性（children）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PropertyReferenceModel withAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
        return this;
    }

    /**
     * 引用属性所属的资产模型ID，该字段仅当type为“引用其他资产属性”或“引用子资产属性”时有效；使用导入模型和导出模型接口时，该字段无效
     * @return assetModelId
     */
    public String getAssetModelId() {
        return assetModelId;
    }

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    public PropertyReferenceModel withAssetModelName(String assetModelName) {
        this.assetModelName = assetModelName;
        return this;
    }

    /**
     * 引用属性所属的资产模型名称，请求中携带该字段时可以不携带asset_model_id字段
     * @return assetModelName
     */
    public String getAssetModelName() {
        return assetModelName;
    }

    public void setAssetModelName(String assetModelName) {
        this.assetModelName = assetModelName;
    }

    public PropertyReferenceModel withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * 引用属性的名称
     * @return propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertyReferenceModel propertyReferenceModel = (PropertyReferenceModel) o;
        return Objects.equals(this.type, propertyReferenceModel.type)
            && Objects.equals(this.assetModelId, propertyReferenceModel.assetModelId)
            && Objects.equals(this.assetModelName, propertyReferenceModel.assetModelName)
            && Objects.equals(this.propertyName, propertyReferenceModel.propertyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, assetModelId, assetModelName, propertyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyReferenceModel {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    assetModelId: ").append(toIndentedString(assetModelId)).append("\n");
        sb.append("    assetModelName: ").append(toIndentedString(assetModelName)).append("\n");
        sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
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
