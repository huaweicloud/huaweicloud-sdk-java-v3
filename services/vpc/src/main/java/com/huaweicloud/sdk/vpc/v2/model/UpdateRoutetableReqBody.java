package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateRoutetableReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable")

    private UpdateRouteTableReq routetable;

    public UpdateRoutetableReqBody withRoutetable(UpdateRouteTableReq routetable) {
        this.routetable = routetable;
        return this;
    }

    public UpdateRoutetableReqBody withRoutetable(Consumer<UpdateRouteTableReq> routetableSetter) {
        if (this.routetable == null) {
            this.routetable = new UpdateRouteTableReq();
            routetableSetter.accept(this.routetable);
        }

        return this;
    }

    /** Get routetable
     * 
     * @return routetable */
    public UpdateRouteTableReq getRoutetable() {
        return routetable;
    }

    public void setRoutetable(UpdateRouteTableReq routetable) {
        this.routetable = routetable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRoutetableReqBody updateRoutetableReqBody = (UpdateRoutetableReqBody) o;
        return Objects.equals(this.routetable, updateRoutetableReqBody.routetable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRoutetableReqBody {\n");
        sb.append("    routetable: ").append(toIndentedString(routetable)).append("\n");
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
