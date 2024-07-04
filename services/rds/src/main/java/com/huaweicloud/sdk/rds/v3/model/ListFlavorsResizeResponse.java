package com.huaweicloud.sdk.rds.v3.model;

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
public class ListFlavorsResizeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_groups")

    private List<ComputeFlavorGroup> flavorGroups = null;

    public ListFlavorsResizeResponse withFlavorGroups(List<ComputeFlavorGroup> flavorGroups) {
        this.flavorGroups = flavorGroups;
        return this;
    }

    public ListFlavorsResizeResponse addFlavorGroupsItem(ComputeFlavorGroup flavorGroupsItem) {
        if (this.flavorGroups == null) {
            this.flavorGroups = new ArrayList<>();
        }
        this.flavorGroups.add(flavorGroupsItem);
        return this;
    }

    public ListFlavorsResizeResponse withFlavorGroups(Consumer<List<ComputeFlavorGroup>> flavorGroupsSetter) {
        if (this.flavorGroups == null) {
            this.flavorGroups = new ArrayList<>();
        }
        flavorGroupsSetter.accept(this.flavorGroups);
        return this;
    }

    /**
     * 规格组列表  normal：通用增强型。 normal2：通用增强Ⅱ型。 armFlavors：鲲鹏通用增强型。 dedicicateNormal（dedicatedNormalLocalssd）：x86独享型。 armLocalssd：鲲鹏通用型。 normalLocalssd：x86通用型。 general：通用型。 dedicated 对于PostgreSQL引擎：独享型
     * @return flavorGroups
     */
    public List<ComputeFlavorGroup> getFlavorGroups() {
        return flavorGroups;
    }

    public void setFlavorGroups(List<ComputeFlavorGroup> flavorGroups) {
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
        ListFlavorsResizeResponse that = (ListFlavorsResizeResponse) obj;
        return Objects.equals(this.flavorGroups, that.flavorGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorsResizeResponse {\n");
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
