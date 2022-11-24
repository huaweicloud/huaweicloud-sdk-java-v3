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
public class ListInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "purchased")

    private Boolean purchased;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<ListInstance> items = null;

    public ListInstanceResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 独享引擎实例数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListInstanceResponse withPurchased(Boolean purchased) {
        this.purchased = purchased;
        return this;
    }

    /**
     * 是否曾经购买过独享引擎
     * @return purchased
     */
    public Boolean getPurchased() {
        return purchased;
    }

    public void setPurchased(Boolean purchased) {
        this.purchased = purchased;
    }

    public ListInstanceResponse withItems(List<ListInstance> items) {
        this.items = items;
        return this;
    }

    public ListInstanceResponse addItemsItem(ListInstance itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListInstanceResponse withItems(Consumer<List<ListInstance>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 详细的独享引擎信息列表
     * @return items
     */
    public List<ListInstance> getItems() {
        return items;
    }

    public void setItems(List<ListInstance> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstanceResponse listInstanceResponse = (ListInstanceResponse) o;
        return Objects.equals(this.total, listInstanceResponse.total)
            && Objects.equals(this.purchased, listInstanceResponse.purchased)
            && Objects.equals(this.items, listInstanceResponse.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, purchased, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    purchased: ").append(toIndentedString(purchased)).append("\n");
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
