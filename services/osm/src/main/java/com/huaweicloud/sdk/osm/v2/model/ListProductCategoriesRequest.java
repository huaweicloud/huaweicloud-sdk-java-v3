package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListProductCategoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_category_name")

    private String productCategoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")

    private Integer xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")

    private String xTimeZone;

    public ListProductCategoriesRequest withProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
        return this;
    }

    /** 产品类型名称
     * 
     * @return productCategoryName */
    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public ListProductCategoriesRequest withXSite(Integer xSite) {
        this.xSite = xSite;
        return this;
    }

    /** 对接站点信息。 0（中国站） 1（国际站），不填的话默认为0。 minimum: 0 maximum: 1
     * 
     * @return xSite */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    public ListProductCategoriesRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /** 语言环境，值为通用的语言描述字符串，比如zh-cn等，默认为zh-cn。 会根据语言环境对应展示一些国际化的信息，比如工单类型名称等。
     * 
     * @return xLanguage */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListProductCategoriesRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    /** 环境时区，值为通用的时区描述字符串，比如GMT+8等，默认为GMT+8。 涉及时间的数据会根据环境时区处理。
     * 
     * @return xTimeZone */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProductCategoriesRequest listProductCategoriesRequest = (ListProductCategoriesRequest) o;
        return Objects.equals(this.productCategoryName, listProductCategoriesRequest.productCategoryName)
            && Objects.equals(this.xSite, listProductCategoriesRequest.xSite)
            && Objects.equals(this.xLanguage, listProductCategoriesRequest.xLanguage)
            && Objects.equals(this.xTimeZone, listProductCategoriesRequest.xTimeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCategoryName, xSite, xLanguage, xTimeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductCategoriesRequest {\n");
        sb.append("    productCategoryName: ").append(toIndentedString(productCategoryName)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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
