package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateRouteTableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_table")

    private CreateRouteTable routeTable;

    public CreateRouteTableRequestBody withRouteTable(CreateRouteTable routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    public CreateRouteTableRequestBody withRouteTable(Consumer<CreateRouteTable> routeTableSetter) {
        if (this.routeTable == null) {
            this.routeTable = new CreateRouteTable();
            routeTableSetter.accept(this.routeTable);
        }

        return this;
    }

    /**
     * Get routeTable
     * @return routeTable
     */
    public CreateRouteTable getRouteTable() {
        return routeTable;
    }

    public void setRouteTable(CreateRouteTable routeTable) {
        this.routeTable = routeTable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRouteTableRequestBody that = (CreateRouteTableRequestBody) obj;
        return Objects.equals(this.routeTable, that.routeTable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeTable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRouteTableRequestBody {\n");
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
