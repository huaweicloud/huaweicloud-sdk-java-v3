package com.huaweicloud.sdk.deh.v1.model;

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
public class ListDedicatedHostAllTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_types")

    private List<DedicatedHostType> dedicatedHostTypes = null;

    public ListDedicatedHostAllTypesResponse withDedicatedHostTypes(List<DedicatedHostType> dedicatedHostTypes) {
        this.dedicatedHostTypes = dedicatedHostTypes;
        return this;
    }

    public ListDedicatedHostAllTypesResponse addDedicatedHostTypesItem(DedicatedHostType dedicatedHostTypesItem) {
        if (this.dedicatedHostTypes == null) {
            this.dedicatedHostTypes = new ArrayList<>();
        }
        this.dedicatedHostTypes.add(dedicatedHostTypesItem);
        return this;
    }

    public ListDedicatedHostAllTypesResponse withDedicatedHostTypes(
        Consumer<List<DedicatedHostType>> dedicatedHostTypesSetter) {
        if (this.dedicatedHostTypes == null) {
            this.dedicatedHostTypes = new ArrayList<>();
        }
        dedicatedHostTypesSetter.accept(this.dedicatedHostTypes);
        return this;
    }

    /**
     * 指定可用的DeH类型。
     * @return dedicatedHostTypes
     */
    public List<DedicatedHostType> getDedicatedHostTypes() {
        return dedicatedHostTypes;
    }

    public void setDedicatedHostTypes(List<DedicatedHostType> dedicatedHostTypes) {
        this.dedicatedHostTypes = dedicatedHostTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDedicatedHostAllTypesResponse that = (ListDedicatedHostAllTypesResponse) obj;
        return Objects.equals(this.dedicatedHostTypes, that.dedicatedHostTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHostTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDedicatedHostAllTypesResponse {\n");
        sb.append("    dedicatedHostTypes: ").append(toIndentedString(dedicatedHostTypes)).append("\n");
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
