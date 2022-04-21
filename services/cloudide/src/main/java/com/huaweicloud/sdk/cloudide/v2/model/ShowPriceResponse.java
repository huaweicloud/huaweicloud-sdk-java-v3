package com.huaweicloud.sdk.cloudide.v2.model;

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
public class ShowPriceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prices")

    private List<ResourcePrice> prices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ShowPriceResponse withPrices(List<ResourcePrice> prices) {
        this.prices = prices;
        return this;
    }

    public ShowPriceResponse addPricesItem(ResourcePrice pricesItem) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(pricesItem);
        return this;
    }

    public ShowPriceResponse withPrices(Consumer<List<ResourcePrice>> pricesSetter) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        pricesSetter.accept(this.prices);
        return this;
    }

    /**
     * 技术栈价格列表
     * @return prices
     */
    public List<ResourcePrice> getPrices() {
        return prices;
    }

    public void setPrices(List<ResourcePrice> prices) {
        this.prices = prices;
    }

    public ShowPriceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPriceResponse showPriceResponse = (ShowPriceResponse) o;
        return Objects.equals(this.prices, showPriceResponse.prices)
            && Objects.equals(this.status, showPriceResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prices, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPriceResponse {\n");
        sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
