package com.huaweicloud.sdk.iotanalytics.v1.model;

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
public class ListDataStoresResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_stores")

    private List<GetDataStore> dataStores = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListDataStoresResponse withDataStores(List<GetDataStore> dataStores) {
        this.dataStores = dataStores;
        return this;
    }

    public ListDataStoresResponse addDataStoresItem(GetDataStore dataStoresItem) {
        if (this.dataStores == null) {
            this.dataStores = new ArrayList<>();
        }
        this.dataStores.add(dataStoresItem);
        return this;
    }

    public ListDataStoresResponse withDataStores(Consumer<List<GetDataStore>> dataStoresSetter) {
        if (this.dataStores == null) {
            this.dataStores = new ArrayList<>();
        }
        dataStoresSetter.accept(this.dataStores);
        return this;
    }

    /**
     * 数据结构列表
     * @return dataStores
     */
    public List<GetDataStore> getDataStores() {
        return dataStores;
    }

    public void setDataStores(List<GetDataStore> dataStores) {
        this.dataStores = dataStores;
    }

    public ListDataStoresResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 返回的 data-store 数量
     * minimum: 0
     * maximum: 200
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataStoresResponse that = (ListDataStoresResponse) obj;
        return Objects.equals(this.dataStores, that.dataStores) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataStores, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataStoresResponse {\n");
        sb.append("    dataStores: ").append(toIndentedString(dataStores)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
