package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class SearchQueryScaleFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_flavor_groups")

    private List<Computes> computeFlavorGroups = null;

    public SearchQueryScaleFlavorsResponse withComputeFlavorGroups(List<Computes> computeFlavorGroups) {
        this.computeFlavorGroups = computeFlavorGroups;
        return this;
    }

    public SearchQueryScaleFlavorsResponse addComputeFlavorGroupsItem(Computes computeFlavorGroupsItem) {
        if (this.computeFlavorGroups == null) {
            this.computeFlavorGroups = new ArrayList<>();
        }
        this.computeFlavorGroups.add(computeFlavorGroupsItem);
        return this;
    }

    public SearchQueryScaleFlavorsResponse withComputeFlavorGroups(Consumer<List<Computes>> computeFlavorGroupsSetter) {
        if (this.computeFlavorGroups == null) {
            this.computeFlavorGroups = new ArrayList<>();
        }
        computeFlavorGroupsSetter.accept(this.computeFlavorGroups);
        return this;
    }

    /** 计算规格列表对象。
     * 
     * @return computeFlavorGroups */
    public List<Computes> getComputeFlavorGroups() {
        return computeFlavorGroups;
    }

    public void setComputeFlavorGroups(List<Computes> computeFlavorGroups) {
        this.computeFlavorGroups = computeFlavorGroups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchQueryScaleFlavorsResponse searchQueryScaleFlavorsResponse = (SearchQueryScaleFlavorsResponse) o;
        return Objects.equals(this.computeFlavorGroups, searchQueryScaleFlavorsResponse.computeFlavorGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computeFlavorGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchQueryScaleFlavorsResponse {\n");
        sb.append("    computeFlavorGroups: ").append(toIndentedString(computeFlavorGroups)).append("\n");
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
