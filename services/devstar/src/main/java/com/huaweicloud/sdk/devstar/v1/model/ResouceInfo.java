package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ResouceInfo */
public class ResouceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "home_link")

    private String homeLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe_link")

    private String subscribeLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference_price")

    private String referencePrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_details_link")

    private String priceDetailsLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specifications")

    private Object specifications;

    public ResouceInfo withName(String name) {
        this.name = name;
        return this;
    }

    /** 云服务名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResouceInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ResouceInfo withHomeLink(String homeLink) {
        this.homeLink = homeLink;
        return this;
    }

    /** 首页链接。
     * 
     * @return homeLink */
    public String getHomeLink() {
        return homeLink;
    }

    public void setHomeLink(String homeLink) {
        this.homeLink = homeLink;
    }

    public ResouceInfo withSubscribeLink(String subscribeLink) {
        this.subscribeLink = subscribeLink;
        return this;
    }

    /** 开通链接。
     * 
     * @return subscribeLink */
    public String getSubscribeLink() {
        return subscribeLink;
    }

    public void setSubscribeLink(String subscribeLink) {
        this.subscribeLink = subscribeLink;
    }

    public ResouceInfo withType(String type) {
        this.type = type;
        return this;
    }

    /** 服务类型。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResouceInfo withReferencePrice(String referencePrice) {
        this.referencePrice = referencePrice;
        return this;
    }

    /** 参考价格。
     * 
     * @return referencePrice */
    public String getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(String referencePrice) {
        this.referencePrice = referencePrice;
    }

    public ResouceInfo withPriceDetailsLink(String priceDetailsLink) {
        this.priceDetailsLink = priceDetailsLink;
        return this;
    }

    /** 价格详情链接。
     * 
     * @return priceDetailsLink */
    public String getPriceDetailsLink() {
        return priceDetailsLink;
    }

    public void setPriceDetailsLink(String priceDetailsLink) {
        this.priceDetailsLink = priceDetailsLink;
    }

    public ResouceInfo withSpecifications(Object specifications) {
        this.specifications = specifications;
        return this;
    }

    /** 规格,例如: {\"cpu\" : \"0.5\",\"ram\" : 1GB}。
     * 
     * @return specifications */
    public Object getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Object specifications) {
        this.specifications = specifications;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResouceInfo resouceInfo = (ResouceInfo) o;
        return Objects.equals(this.name, resouceInfo.name) && Objects.equals(this.description, resouceInfo.description)
            && Objects.equals(this.homeLink, resouceInfo.homeLink)
            && Objects.equals(this.subscribeLink, resouceInfo.subscribeLink)
            && Objects.equals(this.type, resouceInfo.type)
            && Objects.equals(this.referencePrice, resouceInfo.referencePrice)
            && Objects.equals(this.priceDetailsLink, resouceInfo.priceDetailsLink)
            && Objects.equals(this.specifications, resouceInfo.specifications);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, homeLink, subscribeLink, type, referencePrice, priceDetailsLink, specifications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResouceInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    homeLink: ").append(toIndentedString(homeLink)).append("\n");
        sb.append("    subscribeLink: ").append(toIndentedString(subscribeLink)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    referencePrice: ").append(toIndentedString(referencePrice)).append("\n");
        sb.append("    priceDetailsLink: ").append(toIndentedString(priceDetailsLink)).append("\n");
        sb.append("    specifications: ").append(toIndentedString(specifications)).append("\n");
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
