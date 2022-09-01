package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AsscoiateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets")

    @JacksonXmlProperty(localName = "subnets")

    private AssociateRouteTableAndSubnetReq subnets;

    public AsscoiateReq withSubnets(AssociateRouteTableAndSubnetReq subnets) {
        this.subnets = subnets;
        return this;
    }

    public AsscoiateReq withSubnets(Consumer<AssociateRouteTableAndSubnetReq> subnetsSetter) {
        if (this.subnets == null) {
            this.subnets = new AssociateRouteTableAndSubnetReq();
            subnetsSetter.accept(this.subnets);
        }

        return this;
    }

    /**
     * Get subnets
     * @return subnets
     */
    public AssociateRouteTableAndSubnetReq getSubnets() {
        return subnets;
    }

    public void setSubnets(AssociateRouteTableAndSubnetReq subnets) {
        this.subnets = subnets;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AsscoiateReq asscoiateReq = (AsscoiateReq) o;
        return Objects.equals(this.subnets, asscoiateReq.subnets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsscoiateReq {\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
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
