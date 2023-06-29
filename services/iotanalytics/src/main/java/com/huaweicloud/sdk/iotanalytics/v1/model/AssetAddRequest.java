package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssetAddRequest
 */
public class AssetAddRequest {

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
    @JsonProperty(value = "parent")

    private String parent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private List<PropertyRequest> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyses")

    private List<AnalysisRequest> analyses = null;

    public AssetAddRequest withAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
        return this;
    }

    /**
     * 资产模型ID
     * @return assetModelId
     */
    public String getAssetModelId() {
        return assetModelId;
    }

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    public AssetAddRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资产名称，正则：\"^[a-zA-Z][a-zA-Z0-9_-]{0,63}$\"
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AssetAddRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 资产显示名称，修改资产时，\"\"代表配置为空、null或不携带代表不修改，正则：\"^[\\\\u4E-\\\\u9FA5A-Za-z0-9_@#.-]{0,64}$\"
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AssetAddRequest withParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * 父资产ID，根资产的父资产ID为null，修改资产时，null或不携带代表不修改
     * @return parent
     */
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public AssetAddRequest withProperties(List<PropertyRequest> properties) {
        this.properties = properties;
        return this;
    }

    public AssetAddRequest addPropertiesItem(PropertyRequest propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public AssetAddRequest withProperties(Consumer<List<PropertyRequest>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 属性集，最多200个
     * @return properties
     */
    public List<PropertyRequest> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyRequest> properties) {
        this.properties = properties;
    }

    public AssetAddRequest withAnalyses(List<AnalysisRequest> analyses) {
        this.analyses = analyses;
        return this;
    }

    public AssetAddRequest addAnalysesItem(AnalysisRequest analysesItem) {
        if (this.analyses == null) {
            this.analyses = new ArrayList<>();
        }
        this.analyses.add(analysesItem);
        return this;
    }

    public AssetAddRequest withAnalyses(Consumer<List<AnalysisRequest>> analysesSetter) {
        if (this.analyses == null) {
            this.analyses = new ArrayList<>();
        }
        analysesSetter.accept(this.analyses);
        return this;
    }

    /**
     * 分析任务集，最多50个
     * @return analyses
     */
    public List<AnalysisRequest> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(List<AnalysisRequest> analyses) {
        this.analyses = analyses;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssetAddRequest that = (AssetAddRequest) obj;
        return Objects.equals(this.assetModelId, that.assetModelId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.parent, that.parent)
            && Objects.equals(this.properties, that.properties) && Objects.equals(this.analyses, that.analyses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetModelId, name, displayName, parent, properties, analyses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetAddRequest {\n");
        sb.append("    assetModelId: ").append(toIndentedString(assetModelId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    analyses: ").append(toIndentedString(analyses)).append("\n");
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
