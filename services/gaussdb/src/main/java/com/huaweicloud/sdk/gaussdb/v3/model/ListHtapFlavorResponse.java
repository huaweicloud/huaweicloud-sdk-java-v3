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
public class ListHtapFlavorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<HtapFlavorInfoFlavors> flavors = null;

    public ListHtapFlavorResponse withFlavors(List<HtapFlavorInfoFlavors> flavors) {
        this.flavors = flavors;
        return this;
    }

    public ListHtapFlavorResponse addFlavorsItem(HtapFlavorInfoFlavors flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ListHtapFlavorResponse withFlavors(Consumer<List<HtapFlavorInfoFlavors>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * 规格信息。
     * @return flavors
     */
    public List<HtapFlavorInfoFlavors> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<HtapFlavorInfoFlavors> flavors) {
        this.flavors = flavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHtapFlavorResponse that = (ListHtapFlavorResponse) obj;
        return Objects.equals(this.flavors, that.flavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHtapFlavorResponse {\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
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
