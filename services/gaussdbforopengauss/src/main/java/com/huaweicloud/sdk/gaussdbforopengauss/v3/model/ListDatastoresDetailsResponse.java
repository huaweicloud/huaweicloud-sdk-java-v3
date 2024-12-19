package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListDatastoresDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastores")

    private List<DatastoresResult> datastores = null;

    public ListDatastoresDetailsResponse withDatastores(List<DatastoresResult> datastores) {
        this.datastores = datastores;
        return this;
    }

    public ListDatastoresDetailsResponse addDatastoresItem(DatastoresResult datastoresItem) {
        if (this.datastores == null) {
            this.datastores = new ArrayList<>();
        }
        this.datastores.add(datastoresItem);
        return this;
    }

    public ListDatastoresDetailsResponse withDatastores(Consumer<List<DatastoresResult>> datastoresSetter) {
        if (this.datastores == null) {
            this.datastores = new ArrayList<>();
        }
        datastoresSetter.accept(this.datastores);
        return this;
    }

    /**
     * Get datastores
     * @return datastores
     */
    public List<DatastoresResult> getDatastores() {
        return datastores;
    }

    public void setDatastores(List<DatastoresResult> datastores) {
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
        ListDatastoresDetailsResponse that = (ListDatastoresDetailsResponse) obj;
        return Objects.equals(this.datastores, that.datastores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastores);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatastoresDetailsResponse {\n");
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
