package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateRouteTableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_table")

    private UpdateRouteTable routeTable;

    public UpdateRouteTableRequestBody withRouteTable(UpdateRouteTable routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    public UpdateRouteTableRequestBody withRouteTable(Consumer<UpdateRouteTable> routeTableSetter) {
        if (this.routeTable == null) {
            this.routeTable = new UpdateRouteTable();
            routeTableSetter.accept(this.routeTable);
        }

        return this;
    }

    /**
     * Get routeTable
     * @return routeTable
     */
    public UpdateRouteTable getRouteTable() {
        return routeTable;
    }

    public void setRouteTable(UpdateRouteTable routeTable) {
        this.routeTable = routeTable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRouteTableRequestBody updateRouteTableRequestBody = (UpdateRouteTableRequestBody) o;
        return Objects.equals(this.routeTable, updateRouteTableRequestBody.routeTable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeTable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRouteTableRequestBody {\n");
        sb.append("    routeTable: ").append(toIndentedString(routeTable)).append("\n");
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
