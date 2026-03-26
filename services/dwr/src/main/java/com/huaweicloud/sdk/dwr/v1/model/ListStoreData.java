package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListStoreData
 */
public class ListStoreData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stores")

    private List<StoreData> stores = null;

    public ListStoreData withStores(List<StoreData> stores) {
        this.stores = stores;
        return this;
    }

    public ListStoreData addStoresItem(StoreData storesItem) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(storesItem);
        return this;
    }

    public ListStoreData withStores(Consumer<List<StoreData>> storesSetter) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        storesSetter.accept(this.stores);
        return this;
    }

    /**
     * **参数解释：** 列举store列表。 **约束限制：** 不涉及。
     * @return stores
     */
    public List<StoreData> getStores() {
        return stores;
    }

    public void setStores(List<StoreData> stores) {
        this.stores = stores;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStoreData that = (ListStoreData) obj;
        return Objects.equals(this.stores, that.stores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stores);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStoreData {\n");
        sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
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
