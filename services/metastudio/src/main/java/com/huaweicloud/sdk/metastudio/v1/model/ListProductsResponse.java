package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ListProductsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "products")

    private List<ProductDetailInfo> products = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListProductsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 商品信息总数
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListProductsResponse withProducts(List<ProductDetailInfo> products) {
        this.products = products;
        return this;
    }

    public ListProductsResponse addProductsItem(ProductDetailInfo productsItem) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(productsItem);
        return this;
    }

    public ListProductsResponse withProducts(Consumer<List<ProductDetailInfo>> productsSetter) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        productsSetter.accept(this.products);
        return this;
    }

    /**
     * 商品信息列表
     * @return products
     */
    public List<ProductDetailInfo> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDetailInfo> products) {
        this.products = products;
    }

    public ListProductsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProductsResponse that = (ListProductsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.products, that.products)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, products, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    products: ").append(toIndentedString(products)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
