package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProductGroupDelFailInfo
 */
public class ProductGroupDelFailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "products")

    private List<ProductDelFailInfo> products = null;

    public ProductGroupDelFailInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 模板组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ProductGroupDelFailInfo withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 模板组删除失败的原因
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public ProductGroupDelFailInfo withProducts(List<ProductDelFailInfo> products) {
        this.products = products;
        return this;
    }

    public ProductGroupDelFailInfo addProductsItem(ProductDelFailInfo productsItem) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(productsItem);
        return this;
    }

    public ProductGroupDelFailInfo withProducts(Consumer<List<ProductDelFailInfo>> productsSetter) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        productsSetter.accept(this.products);
        return this;
    }

    /**
     * 删除失败的产物的信息
     * @return products
     */
    public List<ProductDelFailInfo> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDelFailInfo> products) {
        this.products = products;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductGroupDelFailInfo that = (ProductGroupDelFailInfo) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.failReason, that.failReason)
            && Objects.equals(this.products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, failReason, products);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductGroupDelFailInfo {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
