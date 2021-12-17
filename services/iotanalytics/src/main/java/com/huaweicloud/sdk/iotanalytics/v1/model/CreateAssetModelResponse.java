package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CreateAssetModelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_model_id")

    private String assetModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private List<PropertyModelResponse> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyses")

    private List<AnalysisModelResponse> analyses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    public CreateAssetModelResponse withAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
        return this;
    }

    /** 模型ID
     * 
     * @return assetModelId */
    public String getAssetModelId() {
        return assetModelId;
    }

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    public CreateAssetModelResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 模型名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAssetModelResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** 模型显示名称
     * 
     * @return displayName */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateAssetModelResponse withProperties(List<PropertyModelResponse> properties) {
        this.properties = properties;
        return this;
    }

    public CreateAssetModelResponse addPropertiesItem(PropertyModelResponse propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public CreateAssetModelResponse withProperties(Consumer<List<PropertyModelResponse>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /** 属性集
     * 
     * @return properties */
    public List<PropertyModelResponse> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyModelResponse> properties) {
        this.properties = properties;
    }

    public CreateAssetModelResponse withAnalyses(List<AnalysisModelResponse> analyses) {
        this.analyses = analyses;
        return this;
    }

    public CreateAssetModelResponse addAnalysesItem(AnalysisModelResponse analysesItem) {
        if (this.analyses == null) {
            this.analyses = new ArrayList<>();
        }
        this.analyses.add(analysesItem);
        return this;
    }

    public CreateAssetModelResponse withAnalyses(Consumer<List<AnalysisModelResponse>> analysesSetter) {
        if (this.analyses == null) {
            this.analyses = new ArrayList<>();
        }
        analysesSetter.accept(this.analyses);
        return this;
    }

    /** 分析任务集
     * 
     * @return analyses */
    public List<AnalysisModelResponse> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(List<AnalysisModelResponse> analyses) {
        this.analyses = analyses;
    }

    public CreateAssetModelResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /** 创建时间
     * 
     * @return createdTime */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public CreateAssetModelResponse withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /** 修改时间
     * 
     * @return modifiedTime */
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
        CreateAssetModelResponse createAssetModelResponse = (CreateAssetModelResponse) o;
        return Objects.equals(this.assetModelId, createAssetModelResponse.assetModelId)
            && Objects.equals(this.name, createAssetModelResponse.name)
            && Objects.equals(this.displayName, createAssetModelResponse.displayName)
            && Objects.equals(this.properties, createAssetModelResponse.properties)
            && Objects.equals(this.analyses, createAssetModelResponse.analyses)
            && Objects.equals(this.createdTime, createAssetModelResponse.createdTime)
            && Objects.equals(this.modifiedTime, createAssetModelResponse.modifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetModelId, name, displayName, properties, analyses, createdTime, modifiedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssetModelResponse {\n");
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
