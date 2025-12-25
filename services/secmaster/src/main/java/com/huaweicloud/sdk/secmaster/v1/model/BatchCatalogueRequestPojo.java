package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量更新目录请求体
 */
public class BatchCatalogueRequestPojo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_navigation")

    private Boolean isNavigation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_card_area")

    private Boolean isCardArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "landing_page")

    private String landingPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_alias_zh")

    private String parentAliasZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_alias_en")

    private String parentAliasEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_catalogue")

    private String parentCatalogue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogue_infos")

    private List<CatalogueBatchPojo> catalogueInfos = null;

    public BatchCatalogueRequestPojo withIsNavigation(Boolean isNavigation) {
        this.isNavigation = isNavigation;
        return this;
    }

    /**
     * 是否显示面包屑导航
     * @return isNavigation
     */
    public Boolean getIsNavigation() {
        return isNavigation;
    }

    public void setIsNavigation(Boolean isNavigation) {
        this.isNavigation = isNavigation;
    }

    public BatchCatalogueRequestPojo withIsCardArea(Boolean isCardArea) {
        this.isCardArea = isCardArea;
        return this;
    }

    /**
     * 是否显示名片区
     * @return isCardArea
     */
    public Boolean getIsCardArea() {
        return isCardArea;
    }

    public void setIsCardArea(Boolean isCardArea) {
        this.isCardArea = isCardArea;
    }

    public BatchCatalogueRequestPojo withLandingPage(String landingPage) {
        this.landingPage = landingPage;
        return this;
    }

    /**
     * 落地页
     * @return landingPage
     */
    public String getLandingPage() {
        return landingPage;
    }

    public void setLandingPage(String landingPage) {
        this.landingPage = landingPage;
    }

    public BatchCatalogueRequestPojo withParentAliasZh(String parentAliasZh) {
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

    public BatchCatalogueRequestPojo withParentAliasEn(String parentAliasEn) {
        this.parentAliasEn = parentAliasEn;
        return this;
    }

    /**
     * 一级目录中文别名
     * @return parentAliasEn
     */
    public String getParentAliasEn() {
        return parentAliasEn;
    }

    public void setParentAliasEn(String parentAliasEn) {
        this.parentAliasEn = parentAliasEn;
    }

    public BatchCatalogueRequestPojo withParentCatalogue(String parentCatalogue) {
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

    public BatchCatalogueRequestPojo withCatalogueInfos(List<CatalogueBatchPojo> catalogueInfos) {
        this.catalogueInfos = catalogueInfos;
        return this;
    }

    public BatchCatalogueRequestPojo addCatalogueInfosItem(CatalogueBatchPojo catalogueInfosItem) {
        if (this.catalogueInfos == null) {
            this.catalogueInfos = new ArrayList<>();
        }
        this.catalogueInfos.add(catalogueInfosItem);
        return this;
    }

    public BatchCatalogueRequestPojo withCatalogueInfos(Consumer<List<CatalogueBatchPojo>> catalogueInfosSetter) {
        if (this.catalogueInfos == null) {
            this.catalogueInfos = new ArrayList<>();
        }
        catalogueInfosSetter.accept(this.catalogueInfos);
        return this;
    }

    /**
     * 目录详情列表
     * @return catalogueInfos
     */
    public List<CatalogueBatchPojo> getCatalogueInfos() {
        return catalogueInfos;
    }

    public void setCatalogueInfos(List<CatalogueBatchPojo> catalogueInfos) {
        this.catalogueInfos = catalogueInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCatalogueRequestPojo that = (BatchCatalogueRequestPojo) obj;
        return Objects.equals(this.isNavigation, that.isNavigation) && Objects.equals(this.isCardArea, that.isCardArea)
            && Objects.equals(this.landingPage, that.landingPage)
            && Objects.equals(this.parentAliasZh, that.parentAliasZh)
            && Objects.equals(this.parentAliasEn, that.parentAliasEn)
            && Objects.equals(this.parentCatalogue, that.parentCatalogue)
            && Objects.equals(this.catalogueInfos, that.catalogueInfos);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(isNavigation, isCardArea, landingPage, parentAliasZh, parentAliasEn, parentCatalogue, catalogueInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCatalogueRequestPojo {\n");
        sb.append("    isNavigation: ").append(toIndentedString(isNavigation)).append("\n");
        sb.append("    isCardArea: ").append(toIndentedString(isCardArea)).append("\n");
        sb.append("    landingPage: ").append(toIndentedString(landingPage)).append("\n");
        sb.append("    parentAliasZh: ").append(toIndentedString(parentAliasZh)).append("\n");
        sb.append("    parentAliasEn: ").append(toIndentedString(parentAliasEn)).append("\n");
        sb.append("    parentCatalogue: ").append(toIndentedString(parentCatalogue)).append("\n");
        sb.append("    catalogueInfos: ").append(toIndentedString(catalogueInfos)).append("\n");
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
