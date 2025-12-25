package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询条件
 */
public class SearchInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_catalogue")

    private String parentCatalogue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second_catalogue")

    private String secondCatalogue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogue_status")

    private Boolean catalogueStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogue_type")

    private String catalogueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_name")

    private String layoutName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_name")

    private String publisherName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_version")

    private String analysisVersion;

    public SearchInfo withParentCatalogue(String parentCatalogue) {
        this.parentCatalogue = parentCatalogue;
        return this;
    }

    /**
     * 一级目录名称
     * @return parentCatalogue
     */
    public String getParentCatalogue() {
        return parentCatalogue;
    }

    public void setParentCatalogue(String parentCatalogue) {
        this.parentCatalogue = parentCatalogue;
    }

    public SearchInfo withSecondCatalogue(String secondCatalogue) {
        this.secondCatalogue = secondCatalogue;
        return this;
    }

    /**
     * 二级目录名称
     * @return secondCatalogue
     */
    public String getSecondCatalogue() {
        return secondCatalogue;
    }

    public void setSecondCatalogue(String secondCatalogue) {
        this.secondCatalogue = secondCatalogue;
    }

    public SearchInfo withCatalogueStatus(Boolean catalogueStatus) {
        this.catalogueStatus = catalogueStatus;
        return this;
    }

    /**
     * 是否内置
     * @return catalogueStatus
     */
    public Boolean getCatalogueStatus() {
        return catalogueStatus;
    }

    public void setCatalogueStatus(Boolean catalogueStatus) {
        this.catalogueStatus = catalogueStatus;
    }

    public SearchInfo withCatalogueType(String catalogueType) {
        this.catalogueType = catalogueType;
        return this;
    }

    /**
     * 是否内置
     * @return catalogueType
     */
    public String getCatalogueType() {
        return catalogueType;
    }

    public void setCatalogueType(String catalogueType) {
        this.catalogueType = catalogueType;
    }

    public SearchInfo withLayoutName(String layoutName) {
        this.layoutName = layoutName;
        return this;
    }

    /**
     * 布局名称
     * @return layoutName
     */
    public String getLayoutName() {
        return layoutName;
    }

    public void setLayoutName(String layoutName) {
        this.layoutName = layoutName;
    }

    public SearchInfo withPublisherName(String publisherName) {
        this.publisherName = publisherName;
        return this;
    }

    /**
     * 发布者
     * @return publisherName
     */
    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public SearchInfo withAnalysisVersion(String analysisVersion) {
        this.analysisVersion = analysisVersion;
        return this;
    }

    /**
     * 安全分析版本
     * @return analysisVersion
     */
    public String getAnalysisVersion() {
        return analysisVersion;
    }

    public void setAnalysisVersion(String analysisVersion) {
        this.analysisVersion = analysisVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchInfo that = (SearchInfo) obj;
        return Objects.equals(this.parentCatalogue, that.parentCatalogue)
            && Objects.equals(this.secondCatalogue, that.secondCatalogue)
            && Objects.equals(this.catalogueStatus, that.catalogueStatus)
            && Objects.equals(this.catalogueType, that.catalogueType)
            && Objects.equals(this.layoutName, that.layoutName)
            && Objects.equals(this.publisherName, that.publisherName)
            && Objects.equals(this.analysisVersion, that.analysisVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentCatalogue,
            secondCatalogue,
            catalogueStatus,
            catalogueType,
            layoutName,
            publisherName,
            analysisVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchInfo {\n");
        sb.append("    parentCatalogue: ").append(toIndentedString(parentCatalogue)).append("\n");
        sb.append("    secondCatalogue: ").append(toIndentedString(secondCatalogue)).append("\n");
        sb.append("    catalogueStatus: ").append(toIndentedString(catalogueStatus)).append("\n");
        sb.append("    catalogueType: ").append(toIndentedString(catalogueType)).append("\n");
        sb.append("    layoutName: ").append(toIndentedString(layoutName)).append("\n");
        sb.append("    publisherName: ").append(toIndentedString(publisherName)).append("\n");
        sb.append("    analysisVersion: ").append(toIndentedString(analysisVersion)).append("\n");
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
