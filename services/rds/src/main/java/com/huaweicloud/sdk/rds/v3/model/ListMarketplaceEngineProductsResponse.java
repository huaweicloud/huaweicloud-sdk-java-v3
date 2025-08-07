package com.huaweicloud.sdk.rds.v3.model;

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
public class ListMarketplaceEngineProductsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marketplace_engine_products")

    private List<MarketplaceEngineProduct> marketplaceEngineProducts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListMarketplaceEngineProductsResponse withMarketplaceEngineProducts(
        List<MarketplaceEngineProduct> marketplaceEngineProducts) {
        this.marketplaceEngineProducts = marketplaceEngineProducts;
        return this;
    }

    public ListMarketplaceEngineProductsResponse addMarketplaceEngineProductsItem(
        MarketplaceEngineProduct marketplaceEngineProductsItem) {
        if (this.marketplaceEngineProducts == null) {
            this.marketplaceEngineProducts = new ArrayList<>();
        }
        this.marketplaceEngineProducts.add(marketplaceEngineProductsItem);
        return this;
    }

    public ListMarketplaceEngineProductsResponse withMarketplaceEngineProducts(
        Consumer<List<MarketplaceEngineProduct>> marketplaceEngineProductsSetter) {
        if (this.marketplaceEngineProducts == null) {
            this.marketplaceEngineProducts = new ArrayList<>();
        }
        marketplaceEngineProductsSetter.accept(this.marketplaceEngineProducts);
        return this;
    }

    /**
     * 云市场引擎商品列表。
     * @return marketplaceEngineProducts
     */
    public List<MarketplaceEngineProduct> getMarketplaceEngineProducts() {
        return marketplaceEngineProducts;
    }

    public void setMarketplaceEngineProducts(List<MarketplaceEngineProduct> marketplaceEngineProducts) {
        this.marketplaceEngineProducts = marketplaceEngineProducts;
    }

    public ListMarketplaceEngineProductsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 云市场引擎商品总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMarketplaceEngineProductsResponse that = (ListMarketplaceEngineProductsResponse) obj;
        return Objects.equals(this.marketplaceEngineProducts, that.marketplaceEngineProducts)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketplaceEngineProducts, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMarketplaceEngineProductsResponse {\n");
        sb.append("    marketplaceEngineProducts: ").append(toIndentedString(marketplaceEngineProducts)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
