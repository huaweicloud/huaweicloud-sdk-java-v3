package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssetModelResponse
 */
public class AssetModelResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_model_id")

    @JacksonXmlProperty(localName = "asset_model_id")

    private String assetModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    @JacksonXmlProperty(localName = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    @JacksonXmlProperty(localName = "properties")

    private List<PropertyModelResponse> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyses")

    @JacksonXmlProperty(localName = "analyses")

    private List<AnalysisModelResponse> analyses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    @JacksonXmlProperty(localName = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    @JacksonXmlProperty(localName = "modified_time")

    private String modifiedTime;

    public AssetModelResponse withAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
        return this;
    }

    /**
     * 模型ID
     * @return assetModelId
     */
    public String getAssetModelId() {
        return assetModelId;
    }

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    public AssetModelResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模型名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AssetModelResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 模型显示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AssetModelResponse withProperties(List<PropertyModelResponse> properties) {
        this.properties = properties;
        return this;
    }

    public AssetModelResponse addPropertiesItem(PropertyModelResponse propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public AssetModelResponse withProperties(Consumer<List<PropertyModelResponse>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 属性集
     * @return properties
     */
    public List<PropertyModelResponse> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyModelResponse> properties) {
        this.properties = properties;
    }

    public AssetModelResponse withAnalyses(List<AnalysisModelResponse> analyses) {
        this.analyses = analyses;
        return this;
    }

    public AssetModelResponse addAnalysesItem(AnalysisModelResponse analysesItem) {
        if (this.analyses == null) {
            this.analyses = new ArrayList<>();
        }
        this.analyses.add(analysesItem);
        return this;
    }

    public AssetModelResponse withAnalyses(Consumer<List<AnalysisModelResponse>> analysesSetter) {
        if (this.analyses == null) {
            this.analyses = new ArrayList<>();
        }
        analysesSetter.accept(this.analyses);
        return this;
    }

    /**
     * 分析任务集
     * @return analyses
     */
    public List<AnalysisModelResponse> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(List<AnalysisModelResponse> analyses) {
        this.analyses = analyses;
    }

    public AssetModelResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public AssetModelResponse withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 修改时间
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetModelResponse assetModelResponse = (AssetModelResponse) o;
        return Objects.equals(this.assetModelId, assetModelResponse.assetModelId)
            && Objects.equals(this.name, assetModelResponse.name)
            && Objects.equals(this.displayName, assetModelResponse.displayName)
            && Objects.equals(this.properties, assetModelResponse.properties)
            && Objects.equals(this.analyses, assetModelResponse.analyses)
            && Objects.equals(this.createdTime, assetModelResponse.createdTime)
            && Objects.equals(this.modifiedTime, assetModelResponse.modifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetModelId, name, displayName, properties, analyses, createdTime, modifiedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetModelResponse {\n");
        sb.append("    assetModelId: ").append(toIndentedString(assetModelId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    analyses: ").append(toIndentedString(analyses)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
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
