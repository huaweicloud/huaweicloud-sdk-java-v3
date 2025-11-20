package com.huaweicloud.sdk.aad.v2.model;

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
public class ListDDoSBlackHoleEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<ListBlackHoleEventRecordItem> items = null;

    public ListDDoSBlackHoleEventResponse withItems(List<ListBlackHoleEventRecordItem> items) {
        this.items = items;
        return this;
    }

    public ListDDoSBlackHoleEventResponse addItemsItem(ListBlackHoleEventRecordItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListDDoSBlackHoleEventResponse withItems(Consumer<List<ListBlackHoleEventRecordItem>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * items
     * @return items
     */
    public List<ListBlackHoleEventRecordItem> getItems() {
        return items;
    }

    public void setItems(List<ListBlackHoleEventRecordItem> items) {
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
        ListDDoSBlackHoleEventResponse that = (ListDDoSBlackHoleEventResponse) obj;
        return Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDDoSBlackHoleEventResponse {\n");
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
