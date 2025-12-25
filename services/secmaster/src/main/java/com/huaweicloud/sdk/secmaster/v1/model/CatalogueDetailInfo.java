package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 目录详情信息
 */
public class CatalogueDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "catalogue_address")

    private String catalogueAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_id")

    private String layoutId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_name")

    private String layoutName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_name")

    private String publisherName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_card_area")

    private Boolean isCardArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_display")

    private Boolean isDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_landing_page")

    private Boolean isLandingPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_navigation")

    private Boolean isNavigation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_alias_en")

    private String parentAliasEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_alias_zh")

    private String parentAliasZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second_alias_en")

    private String secondAliasEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second_alias_zh")

    private String secondAliasZh;

    public CatalogueDetailInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 目录id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CatalogueDetailInfo withParentCatalogue(String parentCatalogue) {
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

    public CatalogueDetailInfo withSecondCatalogue(String secondCatalogue) {
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

    public CatalogueDetailInfo withCatalogueStatus(Boolean catalogueStatus) {
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

    public CatalogueDetailInfo withCatalogueAddress(String catalogueAddress) {
        this.catalogueAddress = catalogueAddress;
        return this;
    }

    /**
     * 目录地址
     * @return catalogueAddress
     */
    public String getCatalogueAddress() {
        return catalogueAddress;
    }

    public void setCatalogueAddress(String catalogueAddress) {
        this.catalogueAddress = catalogueAddress;
    }

    public CatalogueDetailInfo withLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    /**
     * 布局ID
     * @return layoutId
     */
    public String getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    public CatalogueDetailInfo withLayoutName(String layoutName) {
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

    public CatalogueDetailInfo withPublisherName(String publisherName) {
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

    public CatalogueDetailInfo withIsCardArea(Boolean isCardArea) {
        this.isCardArea = isCardArea;
        return this;
    }

    /**
     * 是否展示名片区
     * @return isCardArea
     */
    public Boolean getIsCardArea() {
        return isCardArea;
    }

    public void setIsCardArea(Boolean isCardArea) {
        this.isCardArea = isCardArea;
    }

    public CatalogueDetailInfo withIsDisplay(Boolean isDisplay) {
        this.isDisplay = isDisplay;
        return this;
    }

    /**
     * 是否展示目录
     * @return isDisplay
     */
    public Boolean getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Boolean isDisplay) {
        this.isDisplay = isDisplay;
    }

    public CatalogueDetailInfo withIsLandingPage(Boolean isLandingPage) {
        this.isLandingPage = isLandingPage;
        return this;
    }

    /**
     * 是否为落地页
     * @return isLandingPage
     */
    public Boolean getIsLandingPage() {
        return isLandingPage;
    }

    public void setIsLandingPage(Boolean isLandingPage) {
        this.isLandingPage = isLandingPage;
    }

    public CatalogueDetailInfo withIsNavigation(Boolean isNavigation) {
        this.isNavigation = isNavigation;
        return this;
    }

    /**
     * 是否展示面包屑导航
     * @return isNavigation
     */
    public Boolean getIsNavigation() {
        return isNavigation;
    }

    public void setIsNavigation(Boolean isNavigation) {
        this.isNavigation = isNavigation;
    }

    public CatalogueDetailInfo withParentAliasEn(String parentAliasEn) {
        this.parentAliasEn = parentAliasEn;
        return this;
    }

    /**
     * 一级目录英文别名
     * @return parentAliasEn
     */
    public String getParentAliasEn() {
        return parentAliasEn;
    }

    public void setParentAliasEn(String parentAliasEn) {
        this.parentAliasEn = parentAliasEn;
    }

    public CatalogueDetailInfo withParentAliasZh(String parentAliasZh) {
        this.parentAliasZh = parentAliasZh;
        return this;
    }

    /**
     * 一级目录中文别名
     * @return parentAliasZh
     */
    public String getParentAliasZh() {
        return parentAliasZh;
    }

    public void setParentAliasZh(String parentAliasZh) {
        this.parentAliasZh = parentAliasZh;
    }

    public CatalogueDetailInfo withSecondAliasEn(String secondAliasEn) {
        this.secondAliasEn = secondAliasEn;
        return this;
    }

    /**
     * 二级目录英文别名
     * @return secondAliasEn
     */
    public String getSecondAliasEn() {
        return secondAliasEn;
    }

    public void setSecondAliasEn(String secondAliasEn) {
        this.secondAliasEn = secondAliasEn;
    }

    public CatalogueDetailInfo withSecondAliasZh(String secondAliasZh) {
        this.secondAliasZh = secondAliasZh;
        return this;
    }

    /**
     * 二级目录中文别名
     * @return secondAliasZh
     */
    public String getSecondAliasZh() {
        return secondAliasZh;
    }

    public void setSecondAliasZh(String secondAliasZh) {
        this.secondAliasZh = secondAliasZh;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatalogueDetailInfo that = (CatalogueDetailInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.parentCatalogue, that.parentCatalogue)
            && Objects.equals(this.secondCatalogue, that.secondCatalogue)
            && Objects.equals(this.catalogueStatus, that.catalogueStatus)
            && Objects.equals(this.catalogueAddress, that.catalogueAddress)
            && Objects.equals(this.layoutId, that.layoutId) && Objects.equals(this.layoutName, that.layoutName)
            && Objects.equals(this.publisherName, that.publisherName)
            && Objects.equals(this.isCardArea, that.isCardArea) && Objects.equals(this.isDisplay, that.isDisplay)
            && Objects.equals(this.isLandingPage, that.isLandingPage)
            && Objects.equals(this.isNavigation, that.isNavigation)
            && Objects.equals(this.parentAliasEn, that.parentAliasEn)
            && Objects.equals(this.parentAliasZh, that.parentAliasZh)
            && Objects.equals(this.secondAliasEn, that.secondAliasEn)
            && Objects.equals(this.secondAliasZh, that.secondAliasZh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            parentCatalogue,
            secondCatalogue,
            catalogueStatus,
            catalogueAddress,
            layoutId,
            layoutName,
            publisherName,
            isCardArea,
            isDisplay,
            isLandingPage,
            isNavigation,
            parentAliasEn,
            parentAliasZh,
            secondAliasEn,
            secondAliasZh);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogueDetailInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentCatalogue: ").append(toIndentedString(parentCatalogue)).append("\n");
        sb.append("    secondCatalogue: ").append(toIndentedString(secondCatalogue)).append("\n");
        sb.append("    catalogueStatus: ").append(toIndentedString(catalogueStatus)).append("\n");
        sb.append("    catalogueAddress: ").append(toIndentedString(catalogueAddress)).append("\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    layoutName: ").append(toIndentedString(layoutName)).append("\n");
        sb.append("    publisherName: ").append(toIndentedString(publisherName)).append("\n");
        sb.append("    isCardArea: ").append(toIndentedString(isCardArea)).append("\n");
        sb.append("    isDisplay: ").append(toIndentedString(isDisplay)).append("\n");
        sb.append("    isLandingPage: ").append(toIndentedString(isLandingPage)).append("\n");
        sb.append("    isNavigation: ").append(toIndentedString(isNavigation)).append("\n");
        sb.append("    parentAliasEn: ").append(toIndentedString(parentAliasEn)).append("\n");
        sb.append("    parentAliasZh: ").append(toIndentedString(parentAliasZh)).append("\n");
        sb.append("    secondAliasEn: ").append(toIndentedString(secondAliasEn)).append("\n");
        sb.append("    secondAliasZh: ").append(toIndentedString(secondAliasZh)).append("\n");
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
