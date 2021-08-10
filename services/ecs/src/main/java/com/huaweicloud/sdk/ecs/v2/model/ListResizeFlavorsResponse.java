package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListResizeFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<ListResizeFlavorsResult> flavors = null;

    public ListResizeFlavorsResponse withFlavors(List<ListResizeFlavorsResult> flavors) {
        this.flavors = flavors;
        return this;
    }

    public ListResizeFlavorsResponse addFlavorsItem(ListResizeFlavorsResult flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ListResizeFlavorsResponse withFlavors(Consumer<List<ListResizeFlavorsResult>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /** 云服务器规格列表。
     * 
     * @return flavors */
    public List<ListResizeFlavorsResult> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<ListResizeFlavorsResult> flavors) {
        this.flavors = flavors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResizeFlavorsResponse listResizeFlavorsResponse = (ListResizeFlavorsResponse) o;
        return Objects.equals(this.flavors, listResizeFlavorsResponse.flavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResizeFlavorsResponse {\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
