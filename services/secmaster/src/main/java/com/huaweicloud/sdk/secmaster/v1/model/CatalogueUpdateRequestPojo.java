package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 新增、编辑目录pojo
 */
public class CatalogueUpdateRequestPojo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_alias_en")

    private String parentAliasEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_alias_zh")

    private String parentAliasZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second_catalogue")

    private String secondCatalogue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second_alias_en")

    private String secondAliasEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second_alias_zh")

    private String secondAliasZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_id")

    private String layoutId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_name")

    private String layoutName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogue_address")

    private String catalogueAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_name")

    private String publisherName;

    public CatalogueUpdateRequestPojo withParentAliasEn(String parentAliasEn) {
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

    public CatalogueUpdateRequestPojo withParentAliasZh(String parentAliasZh) {
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

    public CatalogueUpdateRequestPojo withSecondCatalogue(String secondCatalogue) {
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

    public CatalogueUpdateRequestPojo withSecondAliasEn(String secondAliasEn) {
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

    public CatalogueUpdateRequestPojo withSecondAliasZh(String secondAliasZh) {
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

    public CatalogueUpdateRequestPojo withLayoutId(String layoutId) {
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

    public CatalogueUpdateRequestPojo withLayoutName(String layoutName) {
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

    public CatalogueUpdateRequestPojo withCatalogueAddress(String catalogueAddress) {
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

    public CatalogueUpdateRequestPojo withPublisherName(String publisherName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatalogueUpdateRequestPojo that = (CatalogueUpdateRequestPojo) obj;
        return Objects.equals(this.parentAliasEn, that.parentAliasEn)
            && Objects.equals(this.parentAliasZh, that.parentAliasZh)
            && Objects.equals(this.secondCatalogue, that.secondCatalogue)
            && Objects.equals(this.secondAliasEn, that.secondAliasEn)
            && Objects.equals(this.secondAliasZh, that.secondAliasZh) && Objects.equals(this.layoutId, that.layoutId)
            && Objects.equals(this.layoutName, that.layoutName)
            && Objects.equals(this.catalogueAddress, that.catalogueAddress)
            && Objects.equals(this.publisherName, that.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentAliasEn,
            parentAliasZh,
            secondCatalogue,
            secondAliasEn,
            secondAliasZh,
            layoutId,
            layoutName,
            catalogueAddress,
            publisherName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogueUpdateRequestPojo {\n");
        sb.append("    parentAliasEn: ").append(toIndentedString(parentAliasEn)).append("\n");
        sb.append("    parentAliasZh: ").append(toIndentedString(parentAliasZh)).append("\n");
        sb.append("    secondCatalogue: ").append(toIndentedString(secondCatalogue)).append("\n");
        sb.append("    secondAliasEn: ").append(toIndentedString(secondAliasEn)).append("\n");
        sb.append("    secondAliasZh: ").append(toIndentedString(secondAliasZh)).append("\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    layoutName: ").append(toIndentedString(layoutName)).append("\n");
        sb.append("    catalogueAddress: ").append(toIndentedString(catalogueAddress)).append("\n");
        sb.append("    publisherName: ").append(toIndentedString(publisherName)).append("\n");
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
