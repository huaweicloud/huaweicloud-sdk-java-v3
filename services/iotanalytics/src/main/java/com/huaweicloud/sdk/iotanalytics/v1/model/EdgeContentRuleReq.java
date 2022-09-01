package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 在Edge实例中要配置转发规则推送数据的资源空间和产品列表
 */
public class EdgeContentRuleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "products")

    @JacksonXmlProperty(localName = "products")

    private List<String> products = null;

    public EdgeContentRuleReq withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Edge中的资源空间Id
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public EdgeContentRuleReq withProducts(List<String> products) {
        this.products = products;
        return this;
    }

    public EdgeContentRuleReq addProductsItem(String productsItem) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(productsItem);
        return this;
    }

    public EdgeContentRuleReq withProducts(Consumer<List<String>> productsSetter) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        productsSetter.accept(this.products);
        return this;
    }

    /**
     * Edge中某资源空间Id下的产品列表
     * @return products
     */
    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeContentRuleReq edgeContentRuleReq = (EdgeContentRuleReq) o;
        return Objects.equals(this.appId, edgeContentRuleReq.appId)
            && Objects.equals(this.products, edgeContentRuleReq.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, products);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeContentRuleReq {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
