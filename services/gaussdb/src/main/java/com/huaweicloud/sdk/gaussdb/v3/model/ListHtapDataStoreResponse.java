package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ListHtapDataStoreResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastores")

    private List<SrDataStoresDatastores> datastores = null;

    public ListHtapDataStoreResponse withDatastores(List<SrDataStoresDatastores> datastores) {
        this.datastores = datastores;
        return this;
    }

    public ListHtapDataStoreResponse addDatastoresItem(SrDataStoresDatastores datastoresItem) {
        if (this.datastores == null) {
            this.datastores = new ArrayList<>();
        }
        this.datastores.add(datastoresItem);
        return this;
    }

    public ListHtapDataStoreResponse withDatastores(Consumer<List<SrDataStoresDatastores>> datastoresSetter) {
        if (this.datastores == null) {
            this.datastores = new ArrayList<>();
        }
        datastoresSetter.accept(this.datastores);
        return this;
    }

    /**
     * 数据库信息列表。
     * @return datastores
     */
    public List<SrDataStoresDatastores> getDatastores() {
        return datastores;
    }

    public void setDatastores(List<SrDataStoresDatastores> datastores) {
        this.datastores = datastores;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHtapDataStoreResponse that = (ListHtapDataStoreResponse) obj;
        return Objects.equals(this.datastores, that.datastores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastores);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHtapDataStoreResponse {\n");
        sb.append("    datastores: ").append(toIndentedString(datastores)).append("\n");
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
