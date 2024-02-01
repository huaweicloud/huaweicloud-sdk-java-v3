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
public class ListRdSforMysqlProxyFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_flavor_groups")

    private List<MysqlProxyFlavorsResponseComputeFlavorGroups> computeFlavorGroups = null;

    public ListRdSforMysqlProxyFlavorsResponse withComputeFlavorGroups(
        List<MysqlProxyFlavorsResponseComputeFlavorGroups> computeFlavorGroups) {
        this.computeFlavorGroups = computeFlavorGroups;
        return this;
    }

    public ListRdSforMysqlProxyFlavorsResponse addComputeFlavorGroupsItem(
        MysqlProxyFlavorsResponseComputeFlavorGroups computeFlavorGroupsItem) {
        if (this.computeFlavorGroups == null) {
            this.computeFlavorGroups = new ArrayList<>();
        }
        this.computeFlavorGroups.add(computeFlavorGroupsItem);
        return this;
    }

    public ListRdSforMysqlProxyFlavorsResponse withComputeFlavorGroups(
        Consumer<List<MysqlProxyFlavorsResponseComputeFlavorGroups>> computeFlavorGroupsSetter) {
        if (this.computeFlavorGroups == null) {
            this.computeFlavorGroups = new ArrayList<>();
        }
        computeFlavorGroupsSetter.accept(this.computeFlavorGroups);
        return this;
    }

    /**
     * 规格组信息。
     * @return computeFlavorGroups
     */
    public List<MysqlProxyFlavorsResponseComputeFlavorGroups> getComputeFlavorGroups() {
        return computeFlavorGroups;
    }

    public void setComputeFlavorGroups(List<MysqlProxyFlavorsResponseComputeFlavorGroups> computeFlavorGroups) {
        this.computeFlavorGroups = computeFlavorGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRdSforMysqlProxyFlavorsResponse that = (ListRdSforMysqlProxyFlavorsResponse) obj;
        return Objects.equals(this.computeFlavorGroups, that.computeFlavorGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computeFlavorGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRdSforMysqlProxyFlavorsResponse {\n");
        sb.append("    computeFlavorGroups: ").append(toIndentedString(computeFlavorGroups)).append("\n");
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
