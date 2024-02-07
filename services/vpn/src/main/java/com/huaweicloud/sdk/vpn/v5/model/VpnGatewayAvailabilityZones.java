package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VpnGatewayAvailabilityZones
 */
public class VpnGatewayAvailabilityZones {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private List<String> vpc = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er")

    private List<String> er = null;

    public VpnGatewayAvailabilityZones withVpc(List<String> vpc) {
        this.vpc = vpc;
        return this;
    }

    public VpnGatewayAvailabilityZones addVpcItem(String vpcItem) {
        if (this.vpc == null) {
            this.vpc = new ArrayList<>();
        }
        this.vpc.add(vpcItem);
        return this;
    }

    public VpnGatewayAvailabilityZones withVpc(Consumer<List<String>> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new ArrayList<>();
        }
        vpcSetter.accept(this.vpc);
        return this;
    }

    /**
     * VPC关联类型的可用区列表
     * @return vpc
     */
    public List<String> getVpc() {
        return vpc;
    }

    public void setVpc(List<String> vpc) {
        this.vpc = vpc;
    }

    public VpnGatewayAvailabilityZones withEr(List<String> er) {
        this.er = er;
        return this;
    }

    public VpnGatewayAvailabilityZones addErItem(String erItem) {
        if (this.er == null) {
            this.er = new ArrayList<>();
        }
        this.er.add(erItem);
        return this;
    }

    public VpnGatewayAvailabilityZones withEr(Consumer<List<String>> erSetter) {
        if (this.er == null) {
            this.er = new ArrayList<>();
        }
        erSetter.accept(this.er);
        return this;
    }

    /**
     * ER关联类型的可用区列表
     * @return er
     */
    public List<String> getEr() {
        return er;
    }

    public void setEr(List<String> er) {
        this.er = er;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpnGatewayAvailabilityZones that = (VpnGatewayAvailabilityZones) obj;
        return Objects.equals(this.vpc, that.vpc) && Objects.equals(this.er, that.er);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpc, er);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpnGatewayAvailabilityZones {\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    er: ").append(toIndentedString(er)).append("\n");
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
