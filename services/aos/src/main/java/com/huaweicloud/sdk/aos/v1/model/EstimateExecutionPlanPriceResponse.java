package com.huaweicloud.sdk.aos.v1.model;

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
public class EstimateExecutionPlanPriceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<ItemsResponse> items = null;

    public EstimateExecutionPlanPriceResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种，枚举值   * [`CNY` - 元，中国站返回的币种](tag:hws)[`USD` - 美元，国际站返回的币种](tag:hws_hk)[`USD` - 美元，欧洲站返回的币种](tag:hws_eu)
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public EstimateExecutionPlanPriceResponse withItems(List<ItemsResponse> items) {
        this.items = items;
        return this;
    }

    public EstimateExecutionPlanPriceResponse addItemsItem(ItemsResponse itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public EstimateExecutionPlanPriceResponse withItems(Consumer<List<ItemsResponse>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 执行计划中所有资源的询价结果
     * @return items
     */
    public List<ItemsResponse> getItems() {
        return items;
    }

    public void setItems(List<ItemsResponse> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EstimateExecutionPlanPriceResponse that = (EstimateExecutionPlanPriceResponse) obj;
        return Objects.equals(this.currency, that.currency) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EstimateExecutionPlanPriceResponse {\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
