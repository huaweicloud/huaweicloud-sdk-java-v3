package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.Page;
import com.huaweicloud.sdk.iotda.v5.model.ProductSummary;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListProductsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="products")
    
    private List<ProductSummary> products = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Page page = null;

    public ListProductsResponse withProducts(List<ProductSummary> products) {
        this.products = products;
        return this;
    }

    
    public ListProductsResponse addProductsItem(ProductSummary productsItem) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(productsItem);
        return this;
    }

    public ListProductsResponse withProducts(Consumer<List<ProductSummary>> productsSetter) {
        if(this.products == null ){
            this.products = new ArrayList<>();
        }
        productsSetter.accept(this.products);
        return this;
    }

    /**
     * 产品信息列表。
     * @return products
     */
    public List<ProductSummary> getProducts() {
        return products;
    }

    public void setProducts(List<ProductSummary> products) {
        this.products = products;
    }

    public ListProductsResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListProductsResponse withPage(Consumer<Page> pageSetter) {
        if(this.page == null ){
            this.page = new Page();
            pageSetter.accept(this.page);
        }
        
        return this;
    }


    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProductsResponse listProductsResponse = (ListProductsResponse) o;
        return Objects.equals(this.products, listProductsResponse.products) &&
            Objects.equals(this.page, listProductsResponse.page);
    }
    @Override
    public int hashCode() {
        return Objects.hash(products, page);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductsResponse {\n");
        sb.append("    products: ").append(toIndentedString(products)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

