package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssetModelModRequest
 */
public class AssetModelModRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private List<PropertyModelRequest> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyses")

    private List<AnalysisModelRequest> analyses = null;

    public AssetModelModRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 模型显示名称，正则：\"^[\\\\u4E00-\\\\u9FA5A-Za-z0-9_@#.-]{1,64}$\"
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AssetModelModRequest withProperties(List<PropertyModelRequest> properties) {
        this.properties = properties;
        return this;
    }

    public AssetModelModRequest addPropertiesItem(PropertyModelRequest propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    public AssetModelModRequest withProperties(Consumer<List<PropertyModelRequest>> propertiesSetter) {
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
    public List<PropertyModelRequest> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyModelRequest> properties) {
        this.properties = properties;
    }

    public AssetModelModRequest withAnalyses(List<AnalysisModelRequest> analyses) {
        this.analyses = analyses;
        return this;
    }

    public AssetModelModRequest addAnalysesItem(AnalysisModelRequest analysesItem) {
        if (this.analyses == null) {
            this.analyses = new ArrayList<>();
        }
        this.analyses.add(analysesItem);
        return this;
    }

    public AssetModelModRequest withAnalyses(Consumer<List<AnalysisModelRequest>> analysesSetter) {
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
    public List<AnalysisModelRequest> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(List<AnalysisModelRequest> analyses) {
        this.analyses = analyses;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetModelModRequest assetModelModRequest = (AssetModelModRequest) o;
        return Objects.equals(this.displayName, assetModelModRequest.displayName)
            && Objects.equals(this.properties, assetModelModRequest.properties)
            && Objects.equals(this.analyses, assetModelModRequest.analyses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, properties, analyses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetModelModRequest {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
