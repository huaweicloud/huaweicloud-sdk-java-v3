package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowThemeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-service-key")

    private String xServiceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-site")

    private String xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type_id")

    private String productTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type_name")

    private String productTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type_short_name")

    private String productTypeShortName;

    public ShowThemeRequest withXServiceKey(String xServiceKey) {
        this.xServiceKey = xServiceKey;
        return this;
    }

    /**
     * 调用智能客服服务标志。
     * @return xServiceKey
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-service-key")
    public String getXServiceKey() {
        return xServiceKey;
    }

    public void setXServiceKey(String xServiceKey) {
        this.xServiceKey = xServiceKey;
    }

    public ShowThemeRequest withXSite(String xSite) {
        this.xSite = xSite;
        return this;
    }

    /**
     * 站点标记，0-中国站  1-国际站
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-site")
    public String getXSite() {
        return xSite;
    }

    public void setXSite(String xSite) {
        this.xSite = xSite;
    }

    public ShowThemeRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 区域语言简写，en-us  zh-cn
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ShowThemeRequest withProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
        return this;
    }

    /**
     * 产品类型Id
     * @return productTypeId
     */
    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public ShowThemeRequest withProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
        return this;
    }

    /**
     * 产品类型名称
     * @return productTypeName
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public ShowThemeRequest withProductTypeShortName(String productTypeShortName) {
        this.productTypeShortName = productTypeShortName;
        return this;
    }

    /**
     * 产品类型缩写
     * @return productTypeShortName
     */
    public String getProductTypeShortName() {
        return productTypeShortName;
    }

    public void setProductTypeShortName(String productTypeShortName) {
        this.productTypeShortName = productTypeShortName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowThemeRequest showThemeRequest = (ShowThemeRequest) o;
        return Objects.equals(this.xServiceKey, showThemeRequest.xServiceKey)
            && Objects.equals(this.xSite, showThemeRequest.xSite)
            && Objects.equals(this.xLanguage, showThemeRequest.xLanguage)
            && Objects.equals(this.productTypeId, showThemeRequest.productTypeId)
            && Objects.equals(this.productTypeName, showThemeRequest.productTypeName)
            && Objects.equals(this.productTypeShortName, showThemeRequest.productTypeShortName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xServiceKey, xSite, xLanguage, productTypeId, productTypeName, productTypeShortName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowThemeRequest {\n");
        sb.append("    xServiceKey: ").append(toIndentedString(xServiceKey)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    productTypeId: ").append(toIndentedString(productTypeId)).append("\n");
        sb.append("    productTypeName: ").append(toIndentedString(productTypeName)).append("\n");
        sb.append("    productTypeShortName: ").append(toIndentedString(productTypeShortName)).append("\n");
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
