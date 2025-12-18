package com.huaweicloud.sdk.cce.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListPackageProductsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_products")

    private List<PackageProductDetail> packageProducts = null;

    public ListPackageProductsResponse withPackageProducts(List<PackageProductDetail> packageProducts) {
        this.packageProducts = packageProducts;
        return this;
    }

    public ListPackageProductsResponse addPackageProductsItem(PackageProductDetail packageProductsItem) {
        if (this.packageProducts == null) {
            this.packageProducts = new ArrayList<>();
        }
        this.packageProducts.add(packageProductsItem);
        return this;
    }

    public ListPackageProductsResponse withPackageProducts(Consumer<List<PackageProductDetail>> packageProductsSetter) {
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
    public List<PackageProductDetail> getPackageProducts() {
        return packageProducts;
    }

    public void setPackageProducts(List<PackageProductDetail> packageProducts) {
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
        ListPackageProductsResponse that = (ListPackageProductsResponse) obj;
        return Objects.equals(this.packageProducts, that.packageProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageProducts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPackageProductsResponse {\n");
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
