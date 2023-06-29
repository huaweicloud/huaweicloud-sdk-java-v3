package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ContainerNetworkUpdate
 */
public class ContainerNetworkUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidrs")

    private List<ContainerCIDR> cidrs = null;

    public ContainerNetworkUpdate withCidrs(List<ContainerCIDR> cidrs) {
        this.cidrs = cidrs;
        return this;
    }

    public ContainerNetworkUpdate addCidrsItem(ContainerCIDR cidrsItem) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        this.cidrs.add(cidrsItem);
        return this;
    }

    public ContainerNetworkUpdate withCidrs(Consumer<List<ContainerCIDR>> cidrsSetter) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        cidrsSetter.accept(this.cidrs);
        return this;
    }

    /**
     * 容器网络网段列表。1.21及新版本集群，当集群网络类型为vpc-router时，支持增量添加容器网段。  此参数在集群更新后不可更改，请谨慎选择。
     * @return cidrs
     */
    public List<ContainerCIDR> getCidrs() {
        return cidrs;
    }

    public void setCidrs(List<ContainerCIDR> cidrs) {
        this.cidrs = cidrs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerNetworkUpdate that = (ContainerNetworkUpdate) obj;
        return Objects.equals(this.cidrs, that.cidrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerNetworkUpdate {\n");
        sb.append("    cidrs: ").append(toIndentedString(cidrs)).append("\n");
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
