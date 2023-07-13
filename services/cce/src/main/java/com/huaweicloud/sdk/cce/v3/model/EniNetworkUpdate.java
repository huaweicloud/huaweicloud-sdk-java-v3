package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EniNetworkUpdate
 */
public class EniNetworkUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets")

    private List<NetworkSubnet> subnets = null;

    public EniNetworkUpdate withSubnets(List<NetworkSubnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    public EniNetworkUpdate addSubnetsItem(NetworkSubnet subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    public EniNetworkUpdate withSubnets(Consumer<List<NetworkSubnet>> subnetsSetter) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        subnetsSetter.accept(this.subnets);
        return this;
    }

    /**
     * IPv4子网ID列表。1.19.10及以上版本的CCE Turbo集群支持多容器子网，同时支持增量更新容器子网列表。 只允许新增子网，不可删除已有子网，请谨慎选择。  请求体中需包含所有已经存在的subnet。
     * @return subnets
     */
    public List<NetworkSubnet> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<NetworkSubnet> subnets) {
        this.subnets = subnets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EniNetworkUpdate that = (EniNetworkUpdate) obj;
        return Objects.equals(this.subnets, that.subnets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EniNetworkUpdate {\n");
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
