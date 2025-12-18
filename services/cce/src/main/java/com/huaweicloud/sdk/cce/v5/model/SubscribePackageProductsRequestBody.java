package com.huaweicloud.sdk.cce.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 订购套餐包-response结构体。
 */
public class SubscribePackageProductsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_products")

    private List<PackageProductRequestDetail> packageProducts = null;

    public SubscribePackageProductsRequestBody withPackageProducts(List<PackageProductRequestDetail> packageProducts) {
        this.packageProducts = packageProducts;
        return this;
    }

    public SubscribePackageProductsRequestBody addPackageProductsItem(PackageProductRequestDetail packageProductsItem) {
        if (this.packageProducts == null) {
            this.packageProducts = new ArrayList<>();
        }
        this.packageProducts.add(packageProductsItem);
        return this;
    }

    public SubscribePackageProductsRequestBody withPackageProducts(
        Consumer<List<PackageProductRequestDetail>> packageProductsSetter) {
        if (this.packageProducts == null) {
            this.packageProducts = new ArrayList<>();
        }
        packageProductsSetter.accept(this.packageProducts);
        return this;
    }

    /**
     * 套餐包列表。
     * @return packageProducts
     */
    public List<PackageProductRequestDetail> getPackageProducts() {
        return packageProducts;
    }

    public void setPackageProducts(List<PackageProductRequestDetail> packageProducts) {
        this.packageProducts = packageProducts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribePackageProductsRequestBody that = (SubscribePackageProductsRequestBody) obj;
        return Objects.equals(this.packageProducts, that.packageProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageProducts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribePackageProductsRequestBody {\n");
        sb.append("    packageProducts: ").append(toIndentedString(packageProducts)).append("\n");
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
