package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ListConfigurationDatastoresResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastores")

    private List<DataStoreList> datastores = null;

    public ListConfigurationDatastoresResponse withDatastores(List<DataStoreList> datastores) {
        this.datastores = datastores;
        return this;
    }

    public ListConfigurationDatastoresResponse addDatastoresItem(DataStoreList datastoresItem) {
        if (this.datastores == null) {
            this.datastores = new ArrayList<>();
        }
        this.datastores.add(datastoresItem);
        return this;
    }

    public ListConfigurationDatastoresResponse withDatastores(Consumer<List<DataStoreList>> datastoresSetter) {
        if (this.datastores == null) {
            this.datastores = new ArrayList<>();
        }
        datastoresSetter.accept(this.datastores);
        return this;
    }

    /**
     * 引擎信息。
     * @return datastores
     */
    public List<DataStoreList> getDatastores() {
        return datastores;
    }

    public void setDatastores(List<DataStoreList> datastores) {
        this.datastores = datastores;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListConfigurationDatastoresResponse listConfigurationDatastoresResponse =
            (ListConfigurationDatastoresResponse) o;
        return Objects.equals(this.datastores, listConfigurationDatastoresResponse.datastores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastores);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigurationDatastoresResponse {\n");
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
