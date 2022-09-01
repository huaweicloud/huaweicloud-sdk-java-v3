package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDedicatedHostTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_types")

    @JacksonXmlProperty(localName = "dedicated_host_types")

    private List<RespHostType> dedicatedHostTypes = null;

    public ListDedicatedHostTypesResponse withDedicatedHostTypes(List<RespHostType> dedicatedHostTypes) {
        this.dedicatedHostTypes = dedicatedHostTypes;
        return this;
    }

    public ListDedicatedHostTypesResponse addDedicatedHostTypesItem(RespHostType dedicatedHostTypesItem) {
        if (this.dedicatedHostTypes == null) {
            this.dedicatedHostTypes = new ArrayList<>();
        }
        this.dedicatedHostTypes.add(dedicatedHostTypesItem);
        return this;
    }

    public ListDedicatedHostTypesResponse withDedicatedHostTypes(
        Consumer<List<RespHostType>> dedicatedHostTypesSetter) {
        if (this.dedicatedHostTypes == null) {
            this.dedicatedHostTypes = new ArrayList<>();
        }
        dedicatedHostTypesSetter.accept(this.dedicatedHostTypes);
        return this;
    }

    /**
     * 可用的专属主机类型。
     * @return dedicatedHostTypes
     */
    public List<RespHostType> getDedicatedHostTypes() {
        return dedicatedHostTypes;
    }

    public void setDedicatedHostTypes(List<RespHostType> dedicatedHostTypes) {
        this.dedicatedHostTypes = dedicatedHostTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDedicatedHostTypesResponse listDedicatedHostTypesResponse = (ListDedicatedHostTypesResponse) o;
        return Objects.equals(this.dedicatedHostTypes, listDedicatedHostTypesResponse.dedicatedHostTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHostTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDedicatedHostTypesResponse {\n");
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
