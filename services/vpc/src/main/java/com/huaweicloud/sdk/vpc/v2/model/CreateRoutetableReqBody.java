package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class CreateRoutetableReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable")

    private CreateRouteTableReq routetable;

    public CreateRoutetableReqBody withRoutetable(CreateRouteTableReq routetable) {
        this.routetable = routetable;
        return this;
    }

    public CreateRoutetableReqBody withRoutetable(Consumer<CreateRouteTableReq> routetableSetter) {
        if (this.routetable == null) {
            this.routetable = new CreateRouteTableReq();
            routetableSetter.accept(this.routetable);
        }

        return this;
    }

    /**
     * Get routetable
     * @return routetable
     */
    public CreateRouteTableReq getRoutetable() {
        return routetable;
    }

    public void setRoutetable(CreateRouteTableReq routetable) {
        this.routetable = routetable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRoutetableReqBody that = (CreateRoutetableReqBody) obj;
        return Objects.equals(this.routetable, that.routetable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRoutetableReqBody {\n");
        sb.append("    routetable: ").append(toIndentedString(routetable)).append("\n");
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
