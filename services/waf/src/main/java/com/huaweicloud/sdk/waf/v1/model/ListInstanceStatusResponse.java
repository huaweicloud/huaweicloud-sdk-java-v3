package com.huaweicloud.sdk.waf.v1.model;

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
public class ListInstanceStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "purchased")

    private Boolean purchased;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<PremiumWafInstanceStatusResponse> items = null;

    public ListInstanceStatusResponse withPurchased(Boolean purchased) {
        this.purchased = purchased;
        return this;
    }

    /**
     * 是否已购买独享引擎
     * @return purchased
     */
    public Boolean getPurchased() {
        return purchased;
    }

    public void setPurchased(Boolean purchased) {
        this.purchased = purchased;
    }

    public ListInstanceStatusResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListInstanceStatusResponse withItems(List<PremiumWafInstanceStatusResponse> items) {
        this.items = items;
        return this;
    }

    public ListInstanceStatusResponse addItemsItem(PremiumWafInstanceStatusResponse itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListInstanceStatusResponse withItems(Consumer<List<PremiumWafInstanceStatusResponse>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 引擎实例状态信息列表
     * @return items
     */
    public List<PremiumWafInstanceStatusResponse> getItems() {
        return items;
    }

    public void setItems(List<PremiumWafInstanceStatusResponse> items) {
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
        ListInstanceStatusResponse that = (ListInstanceStatusResponse) obj;
        return Objects.equals(this.purchased, that.purchased) && Objects.equals(this.total, that.total)
            && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchased, total, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceStatusResponse {\n");
        sb.append("    purchased: ").append(toIndentedString(purchased)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
