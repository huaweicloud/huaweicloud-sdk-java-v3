package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CAE环境访问VPC配置。
 */
public class EgressCidr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_table_id")

    private String routeTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public EgressCidr withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 目的网络Cidr。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public EgressCidr withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * 目的网络所属CAE环境VPC的路由表ID。
     * @return routeTableId
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public EgressCidr withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * CAE环境访问VPC配置ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EgressCidr that = (EgressCidr) obj;
        return Objects.equals(this.cidr, that.cidr) && Objects.equals(this.routeTableId, that.routeTableId)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidr, routeTableId, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EgressCidr {\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
