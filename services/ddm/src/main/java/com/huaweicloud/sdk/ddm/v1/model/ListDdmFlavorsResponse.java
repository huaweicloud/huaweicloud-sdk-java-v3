package com.huaweicloud.sdk.ddm.v1.model;

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
public class ListDdmFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_groups")

    private List<FlavorGroupInfo> flavorGroups = null;

    public ListDdmFlavorsResponse withFlavorGroups(List<FlavorGroupInfo> flavorGroups) {
        this.flavorGroups = flavorGroups;
        return this;
    }

    public ListDdmFlavorsResponse addFlavorGroupsItem(FlavorGroupInfo flavorGroupsItem) {
        if (this.flavorGroups == null) {
            this.flavorGroups = new ArrayList<>();
        }
        this.flavorGroups.add(flavorGroupsItem);
        return this;
    }

    public ListDdmFlavorsResponse withFlavorGroups(Consumer<List<FlavorGroupInfo>> flavorGroupsSetter) {
        if (this.flavorGroups == null) {
            this.flavorGroups = new ArrayList<>();
        }
        flavorGroupsSetter.accept(this.flavorGroups);
        return this;
    }

    /**
     * 规格组。
     * @return flavorGroups
     */
    public List<FlavorGroupInfo> getFlavorGroups() {
        return flavorGroups;
    }

    public void setFlavorGroups(List<FlavorGroupInfo> flavorGroups) {
        this.flavorGroups = flavorGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDdmFlavorsResponse that = (ListDdmFlavorsResponse) obj;
        return Objects.equals(this.flavorGroups, that.flavorGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDdmFlavorsResponse {\n");
        sb.append("    flavorGroups: ").append(toIndentedString(flavorGroups)).append("\n");
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
